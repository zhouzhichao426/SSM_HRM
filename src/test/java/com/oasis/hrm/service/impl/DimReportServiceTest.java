package com.oasis.hrm.service.impl;

import com.oasis.hrm.dao.DimReportDao;
import com.oasis.hrm.service.iservice.DimReportService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")

public class DimReportServiceTest {
@Autowired
DimReportService dimReportDaoService;
    @Test
    public void findDim() {
        System.err.println(dimReportDaoService.findDim("",""));
    }
}