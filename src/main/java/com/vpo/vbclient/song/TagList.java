package com.vpo.vbclient.song;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class TagList {
	
	public List<Category> categories;
	
	public TagList() {
		super();
	}
	
	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	@JsonIgnoreProperties(ignoreUnknown=true)
	public static class Tag {
		public String name;
		@JsonProperty("song_count")
		public Integer songCount;
		
		public Tag() {
			super();
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getSongCount() {
			return songCount;
		}

		public void setSongCount(Integer songCount) {
			this.songCount = songCount;
		}
		
		
	}
	
	@JsonIgnoreProperties(ignoreUnknown=true)
	public static class Category {
		@JsonProperty("category_name")
		public String name;
		public List<Tag> tags;
		
		public Category() {
			super();
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<Tag> getTags() {
			return tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}
	}

}
