package com.projectwork.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectwork.dto.SignInDto;
import com.projectwork.model.SignIn;
import com.projectwork.service.SignInService;

@RestController
@RequestMapping("SignIn")

public class SigninController {
	@Autowired
	private SignInService signInService;

	@PostMapping("/signin")
	public Map<String, Object> singin(@RequestBody SignInDto signinDto) {
		SignIn siginin = signInService.savedetail(signinDto);
Map<String, Object>response=new HashMap<>();
		if (siginin.geteMail().equals("admin@gmail.com") && (signinDto.getPassword().equals("admin"))) {
			response.put("Status", HttpStatus.OK);
			response.put("message", "sucess");
			response.put("timestamp", new Date());
			return response;
		}

		response.put("Status", HttpStatus.BAD_REQUEST);
		response.put("message", "failed");
		response.put("timestamp", new Date());
		return response; 
	}
	@GetMapping("/getSign")
	public List<SignIn>getsign(){
		return signInService.getsigninInfo();
	}

}
