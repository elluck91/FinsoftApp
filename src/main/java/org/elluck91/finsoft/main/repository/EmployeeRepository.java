package org.elluck91.finsoft.main.repository;
import java.util.List;

import javax.transaction.Transactional;

import org.elluck91.finsoft.main.employee.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	List<Employee> findByDeptOrderByIdAsc(String dept, Pageable topTen);
	
	@Query("select e from Employee e where e.lastName > ?1 and e.lastName < ?2")
	List<Employee> findByLastNameOrderByLastNameAsc(String lastName, String i, Pageable topTen);
}
	
