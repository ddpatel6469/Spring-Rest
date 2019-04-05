package academy.dd.service;

import academy.dd.entity.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findOne(String id);

    Employee create(Employee emp);

    Employee update(String id,Employee emp);

    void delete(String id);
}
