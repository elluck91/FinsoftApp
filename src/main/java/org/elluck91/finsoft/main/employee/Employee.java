package org.elluck91.finsoft.main.employee;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Employee")
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="emp_no")
	private int id;


	private Date birthDate;


	private String firstName;


	private String lastName;

	private String gender;


	private Date hireDate;

	private String email;

	private int salary;

	private String dept;

	private String aboutme;


	public String getAboutme() {
		return aboutme;
	}

	public void setAboutme(String aboutme) {
		this.aboutme = aboutme;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	//    public DepartmentEmployee department;
	@Column(name="salary")
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//    public List<Salaries> salaries;
	//
	//    public void setSalaries(List<Salaries> salaries) {
	//		this.salaries = salaries;
	//	}
	//
	//	@OneToMany
	//	@JoinColumn(name="emp_no")
	//    @OrderBy("to_date DESC")
	//	public List<Salaries> getSalaries() {
	//		return salaries;
	//	}


	//	@OneToOne()
	//	@JoinColumn(name= "emp_no")
	//	public DepartmentEmployee getDepartment() {
	//		return department;
	//	}
	//
	//
	//	public void setDepartment(DepartmentEmployee department) {
	//		this.department = department;
	//	}

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
			String email, int salary, String dept, String aboutme) {
		super();
		this.id = id;
		this.birthDate = birthDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.hireDate = hireDate;
		this.email = email;
		this.salary = salary;
		this.dept = dept;
		this.aboutme = aboutme;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", birthDate=" + birthDate + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", hireDate=" + hireDate + ", email=" + email + ", salary=" + salary
				+ ", dept=" + dept + ", aboutme=" + aboutme + "]";
	}




}