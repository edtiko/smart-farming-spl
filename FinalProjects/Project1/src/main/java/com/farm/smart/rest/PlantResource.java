package com.farm.smart.rest;

import com.farm.smart.entities.Plant;
import com.farm.smart.service.IPlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PlantResource {

    @Autowired
    private IPlantService plantService;

	@GetMapping(value = "/plant")
    public String createPage() {

        return "plant";
    }

    @GetMapping(value = "/plants")
    public List<Plant> getPlants() {

        List<Plant> plants = plantService.findAll();

        return plants;
    }
}