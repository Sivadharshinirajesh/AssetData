package com.projectwork.service;

import java.util.List;

import com.projectwork.dto.SignUpDto;
import com.projectwork.model.SignUp;

public interface SignUpService {
	public SignUp saveInfo(SignUpDto signUpDto);

	public List<SignUp> signupdetails();

}
