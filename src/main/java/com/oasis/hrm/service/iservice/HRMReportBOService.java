package com.oasis.hrm.service.iservice;

import com.oasis.hrm.dao.pojo.HRMReportBO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HRMReportBOService {
    List<HRMReportBO> findByNumAndEdu(String beginTime, String endTime);

}
