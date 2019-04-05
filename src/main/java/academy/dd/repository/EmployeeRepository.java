package academy.dd.repository;

import academy.dd.entity.Employee;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> findAll();

    Employee findOne(String id);
}
