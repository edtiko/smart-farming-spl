package com.farm.smart.dao.impl;

import com.farm.smart.dao.ModuleDao;
import com.farm.smart.entities.Module;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ModuleDaoImpl implements ModuleDao {

    @Override
    public List<Module> getModuleList() {
        return new ArrayList<>();
    }
}
