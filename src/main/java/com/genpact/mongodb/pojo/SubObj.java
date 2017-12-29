package com.genpact.mongodb.pojo;

import java.text.SimpleDateFormat;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="col")
public class SubObj {
	private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	private String title;
	private String _id;
	private String description;
	private String by;
	private String url;
	private String[] tags;
	private int likes;
	private String date;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBy() {
		return by;
	}
	public void setBy(String by) {
		this.by = by;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public SubObj(String title, String _id, String description, String by, String url, String[] tags, int likes, String date) {
		super();
		this.title = title;
		this._id = _id;
		this.description = description;
		this.by = by;
		this.url = url;
		this.tags = tags;
		this.likes = likes;
		this.date = date;
	}
	public SubObj() {
		super();
	}

	
	

}
