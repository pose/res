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
 * BranchService generated by hbm2java
 */
@Entity
@Table(name = "branch_service", catalog = "heroku_54640e8309ac0d5")
public class BranchService implements java.io.Serializable {

	private Integer id;
	private Branch branch;
	private BuisnessService buisnessService;
	private String description;
	private Set<SpecialEvent> specialEvents = new HashSet<SpecialEvent>(0);
	private Set<EmployeesBranchServicePrivilege> employeesBranchServicePrivileges = new HashSet<EmployeesBranchServicePrivilege>(
			0);
	private Set<UserBranchServicePrivilege> userBranchServicePrivileges = new HashSet<UserBranchServicePrivilege>(
			0);
	private Set<Queue> queues = new HashSet<Queue>(0);
	private Set<OpeningHour> openingHours = new HashSet<OpeningHour>(0);

	public BranchService() {
	}

	public BranchService(
			Branch branch,
			BuisnessService buisnessService,
			String description,
			Set<SpecialEvent> specialEvents,
			Set<EmployeesBranchServicePrivilege> employeesBranchServicePrivileges,
			Set<UserBranchServicePrivilege> userBranchServicePrivileges,
			Set<Queue> queues, Set<OpeningHour> openingHours) {
		this.branch = branch;
		this.buisnessService = buisnessService;
		this.description = description;
		this.specialEvents = specialEvents;
		this.employeesBranchServicePrivileges = employeesBranchServicePrivileges;
		this.userBranchServicePrivileges = userBranchServicePrivileges;
		this.queues = queues;
		this.openingHours = openingHours;
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
	@JoinColumn(name = "branch_id")
	public Branch getBranch() {
		return this.branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "buisness_service_id")
	public BuisnessService getBuisnessService() {
		return this.buisnessService;
	}

	public void setBuisnessService(BuisnessService buisnessService) {
		this.buisnessService = buisnessService;
	}

	@Column(name = "description", length = 100)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "branchService")
	public Set<SpecialEvent> getSpecialEvents() {
		return this.specialEvents;
	}

	public void setSpecialEvents(Set<SpecialEvent> specialEvents) {
		this.specialEvents = specialEvents;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "branchService")
	public Set<EmployeesBranchServicePrivilege> getEmployeesBranchServicePrivileges() {
		return this.employeesBranchServicePrivileges;
	}

	public void setEmployeesBranchServicePrivileges(
			Set<EmployeesBranchServicePrivilege> employeesBranchServicePrivileges) {
		this.employeesBranchServicePrivileges = employeesBranchServicePrivileges;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "branchService")
	public Set<UserBranchServicePrivilege> getUserBranchServicePrivileges() {
		return this.userBranchServicePrivileges;
	}

	public void setUserBranchServicePrivileges(
			Set<UserBranchServicePrivilege> userBranchServicePrivileges) {
		this.userBranchServicePrivileges = userBranchServicePrivileges;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "branchService")
	public Set<Queue> getQueues() {
		return this.queues;
	}

	public void setQueues(Set<Queue> queues) {
		this.queues = queues;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "branchService")
	public Set<OpeningHour> getOpeningHours() {
		return this.openingHours;
	}

	public void setOpeningHours(Set<OpeningHour> openingHours) {
		this.openingHours = openingHours;
	}

}