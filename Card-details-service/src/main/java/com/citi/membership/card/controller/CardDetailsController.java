/**@Copyright 2021. All rights are reserved,you should disclose the infromation,otherwise terms and conditions will apply.  
 * 
 * 
 */
package com.citi.membership.card.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.citi.membership.card.model.CardDetailsRequest;
import com.citi.membership.card.model.CardDetailsResponse;

/**
 * @author    ::asus
 * @Date      ::May 3, 2021
 * Description::
 */
@RestController
@RequestMapping(value = "/v1")
public class CardDetailsController {

	@RequestMapping(value = "/cards/{cardNum}",method = RequestMethod.GET,produces = "application/json")
	@ResponseBody
	public List<String> getCards(@PathVariable("cardNum") String cardNum,
			@RequestHeader(name="clientId",required = true) String clientId,
			@RequestHeader(name="requestId",required = true) String requestId,
			@RequestHeader(name="msgTs",required = true) String msgIs){

		//1.Get the request from consumer
		//2.Validate the reqeust
		//3.Prepare the request for service
		//4.Call service and get the service response
		//5.Handler the exception if any comes from service class
		//6.Prepare the controller response

		return null;
	}

	@RequestMapping(value = "/carddetails/{cardNum}",method = RequestMethod.GET,produces = "application/json")
	@ResponseBody
	public CardDetailsResponse getCardsDetails(@PathVariable("cardNum") String cardNum,
			@RequestHeader(name="clientId",required = true) String clientId,
			@RequestHeader(name="requestId",required = true) String requestId,
			@RequestHeader(name="msgTs",required = true) String msgIs){

		//1.Get the request from consumer
		//2.Validate the reqeust
		//3.Prepare the request for service
		//4.Call service and get the service response
		//5.Handler the exception if any comes from service class
		//6.Prepare the controller response

		return null;
	}

	@RequestMapping(value = "/allcards/{cardNum}",method = RequestMethod.POST,produces = "application/json",consumes = "application/json")
	@ResponseBody
	public CardDetailsResponse getAllCardsDetails(@RequestBody CardDetailsRequest cardDetailsRequest,
			@RequestHeader(name="clientId",required = true) String clientId,
			@RequestHeader(name="requestId",required = true) String requestId,
			@RequestHeader(name="msgTs",required = true) String msgIs){

		//1.Get the request from consumer
		//2.Validate the reqeust
		//3.Prepare the request for service
		//4.Call service and get the service response
		//5.Handler the exception if any comes from service class
		//6.Prepare the controller response

		return null;
	}

	@RequestMapping(value = "/health",method = RequestMethod.GET,produces = "application/json")
	@ResponseBody
	public String healthCheck() {
		return "Service is up and running";
	}
}
