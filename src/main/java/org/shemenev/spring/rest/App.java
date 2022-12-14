package org.shemenev.spring.rest;

import org.shemenev.spring.rest.configuration.MyConfig;
import org.shemenev.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

        // получить всех сотрудников
        List<Employee> allEmployees = communication.getAllEmployees();
        allEmployees.forEach(System.out::println);

        // получить конкретного сотрудника
        Employee empById = communication.getEmployee(1);
        System.out.println(empById);

        // add\update сотрудника
        Employee emp = new Employee("Stepan", "Kropachev", "IT", 2800);
        emp.setId(8); // если нужно сделать update
        communication.saveEmployee(emp);

        // удаление сотрудника
        communication.deleteEmployee(8);
    }
}
