package org.elluck91.finsoft.main.repository;

import java.util.List;

import org.elluck91.finsoft.main.dept.emp.DepartmentEmployee;
import org.elluck91.finsoft.main.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentEmployeeRepository extends JpaRepository<DepartmentEmployee, Integer> {

}
