package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import pojo.House;
import pojo.Manager;
import pojo.Renter;


@Repository
public interface ManagerDao {
	
	int insertManager(@Param("manager")Manager manager);
	
	Manager selectManager(@Param("managerName")String managerName,@Param("managerPassword")String managerPassword);
	
	List<House> selectAllHoues(@Param("renter")String renter,@Param("rentStartTime")String rentStartTime);
	
	House selectHouses(@Param("houseName")String houseName);
	
	House selectHouseByRenterName(@Param("renterName")String renterName );
	
	int countHouses(@Param("renter")String renter,@Param("rent_start_time")String rent_start_time);
	
	List<House> paging(@Param("start")int start,@Param("size")int size,@Param("renter")String renter,@Param("rent_start_time")String rentStartTime);
	
	int updateHouseInfo(@Param("house")House house);
	
	int updateHouseInfoNotRenter(@Param("house")House house);
	
	int insertHouseInfo(@Param("house")House house);

	
	int deleteHouse(@Param("name")String name);
	
	Renter selectRenterByName(@Param("renterName")String renterName);
	
	List<Renter> selectAllRenter();
	
	int insertRenter(@Param("renter")Renter renter);
	
	int deleteRenter(@Param("name") String name);
	
	int updateRenter(@Param("renter")Renter renter);
	
	
	int updateHouseIdByrenterName(@Param("renterName")String renterName, @Param("houseId")int houseId);
	
	int updateRenterByHouseId(@Param("houseId")int houseId,@Param("renterName")String renterName);
	

}
