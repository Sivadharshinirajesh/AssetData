package com.projectwork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectwork.dto.AssetDto;
import com.projectwork.model.Asset;
import com.projectwork.repository.AssetRepositoryService;
@Service

public class AssetServiceImpl implements AssetService {
	@Autowired 
	private AssetRepositoryService assetRepositoryService;

	@Override
	public Asset saveassetInfo(AssetDto assetDto) {
		Asset asset=new Asset();
		asset.setId(assetDto.getId());
		asset.setAssetName(assetDto.getAssetName());
		asset.setAssetmodel(assetDto.getAssetmodel());
		asset.setModelnumber(assetDto.getModelnumber());
		asset.setAssetstatus(assetDto.getAssetstatus());
		asset.setAssignlocation(assetDto.getAssignlocation());
		asset.setPurchaseDate(assetDto.getPurchaseDate());
		
		return  assetRepositoryService.save(asset);
	}

	@Override
	public List<Asset> getassetInfo() {
		return assetRepositoryService.findAll() ;
	}

}
