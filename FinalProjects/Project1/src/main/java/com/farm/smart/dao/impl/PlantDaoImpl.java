package com.farm.smart.dao.impl;

import com.farm.smart.dao.PlantDao;
import com.farm.smart.entities.InventaryData;
import com.farm.smart.entities.Plant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PlantDaoImpl implements PlantDao {

    @Override
    public List<Plant> getPlantList() {
        return new ArrayList<>();
    }
}
