package com.farm.smart.dao.impl;

import com.farm.smart.dao.InventaryDao;
import com.farm.smart.entities.Inventary;
import com.farm.smart.entities.InventaryData;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class InventaryDaoImpl implements InventaryDao {

    @Override
    public List<List<Map<Object, Object>>> getCanvasjsChartData() {
        return InventaryData.getCanvasjsDataList();
    }

    @Override
    public List<List<Map<Object, Object>>> getCanvasjsChartData2() {
        return InventaryData.getCanvasjsDataList2();
    }

    @Override
    public List<List<Map<Object, Object>>> getCanvasjsChartData3() {
        return InventaryData.getCanvasjsDataList3();
    }

    @Override
    public List<Inventary> getInventaryList() {
        return InventaryData.getInventaryList();
    }
}
