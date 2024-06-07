package org.demo.jooq.persistence;

import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.table;

import java.util.List;
import org.demo.jooq.domain.Employee;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

  private final DSLContext ctx;

  public EmployeeRepository(DSLContext ctx) {
    this.ctx = ctx;
  }

  public List<Employee> findEmployee(int id) {
    List<Employee> employee=ctx.selectFrom(table("employee"))
        .where(field("id").eq(id))
        .fetchInto(Employee.class);
    return employee;
  }
}
