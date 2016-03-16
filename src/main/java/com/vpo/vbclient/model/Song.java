package com.vpo.vbclient.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Song {
	
	public Song() {
		super();
	}
	
	private Integer id;
	private String title;
	private String artist;
	private String language;
	@JsonProperty("play_count")
	private Integer playCount;
	@JsonProperty("added_on")
	private String addedOn;
	private Set<String> tags;
	@JsonProperty("locations_limited_to")
	private Set<String> limitedTo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Integer getPlayCount() {
		return playCount;
	}
	public void setPlayCount(Integer playCount) {
		this.playCount = playCount;
	}
	public String getAddedOn() {
		return addedOn;
	}
	public void setAddedOn(String addedOn) {
		this.addedOn = addedOn;
	}
	public Set<String> getTags() {
		return tags;
	}
	public void setTags(Set<String> tags) {
		this.tags = tags;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist
				+  ", id=" + id + "]";
	}
	
	

	
}
