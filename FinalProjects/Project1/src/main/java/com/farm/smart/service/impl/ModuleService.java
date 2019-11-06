package com.farm.smart.service.impl;

import com.farm.smart.dao.impl.InventaryDaoImpl;
import com.farm.smart.dao.impl.ModuleDaoImpl;
import com.farm.smart.service.IModuleService;
import com.farm.smart.entities.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleService implements IModuleService {
    @Autowired
    private ModuleDaoImpl moduleDao;

    @Override
    public List<Module> findAll() {
        return moduleDao.getModuleList();
    }
}
