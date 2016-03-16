package com.vpo.vbclient.queue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class PlayRequest {
	


//	room_code (required)
//	The 4-letter code displayed in the room at Voicebox
//	Without this code, clients are not able to access the queue
//
//	song_id (required)
//	The numeric song id, typically found by browsing or searching for songs
//	This may be a comma-separated list of song ids, to add multiple songs at once
//
//	to (optional)
//	Either a play_id or an index, indicating the new destination in the queue
//	If a play_id is used, then the song will be moved to the position of the given play_id
//	The index may be negative, indicating a relative position from the end
//	defaults to -1, adding the song to the end of the queue
//
//	allow_duplicate (optional)
//	A boolean value, indicating whether adding a song should be checked
//	against the songs already in the queue, to prevent consecutive songs with the same song_id.
//	Adding the same song in a non-consecutive position is always allowed.
//	defaults to false, which prevents adding back-to-back songs
//
//	message (optional)
//	A message that will be displayed in the queue next to the song.
//	Note that when a logged-in user adds a song, they will have their handle displayed,
//	and providing an explicit message will override the handle in that case.
//
//	message_color (optional)
//	Set the color for the message.
//	Should be a standard web format like #1122FF.
//	Defaults to #999999 (gray)
	
	public PlayRequest() {
		super();
	}
	
	public PlayRequest(String roomCode, Integer songId) {
		super();
		this.roomCode = roomCode;
		this.songId = songId;
	}
	
	@JsonProperty("room_code")
	private String roomCode;
	@JsonProperty("song_id")
	private Integer songId;
	private String playId;
	private String to;
	private String from;
	@JsonProperty("allow_duplicate")
	private boolean allowDuplicate;
	private String message;
	@JsonProperty("message_color")
	private String messageColor;
	public String getRoomCode() {
		return roomCode;
	}
	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}
	public Integer getSongId() {
		return songId;
	}
	public void setSongId(Integer songId) {
		this.songId = songId;
	}
	public String getPlayId() {
		return playId;
	}

	public void setPlayId(String playId) {
		this.playId = playId;
	}

	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public boolean isAllowDuplicate() {
		return allowDuplicate;
	}
	public void setAllowDuplicate(boolean allowDuplicate) {
		this.allowDuplicate = allowDuplicate;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessageColor() {
		return messageColor;
	}
	public void setMessageColor(String messageColor) {
		this.messageColor = messageColor;
	}
	
	
	
}
