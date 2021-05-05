/**@Copyright 2021. All rights are reserved,you should disclose the infromation,otherwise terms and conditions will apply.  
 * 
 * 
 */
package com.citi.membership.card.dao;

import java.util.List;

import com.citi.membership.card.model.CardDetailsDaoRequest;
import com.citi.membership.card.model.CardDetailsDaoResponse;
import com.citi.membership.card.model.CardDetailsResponse;
	
/**
 * @author    ::asus
 * @Date      ::May 3, 2021
 * Description::
 */
public interface CardDetailsDao {

	List<String> getCards(String cardNum);

	CardDetailsResponse getCardsDetails(String cardNum);

	CardDetailsDaoResponse getAllCardsDetails(CardDetailsDaoRequest cardDetailsDaoRequest);

}
