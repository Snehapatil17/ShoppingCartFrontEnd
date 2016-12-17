package com.niit.shoppingcart.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;
import org.springframework.web.multipart.MultipartFile;

public class FileUtil {
	private static Logger log = LoggerFactory.logger(FileUtil.class);

	public static void upload(String path, MultipartFile file, String fileName) {
		log.debug("starting of the method upload");
		log.debug("path:" + path);
		log.debug("fileName:" + fileName);
		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();

				// creating the directory to store file
				File dir = new File(path);
				if (!dir.exists())
					dir.mkdirs();

				// create the file on server
				File serverFile = new File(dir.getAbsolutePath() + File.separator + fileName);
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();

				log.info("server File Location =" + serverFile.getAbsolutePath());

			} catch (Exception e)

			{
				e.printStackTrace();

			}

		}

		log.debug("enging of th method upload");
	}

}
