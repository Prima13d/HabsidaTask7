package web.controller;

import  org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.UserServiceImpl;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping
    public String showUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    @GetMapping("/add")
    public String showAddUserForm() {
        return "add_user";
    }

    @PostMapping("/add")
    public String addUser(@RequestParam("userFirstName") String userFirstName,
                          @RequestParam("userFamilyName") String userFamilyName) {
        userService.saveUser(userFirstName, userFamilyName);
        return "redirect:/users";  // После добавления сразу на список
    }
}
