package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.House;
import pojo.Manager;
import pojo.Renter;


public interface ManagerService {

	int registerManager(Manager manager);

	Manager loginManager(String managerName, String managerPassword);

	List<House> findAllHoues(String renter, String rentStartTime);

	House findHouses(String houseName);

	House findHouseByRenterName(String renterName);

	int countHouses(String renter, String rentStartTime);

	List<House> paging(int start, int size, String renter, String rentStartTime);

	int updateHouseInfo(House house);
	
	int updateHouseInfoNotRenter(House house);

	int insertHouseInfo(House house);

	int deleteHouse(String name);

	Renter findRenterByName(String renterName);

	List<Renter> findAllRenter();

	int updateRenter(Renter renter);
	
	int insertRenter(Renter renter);

	int deleteRenter(@Param("name") String name);
	
	int updateHouseIdByrenterName(String renterName, int houseId);

	int updateRenterByHouseId(int houseId, String renterName);

}
