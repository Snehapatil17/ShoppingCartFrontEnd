package com.niit.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
	public class FileUploadController {

		@RequestMapping(value="/uploadFile",method=RequestMethod.POST)
		public @ResponseBody String handleFileUpload(@RequestParam("file")MultipartFile file)
		{
			String name=file.getOriginalFilename();
			String path="D:\\new workspace\\ShoppingcartFrontend\\src\\main\\webapp\\image";
					if(!file.isEmpty())
					{
						try{
							File imgDirectory=new File(path);
							if(!imgDirectory.exists())
							{
								imgDirectory.mkdir();
							}
							byte[] bytes=file.getBytes();
							BufferedOutputStream stream =new BufferedOutputStream(new FileOutputStream(new File(path+"\\"+name)));
							stream.write(bytes);
							stream.close();
							return "you successfully uploaded"+name+"into"+name+"-uploaded!";
							
						}
						catch(Exception e)
						{
							return "you failed to upload" +name + "=>"+e.getMessage();
						}
					}else
					{
						return "you failed to upload" +name+"beacause the file was empty.";
					}
			
		}

		/*
		 * upload multiple file using spring controller
		 */

		@RequestMapping(value="/uploadMultipleFile",method=RequestMethod.POST)
		public @ResponseBody
		String uploadMultipleFileHandler(@RequestParam("name")String[] names,@RequestParam("file")MultipartFile[] files)
		{
			if(files.length!=names.length)
				return "mandatory information missing";
			
			String message="";
			for(int i=0;i<files.length;i++)
			{
				MultipartFile file=files[i];
				String name=names[i];
				try
				{
					byte[] bytes= file.getBytes();
					
					
					//craeting the  directory to store file
					String rootPath =System.getProperty("catalina..homme");
					File dir= new File(rootPath +File.separator+"tmpFiles");
					if(!dir.exists())
						dir.mkdirs();
					
					//create the file on server
					File serverFile =new File(dir.getAbsolutePath() +File.separator+name);
					
					BufferedOutputStream stream =new BufferedOutputStream(new FileOutputStream (serverFile));
					
					stream.write(bytes);
					stream.close();
					
					message=message+"you successfully uploaded file"+name+"";
					
				}
				catch(Exception e)
				{
					return "you failed to upload"+ name + " => " + e.getMessage();
				}
			}
			return message;
		}
	}


