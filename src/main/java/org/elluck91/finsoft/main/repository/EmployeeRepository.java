package org.elluck91.finsoft.main.repository;
import java.util.List;

import javax.transaction.Transactional;

import org.elluck91.finsoft.main.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> getByDept(String dept);
}
