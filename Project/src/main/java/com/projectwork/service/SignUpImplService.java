package com.projectwork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectwork.dto.SignUpDto;
import com.projectwork.model.SignUp;
import com.projectwork.repository.SignUpRepositoryService;

@Service
public class SignUpImplService implements SignUpService {
	@Autowired
	 private SignUpRepositoryService signUpRepositoryService;

	@Override
	public SignUp saveInfo(SignUpDto signUpDto) {
		SignUp signup = new SignUp();
		signup.setUserName(signUpDto.getUserName());
		signup.setEmail(signUpDto.getEmail());
		signup.setPassword(signUpDto.getPassword());
		return signUpRepositoryService.save(signup);
	}

	@Override
	public List<SignUp> signupdetails() {
		
		return  signUpRepositoryService.findAll();
	}

}
