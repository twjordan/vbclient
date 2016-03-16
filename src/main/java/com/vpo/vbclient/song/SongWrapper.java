package com.vpo.vbclient.song;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vpo.vbclient.model.Song;

@JsonIgnoreProperties(ignoreUnknown=true)
class SongWrapper {
	
	
	public SongWrapper() {
		super();
	}

	private Song song;

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}
}
