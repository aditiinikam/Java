import java.util.Date;

public class Students {

	private int id;
	private String name;
	private String bdate;
	private Date dob;
	
	public Students(int id, String name, String bdate) {
		this.id = id;
		this.name = name;
		this.bdate = bdate;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getBdate() {
		return bdate;
	}
	
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

