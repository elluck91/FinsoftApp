package org.elluck91.finsoft.main.dept.emp;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.elluck91.finsoft.main.employee.Employee;

@Entity(name="DepartmentEmployee")
@Table(name = "dept_emp")
public class DepartmentEmployee {

	@Id
	@Column(name = "dept_no")
	private String id;
	
	@Column(name = "from_date")
	private Date from_date;
	
	@Column(name = "to_date")
	private Date to_date;
	
	@OneToMany
    @JoinColumn(name="emp_no")
	private List<Employee> employees;
	
	

	public List<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}


	public String getDeptNo() {
		return id;
	}


	public void setDeptNo(String deptNo) {
		this.id = deptNo;
	}


	public Date getFrom_date() {
		return from_date;
	}


	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}


	public Date getTo_date() {
		return to_date;
	}


	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}

	public DepartmentEmployee() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setEmployee(List<Employee> employees) {
		this.employees.clear();
		this.employees.addAll(employees);
}

	
}
