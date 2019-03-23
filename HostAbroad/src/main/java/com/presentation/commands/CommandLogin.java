package com.presentation.commands;

import java.util.ArrayList;

import com.business.TUser;
import com.business.ASFactory.ASFactory;
import com.business.ASSearch.ASSearch;

public class CommandLogin extends Command {

	@Override
	public Pair<Integer, Object> execute(Object transfer) {
		int result;
		ASSearch saSearch = ASFactory.getInstance().createASSearch();
		TUser logedUser = saUser.loginUser();
		result = logedUser == null ? 0 : 1;
		
		return new Pair<Integer,Object>(result,logedUser);
	}

}
