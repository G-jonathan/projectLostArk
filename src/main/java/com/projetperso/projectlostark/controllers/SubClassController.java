package com.projetperso.projectlostark.controllers;

import com.projetperso.projectlostark.services.ISubClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SubClassController {
    @Autowired
    private ISubClassService subClassService;

    @RequestMapping("/subClass/list")
    public String showList(Model model) {
        model.addAttribute("sub_class_list", subClassService.findAllSubClass);
        return "subClass/list";
    }
}