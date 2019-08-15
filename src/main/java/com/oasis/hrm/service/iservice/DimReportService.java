package com.oasis.hrm.service.iservice;
import com.oasis.hrm.dao.pojo.DimDTO;


import java.util.List;

public interface DimReportService {
    List<DimDTO> findDim (String begin,String end);
    //List<InfoBO> findDimBO (DateVO datevo);
}
