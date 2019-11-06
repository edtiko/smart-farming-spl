package com.farm.smart.dao;

import com.farm.smart.entities.Inventary;

import java.util.List;
import java.util.Map;

public interface InventaryDao {

    List<List<Map<Object, Object>>> getCanvasjsChartData();

    List<List<Map<Object, Object>>> getCanvasjsChartData2();

    List<List<Map<Object, Object>>> getCanvasjsChartData3();

    List<Inventary> getInventaryList();
}
