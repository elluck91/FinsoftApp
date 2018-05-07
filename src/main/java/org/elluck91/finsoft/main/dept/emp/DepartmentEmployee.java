package org.elluck91.finsoft.main.dept.emp;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Embeddable
@Entity
@Table(name = "dept_emp")
public class DepartmentEmployee {
	
	
	public String id;
	
	@Column(name = "dept_no")
	public String getId() {
		return id;
	}

	public void setId(String department) {
		this.id = department;
	}
	
	private Date from_date;
	
	@Column(name = "from_date")
	public Date getFrom_date() {
		return from_date;
	}

	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}
	
	private Date to_date;
	
	@Column(name = "to_date")
	public Date getTo_date() {
		return to_date;
	}

	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}
	
	
	private int emp_no;
	
	@Id
	@Column(name = "emp_no")
	public int getEmp_no() {
		return emp_no;
	}
	
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public DepartmentEmployee(String department, Date from_date, Date to_date, int emp_no) {
		super();
		this.id = department;
		this.from_date = from_date;
		this.to_date = to_date;
		this.emp_no = emp_no;
	}

	public DepartmentEmployee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DepartmentEmployee [department=" + id + ", from_date=" + from_date + ", to_date=" + to_date + ", emp_no="
				+ emp_no + "]";
	}
}
