package com.example.VesSpringVes.controller;

import com.example.VesSpringVes.entity.HomeEntity;
import com.example.VesSpringVes.entity.UsersEntity;
import com.example.VesSpringVes.service.HomeService;
import com.example.VesSpringVes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @Autowired
    private UserService userService;

    @Autowired
    private HomeService homeService;

    @GetMapping(value = "/addHome")
    public String getAddHome(@RequestParam("id") Integer userId,
                             Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("homeAttribute", new HomeEntity());
        return "add-home";
    }

    @PostMapping(value = "/addHome")
    public String postAddHome(@ModelAttribute("homeAttribute") HomeEntity homeEntity,
                              @RequestParam("id") Integer userId) {
        homeService.addHome(userId, homeEntity);
        return "redirect:/usersList";
    }

    @GetMapping("/deleteHome")
    public String getDeleteHome(@RequestParam("id") Integer homeId) {
        homeService.deleteHome(homeId);
        return "redirect:/usersList";
    }

    @GetMapping(value = "/editHome")
    public String getEditHome(@RequestParam(value = "uid") Integer userId,
                              @RequestParam(value = "hid") Integer homeId,
                              Model model) {
        HomeEntity exictingHome = homeService.findById(homeId);
        model.addAttribute("userId", userId);
        model.addAttribute("homeAttribute", exictingHome);
        return "edit-home";
    }

    @PostMapping(value = "/editHome")
    public String postEditHome(@RequestParam(value = "id") Integer homeId,
                               @ModelAttribute("userAttribute") HomeEntity homeEntity) {
        homeEntity.setId(homeId);
        homeService.editHome(homeEntity);
        return "redirect:/usersList";
    }
}
