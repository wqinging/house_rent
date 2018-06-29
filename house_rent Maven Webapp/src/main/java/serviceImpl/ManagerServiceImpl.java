package serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.ManagerDao;
import pojo.House;
import pojo.Manager;
import pojo.Renter;
import service.ManagerService;

@Service
@Transactional
public class ManagerServiceImpl implements ManagerService {

	private ManagerDao managerdao;

	public ManagerDao getManagerDao() {
		return managerdao;
	}

	@Autowired
	public void setManagerDao(ManagerDao managerDao) {
		this.managerdao = managerDao;
	}

	@Override
	public int registerManager(Manager manager) {
		return managerdao.insertManager(manager);
	}

	@Override
	public Manager loginManager(String managerName, String managerPassword) {
		return managerdao.selectManager(managerName, managerPassword);
	}

	@Override
	public List<House> findAllHoues(String renter, String rentStartTime) {
		return managerdao.selectAllHoues(renter, rentStartTime);
	}

	@Override
	public House findHouses(String houseName) {
		return managerdao.selectHouses(houseName);
	}

	@Override
	public House findHouseByRenterName(String renterName) {
		return managerdao.selectHouseByRenterName(renterName);
	}

	@Override
	public Renter findRenterByName(String renterName) {
		return managerdao.selectRenterByName(renterName);
	}

	@Override
	public int countHouses(String renter, String rentStartTime) {
		// TODO Auto-generated method stub
		return managerdao.countHouses(renter, rentStartTime);
	}

	@Override
	public List<House> paging(int start, int size, String renter, String rentStartTime) {
		return managerdao.paging(start, size, renter, rentStartTime);
	}

	@Override
	public int updateHouseInfo(House house) {
		return managerdao.updateHouseInfo(house);
	}

	@Override
	public List<Renter> findAllRenter() {

		return managerdao.selectAllRenter();
	}

	@Override
	public int insertRenter(Renter renter) {
		return managerdao.insertRenter(renter);
	}

	@Override
	public int insertHouseInfo(House house) {
		return managerdao.insertHouseInfo(house);
	}

	@Override
	public int deleteHouse(String name) {
		// TODO Auto-generated method stub
		return managerdao.deleteHouse(name);
	}

	@Override
	public int deleteRenter(String name) {
		// TODO Auto-generated method stub
		return managerdao.deleteRenter(name);
	}

	@Override
	public int updateHouseIdByrenterName(String renterName, int houseId) {
		// TODO Auto-generated method stub
		return managerdao.updateHouseIdByrenterName(renterName, houseId);
	}

	@Override
	public int updateRenterByHouseId(int houseId, String renterName) {
		// TODO Auto-generated method stub
		return managerdao.updateRenterByHouseId(houseId, renterName);
	}

	@Override
	public int updateHouseInfoNotRenter(House house) {
		// TODO Auto-generated method stub
		return managerdao.updateHouseInfoNotRenter(house);
	}

	@Override
	public int updateRenter(Renter renter) {
		// TODO Auto-generated method stub
		return managerdao.updateRenter(renter);
	}
}
