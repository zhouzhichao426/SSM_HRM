package com.oasis.hrm.dao;

import com.oasis.hrm.dao.pojo.HRMReportBO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HRMReportBoDao {
    List<HRMReportBO> findByNumAndEdu(@Param("beginTime")String beginTime, @Param("endTime")String endTime);
}
