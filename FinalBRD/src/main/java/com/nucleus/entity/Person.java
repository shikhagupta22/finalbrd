package com.nucleus.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name="person_shikha")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Person 
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq1_shikha")
    @SequenceGenerator(name="seq1_shikha",sequenceName="seq2_shikha",initialValue=10,allocationSize=10)
	@Column(name="Customer_Code")
	private int code;
	@Column(name="Customer_Name",length=30)
	@Pattern(regexp="^([A-Za-z0-9]*$)",message="NO CHARACTER SHOULD BE PRESENT IN CUSTOMER NAME")
	@NotEmpty(message="CUSTOMER NAME CANT BE EMPTY")
	private String name;
	@Column(name="Customer_Contact",length=20)
	@Pattern(regexp="(^[0-9]*$)",message="CONTACT MUST BE A NUMBER")
	@NotEmpty(message="CUSTOMER CONTACT CANT BE EMPTY")
	private String Contact;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	

}
