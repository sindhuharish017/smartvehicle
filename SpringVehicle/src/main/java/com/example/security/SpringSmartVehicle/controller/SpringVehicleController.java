//package com.example.security.SpringSmartVehicle.controller;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.boot.context.properties.bind.BindException;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.example.security.SpringSmartVehicle.Service.AdminService;
//import com.example.security.SpringSmartVehicle.Service.DLService;
//import com.example.security.SpringSmartVehicle.Service.UserService;
//import com.example.security.SpringSmartVehicle.entity.Admin;
//import com.example.security.SpringSmartVehicle.entity.DrivingLicense;
//import com.example.security.SpringSmartVehicle.entity.User;
//
//@Controller
//public class HelloController {
//
//	@Autowired
//	private UserService userservice;
//
//	@Autowired
//	private AdminService adminService;
//	@Autowired
//	private DLService dlService;
//
//	@Autowired
//	@GetMapping("/home")
//	public String home() {
//		return "home";
//	}
//
//	@GetMapping("/admin")
//	public String admin() {
//		return "admin";
//	}
//
//	@PostMapping("/admin")
////	@ResponseBody
//	public ModelAndView admin(@ModelAttribute Admin admin) throws Exception{
//
//		if (adminService.loginValidator(admin.getUsername()) == 1) {
//			ModelAndView mv = new ModelAndView("redirect:/createdl");
//			return mv;
//		}
//		ModelAndView mv = new ModelAndView("/failuredl");
//		return mv;
//
//	}
//
//
//	@GetMapping("/createdl")
//	public String dl() {
//		return "createdl";
//	}
//	
//	@PostMapping("/createdl")
//	public ModelAndView newDLRegister(@ModelAttribute DrivingLicense dl,Model model) throws Exception  {
//		
//		
////		try{
////			ModelAndView mv = new ModelAndView("redirect:/createdl");
////		if(dl.getDlno().equals(userservice.getDlno(dl.getDlno())))
////	{
////			  System.out.println(dl.getDlno()+ userservice.getDlno(dl.getDlno()));
//			//  dlService.createDL(dl);
////			  model.addAttribute("user","dlno Already Exist hucchi");
////			  ModelAndView mv1 = new ModelAndView("redirect:/createdl");
////				
////				 //return mv1;
////			  
////	}
////		 return mv;
//////		else {
//////			 System.out.println(dl.getDlno()+ userservice.getDlno(dl.getDlno()));
//////			 dlService.createDL(dl);
//////			ModelAndView mv1 = new ModelAndView("redirect:/dllist");
//////			 model.addAttribute("user","dlno Already Exist hucchi");
//////			 return mv1;
//////		}
////	
////	}
////		catch(NullPointerException n){
////			System.out.println(dl.getDlno()+ userservice.getDlno(dl.getDlno()));
//			 dlService.createDL(dl);
//			ModelAndView mv1 = new ModelAndView("redirect:/dllist");
//			 //model.addAttribute("user","dlno Already Exist hucchi");
//			 return mv1;
//			
//		}
//	
//
//
//	@GetMapping("/userlogin")
//	public String user() {
//		return "/user";
//	}
//	@GetMapping("/vehicleType/{id}")
//	public ModelAndView update(@PathVariable int id, Model model,@ModelAttribute User user) {
//		ModelAndView mv=new ModelAndView();
//		mv.addObject("dlno", user.getDlno());
//	    mv.addObject("pass", user.getPass());
//	    mv.setViewName("vehicleType");
////		model.addAttribute("vehicleType", userservice.getUser(id));
//		return mv;
//	}
//	
//	@PostMapping("/vehicleType/{id}")	
//	public String update(@PathVariable int id,@ModelAttribute User user,Model model) {
//		ModelAndView  mv=new ModelAndView("redirect:/userlogin");
//		
//		System.out.println(user.getId());
////		user.setId(id);
////		user.setVehicleType("2wheeler");
//		String vtype=user.getVehicleType();
//		
//		System.out.println(user.getDlno());
//		System.out.println(user.getPass());
////		user.setVehicleType(vtype);
//			userservice.updateUser(user);
//			System.out.println(user.getVehicleType());
//
//		
////		ModelAndView view=new ModelAndView("/vehicleType");
////		view.addObject(attributeValue)
//		return "redirect:/userlogin";
//	}
//
//	@PostMapping("/userlogin")
//    //@ResponseBody
//    public ModelAndView user(@ModelAttribute User user,ModelMap model)  throws Exception{
////        String url;
//        if(user.getDlno()=="" ){
//            if(user.getPass()==""){
//            	throw new Exception("please enter username and password");
////            model.addAttribute("enter","enter username and pass");
////            ModelAndView mv = new ModelAndView("/user");
////            return mv;
//            }
//        }
//        else if (userservice.loginValidator(user.getDlno()) == 1 ) {
//            if(userservice.loginValidator(user.getPass())==1){
////            	  System.out.println("User Page Requested");
//            	int id=userservice.getIdByDlno(user.getDlno());
//            	System.out.println(id);
//            	
//            ModelAndView mv = new ModelAndView("vehicleType/"+id);
//            mv.addObject("dlno", user.getDlno());
//    	    mv.addObject("pass", user.getPass());
//            return mv;
//        }
//        }
//        
//        model.addAttribute("fail","login failed");
//        ModelAndView mv = new ModelAndView("/user");
//        return mv;
//    }
//	
//	
//	
//
//	
//	@GetMapping("/register")
//	public String newUserRegister(@ModelAttribute User user) {
//		ModelAndView mv=new ModelAndView();
//		mv.addObject("dlno", user.getDlno());
//		return "register";
//	}
//
////	@PostMapping("/register")
////	public ModelAndView newUserRegister(@ModelAttribute User user,DrivingLicense dl,Model model) {
////		
//////		try{
//////			if(user.getDlno().equals(userservice.checkIfDlExist(user.getDlno()))){
//////				
////				userservice.createUser(user);
////				System.out.println(user.getDlno());
////				System.out.println(dl.getDlno());
////				userservice.createUser(user);
////				ModelAndView mv1 = new ModelAndView("/userlogin");
////				return 	mv1;
////				
//////			}
//////		
//////		}
//////		catch(NullPointerException n){
//////			model.addAttribute("user","dlno Already Exist");
//////			ModelAndView mv1 = new ModelAndView("/register");
//////			return 	mv1;
//////			
////		}
//////		ModelAndView mv1 = new ModelAndView("/register");
//////		return 	mv1;
//////	}
////
////	
//////	if(user.getDlno().equals(dl.getDlno())){
////	
//////	}
//////	else{
//////
//////	model.addAttribute("valid","This dl is not valid");
//////	}
////	
//	@PostMapping("/register")
//	public ModelAndView newUserRegister(@ModelAttribute User user,Model model) throws Exception {
//		ModelAndView mv = new ModelAndView("/user");
//		System.out.println(user.getDlno());
////		System.out.println(dl.getDlno());
////		if(user.getDlno().equals(dl.getDlno())){
//			userservice.createUser(user);
////		}
////		else{
////	
////		model.addAttribute("valid","This dl is not valid");
////		}
//		//mv.getModel().put("user", userservice.getAll());
//		return mv;
//	}
//	@GetMapping("/dllist")
//	public String list(Model model){
//		System.out.println("List Of DL");
//		model.addAttribute("dl",dlService.getAll());
//		return "dllist";
//	}
//
//
//
//}
package com.example.security.SpringSmartVehicle.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.properties.bind.BindException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.security.SpringSmartVehicle.Repository.DLRepo;
import com.example.security.SpringSmartVehicle.Repository.UserRepo;
import com.example.security.SpringSmartVehicle.Service.AdminService;
import com.example.security.SpringSmartVehicle.Service.DLService;
import com.example.security.SpringSmartVehicle.Service.PoliceService;
import com.example.security.SpringSmartVehicle.Service.UserService;
import com.example.security.SpringSmartVehicle.entity.Admin;
import com.example.security.SpringSmartVehicle.entity.DrivingLicense;
import com.example.security.SpringSmartVehicle.entity.Police;
import com.example.security.SpringSmartVehicle.entity.User;

