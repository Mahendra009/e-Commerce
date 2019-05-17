package com.lko.EveryNeed.in.util;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtility {
	
	private static final String ABS_PATH = "C:\\Users\\Srivastava Ji\\e-Commerce\\e-Commerce\\EveryNeed.in\\src\\main\\webapp\\resources\\images\\";
	private static String REAL_PATH = "";
	
	private static final Logger logger = LoggerFactory.getLogger(FileUploadUtility.class);
	public static void uploadFile(HttpServletRequest request, MultipartFile file, String productCode) {
		
		REAL_PATH = request.getSession().getServletContext().getRealPath("/resources/images/");
		
		logger.info(REAL_PATH);
		
		if(! new File(ABS_PATH).exists())
		{
			new File(ABS_PATH).mkdirs();
		}
		if(! new File(REAL_PATH).exists())
		{
			new File(REAL_PATH).mkdirs();
		}
		
		try 
		{
			// for server upload
			file.transferTo(new File (REAL_PATH + productCode + ".jpg"));
			
			// for project directory upload
			file.transferTo(new File (ABS_PATH + productCode + ".jpg"));
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}

}
