package com.farm.smart.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventaryData {

    static Map<Object,Object> map = null;
    static List<List<Map<Object,Object>>> list = new ArrayList<>();
    static List<Map<Object,Object>> dataPoints1 = new ArrayList<>();

    static Map<Object,Object> map2 = null;
    static List<List<Map<Object,Object>>> list2 = new ArrayList<>();
    static List<Map<Object,Object>> dataPoints2 = new ArrayList<>();

    static Map<Object,Object> map3 = null;
    static List<List<Map<Object,Object>>> list3 = new ArrayList<>();
    static List<Map<Object,Object>> dataPoints3 = new ArrayList<>();

    static List<Inventary> reportList = new ArrayList<>();

    static {
        map = new HashMap<>(); map.put("x", 1167589800000L); map.put("y", 188);dataPoints1.add(map);
        map = new HashMap<>(); map.put("x", 1199125800000L); map.put("y", 213);dataPoints1.add(map);
        map = new HashMap<>(); map.put("x", 1230748200000L); map.put("y", 213);dataPoints1.add(map);
        map = new HashMap<>(); map.put("x", 1262284200000L); map.put("y", 219);dataPoints1.add(map);
        map = new HashMap<>(); map.put("x", 1293820200000L); map.put("y", 207);dataPoints1.add(map);
        map = new HashMap<>(); map.put("x", 1325356200000L); map.put("y", 167);dataPoints1.add(map);
        map = new HashMap<>(); map.put("x", 1356978600000L); map.put("y", 136);dataPoints1.add(map);
        map = new HashMap<>(); map.put("x", 1388514600000L); map.put("y", 152);dataPoints1.add(map);
        map = new HashMap<>(); map.put("x", 1420050600000L); map.put("y", 129);dataPoints1.add(map);
        map = new HashMap<>(); map.put("x", 1451586600000L); map.put("y", 155);dataPoints1.add(map);

        list.add(dataPoints1);
    }

    static {
        map2 = new HashMap<Object,Object>(); map2.put("label", "Frijoles"); map2.put("y", 30);dataPoints2.add(map2);
        map2 = new HashMap<Object,Object>(); map2.put("label", "Lechuga"); map2.put("y", 25);dataPoints2.add(map2);
        map2 = new HashMap<Object,Object>(); map2.put("label", "Tomate"); map2.put("y", 5);dataPoints2.add(map2);
        map2 = new HashMap<Object,Object>(); map2.put("label", "Repollo"); map2.put("y", 20);dataPoints2.add(map2);
        map2 = new HashMap<Object,Object>(); map2.put("label", "Yuca"); map2.put("y", 10);dataPoints2.add(map2);
        map2 = new HashMap<Object,Object>(); map2.put("label", "Maíz"); map2.put("y", 10);dataPoints2.add(map2);

        list2.add(dataPoints2);
    }

    static {
        map3 = new HashMap<Object,Object>(); map3.put("x", 1483209000000L); map3.put("y", new Integer[] {5,14});dataPoints3.add(map3);
        map3 = new HashMap<Object,Object>(); map3.put("x", 1485887400000L); map3.put("y", new Integer[] {6,14});dataPoints3.add(map3);
        map3 = new HashMap<Object,Object>(); map3.put("x", 1488306600000L); map3.put("y", new Integer[] {8,16});dataPoints3.add(map3);
        map3 = new HashMap<Object,Object>(); map3.put("x", 1490985000000L); map3.put("y", new Integer[] {10,18});dataPoints3.add(map3);
        map3 = new HashMap<Object,Object>(); map3.put("x", 1493577000000L); map3.put("y", new Integer[] {14,22});dataPoints3.add(map3);
        map3 = new HashMap<Object,Object>(); map3.put("x", 1496255400000L); map3.put("y", new Integer[] {18,26});dataPoints3.add(map3);
        map3 = new HashMap<Object,Object>(); map3.put("x", 1498847400000L); map3.put("y", new Integer[] {21,28});dataPoints3.add(map3);
        map3 = new HashMap<Object,Object>(); map3.put("x", 1501525800000L); map3.put("y", new Integer[] {21,29});dataPoints3.add(map3);
        map3 = new HashMap<Object,Object>(); map3.put("x", 1504204200000L); map3.put("y", new Integer[] {18,26});dataPoints3.add(map3);
        map3 = new HashMap<Object,Object>(); map3.put("x", 1506796200000L); map3.put("y", new Integer[] {14,23});dataPoints3.add(map3);
        map3 = new HashMap<Object,Object>(); map3.put("x", 1509474600000L); map3.put("y", new Integer[] {9,18});dataPoints3.add(map3);
        map3 = new HashMap<Object,Object>(); map3.put("x", 1512066600000L); map3.put("y", new Integer[] {5,14});dataPoints3.add(map3);

        list3.add(dataPoints3);
    }

    static {
        reportList.add(new Inventary("Fresas", "FR-001", "Valle", "65", "2019/11/03", "$84,600","28", "100"));
        reportList.add(new Inventary("Lechuga", "FR-001", "Valle", "21", "2019/11/03", "$89,600","28", "100"));
        reportList.add(new Inventary("Repollo", "FR-001", "Antioquia", "62", "2019/11/03", "$88,600","28", "100"));
        reportList.add(new Inventary("Frijoles", "FR-001", "Valle", "65", "2019/11/03", "$87,600","28", "100"));
        reportList.add(new Inventary("Maiz", "FR-001", "Valle", "65", "2019/11/03", "$86,600","28", "100"));
        reportList.add(new Inventary("Papa", "FR-001", "Antioquia", "63", "2019/11/03", "$85,600","28", "100"));
        reportList.add(new Inventary("Arbeja", "FR-001", "Valle", "65", "2019/11/03", "$87,600","28", "100"));
        reportList.add(new Inventary("Yuca", "FR-001", "Valle", "65", "2019/11/03", "$83,600","28", "100"));
        reportList.add(new Inventary("Cebolla", "FR-001", "Valle", "64", "2019/11/03", "$82,600","28", "100"));
        reportList.add(new Inventary("Fresas", "FR-001", "Valle", "85", "2019/11/03", "$84,600","28", "100"));
        reportList.add(new Inventary("Repollo", "FR-001", "Antioquia", "65", "2019/11/03", "$84,600","28", "100"));
        reportList.add(new Inventary("Maiz", "FR-001", "Valle", "65", "2019/11/03", "$84,600","28", "100"));
        reportList.add(new Inventary("Arbeja", "FR-001", "Valle", "65", "2019/11/03", "$81,600","28", "100"));
        reportList.add(new Inventary("Lechuga", "FR-001", "Antioquia", "65", "2019/11/03", "$84,600","28", "100"));
        reportList.add(new Inventary("Fresas", "FR-001", "Antioquia", "65", "2019/11/03", "$84,600","28", "100"));
        reportList.add(new Inventary("Frijoles", "FR-001", "Valle", "65", "2019/11/03", "$84,600","28", "100"));
        reportList.add(new Inventary("Arbeja", "FR-001", "Antioquia", "65", "2019/11/03", "$84,600","28", "100"));
        reportList.add(new Inventary("Arbeja", "FR-001", "Valle", "65", "2019/11/03", "$84,600","28", "100"));
        reportList.add(new Inventary("Maiz", "FR-001", "Valle", "66", "2019/11/03", "$84,600","28", "100"));
        reportList.add(new Inventary("Repollo", "FR-001", "Antioquia", "65", "2019/11/03", "$84,600","28", "100"));
        reportList.add(new Inventary("Lechuga", "FR-001", "Valle", "65", "2019/11/03", "$84,600","28", "100"));
        reportList.add(new Inventary("Frijoles", "FR-001", "Valle", "95", "2019/11/03", "$84,600","28", "100"));
        reportList.add(new Inventary("Fresas", "FR-001", "Valle", "25", "2019/11/03", "$84,600","28", "100"));
        reportList.add(new Inventary("Lechuga", "FR-001", "Antioquia", "65", "2019/11/03", "$84,600","28", "100"));
        reportList.add(new Inventary("Arbeja", "FR-001", "Valle", "65", "2019/11/03", "$84,600","28", "100"));
        reportList.add(new Inventary("Maiz", "FR-001", "Valle", "64", "2019/11/03", "$84,600","28", "100"));
        reportList.add(new Inventary("Repollo", "FR-001", "Valle", "65", "2019/11/03", "$94,600","28", "100"));
        reportList.add(new Inventary("Frijoles", "FR-001", "Antioquia", "65", "2019/11/03", "$14,600","28", "100"));
        reportList.add(new Inventary("Arbeja", "FR-001", "Valle", "45", "2019/11/03", "$24,600","28", "100"));
        reportList.add(new Inventary("Arbeja", "FR-001", "Valle", "65", "2019/11/03", "$34,600","28", "100"));
        reportList.add(new Inventary("Fresas", "FR-001", "Antioquia", "65", "2019/11/03", "$44,600","28", "100"));
        reportList.add(new Inventary("Lechuga", "FR-001", "Valle", "65", "2019/11/03", "$54,600","28", "100"));
        reportList.add(new Inventary("Repollo", "FR-001", "Valle", "65", "2019/11/03", "$64,600","28", "100"));
        reportList.add(new Inventary("Frijoles", "FR-001", "Valle", "95", "2019/11/03", "$74,600","28", "100"));
        reportList.add(new Inventary("Fresas", "FR-001", "Antioquia", "65", "2019/11/03", "$84,600","28", "100"));

    }

    public static List<List<Map<Object, Object>>> getCanvasjsDataList() {
        return list;
    }

    public static List<List<Map<Object, Object>>> getCanvasjsDataList2() { return list2;}

    public static List<List<Map<Object, Object>>> getCanvasjsDataList3() { return list3;}

    public static List<Inventary> getInventaryList() { return reportList; }
}
