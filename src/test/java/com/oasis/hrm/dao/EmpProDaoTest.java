package com.oasis.hrm.dao;

import com.oasis.hrm.dao.pojo.EmpPro;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class EmpProDaoTest {
@Autowired
    EmpProDao empProDao;
    @Test
    public void findAll() {
        for (EmpPro empPro : empProDao.findAll()) {
            System.err.println(empPro);
        }
    }
}