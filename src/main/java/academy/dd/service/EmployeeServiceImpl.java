package academy.dd.service;

import academy.dd.entity.Employee;
import academy.dd.exception.EmployeeNotFoundException;
import academy.dd.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repository;


    @Override
    public List<Employee> findAll() {
        return repository.findAll();
    }

    @Override
    public Employee findOne(String id) {
        Employee employee = repository.findOne(id);
        if(employee == null){
            throw new EmployeeNotFoundException("Employee with id = "+id+" not found");
        }
        else{
            return employee;
        }
    }

    @Override
    public Employee create(Employee emp) {
        return null;
    }

    @Override
    public Employee update(String id, Employee emp) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
