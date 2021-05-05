package com.citi.membership.enrollment.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
public class EnrollmentResponse {
	
	private StatusBlock statusBlock;
	private String enrollmentStatus;
	
	private String description;
	private String ackNum;
}
