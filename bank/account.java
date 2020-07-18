
public class NAccount {
	private long accNo;
	private String type;
	private int minBalance=1000;
	private long balance;
	
	public NAccount(long accNo, String type, long balance) {
		this.accNo = accNo;
		this.type = type;
		this.balance = balance;
	}
	
	public long getAccNo() {
		return accNo;
	}
	public String getType() {
		return type;
	}
	public int getMinBalance() {
		return minBalance;
	}
	public long getBalance() {
		return balance;
	}
	
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
}
