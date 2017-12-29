package com.genpact.mongodb.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.genpact.mongodb.pojo.Student;

public interface StudentRepository extends CrudRepository<Student, String> {
	List<Student> findByName(String name);
	List<Student> findByNameLike(String name);
	/**
	 * 方法名:searchStudent
	 * 描    述:不用spring data 自定义查询
	 * 返回值:Iterable<Student>
	 * 参    数:@param name
	 * 参    数:@param benginAge
	 * 参    数:@param endAge
	 * 参    数:@return
	 * 作    者:710009498
	 * 时    间:Dec 10, 2015 4:31:26 PM
	 * http://www.51testing.com/html/57/60357-842145.html
	 * http://www.cnblogs.com/chen-lei/archive/2011/08/18/2144390.html
	 */
	@Query("{'name' : {'$regex': ?0, $options: 'i'}}")
	public List<Student> searchStudent(String name);
	
	@Query("{'age': {$gt:?0,$lt:?1}}")
	public List<Student> searchStudent(int benginAge,int endAge);
	
	//正则匹配student的name字段的值和nameLike的值,
	//student 的age字段的值是否>beginage and < endage
	@Query("{'name' : {'$regex': ?0, $options: 'i'},'age': {$gt:?1,$lt:?2}}")
	public List<Student> searchStudent(String nameLike,int benginAge,int endAge);
}
