package org.elluck91.finsoft.main.salaries;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.elluck91.finsoft.main.employee.Employee;

@Entity(name="Salaries")
@Table(name="salaries")
public class Salaries implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4785639954377335145L;

	@ManyToOne
    @JoinColumn(name="emp_no")
	private Employee employee;
	
	@Column(name = "salary")
	public int salary;
	
	@Id
	@Column(name="from_date")
	private Date fromDate;
	
	@Column(name = "to_date")
	private Date toDate;

	public Employee getEmployee() {
		return employee;
	}

	public void setId(Employee employee) {
		this.employee = employee;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public Salaries(Employee employee, int salary, Date fromDate, Date toDate) {
		super();
		this.employee = employee;
		this.salary = salary;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public Salaries() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return salary + "";
	}
	
	
}
