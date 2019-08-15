package com.oasis.hrm.service.iservice;

import com.oasis.hrm.dao.pojo.NewEmpDTO;

import java.util.List;

public interface NewEmpReportService {
    List<NewEmpDTO>  findByTime(String beginTime,String endTime);
}
