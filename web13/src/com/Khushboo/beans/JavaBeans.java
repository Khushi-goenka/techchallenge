package com.Khushboo.beans;

public class JavaBeans {
	String type;
	MarketplaceBean marketplace;
	String applicationUuid;
	String flag;
	CreatorBean creator;
	PayloadBean payload;
	String returnUrl;
	
	int[] links ;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public MarketplaceBean getMarketplace() {
		return marketplace;
	}
	public void setMarketplace(MarketplaceBean marketplace) {
		this.marketplace = marketplace;
	}
	public String getApplicationUuid() {
		return applicationUuid;
	}
	public void setApplicationUuid(String applicationUuid) {
		this.applicationUuid = applicationUuid;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public CreatorBean getCreator() {
		return creator;
	}
	public void setCreator(CreatorBean creator) {
		this.creator = creator;
	}
	public PayloadBean getPayload() {
		return payload;
	}
	public void setPayload(PayloadBean payload) {
		this.payload = payload;
	}
	public String getReturnUrl() {
		return returnUrl;
	}
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}
	public int[] getLinks() {
		return links;
	}
	public void setLinks(int[] links) {
		this.links = links;
	}

}
