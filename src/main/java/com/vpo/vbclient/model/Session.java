package com.vpo.vbclient.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Session {
	
	public Session(String session) {
		super();
		this.session = session;
	}
	
	public Session() {
		super();
	}

	private String session;
	private String email;
	private String handle;
	private String color;
	@JsonProperty("hide_handle_in_queue")
	private boolean hideHandle;
	
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHandle() {
		return handle;
	}
	public void setHandle(String handle) {
		this.handle = handle;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isHideHandle() {
		return hideHandle;
	}
	public void setHideHandle(boolean hideHandle) {
		this.hideHandle = hideHandle;
	}

	@Override
	public String toString() {
		return "Session [session=" + session + ", email=" + email + ", handle="
				+ handle + "]";
	}
	
	
	
}
