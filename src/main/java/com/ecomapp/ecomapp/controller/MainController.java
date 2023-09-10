package com.ecomapp.ecomapp.controller;

import com.ecomapp.ecomapp.dto.UserDto;
import com.ecomapp.ecomapp.service.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
    private UserService userService;

    public MainController(UserService userService) {
        super();
        this.userService = userService;
    }

    @ModelAttribute("user")
    public UserDto userDto() {
        return new UserDto();
    }

    @GetMapping("login")
    public String login(){
        return "login";
    }

    @PostMapping("signup")
    public String registerUserAccount(@ModelAttribute("user") UserDto userDto) {
        userService.save(userDto);
        return "redirect:/login?success";
    }

    @GetMapping
    public String redirectToLandingPage(Model model){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        boolean isAdmin = authentication.getAuthorities().stream()
                .anyMatch(auth -> auth.getAuthority().equals("ROLE_ADMIN"));
        boolean isUser = authentication.getAuthorities().stream()
                .anyMatch(auth -> auth.getAuthority().equals("ROLE_USER"));

        if (isAdmin) return "redirect:/admin";

        return "redirect:/user";

    }
}
