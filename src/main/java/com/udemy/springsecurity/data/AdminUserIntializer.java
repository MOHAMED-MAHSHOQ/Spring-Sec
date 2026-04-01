package com.udemy.springsecurity.data;

import com.udemy.springsecurity.entity.Users;
import com.udemy.springsecurity.repository.UserDetailsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class AdminUserIntializer {

    @Bean
    public CommandLineRunner createAdmin(UserDetailsRepository userDetailsRepository, PasswordEncoder passwordEncoder){
        return args -> {
            if(userDetailsRepository.findByUserName("admin").isEmpty()){
                Users admin = new Users();
                admin.setUserName("admin");
                admin.setPassword(passwordEncoder.encode("admin123"));
                admin.setRole("ROLE_ADMIN");

                userDetailsRepository.save(admin);
                System.out.println("Admin saved ");
            }
        };
    }

}
