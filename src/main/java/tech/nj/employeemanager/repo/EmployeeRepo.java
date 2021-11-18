package tech.nj.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import tech.nj.employeemanager.domain.Employee;

import javax.transaction.Transactional;
import java.util.Optional;

public interface EmployeeRepo extends JpaRepository <Employee, Long>{

    @Transactional
    @Modifying
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
