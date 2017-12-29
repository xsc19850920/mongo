package com.genpact.mongodb.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="student")
public class Student  {
	@Id
//	@GenericGenerator(name="generator",strategy="uuid.hex")
//	@GeneratedValue(generator="generator")
	private String id;
	
	private String name;
	
	private int age;
	
//	private School school;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	public School getSchool() {
//		return school;
//	}
//	public void setSchool(School school) {
//		this.school = school;
//	}
//	@PersistenceConstructor
//	public Student(String id, String name, int age, School school) {
//		this.id = id;
//		this.name = name;
//		this.age = age;
//		this.school = school;
//	}
	
	@Override
	public String toString() {
		return "{student --> id="+id+", name="+name+", age="+age+"}";
	}
	
	
}
