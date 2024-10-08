package com.projectwork.service;

import java.util.List;

import com.projectwork.dto.AssetDto;
import com.projectwork.model.Asset;

public interface AssetService {
	

	public Asset saveassetInfo(AssetDto assetDto);

	public List<Asset> getassetInfo();

}
