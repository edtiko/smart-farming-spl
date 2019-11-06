Fragment Climate-AlterClimateResource { 
   Action: replace
   Priority: high
   FragmentationPoints: climate
   PointBracketsLan: java
   Destinations: ClimateControlResource
   SourceCode: [ALTERCODE-FRAG]      @RequestMapping("/temperatura")
    public String springMVC(ModelMap modelMap) {
        List<List<Map<Object, Object>>> canvasjsDataList = inventaryService.getCanvasjsChartData3();
        modelMap.addAttribute("dataPointsList", canvasjsDataList);
        return "chart3";
    }[/ALTERCODE-FRAG]
}