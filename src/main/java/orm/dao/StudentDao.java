package orm.dao;



import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import orm.entity.Student;

public class StudentDao {

	public HibernateTemplate hibertemp;
	//save student method in db\
	@Transactional  //on;y transactioncal for write operations ,updtae not for getting 
public int insert(Student student)
{
	Integer i=(Integer) this.hibertemp.save(student);
	return i;
}
	
	//get single data object
	public Student getStudent(int studentID) {
		Student stud=this.hibertemp.get(Student.class,studentID);
		return stud;
	}
	
	//get all list
	List<Student>getAllStudent(){
		List<Student>student=this.hibertemp.loadAll(Student.class);
		return student;
	}
	//delet return void rhta actual hiberante teemplate mai delet k lie phle load karna firr delete
	@Transactional
	public void delete(int studentid) {
		Student student=this.hibertemp.get(Student.class,studentid);
		this.hibertemp.delete(student);
	}
	//updating dtaa
	@Transactional
	public void update(Student student) {
		this.hibertemp.update(student);
	}
}