@Controller
public class SpringVehicleController {

	@Autowired
	private UserService userservice;

	@Autowired
	private AdminService adminService;
	@Autowired
	private DLService dlService;

	@Autowired
	private DLRepo dlRepo;

	@Autowired
	private UserRepo repo;
	@Autowired
	private PoliceService policeService;

	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}

	@PostMapping("/admin")
	public ModelAndView admin(@ModelAttribute Admin admin ,Model model) throws Exception {

		if (adminService.loginValidator(admin.getUsername()) == 1) {
			ModelAndView mv = new ModelAndView("redirect:/createdl");
			return mv;
		}
		ModelAndView mv = new ModelAndView();
     	model.addAttribute("fail", "login failed");
		return mv;
		
	}
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	@GetMapping("/faq")
	public String faq() {
		return "faq";
	}
	
	@GetMapping("/aboutus")
	public String aboutUs() {
		return "aboutus";
	}

	@GetMapping("/createdl")
	public String dl() {
		return "createdl";
	}
	
	//To Create DL
	@PostMapping("/createdl")
	public ModelAndView newDLRegister(@ModelAttribute DrivingLicense dl, User user) throws NullPointerException {

		ModelAndView mv = new ModelAndView("redirect:/dllist");
		
		dlService.createDL(dl);

		return mv;
	}
	
	@GetMapping("/updatedl/{id}")
	//@ResponseBody
	public String updateDL(@PathVariable("id") int id ,Model model) {
		
		model.addAttribute("dl",dlService.getById(id));
		
		return "/updatedl";
	}
	// To list the Updated Dl Information.
	@PostMapping("/updatedl/{id}")
	public ModelAndView saveUpdatedl(@PathVariable("id")int id,@ModelAttribute DrivingLicense dl){
	ModelAndView view=new ModelAndView("redirect:/updateddllist");
	dlService.update(dl);
		return view;
	}
	
	@GetMapping("/updateddllist")
	public String dllist(Model model) {
		System.out.println("List Of DL");
		
		System.out.println(dlService.getAll());
		model.addAttribute("dl", dlService.getAll());
		return "updateddllist";
	}
	
	@GetMapping("/register")
	public String newUserRegister(@ModelAttribute User user) {
		// DrivingLicense dl= new DrivingLicense();
		ModelAndView mv = new ModelAndView();
		mv.addObject("dlno", user.getDlno());
		return "register";
	}

	//If User want to drive vehicle, the User have to Register 
	@PostMapping("/register")
	public ModelAndView newUserRegister(@ModelAttribute User user, Model model) throws Exception {

		ModelAndView mv = new ModelAndView("/userlogin");
		try {
			//The User is Allowed to register, if the user holding Driving License... 
			//It is Checking Using checkIfDlnoExist method
			if (checkIfDlnoExist(user.getDlno(),user.getFullname())) {

				if (user.getPass().equals(user.getConfirmpassword())) {
					
					userservice.createUser(user);
				} else {
					ModelAndView mv1 = new ModelAndView("/register");
					System.out.println("error");
					model.addAttribute("valid", "Those Password didn't Match.Try Again ");
					return mv1;
				}

			}
			else{
				ModelAndView mv1 = new ModelAndView("/register");
				model.addAttribute("valid", " The Username Should Match to Your DL name ");
				return mv1;
			}
		}catch (Exception e) {

			ModelAndView mv1 = new ModelAndView("/register");
			model.addAttribute("valid", "provide Valid DL_NO ");
			return mv1;
		}
		model.addAttribute("valid","the User Registered Succeessfilly!!!");
		return mv;
	}
	
	
	@GetMapping("/userlogin")
	public String user() {
		return "/userlogin";
	}

	
	@PostMapping("/userlogin")
	public ModelAndView user(@ModelAttribute User user, ModelMap model) throws NullPointerException {
		try {
			if (user.getDlno() == "" && user.getPass() == "") {
				model.addAttribute("enter", "enter username and password");
				ModelAndView mv = new ModelAndView("/userlogin");
				return mv;
			}
			//User can only login if the dlno and Password Matches.
			else if (user.getDlno().equals(userservice.finduser(user.getDlno()))
					&& user.getPass().equals(userservice.findpass(user.getPass()))) {
				System.out.println("User Page Requested");
				int id = userservice.getIdByDlno(user.getDlno());
				System.out.println(id);

				ModelAndView mv = new ModelAndView("redirect:/vehicleType/" + id);
				mv.addObject("dlno", user.getDlno());
				mv.addObject("pass", user.getPass());
				return mv;
			}
			model.addAttribute("fail", "login failed");
			ModelAndView mv = new ModelAndView("/userlogin");
			return mv;
		} catch (NullPointerException e) {
			model.addAttribute("fail", "login failed");
			ModelAndView mv = new ModelAndView("/userlogin");
			return mv;
		}
	}

	@GetMapping("/vehicleType/{id}")
	public String update(@PathVariable("id") int id, Model model, @ModelAttribute User user) {
		ModelAndView mv = new ModelAndView();

		User u = repo.findById(id).get();
		mv.addObject("dlno", u.getDlno());
		mv.addObject("pass", u.getPass());
		mv.addObject("confirmpassword", u.getConfirmpassword());
		mv.addObject("fullname", u.getFullname());
		mv.addObject("dateofbirth", u.getDateofbirth());
		mv.addObject("email", u.getEmail());
		mv.addObject("phonenumber", u.getPhonenumber());
		mv.setViewName("vehicleType");
		return "/vehicleType";
	}
