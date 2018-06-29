package pojo;

public class Manager {
	
	private int managerId;
	private String managerName;
	private String managerPassword;
	private String phoneNumber;
	public Manager(int managerId, String managerName, String managerPassword, String phoneNumber) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.managerPassword = managerPassword;
		this.phoneNumber = phoneNumber;
	}
	public Manager() {
		super();
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerPassword() {
		return managerPassword;
	}
	public void setManagerPassword(String managerPassword) {
		this.managerPassword = managerPassword;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", managerPassword="
				+ managerPassword + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	

}
