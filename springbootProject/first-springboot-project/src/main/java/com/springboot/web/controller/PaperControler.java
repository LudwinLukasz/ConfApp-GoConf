package com.springboot.web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springboot.web.service.confPaperService;
@Controller
@SessionAttributes(value = {"name","id"})
public class PaperControler {
		
		@Autowired
		confPaperService service;
		
		@RequestMapping(value="/list-papers", method = RequestMethod.GET)
		public String showPapers(ModelMap model){
			String name = (String) model.get("name");
			model.put("papers", service.retrievePapers(name));
			//System.out.println("ala ma kota " + service.retrievePapers(name));
			return "list-papers";
		}
		
		@RequestMapping(value="/add-paper", method = RequestMethod.GET)
		public String showAddPapers(ModelMap model){
			return "paper";
		}
		@RequestMapping(value="/delete-paper", method = RequestMethod.GET)
		public String showAddPapers(@RequestParam int id){
			service.deletePaper(id);
			return "redirect:/list-papers";
		}
		@RequestMapping(value="/add-paper", method = RequestMethod.POST)
		public String addPapers(ModelMap model, @RequestParam String author, @RequestParam String topic, @RequestParam String branch, @RequestParam String desc){
			service.addPaper((String) model.get("name"), author, topic, branch, desc, "path", "dodano");
			return "redirect:/list-papers";
		}
	}
