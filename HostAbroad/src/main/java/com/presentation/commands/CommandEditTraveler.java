package com.presentation.commands;

import java.util.ArrayList;

import com.business.TUser;
import com.business.ASFactory.ASFactory;
import com.business.ASSearch.ASSearch;

public class CommandEditTraveler extends Command {

	@Override
	public Pair<Integer, Object> execute(Object transfer) {
		
		TUser travelerInfo = (TUser)transfer;
		ASUser asUser = ASFactory.getInstance().createASUser(travelerInfo); //crea ASUser y
		int result = asUser.editTraveler();
		
		return new Pair<Integer,Object>(result,transfer);
	}

}
