package org.elluck91.finsoft.main.employee;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.elluck91.finsoft.main.dept.emp.DepartmentEmployee;
import org.elluck91.finsoft.main.salaries.Salaries;

@Entity(name="Employee")
@Table(name = "employees")
public class Employee {
	@Id
    @Column(name="emp_no")
	private int id;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
    
	private String gender;
    
    @Column(name = "hire_date")
    private Date hireDate;
    
    private String email;
    
    @OneToOne
    @JoinColumn(name="emp_no", insertable=false, updatable=false)
    private DepartmentEmployee department;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@OneToMany
	@JoinColumn(name="emp_no", insertable=false, updatable=false)
    @OrderBy("to_date DESC")
    private List<Salaries> salaries;

	public List<Salaries> getSalaries() {
		return salaries;
	}

	public void setSalaries(List<Salaries> salaries) {
		salaries.clear();
		this.salaries.addAll(salaries);
	}

	public DepartmentEmployee getDepartment() {
		return department;
	}


	public void setDepartment(DepartmentEmployee department) {
		this.department = department;
	}


	public int getEmp_no() {
		return id;
	}


	public void setEmp_no(int empNo) {
		this.id = empNo;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Date getHireDate() {
		return hireDate;
	}


	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Salaries getLatestSalary() {
		int res = 0;
		Date latest = salaries.get(0).getToDate();
		for (int i = 1; i < salaries.size(); i++) {
			if (latest.compareTo(salaries.get(i).getToDate()) < 0)
				res = i;
		}
		
		return salaries.get(res);
	}


	public Employee(int id, Date birthDate, String firstName, String lastName, String gender, Date hireDate,
			String email, DepartmentEmployee department, List<Salaries> salaries) {
		super();
		this.id = id;
		this.birthDate = birthDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.hireDate = hireDate;
		this.email = email;
		this.department = department;
		this.salaries = salaries;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", birthDate=" + birthDate + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", hireDate=" + hireDate + ", email=" + email + ", department=" + department
				+ ", salaries=" + salaries + "]";
	}
}