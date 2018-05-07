package org.elluck91.finsoft.main.repository;

import org.elluck91.finsoft.main.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalariesRepository extends JpaRepository<Employee, Integer> {

}
