package com.project.staragile;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor {
	
	@Id
	private String doctorRegistrationId;
	
	private String doctorName;
	
	private String doctorSpeciality;
	
	private String doctorExperience;

	public Doctor(String doctorRegistrationId, String doctorName, String doctorSpeciality, String doctorExperience) {
		super();
		this.doctorRegistrationId = doctorRegistrationId;
		this.doctorName = doctorName;
		this.doctorSpeciality = doctorSpeciality;
		this.doctorExperience = doctorExperience;
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDoctorRegistrationId() {
		return doctorRegistrationId;
	}

	public void setDoctorRegistrationId(String doctorRegistrationId) {
		this.doctorRegistrationId = doctorRegistrationId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorSpeciality() {
		return doctorSpeciality;
	}

	public void setDoctorSpeciality(String doctorSpeciality) {
		this.doctorSpeciality = doctorSpeciality;
	}

	public String getDoctorExperience() {
		return doctorExperience;
	}

	public void setDoctorExperience(String doctorExperience) {
		this.doctorExperience = doctorExperience;
	}
	
	

}
