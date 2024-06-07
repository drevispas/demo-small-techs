package org.demo.jooq;

import java.util.List;
import org.demo.jooq.domain.Employee;
import org.demo.jooq.persistence.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeService {

  private final EmployeeRepository employeeRepository;

  public EmployeeService(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

  public List<Employee> findEmployee(int id) {
    return employeeRepository.findEmployee(id);
  }
}
