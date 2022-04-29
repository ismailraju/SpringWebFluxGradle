package com.example.demo.client;

import com.example.demo.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeWebClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeWebClient.class);
    WebClient client = WebClient.create("http://localhost:8080");

    public EmployeeWebClient() {
        this.client = WebClient.create("http://localhost:8080");
    }

    public Flux<Employee> consume() {
        Mono<Employee> employeeMono = client.get()
                .uri("/employees/{id}", 1)
                .retrieve()
                .bodyToMono(Employee.class);

        employeeMono.subscribe(employee -> LOGGER.debug("Employee: {}", employee));


        Flux<Employee> employeeFlux = client.get()
                .uri("/employees")
                .retrieve()
                .bodyToFlux(Employee.class);
        employeeFlux.subscribe(employee -> LOGGER.debug("Employee: {}", employee));

        return employeeFlux;
    }
}
