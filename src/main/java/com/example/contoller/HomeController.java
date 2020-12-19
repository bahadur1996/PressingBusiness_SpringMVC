package com.example.contoller;

import com.example.entity.UserEntity;
import com.example.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private final UserRepository userRepository;

    public HomeController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/")
    public String home(){
        return "home/home";
}
    @RequestMapping("/index")
    public String index(){
      UserEntity userEntity =  new UserEntity().setLastName("Bahadur").setFirstName("Arshad").setAddress("Duri angul lan").setCountry("Bangladesh")
              .setEmail("bahadur@gmail.com").setMobile("+01843135687");
        userRepository.save(userEntity);

        return "index";
    }
}
