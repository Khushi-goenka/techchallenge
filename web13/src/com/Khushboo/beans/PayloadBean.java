package com.Khushboo.beans;

public class PayloadBean {
	UserBean user;
	public UserBean getUser() {
		return user;
	}
	public void setUser(UserBean user) {
		this.user = user;
	}
	CompanyBean company;
    OrderBean order;
    NoticeBean notice;
    public NoticeBean getNotice() {
		return notice;
	}
	public void setNotice(NoticeBean notice) {
		this.notice = notice;
	}
	ConfigurationBean configuration;
   
	
	AccountBean account;
    AddonInstanceBean addonInstance;
    public ConfigurationBean getConfiguration() {
		return configuration;
	}
	public void setConfiguration(ConfigurationBean configuration) {
		this.configuration = configuration;
	}
	AddonBindingBean addonBinding;
    
	
	public AddonInstanceBean getAddonInstance() {
		return addonInstance;
	}
	public void setAddonInstance(AddonInstanceBean addonInstance) {
		this.addonInstance = addonInstance;
	}
	public AccountBean getAccount() {
		return account;
	}
	public void setAccount(AccountBean account) {
		this.account = account;
	}
	public CompanyBean getCompany() {
		return company;
	}
	public void setCompany(CompanyBean company) {
		this.company = company;
	}

	
	
	public AddonBindingBean getAddonBinding() {
		return addonBinding;
	}
	public void setAddonBinding(AddonBindingBean addonBinding) {
		this.addonBinding = addonBinding;
	}
	public OrderBean getOrder() {
		return order;
	}
	public void setOrder(OrderBean order) {
		this.order = order;
	}
	
	
	

}
