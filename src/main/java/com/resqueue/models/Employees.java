package com.resqueue.models;

// Generated May 9, 2014 8:07:37 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Employees generated by hbm2java
 */
@Entity
@Table(name = "employees", catalog = "heroku_54640e8309ac0d5")
public class Employees implements java.io.Serializable {

	private Integer id;
	private Branch branch;
	private Integer role;
	private Set<EmployeesBranchServicePrivilege> employeesBranchServicePrivileges = new HashSet<EmployeesBranchServicePrivilege>(
			0);

	public Employees() {
	}

	public Employees(
			Branch branch,
			Integer role,
			Set<EmployeesBranchServicePrivilege> employeesBranchServicePrivileges) {
		this.branch = branch;
		this.role = role;
		this.employeesBranchServicePrivileges = employeesBranchServicePrivileges;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MainBranch")
	public Branch getBranch() {
		return this.branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Column(name = "Role")
	public Integer getRole() {
		return this.role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employees")
	public Set<EmployeesBranchServicePrivilege> getEmployeesBranchServicePrivileges() {
		return this.employeesBranchServicePrivileges;
	}

	public void setEmployeesBranchServicePrivileges(
			Set<EmployeesBranchServicePrivilege> employeesBranchServicePrivileges) {
		this.employeesBranchServicePrivileges = employeesBranchServicePrivileges;
	}

}