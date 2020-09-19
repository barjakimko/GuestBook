package com.example.servingwebcontent;

import com.example.servingwebcontent.Dto.UserDto;
import com.example.servingwebcontent.Model.User;
import com.example.servingwebcontent.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/all-user")
public class GreetingController {
    private GreetingService greetingService;
    private UserService userService;

    public GreetingController(GreetingService greetingService, UserService userService) {
        this.greetingService = greetingService;
        this.userService = userService;

    }

//    @GetMapping("/greeting")
//    public String greeting(@RequestParam(name="name1", required=false, defaultValue="World") String name1, Model model) {
//        model.addAttribute("name1", name1);
//        model.addAttribute("name", greetingService.getGreetings());
//
//        return "greeting";
//    }
//
//    @GetMapping("/not-greeting/{name}")
//    public String notgreeting(@PathVariable String name, Model model){
//        model.addAttribute("name", name);
//        return "not-greeting";
//    }
//
//    @GetMapping("/random")
//    public String randomF(){
//        return "redirect:not-greeting";
//    }
//
//    @GetMapping("/index")
//    public String getMainPage(){
//        return "student_template";
//    }

    @GetMapping
    public String guestBook(Model model) {


        model.addAttribute("users", userService.getAllUsers());
        return "/all-user";
    }

    @GetMapping("/add-user")
    public String addGuest(Model model) {


        model.addAttribute("user", new UserDto());
        return "/add-user";
    }

    @PostMapping
    public String addNewGuest(Model model, UserDto userDto){
        User user = new User(userDto.getName(), userDto.getMsg());
        userService.addUser(user);
        return "redirect:all-user";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable String id, Model model) {

        userService.deleteUserById(id);
        return "redirect:http://localhost:8080/all-user";
    }
}

