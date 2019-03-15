package com.gontuseries.hellocontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class StudentController {
	
	@RequestMapping(value="/admission.html",method=RequestMethod.GET)
    public ModelAndView getAdmissionForm() {
		ModelAndView model=new ModelAndView("AdmissionForm");
		return model;
	}
	
	@RequestMapping(value="/submitAdmissionForm.html",method=RequestMethod.POST)
    public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name,@RequestParam("studentHobby") String hobby) {
	 ModelAndView model=new ModelAndView("AdmissionSuccess");
	 model.addObject("msg","Details submitted by you::Name: "+name+ " Hobby: "+ hobby);
	 return model;
	}


}

