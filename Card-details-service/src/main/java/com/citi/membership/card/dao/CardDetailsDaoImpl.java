/**@Copyright 2021. All rights are reserved,you should disclose the infromation,otherwise terms and conditions will apply.  
 * 
 * 
 */
package com.citi.membership.card.dao;

import java.util.List;

import com.citi.membership.card.model.CardDetailsDaoRequest;
import com.citi.membership.card.model.CardDetailsDaoResponse;
import com.citi.membership.card.model.CardDetailsRequest;
import com.citi.membership.card.model.CardDetailsResponse;

/**
 * @author    ::asus
 * @Date      ::May 3, 2021
 * Description::
 */
public class CardDetailsDaoImpl implements CardDetailsDao {

	public List<String> getCards(String cardNum) {

		//1.Get the request from service
		//2.Prepare the request for db
		//3.Call db and get the response
		//4.If the response is succes  the prepare DAO Response else prepare exception
		//5.Send either daoResponse or exception to service

		return null;
	}

	public CardDetailsResponse getCardsDetails(String cardNum) {

		//1.Get the request from service
		//2.Prepare the request for db
		//3.Call db and get the response
		//4.If the response is succes  the prepare DAO Response else prepare exception
		//5.Send either daoResponse or exception to service

		return null;
	}

	public CardDetailsDaoResponse getAllCardsDetails(CardDetailsDaoRequest cardDetailsDaoRequest) {

		//1.Get the request from service
		//2.Prepare the request for db
		//3.Call db and get the response
		//4.If the response is succes  the prepare DAO Response else prepare exception
		//5.Send either daoResponse or exception to service

		return null;
	}

}
