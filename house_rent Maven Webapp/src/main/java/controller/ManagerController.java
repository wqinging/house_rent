package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import pojo.House;
import pojo.Manager;
import pojo.Renter;
import service.ManagerService;

@Controller
@Transactional
public class ManagerController {

	@Autowired
	ManagerService managerService;

	@GetMapping("/index")
	public String managerAction() {
		return "index";
	}

	@GetMapping("/showAddHousePage")
	public String showAddHousePage() {
		return "addHouse";
	}
	@GetMapping("loginvalid")
	public void loginvalid(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		request.getSession().removeAttribute("user");
		response.sendRedirect("index");
	}

	@PostMapping("/login")
	public ModelAndView loginManager(String managerName, String managerPassword, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		Manager mgr = null;
		mgr = managerService.loginManager(managerName, managerPassword);
		if (mgr != null) {
			session.setAttribute("mgr", mgr);
			mav.setViewName("manage");
		} else {
			mav.addObject("error", "该账户不存在或登录密码出错,请更改用户");
			mav.setViewName("index");
		}
		return mav;
	}

	@PostMapping("/register")
	public ModelAndView registerManager(Manager manager) {
		ModelAndView mav = new ModelAndView();
		int result = managerService.registerManager(manager);
		if (result > 0) {
			mav.setViewName("index");
		} else {
			mav.setViewName("index");
		}
		return mav;
	}

	@GetMapping("/getAllHouse")
	public ModelAndView getAllHouse(String renter, String rentStartTime) {
		ModelAndView mav = new ModelAndView();
		int pageNum = 1;
		int totalHouse = managerService.countHouses(renter, rentStartTime);
		int size = 4;
		int totalpage = 0;
		if (totalHouse < size) {
			totalpage = 1;
		} else if (totalHouse % size == 0) {
			totalpage = totalHouse / size;
		} else {
			totalpage = (totalHouse / size) + 1;
		}
		int start = (pageNum - 1) * size;
		List<House> houseList = managerService.paging(start, size, renter, rentStartTime);
		mav.addObject("renter", renter);
		mav.addObject("rentStartTime", rentStartTime);
		mav.addObject("pageNum", pageNum);
		mav.addObject("totalpage", totalpage);
		mav.addObject("houseList", houseList);
		mav.setViewName("showAllHouse");
		return mav;
	}

	@GetMapping("/preOrnext")
	public ModelAndView preOrnext(int pageNum, int totalPage, String renter, String rentStartTime) {
		ModelAndView mav = new ModelAndView();
		int size = 4;
		int start = (pageNum - 1) * size;
		List<House> houseList = managerService.paging(start, size, renter, rentStartTime);
		mav.addObject("pageNum", pageNum);
		mav.addObject("totalpage", totalPage);
		mav.addObject("houseList", houseList);
		mav.addObject("renter", renter);
		mav.addObject("rentStartTime", rentStartTime);
		mav.setViewName("showAllHouse");
		return mav;
	}

	@GetMapping("/checkHouseInfo")
	public ModelAndView checkHouseInfo(String name) {
		ModelAndView mav = new ModelAndView();
		House house = managerService.findHouses(name);
		mav.addObject("house", house);
		mav.setViewName("details");
		return mav;
	}

	@GetMapping("/addRenterPage")
	public String addRenterPage() {
		return "addRenter";
	}

	@PostMapping("/changeHouseInfo")
	public ModelAndView changHouseInfo(HttpServletRequest request, @RequestParam("id") int id,
			@RequestParam("name") String name, @RequestParam("price") String price,
			@RequestParam("address") String address, @RequestParam("huxing") String huxing,
			@RequestParam("area") String area, @RequestParam("floor") String floor,
			@RequestParam("chaoxiang") String chaoxiang, @RequestParam("subway") String subway,
			@RequestParam("descoration") String descoration, @RequestParam("renter") String renter,
			@RequestParam("rentStartTime") String rentStartTime, @RequestParam("rentEndTime") String rentEndTime,
			@RequestParam("image") String photoName) throws IllegalStateException, IOException {

		ModelAndView mav = new ModelAndView();
		House house = new House();
		String imgName = "";
		if (request instanceof MultipartHttpServletRequest) {
			MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
			Map<String, MultipartFile> fileMap = multipartHttpServletRequest.getFileMap();
			for (Map.Entry<String, MultipartFile> entry : fileMap.entrySet()) {
				// 对文件进处理
				String path = "D:\\Program Files\\myeclipse-2017\\Workspaces\\house_rent Maven Webapp\\src\\main\\webapp\\imgs\\";
				imgName = entry.getValue().getOriginalFilename();
				if (imgName.equals("") || imgName == null) {
					imgName = photoName;
				} else {
					String t_path = request.getSession().getServletContext().getRealPath("imgs/");
					File t_file = new File(t_path + imgName);
					File old_t_file = new File(t_path + photoName);
					old_t_file.delete();
					if (!t_file.getParentFile().exists()) {
						t_file.getParentFile().mkdirs();
					}
					if (!t_file.exists()) {
						t_file.createNewFile();
					}
					File oldFile = new File(path + photoName);

					oldFile.delete();

					File tempFile = new File(path + imgName);
					if (!tempFile.getParentFile().exists()) {
						tempFile.getParentFile().mkdirs();
					}
					if (!tempFile.exists()) {
						tempFile.createNewFile();
					}
					byte[] imageByte = entry.getValue().getBytes();
					FileOutputStream is = new FileOutputStream(tempFile);
					DataOutputStream dis = new DataOutputStream(is);
					dis.write(imageByte);
					dis.close();
					is.close();
					entry.getValue().transferTo(t_file);
				}
			}
		}
		if (renter != "" && renter != null) {
			house.setRenter(null);
	    	house.setRentStartTime(null);
	    	house.setRentEndTime(null);
			managerService.updateHouseIdByrenterName(renter, id);
			
		}
		house = new House(id, name, price, address, huxing, area, floor, chaoxiang, descoration, subway, renter,
				rentStartTime, rentEndTime, imgName);
		int result = managerService.updateHouseInfo(house);
		mav.setViewName("manage");
		return mav;

	}

