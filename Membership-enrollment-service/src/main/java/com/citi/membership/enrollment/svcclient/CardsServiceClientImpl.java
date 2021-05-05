/**@Copyright 2021. All rights are reserved,you should disclose the infromation,otherwise terms and conditions will apply.  
 * 
 * 
 */
package com.citi.membership.enrollment.svcclient;

import java.util.List;

import com.citi.membership.enrollment.model.CardDetailsRequest;
import com.citi.membership.enrollment.model.CardDetailsResponse;

/**
 * @author    ::asus
 * @Date      ::May 3, 2021
 * Description::
 */
public class CardsServiceClientImpl implements CardsServiceClient {

	public List<String> getCards(String cardNum) {
		// TODO ::Write rest client code to connect CardDetailsService and get the details
		return null;
	}

	public CardDetailsResponse getCardDetails(String cardNum) {
		
		// TODO ::Write rest client code to connect CardDetailsService and get the details
		
		return null;
	}

	public CardDetailsResponse getAllCardDetails(CardDetailsRequest cardDetailsRequest) {
		
		// TODO ::Write rest client code to connect CardDetailsService and get the details
		return null;
	}

}
