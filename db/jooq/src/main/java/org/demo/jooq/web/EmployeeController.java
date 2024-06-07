package org.demo.jooq.web;

import java.util.List;
import org.demo.jooq.EmployeeService;
import org.demo.jooq.domain.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

  private final EmployeeService employeeService;

  public EmployeeController(EmployeeService employeeService) {
    this.employeeService = employeeService;
  }

  @GetMapping("/employees/{id}")
  public List<Employee> getEmployee(@PathVariable int id) {
    return employeeService.findEmployee(id);
  }
}
