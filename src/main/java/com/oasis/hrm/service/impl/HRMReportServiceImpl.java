package com.oasis.hrm.service.impl;

import com.oasis.hrm.dao.HRMReportBoDao;
import com.oasis.hrm.dao.pojo.HRMReportBO;
import com.oasis.hrm.service.iservice.HRMReportBOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
@Service("hrmReportService")
public class HRMReportServiceImpl implements HRMReportBOService {
    @Autowired
    HRMReportBoDao hrmReportBoDao;
    @Override
    public List<HRMReportBO> findByNumAndEdu(String beginTime, String endTime) {
            if (beginTime != ""||endTime!="") {
                return hrmReportBoDao.findByNumAndEdu(beginTime, endTime);
            } else {
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

                //获取前月的第一天
                Calendar cal_1 = Calendar.getInstance();//获取当前日期
                cal_1.add(Calendar.MONTH, -1);
                cal_1.set(Calendar.DAY_OF_MONTH, 1);//设置为1号,当前日期既为本月第一天
                String firstDay = format.format(cal_1.getTime());
                beginTime = firstDay;
                Calendar ca = Calendar.getInstance();
                ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
                String last = format.format(ca.getTime());
                endTime=last;
                return hrmReportBoDao.findByNumAndEdu(beginTime, endTime);

            }
        }
}
