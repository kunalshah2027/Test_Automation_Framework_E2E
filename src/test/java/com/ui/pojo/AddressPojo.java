package com.ui.pojo;



public class AddressPojo {
	public String getCompany_() {
		return company_;
	}

	public void setCompany_(String company_) {
		this.company_ = company_;
	}

	public String getAddress1() {
		return address1;
	}

	@Override
	public String toString() {
		return "AddressPojo [company_=" + company_ + ", address1=" + address1 + ", address2=" + address2 + ", city_="
				+ city_ + ", post_=" + post_ + ", home_=" + home_ + ", mobile_=" + mobile_ + ", other_=" + other_
				+ ", address_=" + address_alias_ + ", state_=" + state_ + "]";
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity_() {
		return city_;
	}

	public void setCity_(String city_) {
		this.city_ = city_;
	}

	public String getPost_() {
		return post_;
	}

	public void setPost_(String post_) {
		this.post_ = post_;
	}

	public String getHome_() {
		return home_;
	}

	public void setHome_(String home_) {
		this.home_ = home_;
	}

	public String getMobile_() {
		return mobile_;
	}

	public void setMobile_(String mobile_) {
		this.mobile_ = mobile_;
	}

	public String getOther_() {
		return other_;
	}

	public void setOther_(String other_) {
		this.other_ = other_;
	}

	public String getaddress_alias_() {
		return address_alias_;
	}

	public void setaddress_alias_(String address_alias_) {
		this.address_alias_ = address_alias_;
	}

	public String getState_() {
		return state_;
	}

	public void setState_(String state_) {
		this.state_ = state_;
	}


	private String company_;
	private String address1;
	private String address2;
	private String city_;
	private String post_;
	private String home_;
	private String mobile_;
	private String other_;
	private String address_alias_;
	private String state_;
	 
	public AddressPojo(String company_, String address1, String address2, String city_, String post_, String home_,
			String mobile_, String other_, String address_alias_, String state_) {
		super();
		this.company_ = company_;
		this.address1 = address1;
		this.address2 = address2;
		this.city_ = city_;
		this.post_ = post_;
		this.home_ = home_;
		this.mobile_ = mobile_;
		this.other_ = other_;
		this.address_alias_ = address_alias_;
		this.state_ = state_;
	}


}
