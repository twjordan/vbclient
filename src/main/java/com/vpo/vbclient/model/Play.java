package com.vpo.vbclient.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Play {
	
	public Play() {
			super();
		}
//  "current_song": {
//  "song_id": 68250,
//  "play_id": "G-Test-6c4008b3e6c4-1435717763903-2",
//  "title": "Beautiful, Dirty, Rich",
//  "artist": "Lady Gaga",
//  "duration": 170000,
//  "position": 30000,
//  "paused": false
//},
	@JsonProperty("song_id")
	private Integer songId;
	@JsonProperty("play_id")
	private String playId;
	private Integer index;
	private String title;
	private String artist;
	private Integer duration;
	private Integer position;
	private Long estimatedPlayTime;
	private boolean paused;
	
	public Integer getId() {
		return songId;
	}
	public void setId(Integer id) {
		this.songId = id;
	}
	public String getPlayId() {
		return playId;
	}
	public void setPlayId(String playId) {
		this.playId = playId;
	}
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
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
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public Long getEstimatedPlayTime() {
		return estimatedPlayTime;
	}
	public void setEstimatedPlayTime(Long estimatedPlayTime) {
		this.estimatedPlayTime = estimatedPlayTime;
	}
	public boolean isPaused() {
		return paused;
	}
	public void setPaused(boolean paused) {
		this.paused = paused;
	}
	@Override
	public String toString() {
		return "Play [songId=" + songId + ", playId=" + playId + ", index="
				+ index + ", title=" + title + ", artist=" + artist + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((playId == null) ? 0 : playId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Play other = (Play) obj;
		if (playId == null) {
			if (other.playId != null)
				return false;
		} else if (!playId.equals(other.playId))
			return false;
		return true;
	}
	
	
	
}