//To select the Type of Vehicle The User wish to Drive.
	@PostMapping("/vehicleType/{id}")
	public String update(@PathVariable("id") int id, @ModelAttribute User user, Model model) {
		// ModelAndView mv1 = new ModelAndView("redirect:/userlogin");
		int flag = 0;
		User u = repo.findById(id).get();
		u.setVehicleType(user.getVehicleType());
		userservice.updateUser(u);
		DrivingLicense dl = dlRepo.findByDlno(u.getDlno());
		String[] veh = dl.getVehicle();
		System.out.println(Arrays.toString(veh));
		System.out.println(dl.getAddress());
		System.out.println(u.getVehicleType());
		//The user is allow to Drive a Selected Vehicle if and only if the dl is issued for that Vehicle Type.
		for (String element : veh) {
			if (element.equals(u.getVehicleType())) {
				flag = 1;
			}
		}
	
		if(flag==1){
			System.out.println("Allow to drive");
			return "redirect:/allowAccess/{id}";
		}
		else{
			System.out.println("notallow");
			return "redirect:/accessDenied";
		}
	}

	@GetMapping("/allowAccess/{id}")
	public String allowAccess(@PathVariable("id") int id) {
		return "allowAccess";
	}

	//while driving a Vehicle, If Accident happens The police want to know the identity of user using userid.
	@PostMapping("/allowAccess/{id}")
	public ModelAndView AllowAccess(@PathVariable("id") int id, Model model) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/police/{id}");
		User u = repo.findById(id).get();
		DrivingLicense dl = dlRepo.findByDlno(u.getDlno());
		Police police = new Police();
		police.setAddress(dl.getAddress());
		police.setDateofBirth(u.getDateofbirth());
		police.setDlno(u.getDlno());
		police.setName(u.getFullname());
		police.setPhonenumber(u.getPhonenumber());
		policeService.ProvideUserIdentity(police);
		System.out.println(police.getDlno());
		model.addAttribute("police", police);
		return mv;
	}

	

	private boolean checkIfDlnoExist(String dlno,String name) {
		DrivingLicense dl = dlRepo.findByDlno(dlno);
		if (dl.getDlno().equals(dlno) && dl.getName().equals(name))
			return true;
		else {
			return false;
		}

	}
//If the User Not Allowed To Drive a Vehicle
	@GetMapping("/accessDenied")
	public String acessDeniedfordl() {
		return "accessDenied";
	}

	@GetMapping("/dllist")
	public String list(Model model) {
		System.out.println("List Of DL");
		model.addAttribute("dl", dlService.getAll());
		return "dllist";
	}

	@GetMapping("/police/{id}")
	public String PoliceNotified(@PathVariable("id") int id, Model model) {
		System.out.println("information of user");
		User u = repo.findById(id).get();
		DrivingLicense dl=dlRepo.findByDlno(u.getDlno());
		Police p = new Police();
		p.setDlno(u.getDlno());
		p.setAddress(dl.getAddress());
		p.setDateofBirth(u.getDateofbirth());
		p.setName(u.getFullname());
		p.setPhonenumber(u.getPhonenumber());
		
		model.addAttribute("phno", p.getPhonenumber());
		model.addAttribute("name", p.getName());
		model.addAttribute("address", p.getAddress());
		model.addAttribute("dob", p.getDateofBirth());
		model.addAttribute("dlno", p.getDlno());
		return "police";
	}


	@PostMapping("/police/{id}")
	public String police(@PathVariable("id") int id) {
		return "police";
	}

}