package com.projectwork.dto;

public class AssetDto {
	private String modelnumber;
	private String assetName;
	private long id;
	private String assetmodel;
	private String assetstatus;
	private String assignlocation;
	private String purchaseDate;
	public AssetDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AssetDto(String modelnumber, String assetName, long id, String assetmodel, String assetstatus,
			String assignlocation, String purchaseDate) {
		super();
		this.modelnumber = modelnumber;
		this.assetName = assetName;
		this.id = id;
		this.assetmodel = assetmodel;
		this.assetstatus = assetstatus;
		this.assignlocation = assignlocation;
		this.purchaseDate = purchaseDate;
	}
	public String getModelnumber() {
		return modelnumber;
	}
	public void setModelnumber(String modelnumber) {
		this.modelnumber = modelnumber;
	}
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAssetmodel() {
		return assetmodel;
	}
	public void setAssetmodel(String assetmodel) {
		this.assetmodel = assetmodel;
	}
	public String getAssetstatus() {
		return assetstatus;
	}
	public void setAssetstatus(String assetstatus) {
		this.assetstatus = assetstatus;
	}
	public String getAssignlocation() {
		return assignlocation;
	}
	public void setAssignlocation(String assignlocation) {
		this.assignlocation = assignlocation;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
	
	
	
}
