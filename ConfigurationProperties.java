package com.juaracoding.wptesting.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")

public class ConfigurationProperties {
	
	@Value("${browser}")
	private String browser;
	
	@Value("${myusername}")
	private String userName;
	
	@Value("${email}")
	private String email;
	
	
	@Value("${password}")
	private String password;
	
	@Value("${displayname}")
	private String displayName;
	
	@Value("${displaynamedashboard}")
	private String displayNameDashboard;
	

	@Value("${displaynamepost}")
	private String displayNamePost;

	@Value("${search}")
	private String search;
	
	@Value("${searchshoes}")
	private String searchshoes;
	
	
	
	@Value("${firstname}")
	private String firstname;
	
	
	@Value("${lastname}")
	private String lastname;
	
	@Value("${company}")
	private String company;
	
	@Value("${alamat1}")
	private String alamat1;
	
	@Value("${alamat2}")
	private String alamat2;
	
	@Value("${kota}")
	private String kota;
	
	@Value("${kodepos}")
	private String kodepos;
	
	@Value("${telepon}")
	private String telepon;
	
	@Value("${additional}")
	private String additional;
	
	


	
	
//////////
	

	public String getSearchshoes() {
		return searchshoes;
	}

	public String getSearch() {
		return search;
	}

	public String getBrowser() {
		return browser;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getDisplayName() {
		return displayName;
	}
	public String getDisplayNameDashboard() {
		return displayNameDashboard;
	}
	public String getDisplayNamePost() {
		return displayNamePost;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getCompany() {
		return company;
	}

	public String getAlamat1() {
		return alamat1;
	}

	public String getAlamat2() {
		return alamat2;
	}

	public String getKota() {
		return kota;
	}

	public String getKodepos() {
		return kodepos;
	}

	public String getTelepon() {
		return telepon;
	}

	public String getAdditional() {
		return additional;
	}


	
	


}
