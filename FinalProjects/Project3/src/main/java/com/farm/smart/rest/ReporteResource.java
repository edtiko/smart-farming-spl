package com.farm.smart.rest;

import com.farm.smart.entities.Inventary;
import com.farm.smart.entities.InventaryData;
import com.farm.smart.repository.InventaryRepository;
import com.farm.smart.service.InventaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class ReporteResource {


    @Autowired
    private InventaryService inventaryService;

    @Autowired
    private InventaryRepository inventaryRepository;

	@RequestMapping("/reporte")
    public String reporte(ModelMap modelMap) {
        List<Inventary> reportList = inventaryRepository.findAll();
        modelMap.addAttribute("reportList", reportList);
        return "report";
    }

}
