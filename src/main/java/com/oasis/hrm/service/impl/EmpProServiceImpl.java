package com.oasis.hrm.service.impl;

import com.github.pagehelper.PageHelper;
import com.oasis.hrm.commons.Result;
import com.oasis.hrm.dao.EmpProDao;
import com.oasis.hrm.dao.pojo.EmpPro;

import com.oasis.hrm.service.iservice.EmpProService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service("empProService")
public class EmpProServiceImpl implements EmpProService {
    @Autowired
    EmpProDao empProDao;
    @Override
    public String save(EmpPro empPro) {
        int result =empProDao.insertSelective(empPro);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public String delete(Integer eno) {
        int result =empProDao.deleteByPrimaryKey(eno);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public String update(EmpPro empPro) {
        int result =empProDao.updateByPrimaryKeySelective(empPro);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public EmpPro findById(Integer id) {
        return empProDao.selectByPrimaryKey(id);
    }

    @Override
    public List<EmpPro> findByPage(int page, int size) {
        PageHelper.startPage(page,size);
        return empProDao.findAll();
    }
}
