package com.oasis.hrm.service.impl;


import com.oasis.hrm.dao.pojo.NewEmpDTO;
import com.oasis.hrm.service.iservice.NewEmpReportService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class NewEmpReportDaoServiceImplTest {
    @Autowired
    NewEmpReportService newEmpReportService;

    @Test
    public void findByTime() {
        List<NewEmpDTO> infos=newEmpReportService.findByTime("","");
        for(NewEmpDTO info:infos){
            System.err.println(info);
        }
    }
}