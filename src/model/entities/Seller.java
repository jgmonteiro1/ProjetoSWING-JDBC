package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String email;
	private Integer id;
	private Date birthDate;
	private Double salaryBase;
	
	private Department department;

	public Seller() {
		
	}

	public Seller(String name, String email, Integer id, Date birthDate, Double salaryBase, Department department) {
		this.name = name;
		this.email = email;
		this.id = id;
		this.birthDate = birthDate;
		this.salaryBase = salaryBase;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Double getSalaryBase() {
		return salaryBase;
	}

	public void setSalaryBase(Double salaryBase) {
		this.salaryBase = salaryBase;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Seller [name=" + name + ", email=" + email + ", id=" + id + ", birthDate=" + birthDate + ", salaryBase="
				+ salaryBase + ", department=" + department + "]";
	}

	
	
	
	
}
