package orm.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student_details")
public class Student {
	@Id
	@Column(name="student_id")
private int studid;
	@Column(name="student_city")
private String city;
	@Column(name="student_name")
private String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
