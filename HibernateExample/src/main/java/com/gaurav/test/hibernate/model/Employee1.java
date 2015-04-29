package com.gaurav.test.hibernate.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


//"javax.persistence.Entity" annotation is used to mark a class as Entity bean 
//that can be persisted by hibernate, since hibernate provides JPA implementation.

//"javax.persistence.Table" annotation is used to define the table mapping and 
//unique constraints for the columns.

@Entity
@Table(name="Employee",
	   uniqueConstraints={@UniqueConstraint(columnNames={"ID"})})
public class Employee1 {
	
	//"javax.persistence.Id" annotation is used to define the primary key for the table.
	
	//javax.persistence.GeneratedValue annotation is used to define that the field 
	//will be auto generated.
	
	//And "GenerationType.IDENTITY" strategy is used so that the generated “id” value
	//is mapped to the bean and can be retrieved in the java program.
	
	//javax.persistence.Column annotation is used to map the field with table column, 
	//we can also specify length, nullable and uniqueness for the bean properties.
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID", nullable=false, unique=true, length=11)
	private int id;
	
	@Column(name="NAME", length=20, nullable=true)
    private String name;
	
	@Column(name="ROLE", length=20, nullable=true)
    private String role;
	
	@Column(name="insert_time", nullable=true)
    private Date insertTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

	
}
