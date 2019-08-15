package com.oasis.hrm.dao;


import com.oasis.hrm.dao.pojo.DimDTO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DimReportDao {
    List<DimDTO> findDim(@Param("begin") String begin,@Param("end") String end);
}
