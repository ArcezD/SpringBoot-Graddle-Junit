package cr.arce.core.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/** 
 * <H1>Main RestController</H1>
 * 
 * AzD-Core [ArcezD]
 * 
 * @author Diego Arce E.
 * @version 1.0
 * 
 * Copyright 2016 ArcezD.
 * 
 */

@Controller
public class MainController {
	
	final static Logger logger = LogManager.getLogger(MainController.class);
	
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "AzD-Core. Desarrollado por: <a href='http://diego.arce.cr'>Diego Arce</a>";
	}
	
}