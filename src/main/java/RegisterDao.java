import java.sql.*;

public class RegisterDao {
	private String id;
	private String name;
	private Integer age;
	private String gmail;
	private String password;
	private String location;
	private String course;
	private Connection connect;
	private PreparedStatement pstmt;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public int registerInfo(String id, String name, Integer age,String gmail,String password, String location,String course )throws SQLException {
		connect=JdbcUtil.getConnection();
		int rst=0;
		if(connect!=null) {
			String query="Insert into student_detail(id,name,age,gmail,password,location,course)VALUES(?,?,?,?,?,?,?)";
			pstmt=connect.prepareStatement(query);
			if(pstmt!=null) {
				pstmt.setString(1, id);
				pstmt.setString(2, name);
				pstmt.setInt(3, age);
				pstmt.setString(4, gmail);
				pstmt.setString(5, password);
				pstmt.setString(6, location);
				pstmt.setString(7, course);
				rst=pstmt.executeUpdate();
				return rst;
				
			}
			
		}
		return rst;
	}
	
}
