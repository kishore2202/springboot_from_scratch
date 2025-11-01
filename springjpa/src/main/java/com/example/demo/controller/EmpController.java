package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.entities.Emp;
import com.example.demo.repo.EmpRepo;

@RestController
public class EmpController {

	@Autowired
	EmpRepo repo;

	@RequestMapping("/home")
	public ModelAndView home(Emp emp)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj",emp);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/addEmp")
	public String addEmp(Emp emp)
	{
		repo.save(emp);
		return "home";
	}
	
	@RequestMapping("/deleteEmp")
	public String deleteEmp(Emp emp)
	{
		repo.delete(emp);
		return "home";
	}
	
	@RequestMapping(path="/readEmps1", produces= {"application/xml"})
	public ModelAndView readEmp(@RequestParam int eid)
	{
		ModelAndView mv=new ModelAndView("display");
		Emp emp=repo.findById(eid).orElse(new Emp());
		mv.addObject(emp);
		return mv;
	}
	
	@RequestMapping(path="/readEmps", produces= {"application/xml"})
	public List<Emp> readEmp2()
	{
		return repo.findAll();
	}
	
	@RequestMapping("/readEmp/{eid}") 
	public String readEmp1(@PathVariable("eid") int eid)
	{
		return repo.findById(eid).toString();
	}
	
	
	@RequestMapping("/updateEmp")
	public String updateEmp(int eid, String ename)
	{
		Optional<Emp> emp=repo.findById(eid);
		if(emp.isPresent())
		{
			Emp em=emp.get();
			em.setEname(ename);
			repo.save(em);
		}
		return "home";
	}
}
