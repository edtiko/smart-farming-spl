Fragment Productividad-AlterInventary { 
   Action: add
   Priority: high
   FragmentationPoints: management
   PointBracketsLan: java
   Destinations: InventaryResource
   SourceCode: [ALTERCODE-FRAG]    @RequestMapping("/productividad")
    public String desperdicios(ModelMap modelMap) {
        List<List<Map<Object, Object>>> canvasjsDataList = inventaryService.getCanvasjsChartData2();
        modelMap.addAttribute("dataPointsList", canvasjsDataList);
        return "chart2";
    }[/ALTERCODE-FRAG]
}