	@PostMapping("/insertHouseInfo")
	public ModelAndView insertHouseInfo(HttpServletRequest request, @RequestParam("name") String name,
			@RequestParam("price") String price, @RequestParam("address") String address,
			@RequestParam("huxing") String huxing, @RequestParam("area") String area,
			@RequestParam("floor") String floor, @RequestParam("chaoxiang") String chaoxiang,
			@RequestParam("subway") String subway, @RequestParam("descoration") String descoration)
			throws IllegalStateException, IOException {

		ModelAndView mav = new ModelAndView();
		House house = new House();
		String imgName = "";
		if (request instanceof MultipartHttpServletRequest) {
			MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
			Map<String, MultipartFile> fileMap = multipartHttpServletRequest.getFileMap();
			for (Map.Entry<String, MultipartFile> entry : fileMap.entrySet()) {
				// 对文件进处理
				String path = "D:\\Program Files\\myeclipse-2017\\Workspaces\\house_rent Maven Webapp\\src\\main\\webapp\\imgs\\";
				imgName = entry.getValue().getOriginalFilename();
				String t_path = request.getSession().getServletContext().getRealPath("imgs/");
				File t_file = new File(t_path + imgName);
				if (!t_file.getParentFile().exists()) {
					t_file.getParentFile().mkdirs();
				}
				if (!t_file.exists()) {
					t_file.createNewFile();
				}
				File tempFile = new File(path + imgName);
				if (!tempFile.getParentFile().exists()) {
					tempFile.getParentFile().mkdirs();
				}
				if (!tempFile.exists()) {
					tempFile.createNewFile();
				}
				byte[] imageByte = entry.getValue().getBytes();
				FileOutputStream is = new FileOutputStream(tempFile);
				DataOutputStream dis = new DataOutputStream(is);
				dis.write(imageByte);
				dis.close();
				is.close();
				entry.getValue().transferTo(t_file);
			}
		}
		house = new House(name, price, address, huxing, area, floor, chaoxiang, descoration, subway, imgName);
		int result = managerService.insertHouseInfo(house);
		mav.setViewName("manage");
		return mav;

	}

	@GetMapping("/findHouseByName")
	public ModelAndView findHouseByName(String name) {
		ModelAndView mav = new ModelAndView();
		House house = managerService.findHouses(name);
		List<House> houseList = new ArrayList<House>();
		houseList.add(house);
		mav.addObject("houseList", houseList);
		mav.setViewName("showAllHouse");
		return mav;
	}

	@GetMapping("/showAllRenter")
	public ModelAndView showAllRenter() {
		ModelAndView mav = new ModelAndView();
		List<Renter> renterList = managerService.findAllRenter();
		mav.addObject("renterList", renterList);
		mav.setViewName("showAllRenter");
		return mav;
	}

	@PostMapping("/addRenterAction")
	public ModelAndView addRenterAction(Renter renter) {
		ModelAndView mav = new ModelAndView();
		int result = managerService.insertRenter(renter);
		mav.setViewName("manage");
		return mav;
	}

	@GetMapping(value = "/deletehouseinfo")
	public ModelAndView deleteHouseInfo(String name) {
		ModelAndView mav = new ModelAndView();
		int result = managerService.deleteHouse(name);
		mav.setViewName("manage");
		return mav;
	}

	@PostMapping(value = "/deleterenter")
	public ModelAndView deleteRenter(String name) {
		ModelAndView mav = new ModelAndView();
		int result = managerService.deleteRenter(name);
		mav.setViewName("manage");
		return mav;
	}

	@GetMapping(value = "/selectRenterByName")
	public ModelAndView selectRenterByName(String name) {
		ModelAndView mav = new ModelAndView();
		Renter renter = managerService.findRenterByName(name);
		List<Renter> listRenter = new ArrayList<Renter>();
		listRenter.add(renter);
		mav.addObject("renterList", listRenter);
		mav.setViewName("showAllRenter");
		return mav;
	}
	
	@PostMapping("/cheRenterInfo")
	public ModelAndView changeRenterInfo(String renterName){
		ModelAndView mav = new ModelAndView();
		Renter renter = managerService.findRenterByName(renterName);
		mav.addObject("renter",renter);
		mav.setViewName("updateRenter");
		return mav;
	}
	
	@PostMapping("/updateRenterInfo")
	public ModelAndView updateRenter(Renter renter){
		ModelAndView mav = new ModelAndView();
	    Renter tempRenter = managerService.findRenterByName(renter.getRenterName());
	    if(renter.getHouseId() != tempRenter.getHouseId()){
	    	House house = managerService.findHouseByRenterName(renter.getRenterName());
	    	if(house!=null){
	    		house.setRenter(null);
		    	house.setRentStartTime(null);
		    	house.setRentEndTime(null);
	    	}
	    	managerService.updateHouseInfo(house);
	    	managerService.updateRenterByHouseId(renter.getHouseId(),renter.getRenterName());
	    }
	    renter.setRentId(tempRenter.getRentId());
	    int result = managerService.updateRenter(renter);
	    mav.setViewName("manage");
		return mav;
	}
	

	
}
