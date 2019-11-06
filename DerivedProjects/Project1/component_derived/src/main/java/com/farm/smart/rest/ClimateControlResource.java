package com.farm.smart.rest;

import com.farm.smart.service.InventaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class ClimateControlResource {
	@Autowired
    private InventaryService inventaryService;
	/*B-climate*/

/*Code replaced by: Climate-AlterClimateResource*/
@RequestMapping("/temperatura")
    public String springMVC(ModelMap modelMap) {
        List<List<Map<Object, Object>>> canvasjsDataList = inventaryService.getCanvasjsChartData3();
        modelMap.addAttribute("dataPointsList", canvasjsDataList);
        return "chart3";
    }
/*Code replaced by: Climate-AlterClimateResource*/
/*E-climate*/
}
