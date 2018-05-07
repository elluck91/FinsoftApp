package org.elluck91.finsoft.main.employee;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
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
	
	private int id;
	
	
	private Date birthDate;
	
	
	private String firstName;
	
	
	private String lastName;
    
	private String gender;
    
    
    private Date hireDate;
    
    private String email;
    
    
    public DepartmentEmployee department;
    
    @Id
    @Column(name="emp_no")
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

    public List<Salaries> salaries;

    public void setSalaries(List<Salaries> salaries) {
		this.salaries = salaries;
	}

	@OneToMany
	@JoinColumn(name="emp_no")
    @OrderBy("to_date DESC")
	public List<Salaries> getSalaries() {
		return salaries;
	}

	
	@OneToOne()
	@JoinColumn(name= "emp_no")
	public DepartmentEmployee getDepartment() {
		return department;
	}


	public void setDepartment(DepartmentEmployee department) {
		this.department = department;
	}

	@Column(name="birth_date")
	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Column(name="first_name")
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name")
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

	@Column(name = "hire_date")
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
				+ ", gender=" + gender + ", hireDate=" + hireDate + ", email=" + email + ", salaries=" + salaries + "]";
	}
}