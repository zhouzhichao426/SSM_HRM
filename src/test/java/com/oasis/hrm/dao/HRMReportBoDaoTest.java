package com.oasis.hrm.dao;

import com.oasis.hrm.dao.pojo.HRMReportBO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class HRMReportBoDaoTest {
    @Autowired
    HRMReportBoDao hrmReportBoDao;

    @Test
    public void findByNumAndEdu() {
        List<HRMReportBO> hrmReportBOList = hrmReportBoDao.findByNumAndEdu("2019-08-01","2019-08-31");
        for (HRMReportBO hrmReportBO : hrmReportBOList) {
            System.err.println(hrmReportBO);
        }
    }
}