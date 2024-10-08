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

import com.projectwork.dto.AssetDto;
import com.projectwork.model.Asset;
import com.projectwork.service.AssetService;

@RestController
@RequestMapping("/Asset")
public class AssetController {
	@Autowired
	private AssetService assetService;

	@PostMapping("/saveasset")
	public Map<String, Object> saveasset(@RequestBody AssetDto assetDto) {
		Asset asset = assetService.saveassetInfo(assetDto);
		Map<String, Object> responsive = new HashMap<>();
		if (asset != null) {
			responsive.put("Status", HttpStatus.OK);
			responsive.put("message", "sucess");
			responsive.put("timestamp", new Date());
			return responsive;
		}
		responsive.put("Status", HttpStatus.BAD_REQUEST);
		responsive.put("message", "failed");
		responsive.put("timestamp", new Date());

		return responsive;

	}
	@GetMapping("/GetAsset")
	public List<Asset>getasset(){
		return assetService.getassetInfo();
	}
}