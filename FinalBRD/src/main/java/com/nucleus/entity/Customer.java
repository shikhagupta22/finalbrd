package com.nucleus.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name="customer_shikha")
public class Customer extends Person
{
	@NotEmpty(message="CUSTOMER ADDRESS CANNOT BE EMPTY")
	@Column(name="Customer_Address",length=100)
	private String address;
	@Column(name="Customer_PinCode",length=6)
	@Size(min=6,max=6,message="PIN CODE MUST BE OF LENGTH 6")
	@NotEmpty(message="CUSTOMER PINCODE CANNOT BE EMPTY")
	@Pattern(regexp="(^[0-9]*$)",message="NO CHARACTER SHOULD BE PRESENT")
	private String pinCode;
	@Column(name="Customer_Email",length=100)
	@Email(message="EMAIL ADDRESS MUST BE IN VALID FORMAT")
	@NotEmpty(message="EMAIL ADDRESS CANT BE EMPTY ")
	private String email;
	@Column(name="Customer_RegistrationDate")
	//@Temporal(TemporalType.DATE)
	private String registrationDate;
	@Column(name="Customer_CreatedBy")
	private String createdBy;
	@Column(name="Customer_ModifiedBy")
	//@Temporal(TemporalType.DATE)
	private String modifiedDate;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	
	

}
