package com.genpact.mongodb.pojo;

import java.util.Arrays;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="col")
public class Obj {
	private String title;
	private String _id;
	private String description;
	private String by;
	private String url;
	private String[] tags;
	private int likes;
	private Date date;
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
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Obj(String title, String _id, String description, String by, String url, String[] tags, int likes, Date date) {
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
	
	
	
	public Obj(String title, String _id, String description, String by, String url, String[] tags, int likes) {
		super();
		this.title = title;
		this._id = _id;
		this.description = description;
		this.by = by;
		this.url = url;
		this.tags = tags;
		this.likes = likes;
	}
	public Obj() {
		super();
	}
	@Override
	public String toString() {
		return "Obj [title=" + title + ", _id=" + _id + ", description=" + description + ", by=" + by + ", url=" + url + ", tags=" + Arrays.toString(tags) + ", likes=" + likes + ", date=" + date + "]";
	}

	
	

}
