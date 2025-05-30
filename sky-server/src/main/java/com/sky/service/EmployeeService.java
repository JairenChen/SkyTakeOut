package com.sky.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

import java.util.List;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 新增员工
     * @param employeeDTO
     * return
     */
    void save(EmployeeDTO employeeDTO);
    /**
     * 员工分页查询
     * @param employeePageQueryDTO
     * return
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);


    /*
    * 更新员工状态
    * @param id
    * return
    * */
    void updateStatus(Integer status, Long id);

    Employee getById(Long id);

    /*
     * 更新员工信息
     * @param id
     * return
     * */
    void update(EmployeeDTO employeeDTO);
}
