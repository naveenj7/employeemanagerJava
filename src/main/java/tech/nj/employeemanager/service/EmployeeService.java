package tech.nj.employeemanager.service;

import org.springframework.stereotype.Service;
import tech.nj.employeemanager.domain.Employee;
import tech.nj.employeemanager.exception.EmployeeNotFoundException;
import tech.nj.employeemanager.repo.EmployeeRepo;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee saveEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployee(){
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public Employee findById(Long id){
        return employeeRepo.findEmployeeById(id).orElseThrow(
                ()->new EmployeeNotFoundException("employee for the id:"+ id + "not found")
        );
    }

    public void deleteEmployee(Long id){
        employeeRepo.deleteEmployeeById(id);
    }
}
