package com.example.demo.controller;

import com.example.demo.client.EmployeeWebClient;
import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/consume")
public class EmployeeClientController {
    private final EmployeeWebClient employeeWebClient;

    public EmployeeClientController(EmployeeWebClient employeeRepository) {
        this.employeeWebClient = employeeRepository;
    }


    @GetMapping
    private Flux<Employee> consume() {
        return employeeWebClient.consume();
    }


}
