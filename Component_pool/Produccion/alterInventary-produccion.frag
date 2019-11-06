Fragment Produccion-AlterInventary { 
   Action: add
   Priority: high
   FragmentationPoints: management
   PointBracketsLan: java
   Destinations: InventaryResource
   SourceCode: [ALTERCODE-FRAG]    @RequestMapping("/produccion")
    public String productividad(ModelMap modelMap) {
        List<List<Map<Object, Object>>> canvasjsDataList = inventaryService.getCanvasjsChartData();
        modelMap.addAttribute("dataPointsList", canvasjsDataList);
        return "chart";
    }[/ALTERCODE-FRAG]
}