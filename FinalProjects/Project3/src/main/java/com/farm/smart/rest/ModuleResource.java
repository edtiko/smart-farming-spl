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

	@GetMapping(value = "/module")
    public String createPage() {

        return "module";
    }

    @GetMapping(value = "/modules")
    public List<Module> getModules() {

        List<Module> modules = moduleService.findAll();

        return modules;
    }
}
