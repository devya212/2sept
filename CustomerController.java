package com.nucleus.controller;

import java.security.Principal;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//import com.nucleus.model.Customer;
//import com.nucleus.dao.ICustomerDao;
import com.nucleus.model.Customer;
import com.nucleus.model.Role;
import com.nucleus.model.User;
import com.nucleus.service.ICustomerService;
import com.nucleus.utility.PasswordEncode;
//import com.nucleus.utility.PasswordEncode;
@Controller
public class CustomerController {

	@Autowired
	ICustomerService customerService;
	@Autowired
	PasswordEncode passwordencode;
	Date dateobj = new Date();
	
	
	@RequestMapping("/RegisterCustomer")	
	public ModelAndView request1(@ModelAttribute("customer2") Customer customer2)
	{
		//customer.setCustname("aaaa");
		return new ModelAndView("add");
	}
	@RequestMapping("/DeleteCustomer")	
	public ModelAndView request2(@ModelAttribute("customer2") Customer customer2)
	{
		//customer.setCustname("aaaa");
		return new ModelAndView("delete");
	}
	@RequestMapping("/UpdateCustomer")	
	public ModelAndView request3(@ModelAttribute("customer2") Customer customer2)
	{
		//customer.setCustname("aaaa");
		return new ModelAndView("updateform");
	}
	
	
	@RequestMapping("/saveCustomer")
	public ModelAndView request4(@ModelAttribute("customer2") @Valid Customer customer,Principal principal,BindingResult result)
	{
		if(result.hasErrors())
		{
			return new ModelAndView("add");
		}
        customer.setCreateDate(dateobj);
        customer.setCreatedBy(principal.getName());
    
        /*customer.setRecordStatus("N");*/
		customerService.insert(customer);
		return new ModelAndView("makerHome","addmsg","customer details added successfully");
	}
	
	
	
	@RequestMapping("/deleteCustomer")
	public ModelAndView request5(@ModelAttribute("customer2") @Valid Customer customer, BindingResult result)
	{
		if(result.hasErrors())
		{
			return new ModelAndView("delete");
		}
		
		customerService.delete(customer);
		return new ModelAndView("makerHome","delmsg","customer details deleted successfully");
	}
	@RequestMapping("/updateCustomer")
	public ModelAndView request6(@ModelAttribute("customer2") Customer customer, BindingResult result)
	{
	   Customer customer1=customerService.updateCustomer(customer.getCustomerCode());
	   //System.out.println(customer1.toString());
		ModelAndView model=new ModelAndView();
		model.addObject("customer2",customer1);
		model.setViewName("update");
		return model;
		
		
	}
 @RequestMapping("/UpdateCustomer1")
	public ModelAndView request7(@ModelAttribute("customer2") Customer customer,Principal principal, BindingResult result)
	{
		if(result.hasErrors())
		{
			return new ModelAndView("update");
		}
		customer.setModifiedDate(dateobj);
        /*customer.setCreatedBy(principal.getName());*/
       /* customer.setRecordStatus("N");
		*/
		customerService.update(customer,customer.getCustomerCode());
		return new ModelAndView("makerHome","updatemsg","customer details updated successfully");
	}
 @RequestMapping("/register")
 public ModelAndView request8(User user)
 {
	 return new ModelAndView("adminRegistration");
 }
 @RequestMapping("/saveUser")	
	public ModelAndView request9(@ModelAttribute("user") User user)
	{
		String pwd = passwordencode.encodePwd(user.getPassword());
		user.setPassword(pwd);
		/*Role r1=user.getRole();
		String r=user.getRole().getRoleid();
		if(r.equals("1"))
			r1.setRolename("ROLE_ADMIN");
		if(r.equals("2"))
			r1.setRolename("ROLE_USER");
		*/
		Role r1=new Role();
		r1.setRoleid("2");
		r1.setRolename("ROLE_USER");
		user.setRole(r1);
		user.setCheckEnable(1);
		customerService.saveUser(user);
		return new ModelAndView("result4","user",user);
	}

}