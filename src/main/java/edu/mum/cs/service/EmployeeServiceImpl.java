package edu.mum.cs.service;

import edu.mum.cs.domain.Employee;
import edu.mum.cs.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return (List<Employee>)employeeRepository.findAll();
    }
}
