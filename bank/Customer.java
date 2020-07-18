
public class Customer {
	private String accName;
	private NAccount acc; 
	
	public Customer(String accName, NAccount acc) {
		super();
		this.accName = accName;
		this.acc = acc;
	}
	
	public String getAccName() {
		return accName;
	}
	public NAccount getAcc() {
		return acc;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}
	public void setAcc(NAccount acc) {
		this.acc = acc;
	}
	
	
}
