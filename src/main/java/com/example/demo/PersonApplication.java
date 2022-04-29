package com.example.demo;

import com.example.demo.model.Employee;
import com.example.demo.model.Person;
import com.example.demo.repo.EmployeeRepository;
import com.example.demo.repo.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class PersonApplication {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(PersonApplication.class, args);
    }

    @Bean
    CommandLineRunner start(PersonRepository personRepository) {
        return args -> {

            Flux.just(
                    new Person("josdem", "joseluis.delacruz@gmail.com"),
                    new Person("tgrip", "tgrip@email.com"),
                    new Person("edzero", "edzero@email.com"),
                    new Person("siedrix", "siedrix@email.com"),
                    new Person("mkheck", "mkheck@email.com"))
                    .flatMap(personRepository::save)
                    .subscribe(person -> log.info("person: {}", person));

        };
    }

    @Bean
    CommandLineRunner employeeSaveToMongo(EmployeeRepository employeeRepository) {
        return arg -> {


            Flux.just(new Employee("1", "Employee 1"),
                    new Employee("2", "Employee 2"),
                    new Employee("3", "Employee 3"),
                    new Employee("4", "Employee 4"),
                    new Employee("5", "Employee 5"),
                    new Employee("6", "Employee 6"),
                    new Employee("7", "Employee 7"),
                    new Employee("8", "Employee 8"),
                    new Employee("9", "Employee 9"),
                    new Employee("10", "Employee 10"))
                    .flatMap(employeeRepository::save)
                    .subscribe(employee -> log.info("employee: {}", employee));
        };
    }
}