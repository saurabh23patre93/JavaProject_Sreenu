/**@Copyright 2021. All rights are reserved,you should disclose the infromation,  
 * otherwise terms and conditions will apply.
 * 
 */
package com.citi.membership.enrollment.dao;

import com.citi.membership.enrollment.exception.BusinessException;
import com.citi.membership.enrollment.exception.SystemException;
import com.citi.membership.enrollment.model.EnrollmentDaoRequest;
import com.citi.membership.enrollment.model.EnrollmentDaoResponse;

/**
 * @author    ::asus
 * @Date      ::Apr 29, 2021
 * Description::
 */
public class EnrollmentDaoImpl implements EnrollmentDao {

	public EnrollmentDaoResponse createEnrollment(EnrollmentDaoRequest enrollmentDaoRequest) throws BusinessException, SystemException  {
		
		System.out.println("Enter into dao--start");
		//1.Get the request from service
		
		//2.Prepare the request for db i.e. prepare the db queries
		
		//3.Call db and get the db response i.e. Resultset
		
		String dbResponseCode="0";//replace with db Resposense
		String dbResponseMsg="success";
		
		
		//4.Prepare the dao response
		EnrollmentDaoResponse daoResponse=new EnrollmentDaoResponse();
		if("0".equals(dbResponseCode)) {
			//Response dao response with ResultSet
			daoResponse.setAckNum("1212abc");
			daoResponse.setEnrollmentStatus("Enrollment Successfull");
			daoResponse.setResponseCode("0");
			daoResponse.setResponseMsg("Success");
			daoResponse.setDiscription("It is enrollment object call");
		}else if("100".equals(dbResponseCode) ||"101".equals(dbResponseCode) ||"102".equals(dbResponseCode)) {
			//TODO::handle  business exception
			throw new BusinessException(dbResponseCode, dbResponseMsg);
		
		}else {
			//TODO::handle system exception
			throw new SystemException(dbResponseCode, dbResponseMsg);
		}
			System.out.println("Exit from dao--end"+daoResponse);
		
		return daoResponse;
	}

}
