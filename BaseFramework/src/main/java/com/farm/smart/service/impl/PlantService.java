package com.farm.smart.service.impl;

import com.farm.smart.dao.impl.ModuleDaoImpl;
import com.farm.smart.dao.impl.PlantDaoImpl;
import com.farm.smart.service.IPlantService;
import com.farm.smart.entities.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantService implements IPlantService {

    @Autowired
    private PlantDaoImpl plantDao;

    @Override
    public List<Plant> findAll() {
        return plantDao.getPlantList();
    }
}
