package com.udemy.springsecurity.data;

import com.udemy.springsecurity.entity.Role;
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
                admin.setRole(Role.ADMIN);

                userDetailsRepository.save(admin);
                System.out.println("Admin saved ");
            }
            if(userDetailsRepository.findByUserName("user").isEmpty()){
                Users user = new Users();
                user.setUserName("user");
                user.setPassword(passwordEncoder.encode("user123"));
                user.setRole(Role.USER);

                userDetailsRepository.save(user);
                System.out.println("Admin saved ");
            }
        };
    }

}
