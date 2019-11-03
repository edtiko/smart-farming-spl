package com.farm.smart.rest;

import com.farm.smart.service.IModuleService;
import com.farm.smart.entities.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class ModuleResource {

    @Autowired
    private IModuleService moduleService;


    @GetMapping(value = "/agroItem")
    public String createPage() {

        return "agroItem";
    }

    @GetMapping(value = "/modules")
    public List<Module> getModules() {

        List<Module> cities = moduleService.findAll();

        return cities;
    }
}
