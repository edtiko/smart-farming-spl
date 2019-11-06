package com.farm.smart.rest;

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

	/*B-management*/

/*Code injected by: Productividad-AlterInventary*/
@RequestMapping("/productividad")
    public String desperdicios(ModelMap modelMap) {
        List<List<Map<Object, Object>>> canvasjsDataList = inventaryService.getCanvasjsChartData2();
        modelMap.addAttribute("dataPointsList", canvasjsDataList);
        return "chart2";
    }
/*Code injected by: Productividad-AlterInventary*/


/*Code injected by: Produccion-AlterInventary*/
@RequestMapping("/produccion")
    public String productividad(ModelMap modelMap) {
        List<List<Map<Object, Object>>> canvasjsDataList = inventaryService.getCanvasjsChartData();
        modelMap.addAttribute("dataPointsList", canvasjsDataList);
        return "chart";
    }
/*Code injected by: Produccion-AlterInventary*/

	/*E-management*/
}
