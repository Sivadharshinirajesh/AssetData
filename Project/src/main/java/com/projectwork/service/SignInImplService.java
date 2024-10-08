package com.projectwork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectwork.dto.SignInDto;
import com.projectwork.model.SignIn;
import com.projectwork.repository.SignInRepositoryService;

@Service
public class SignInImplService implements SignInService {
	@Autowired
	 private SignInRepositoryService signInRepositoryService;

	@Override
	public SignIn savedetail(SignInDto signinDto) {
		SignIn signin = new SignIn();
		signin.seteMail(signinDto.getEmail());
		signin.setPassword(signinDto.getPassword());
		return signInRepositoryService.save(signin);
	}

	@Override
	public List<SignIn> getsigninInfo() {
		
		return signInRepositoryService.findAll();
	}

}
