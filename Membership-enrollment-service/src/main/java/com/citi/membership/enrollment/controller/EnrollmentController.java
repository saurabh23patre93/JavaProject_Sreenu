/**@Copyright 2021. All rights are reserved,you should disclose the infromation,

 * otherwise terms and conditions will apply.
 * 
 */
package com.citi.membership.enrollment.controller;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.citi.membership.enrollment.exception.BusinessException;
import com.citi.membership.enrollment.exception.EnrollmentRequestValidationException;
import com.citi.membership.enrollment.exception.SystemException;
import com.citi.membership.enrollment.model.EnrollmentRequest;
import com.citi.membership.enrollment.model.EnrollmentResponse;
import com.citi.membership.enrollment.service.EnrollmentService;
import com.citi.membership.enrollment.service.EnrollmentServiceImpl;
import com.citi.membership.enrollment.validator.EnrollmentRequestValidator;

/**
 * @author    ::asus
 * @Date      ::Apr 29, 2021
 * Description::
 */

@RestController
@RequestMapping(value = "/customer")
public class EnrollmentController {

	@RequestMapping(value = "/enrollment",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
	@ResponseBody
	public EnrollmentResponse createEnrollment(@RequestBody EnrollmentRequest enrollmentRequest) throws EnrollmentRequestValidationException, SystemException, BusinessException{

		System.out.println("Enter into Controller--start");
		//1.Get the request from consumers/clients.

		EnrollmentResponse enrollmentResponse=null;

		//2.Validate the request.
		EnrollmentRequestValidator validator=new EnrollmentRequestValidator();

		validator.validate(enrollmentRequest);

		//3.Prepare the request for service.
		//4.Call service and get the response.
		EnrollmentService service=new EnrollmentServiceImpl();
		enrollmentResponse = service.createEnrollment(enrollmentRequest);



		//5.Prepare the controller response.

		System.out.println("Exit from Controller--end");
		return enrollmentResponse;

	}

	@RequestMapping(value = "/health",method = RequestMethod.GET)
	public String healthCheck() {
		return "Service UP and Running.............s";
	}

}
