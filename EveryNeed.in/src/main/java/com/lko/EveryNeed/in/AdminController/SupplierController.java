package com.lko.EveryNeed.in.AdminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SupplierController {
	
	@RequestMapping(value = "/supplier")
	public String showSupplier()
	{
		return "Supplier";
	}

}
