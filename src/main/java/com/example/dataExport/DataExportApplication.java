package com.example.dataExport;

import com.example.dataExport.entity.User;
import com.example.dataExport.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DataExportApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DataExportApplication.class, args);
	}



	@Override
	public void run(String... args) {
		List<User> users = new ArrayList<>(12);
		for (int i=0; i<12;i++){
			users.add(new User("test@gmail.com","asdfsfdadsf","Test User "+i));
		}
		userRepository.saveAll(users);
	}
}
