package com.tomvarga.server.springServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@SpringBootApplication
//@RestController
public class SpringServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringServerApplication.class, args);
	}

	/*@PostMapping("/upload")
	public ResponseEntity uploadFileToSystem(@RequestParam("file") MultipartFile file,
		HttpServletResponse response){

		String pathToSave="/Users/tomvarga/Desktop/images/";
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		Path path = Paths.get(pathToSave+fileName);
		System.out.println(path);
		try {
			Files.copy(file.getInputStream(),path, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok("Image was saved");
	}*/


}
