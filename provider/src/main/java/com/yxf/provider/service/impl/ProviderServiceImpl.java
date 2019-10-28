package com.yxf.provider.service.impl;

//import com.yxf.commons.pojo.Emp;
//import com.yxf.commons.pojo.EmpDto;
//import com.yxf.provider.dao.EmpDao;
import com.yxf.commons.pojo.EmpDto;
import com.yxf.provider.dao.EmpDao;
import com.yxf.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProviderServiceImpl implements ProviderService {
    @Autowired
    private EmpDao empDao;

    @Override
    public Map<String, Object> selAll(int page, int rows) {
        Pageable pageable = PageRequest.of(page-1,rows);
        Page<EmpDto> p = empDao.selAll(pageable);
        Map<String, Object> map = new HashMap<>();
        map.put("list",p.getContent());
        map.put("total",p.getTotalElements());
        map.put("count",p.getTotalPages());
        return map;
    }
}
