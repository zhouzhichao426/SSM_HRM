package com.oasis.hrm.service.iservice;

import com.oasis.hrm.dao.pojo.EmpPro;

import java.util.List;

public interface EmpProService {
    String save(EmpPro empPro);
    String delete(Integer eno);
    String update(EmpPro empPro);
    EmpPro findById(Integer id);
    List<EmpPro> findByPage(int page,int size);
}
