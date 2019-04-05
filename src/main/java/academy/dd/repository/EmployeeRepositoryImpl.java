package academy.dd.repository;

import academy.dd.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
    @Override
    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("DD","dd@gmail.com",1000));
        return employees;
    }

    @Override
    public Employee findOne(String id) {
//        return new Employee("DD","dd@gmail.com",1000);
        return null;
    }
}
