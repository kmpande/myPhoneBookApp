package com.myPhBkWebApp.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "contacts")
@Getter
@Setter
@NoArgsConstructor
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "contact_id")
	private Integer contactId;
	
	@Column(name = "contact_name")
	private String contactName;
	
	@Column(name = "contact_number")
	private String contactNumber;
	
	@Column(name = "contact_email")
	private String contactEmail;
	
	@Column(name= "active_switch")
	private Character activeSwitch;
	
	@Column(name = "created_date", updatable = false)
	@CreationTimestamp
	private LocalDate createdDate;
	
	@Column(name = "updated_date" ,insertable = false)
	@UpdateTimestamp
	private LocalDate  updatedDate;
}

