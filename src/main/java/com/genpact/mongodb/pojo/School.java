package com.genpact.mongodb.pojo;


import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="school")
public class School{
	@Id
//	@GenericGenerator(name="generator",strategy="uuid.hex")
//	@GeneratedValue(generator="generator")
	private String id;
	
	private String name;
	
//	@DBRef(db = "student")
	private List<Student> students;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
//	@PersistenceConstructor
//	public School(String name) {
//		this.name = name;
//	}
	@Override
	public String toString() {
		return "{school --> id:"+id+" , name:"+name+"}";
	}
	

	
}
