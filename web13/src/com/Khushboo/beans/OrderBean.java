package com.Khushboo.beans;

public class OrderBean {
	String editionCode;
	String addonOfferingCode;
	public String getEditionCode() {
		return editionCode;
	}
	public void setEditionCode(String editionCode) {
		this.editionCode = editionCode;
	}
	public String getAddonOfferingCode() {
		return addonOfferingCode;
	}
	public void setAddonOfferingCode(String addonOfferingCode) {
		this.addonOfferingCode = addonOfferingCode;
	}
	public String getPricingDuration() {
		return pricingDuration;
	}
	public void setPricingDuration(String pricingDuration) {
		this.pricingDuration = pricingDuration;
	}
	public ItemBean[] getItems() {
		return items;
	}
	public void setItems(ItemBean[] items) {
		this.items = items;
	}
	public String[] getCustomAttributes() {
		return customAttributes;
	}
	public void setCustomAttributes(String[] customAttributes) {
		this.customAttributes = customAttributes;
	}
	String pricingDuration;
	ItemBean [] items;
	String [] customAttributes;
	
}
