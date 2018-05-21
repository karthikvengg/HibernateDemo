package com.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="department_table")
public class DepartmentBean {

	@Id
	@Column(name="dept_id")
	private int deptId;
	
	@Column(name="dept_name")
	private String deptName;
	
	private String dept_location;

	public DepartmentBean() {
		super();
	}
	public DepartmentBean(int deptId, String deptName, String dept_location) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.dept_location = dept_location;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getLocation() {
		return dept_location;
	}	
	public void setLocation(String location) {
		this.dept_location = location;
	}
	@Override
	public String toString() {
		return "DepartmentBean [deptId=" + deptId + ", deptName=" + deptName + ", location=" + dept_location + "]";
	}
	
}
