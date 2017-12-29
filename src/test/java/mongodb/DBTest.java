package mongodb;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.time.DateUtils;
import org.bson.BSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoDbUtils;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.UpdateMapper;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.BasicUpdate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.util.DBObjectUtils;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.genpact.mongodb.dao.SchoolRepository;
import com.genpact.mongodb.dao.StudentRepository;
import com.genpact.mongodb.pojo.Obj;
import com.genpact.mongodb.pojo.School;
import com.genpact.mongodb.pojo.Student;
import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import com.mongodb.MongoURI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationcontext.xml" })
public class DBTest {
	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private SchoolRepository schoolRepository;

	@Autowired
	private MongoTemplate mongoTemplate;

	@Test
	public void oldMethod() {

		

		List<Obj> list = mongoTemplate.find(new BasicQuery("{date : {$gte:{$date:'2012-12-08T00:00:00.000Z'},$lt:{$date:'2016-11-09T00:00:00.000Z'}}}"), Obj.class);
		for (Obj obj : list) {
			System.out.println(">>>>>>>>>>>>>>>>>>>> " + obj.toString());
		}
//		mongoTemplate.updateFirst(new BasicQuery("{'title' : 'MongoDB Study'}"), new BasicUpdate("{'title' : 'MongoDB Study sxia'}"), Obj.class);
		
//		Query query = new Query(Criteria.where("title").is("test title"));
//		Obj obj = mongoTemplate.findOne(query, Obj.class);
//		mongoTemplate.execute(new DbCallback<Obj>(){
//			public Obj doInDB(DB db) throws MongoException, DataAccessException {
//				String s = db.toString();
//				return null;
//			}
//			
//		});
//		System.out.println("json obj : "+obj);
	}
	
	
	
	@Test
	public void saveObj(){
		Obj obj = new Obj("test title","id 5","desc 1111 ","sxia","url",new String[]{"tag1"},12,DateUtils.addYears(new Date(), -3));
//		Obj obj = new Obj("test title","id 3","desc 1111 ","sxia","url",new String[]{"tag1"},12);
//		JsonConfig config = new JsonConfig();
//		config.registerJsonValueProcessor(Date.class, new JsonValueProcessor() {
//			
//			public Object processObjectValue(String arg0, Object arg1, JsonConfig arg2) {
//				return process(arg1);
//			}
//			
//			public Object processArrayValue(Object arg0, JsonConfig arg1) {
//				return process(arg0);
//			}
//			
//			private Object process(Object value){
//				if(value instanceof Date){
//					return format.format((Date)value);
//				}
//				return null;
//			}
//		});
		
	
		//mongoTemplate.dropCollection("col");
		mongoTemplate.insert(obj);
		
		//BasicDBObject index = new BasicDBObject("title", "text");
		//mongoTemplate.getCollection("col").createIndex(index);
		
//		mongoTemplate.getCollection("col").createIndex(new BasicDBObject("title", "text"));
	
		
//		mongoTemplate.remove(new Query(Criteria.where("_id").is("id 1")), obj.getClass());
		
		
		
	}
	
	@Test
	public void createIndex(){
		
		List<DBObject> indexList = mongoTemplate.getCollection("col").getIndexInfo();
		mongoTemplate.dropCollection("col");
		Obj obj = new Obj("test title","id 1","desc 1111 ","sxia","url",new String[]{"tag1"},12,new Date());
		mongoTemplate.insert(obj);
		BasicDBObject index = new BasicDBObject();
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		map.put("title", 1);
		index.put("title", 1);
//		map.clear();
		mongoTemplate.getCollection("col").createIndex(index);
		
		
		index = new BasicDBObject();
//		map.put("url", 1);
		index.put("url", 1);
//		map.clear();
		
		mongoTemplate.getCollection("col").createIndex(index);
//		for (int i = 1; i < indexList.size(); i++) {
////			DBObject item = indexList.get(i);
////			BasicDBObject index = new BasicDBObject();
////			BasicDBObject key = (BasicDBObject)item.get("key");
////			index.put("key",key);
////			if(item.get("weights") != null){
////				index.put("weights",item.get("weights"));
////			}
//		
////			if(item.get("background") != null && (boolean)item.get("background")){
////				index.put("background",Boolean.TRUE);
////			}
//			
//			mongoTemplate.getCollection("col").createIndex(index);
//		}
	}
	
	@Test
	public void findIndex(){
		List<DBObject> indexList = mongoTemplate.getCollection("col").getIndexInfo();
		for (DBObject dbObject : indexList) {
			System.out.println(dbObject);
		}
	}

	
	@Test
	public void delCol(){
		mongoTemplate.dropCollection("col");
	}
	
	

	// @Test
	public void selectSchool() {
		Iterable<School> schools = schoolRepository.findAll();
		// for (School s : schools) {
		// System.out.println(s.toString());
		// }
		School s = schools.iterator().next();
		List<Student> students = s.getStudents();
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}

	// @Test
	public void updateStudent() {
		Student s = studentRepository.findOne("d7937991-f7b0-4bb5-9fa6-bdea0c32a291");
		s.setAge(10);
		studentRepository.save(s);
	}

	// @Test
	public void deleteSutdent() {
		studentRepository.delete("e398d1c5-964b-4453-85b5-d79fa9487e95");
		Iterable<Student> sutdents = studentRepository.findAll();
		for (Student s : sutdents) {
			System.out.println(s.toString());
		}
	}

	// @Test
	public void selectStudent() {
		// Iterable<Student> students= studentRepository.findAll();
		// for (Student student : students) {
		// System.out.println(student.toString());
		// }
		// /*等查询和模糊查询*/
		// List<Student> list = studentRepository.findByName("xsc");
		// List<Student> list = studentRepository.findByNameLike("xsc");

		/* 自定义模糊查询 */
		// List<Student> list = studentRepository.searchStudent("x");
		// List<Student> list = studentRepository.searchStudent(11, 31);
		List<Student> list = studentRepository.searchStudent("m", 11, 31);
		for (Student student : list) {
			System.out.println(student.toString());
		}

	}

	// @Test
	public void init() {

		School school = new School();
		school.setName("长兴岛初级中学");
		school.setId(UUID.randomUUID().toString());

		Student xsc = new Student();
		xsc.setAge(30);
		xsc.setName("xsc");
		xsc.setId(UUID.randomUUID().toString());

		Student mln = new Student();
		mln.setAge(30);
		mln.setName("xsc1");
		mln.setId(UUID.randomUUID().toString());

		List<Student> students = new ArrayList<Student>();
		students.add(xsc);
		students.add(mln);
		school.setStudents(students);

		schoolRepository.save(school);

		studentRepository.save(xsc);
		studentRepository.save(mln);

	}
}
