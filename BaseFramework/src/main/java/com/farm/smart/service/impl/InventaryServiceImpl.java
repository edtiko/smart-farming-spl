package com.farm.smart.service.impl;

import com.farm.smart.dao.impl.InventaryDaoImpl;
import com.farm.smart.entities.Inventary;
import com.farm.smart.service.InventaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class InventaryServiceImpl implements InventaryService {

    @Autowired
    private InventaryDaoImpl inventaryDao;

    public void setCanvasjsChartDao(InventaryDaoImpl inventaryDao) {
        this.inventaryDao = inventaryDao;
    }

    @Override
    public List<List<Map<Object, Object>>> getCanvasjsChartData() {
        return inventaryDao.getCanvasjsChartData();
    }

    @Override
    public List<List<Map<Object, Object>>> getCanvasjsChartData2() {
        return inventaryDao.getCanvasjsChartData2();
    }

    @Override
    public List<List<Map<Object, Object>>> getCanvasjsChartData3() {
        return inventaryDao.getCanvasjsChartData3();
    }

    @Override
    public List<Inventary> getInventaryList() {
        return inventaryDao.getInventaryList();
    }
}
