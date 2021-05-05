/**@Copyright 2021. All rights are reserved,you should disclose the infromation,otherwise terms and conditions will apply.  
 * 
 * 
 */
package com.citi.membership.enrollment.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.citi.membership.enrollment.exception.EnrollmentRequestValidationException;
import com.citi.membership.enrollment.model.EnrollmentResponse;
import com.citi.membership.enrollment.model.StatusBlock;

import lombok.val;

/**
 * @author    ::asus
 * @Date      ::May 1, 2021
 * Description::
 */
@ControllerAdvice
public class EnrollmentControllerAdvice {

	@ExceptionHandler(value=EnrollmentRequestValidationException.class)
	@ResponseBody
	public EnrollmentResponse handleRequstInvalidException(EnrollmentRequestValidationException exception) {
		
		//TODO::need to implement error logs
		
		EnrollmentResponse enrollmentResponse=new EnrollmentResponse();
		
		StatusBlock statusBlock=new StatusBlock();
		statusBlock.setResponseCode(exception.getResponseCode());
		statusBlock.setResponseMsg(exception.getResponseMsg());
		
		enrollmentResponse.setStatusBlock(statusBlock);
		
		return enrollmentResponse;
		
	}
}
