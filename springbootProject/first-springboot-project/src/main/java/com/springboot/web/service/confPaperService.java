package com.springboot.web.service;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.web.model.Paper;
@Service
public class confPaperService {

	    private static List<Paper> papers = new ArrayList<Paper>();
	    private static int paperCount = 3;

	    static {
	        papers.add(new Paper(1, "profDummy1", "prof Alex Dummy1 ","O karczowaniu lasu","lesnictwo",
	        		"taki sobie","c:/","dodawanie"));
	        papers.add(new Paper(2, "profDummy1", "prof Alex Dummy1 ","O sadzeniu lasu","lesnictwo",
	        		"naprawde warto","c:/","dodawanie"));
	        papers.add(new Paper(3, "profDummy2", "prof Fiona Dummy2 ","Tam i spowrotem","awionika",
	        		"no cóż","c:/","dodawanie"));
	    }
	    
	    public List<Paper> retrievePapers(String user) {
	        List<Paper> filteredPapers = new ArrayList<Paper>();
	        for (Paper paper : papers) {
	            if (paper.getUser().equals(user)) {
	                filteredPapers.add(paper);
	            }
	        }
	        return filteredPapers;
	    }

	    public void addPaper(String user, String author, String topic,
				String branch, String desc, String path, String status) {
	    	papers.add(new Paper(++paperCount, user, author, topic,
					branch, desc, path, status));
	    }
	    public void markPaper(int id) {
	    	 Iterator<Paper> iterator = papers.iterator();
		        while (iterator.hasNext()) {
		            Paper paper = iterator.next();
		            if (paper.getId() == id) {
		                paper.setStatus("wysłany");
		            }
		        }
		        
	    }
	    public void deletePaper(int id) {
	        Iterator<Paper> iterator = papers.iterator();
	        while (iterator.hasNext()) {
	            Paper paper = iterator.next();
	            if (paper.getId() == id) {
	                iterator.remove();
	            }
	        }
	    }
	    
}