package com.projectwork.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="asset")
public class Asset {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="Model_Number")
	private String modelnumber;
	@Column(name="Asset_Name")
	private String assetName;
	@Column(name=" Asset_Models")
	private String assetmodel;
	@Column(name="Asset_Status")
	private String assetstatus;
	@Column(name="Assign-Location")
	private String assignlocation;
	@Column(name="Purchase_Date")
	private String purchaseDate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
