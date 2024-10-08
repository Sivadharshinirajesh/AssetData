package com.projectwork.service;

import java.util.List;

import com.projectwork.dto.SignInDto;
import com.projectwork.model.SignIn;

public interface SignInService {
	public SignIn savedetail(SignInDto signinDto);

	public List<SignIn> getsigninInfo();

}
