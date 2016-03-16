package com.vpo.vbclient.song;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class FavoriteResponse {

	@JsonProperty("song_id")
	private Integer songId;
	private boolean added;
	
	public FavoriteResponse() {
		super();
	}
	
	public Integer getSongId() {
		return songId;
	}
	public void setSongId(Integer songId) {
		this.songId = songId;
	}
	public boolean isAdded() {
		return added;
	}
	public void setAdded(boolean added) {
		this.added = added;
	}
	
	
	
}
