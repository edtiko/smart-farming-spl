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
public class InventaryResource {


    @Autowired
    private InventaryService inventaryService;

    @Autowired
    private InventaryRepository inventaryRepository;

    @RequestMapping("/produccion")
    public String productividad(ModelMap modelMap) {
        List<List<Map<Object, Object>>> canvasjsDataList = inventaryService.getCanvasjsChartData();
        modelMap.addAttribute("dataPointsList", canvasjsDataList);
        return "chart";
    }


    @RequestMapping("/productividad")
    public String desperdicios(ModelMap modelMap) {
        List<List<Map<Object, Object>>> canvasjsDataList = inventaryService.getCanvasjsChartData2();
        modelMap.addAttribute("dataPointsList", canvasjsDataList);
        return "chart2";
    }


    @RequestMapping("/temperatura")
    public String springMVC(ModelMap modelMap) {
        List<List<Map<Object, Object>>> canvasjsDataList = inventaryService.getCanvasjsChartData3();
        modelMap.addAttribute("dataPointsList", canvasjsDataList);
        return "chart3";
    }

    @RequestMapping("/reporte")
    public String reporte(ModelMap modelMap) {
        List<Inventary> reportList = inventaryRepository.findAll();
        modelMap.addAttribute("reportList", reportList);
        return "report";
    }

    @RequestMapping("/createData")
    public String createData() {
        inventaryRepository.saveAll(InventaryData.getInventaryList());
        return "exito";
    }


}
