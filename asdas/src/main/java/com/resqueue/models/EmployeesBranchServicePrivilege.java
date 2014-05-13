package com.resqueue.models;

// Generated May 9, 2014 8:07:37 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * EmployeesBranchServicePrivilege generated by hbm2java
 */
@Entity
@Table(name = "employees_branch_service_privilege", catalog = "heroku_54640e8309ac0d5")
public class EmployeesBranchServicePrivilege implements java.io.Serializable {

	private Integer id;
	private Employees employees;
	private Privilege privilege;
	private BranchService branchService;

	public EmployeesBranchServicePrivilege() {
	}

	public EmployeesBranchServicePrivilege(Employees employees,
			Privilege privilege, BranchService branchService) {
		this.employees = employees;
		this.privilege = privilege;
		this.branchService = branchService;
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
	@JoinColumn(name = "employee_id")
	public Employees getEmployees() {
		return this.employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "privilege_id")
	public Privilege getPrivilege() {
		return this.privilege;
	}

	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "branch_service_id")
	public BranchService getBranchService() {
		return this.branchService;
	}

	public void setBranchService(BranchService branchService) {
		this.branchService = branchService;
	}

}
