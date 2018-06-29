package pojo;

public class Renter {
	private int rentId;
	private String renterName;
	private String rentPnumber;
	private String idCard;
	private int houseId;
	public int getRentId() {
		return rentId;
	}
	public void setRentId(int rentId) {
		this.rentId = rentId;
	}
	public String getRenterName() {
		return renterName;
	}
	public void setRenterName(String renterName) {
		this.renterName = renterName;
	}
	public String getRentPnumber() {
		return rentPnumber;
	}
	public void setRentPnumber(String rentPnumber) {
		this.rentPnumber = rentPnumber;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public int getHouseId() {
		return houseId;
	}
	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}
	public Renter(int rentId, String renterName, String rentPnumber, String idCard, int houseId) {
		super();
		this.rentId = rentId;
		this.renterName = renterName;
		this.rentPnumber = rentPnumber;
		this.idCard = idCard;
		this.houseId = houseId;
	}
	public Renter() {
		super();
	}
	@Override
	public String toString() {
		return "Renter [rentId=" + rentId + ", renterName=" + renterName + ", rentPnumber=" + rentPnumber + ", idCard="
				+ idCard + ", houseId=" + houseId + "]";
	}
    
	

}
