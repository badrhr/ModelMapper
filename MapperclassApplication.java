package org.xproce.mapperclass;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.xproce.mapperclass.dao.entities.User;
import org.xproce.mapperclass.dao.repositories.UserRepository;

import java.util.List;

@SpringBootApplication
public class MapperclassApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapperclassApplication.class, args);
    }

    @Bean
    CommandLineRunner start(UserRepository userRepository){
        return args -> {
            List<User> users = List.of(
                    User.builder().name("t").login("jhui").password("65f4d6f4ew").build(),
                    User.builder().name("e").login("lkjh").password("df64ew8f7").build(),
                    User.builder().name("g").login("jhg").password("wef8w7q9f").build(),
                    User.builder().name("k").login("hg").password("f6e87f4dr8").build()
            );

            userRepository.saveAll(users);
        };
    }

}
