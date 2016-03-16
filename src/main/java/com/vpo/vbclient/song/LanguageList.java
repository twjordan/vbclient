package com.vpo.vbclient.song;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class LanguageList {
	
	public List<Language> languages;
	
	public LanguageList() {
		super();
	}
	
	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	@JsonIgnoreProperties(ignoreUnknown=true)
	public static class Language {
		public String language;
		@JsonProperty("artist_count")
		public Integer artistCount;
		@JsonProperty("song_count")
		public Integer songCount;
		
		public Language() {
			super();
		}
		
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		public Integer getArtistCount() {
			return artistCount;
		}
		public void setArtistCount(Integer artistCount) {
			this.artistCount = artistCount;
		}
		public Integer getSongCount() {
			return songCount;
		}
		public void setSongCount(Integer songCount) {
			this.songCount = songCount;
		}
		
	}
}
