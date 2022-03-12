package com.projetperso.projectlostark.controllers;

import com.projetperso.projectlostark.models.SubClass;
import com.projetperso.projectlostark.services.ISubClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class SubClassController {
    @Autowired
    private ISubClassService subClassService;

    @RequestMapping("/subClass/list")
    public String showList(Model model, SubClass subClass) {
        model.addAttribute("sub_class_list", subClassService.findAllSubClass());
        return "subClass/list";
    }

    @PostMapping("/subClass/update")
    public String updateList(SubClass subClass, Model model) {
        System.out.println("###########################################");
        System.out.println("11111111111111111111111111111111111111111111");
        System.out.println(subClass.toString());
        List<SubClass> resultList = subClassService.findSpecificSubClass(subClass);
        model.addAttribute("sub_class_list", resultList);
        System.out.println("###########################################");
        System.out.println("22222222222222222222222222222222222222222222");
        System.out.println(resultList.toString());
        return "subClass/list";
    }
}