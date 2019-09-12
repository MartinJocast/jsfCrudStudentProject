package fr.formation.inti.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.formation.inti.entities.StudentRecord;

@ManagedBean(name = "studentBean") 
@SessionScoped
public class StudentBean {
	
	@ManagedProperty(value = "#{managerStudent}")
	ManagerStudent service ;
	private int id;  
	private String name;  
	private String email;  
	private String password;  
	private String gender;  
	private String address;

	public List<StudentRecord> studentsListFromDB;
	

	public List<StudentRecord> getStudentsListFromDB() {
		return studentsListFromDB;
	}

	public void setStudentsListFromDB(List<StudentRecord> studentsListFromDB) {
		this.studentsListFromDB = studentsListFromDB;
	}

	public int getId() {
		return id;	
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}  
	
	public String method() {
		return "";
	}
	
	
//	public void init() {
//		List studentsListFromDB = service.findAll();
//	}
	
	@PostConstruct
	public void init() {
		studentsListFromDB = service.findAll();
	}
	/* Method Used To Fetch All Records From The Database */
	public List<StudentRecord> studentsList() {
		List<StudentRecord> studentsListFromDB = service.findAll();
		return studentsListFromDB;
	}
	
	/* Method Used To Save New Student Record */
	public Integer saveStudentDetails(StudentRecord newStudentObj) {
		return service.save(newStudentObj);
	}
	
//	/* Method Used To Edit Student Record */
//	public String editStudentRecord(int studentId) {
//		return DatabaseOperation.editStudentRecordInDB(studentId);
//	}
	
	/* Method Used To Update Student Record */
	public void updateStudentDetails(StudentRecord updateStudentObj) {
		service.update(updateStudentObj);
	}
	
	/* Method Used To Delete Student Record */
	public void deleteStudentRecord(int studentId) {
		service.delete(studentId);
	}
	
	
}