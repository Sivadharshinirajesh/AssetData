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

import com.projectwork.dto.SignUpDto;
import com.projectwork.model.SignUp;
import com.projectwork.service.SignUpService;

@RestController
@RequestMapping("signup")
public class SignupController {
	@Autowired
	private SignUpService signUpService;

	@PostMapping("/savesignup")
	public Map<String, Object> savesignup(@RequestBody SignUpDto signupDto) {
		SignUp signUp = signUpService.saveInfo(signupDto);
		Map<String, Object>respons=new HashMap<>();
		if (signUp.getEmail().equals("admin@gmail.com") && signUp.getPassword().equals("admin")) {
			respons.put("status",HttpStatus.OK);
			respons.put("message","success");
			respons.put("timestamp",new Date());
			return respons;
		}
		respons.put("status",HttpStatus.BAD_REQUEST);
		respons.put("message","failed");
		respons.put("timestamp",new Date());
		return respons;
	}
	@GetMapping("/getsignup")
	public List<SignUp> getsignupdetails(){
		return signUpService. signupdetails();
	}
	
	

}
