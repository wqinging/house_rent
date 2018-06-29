package pojo;

public class House {
	private int id;
	private String name;
	private String price;
	private String address;
	private String huxing;
	private String area;
	private String floor;
	private String chaoxiang;
	private String payway;
	private String descoration;
	private String subway;
	private String renter;
	private String rentStartTime;
	private String rentEndTime;
	private String image;
	public House(int id, String name, String price, String address, String huxing, String area, String floor,
			String chaoxiang, String payway, String descoration, String subway, String renter, String rentStartTime,
			String rentEndTime, String image) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.address = address;
		this.huxing = huxing;
		this.area = area;
		this.floor = floor;
		this.chaoxiang = chaoxiang;
		this.payway = payway;
		this.descoration = descoration;
		this.subway = subway;
		this.renter = renter;
		this.rentStartTime = rentStartTime;
		this.rentEndTime = rentEndTime;
		this.image = image;
	}
	
	public House(int id, String name, String price, String address, String huxing, String area, String floor,
			String chaoxiang, String descoration, String subway, String image) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.address = address;
		this.huxing = huxing;
		this.area = area;
		this.floor = floor;
		this.chaoxiang = chaoxiang;
		this.descoration = descoration;
		this.subway = subway;
		this.image = image;
	}

	public House(int id, String name, String price, String address, String huxing, String area, String floor,
			String chaoxiang, String descoration, String subway, String renter, String rentStartTime,
			String rentEndTime) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.address = address;
		this.huxing = huxing;
		this.area = area;
		this.floor = floor;
		this.chaoxiang = chaoxiang;
		this.descoration = descoration;
		this.subway = subway;
		this.renter = renter;
		this.rentStartTime = rentStartTime;
		this.rentEndTime = rentEndTime;
	}

	

	public House(String name, String price, String address, String huxing, String area, String floor, String chaoxiang,
			String descoration, String subway, String image) {
		super();
		this.name = name;
		this.price = price;
		this.address = address;
		this.huxing = huxing;
		this.area = area;
		this.floor = floor;
		this.chaoxiang = chaoxiang;
		this.descoration = descoration;
		this.subway = subway;
		this.image = image;
	}

	public House(int id, String name, String price, String address, String huxing, String area, String floor,
			String chaoxiang, String descoration, String subway, String renter, String rentStartTime,
			String rentEndTime, String image) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.address = address;
		this.huxing = huxing;
		this.area = area;
		this.floor = floor;
		this.chaoxiang = chaoxiang;
		this.descoration = descoration;
		this.subway = subway;
		this.renter = renter;
		this.rentStartTime = rentStartTime;
		this.rentEndTime = rentEndTime;
		this.image = image;
	}

	public House() {
		super();
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHuxing() {
		return huxing;
	}
	public void setHuxing(String huxing) {
		this.huxing = huxing;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getChaoxiang() {
		return chaoxiang;
	}
	public void setChaoxiang(String chaoxiang) {
		this.chaoxiang = chaoxiang;
	}
	public String getPayway() {
		return payway;
	}
	public void setPayway(String payway) {
		this.payway = payway;
	}
	public String getDescoration() {
		return descoration;
	}
	public void setDescoration(String descoration) {
		this.descoration = descoration;
	}
	public String getSubway() {
		return subway;
	}
	public void setSubway(String subway) {
		this.subway = subway;
	}
	public String getRenter() {
		return renter;
	}
	public void setRenter(String renter) {
		this.renter = renter;
	}
	public String getRentStartTime() {
		return rentStartTime;
	}
	public void setRentStartTime(String rentStartTime) {
		this.rentStartTime = rentStartTime;
	}
	public String getRentEndTime() {
		return rentEndTime;
	}
	public void setRentEndTime(String rentEndTime) {
		this.rentEndTime = rentEndTime;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "House [id=" + id + ", name=" + name + ", price=" + price + ", address=" + address + ", huxing=" + huxing
				+ ", area=" + area + ", floor=" + floor + ", chaoxiang=" + chaoxiang + ", payway=" + payway
				+ ", descoration=" + descoration + ", subway=" + subway + ", renter=" + renter + ", rentStartTime="
				+ rentStartTime + ", rentEndTime=" + rentEndTime + ", image=" + image + "]";
	}
	
	
	

}
