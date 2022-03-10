package com.projetperso.projectlostark.controllers;

import com.projetperso.projectlostark.services.ISubClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EngravingController {
    @Autowired
    private ISubClassService subClassService;

    @RequestMapping("/engravings/list")
    public String showList(Model model) {
        model.addAttribute("engravings_list");
        return "/engravings/list";
    }
}