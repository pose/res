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
 * Business generated by hbm2java
 */
@Entity
@Table(name = "business", catalog = "heroku_54640e8309ac0d5")
public class Business implements java.io.Serializable {

	private Integer id;
	private BuisnessCategory buisnessCategory;
	private String name;
	private Integer rating;
	private Set<Branch> branches = new HashSet<Branch>(0);
	private Set<BuisnessService> buisnessServices = new HashSet<BuisnessService>(
			0);

	public Business() {
	}

	public Business(BuisnessCategory buisnessCategory, String name,
			Integer rating, Set<Branch> branches,
			Set<BuisnessService> buisnessServices) {
		this.buisnessCategory = buisnessCategory;
		this.name = name;
		this.rating = rating;
		this.branches = branches;
		this.buisnessServices = buisnessServices;
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
	@JoinColumn(name = "category")
	public BuisnessCategory getBuisnessCategory() {
		return this.buisnessCategory;
	}

	public void setBuisnessCategory(BuisnessCategory buisnessCategory) {
		this.buisnessCategory = buisnessCategory;
	}

	@Column(name = "name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "rating")
	public Integer getRating() {
		return this.rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "business")
	public Set<Branch> getBranches() {
		return this.branches;
	}

	public void setBranches(Set<Branch> branches) {
		this.branches = branches;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "business")
	public Set<BuisnessService> getBuisnessServices() {
		return this.buisnessServices;
	}

	public void setBuisnessServices(Set<BuisnessService> buisnessServices) {
		this.buisnessServices = buisnessServices;
	}

}
