package com.oasis.hrm.action;

import com.oasis.hrm.commons.ResultJSON;
import com.oasis.hrm.dao.pojo.HRMReportBO;
import com.oasis.hrm.service.iservice.HRMReportBOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class HRMReportBOAction {
    @Autowired
    HRMReportBOService hrmReportBOService;

    @RequestMapping("demo.do")
    public String findByNumAndEdu(Map<String,Object> map, @RequestParam(value = "beginTime")String beginTime,
                                  @RequestParam(value = "endTime")String endTime) {
        List<HRMReportBO> hrmReportBOList = hrmReportBOService.findByNumAndEdu(beginTime,endTime);
        map.put("hrmList",hrmReportBOList);
        return "demo";
    }
}
