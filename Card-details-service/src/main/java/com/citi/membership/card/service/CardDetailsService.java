/**@Copyright 2021. All rights are reserved,you should disclose the infromation,otherwise terms and conditions will apply.  
 * 
 * 
 */
package com.citi.membership.card.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.citi.membership.card.model.CardDetailsRequest;
import com.citi.membership.card.model.CardDetailsResponse;

/**
 * @author    ::asus
 * @Date      ::May 3, 2021
 * Description::
 */
public interface CardDetailsService {

	List<String> getCards(String cardNum);

	CardDetailsResponse getCardsDetails(String cardNum);

	CardDetailsResponse getAllCardsDetails(CardDetailsRequest cardDetailsRequest);


}