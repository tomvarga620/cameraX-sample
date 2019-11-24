package com.tomvarga.server.springServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.xml.ws.Response;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@SpringBootApplication
public class SpringServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringServerApplication.class, args);
	}

	@RequestMapping("/upload")
	public ResponseEntity uploadFileToSystem(@RequestParam("file") MultipartFile file){
		String pathToSave="/Users/tomvarga/Desktop/images";
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		Path path = Paths.get(pathToSave+fileName);

		try {
			Files.copy(file.getInputStream(),path, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok("File was uploaded");

	}

}
