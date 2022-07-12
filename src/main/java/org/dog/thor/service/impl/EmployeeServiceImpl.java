package org.dog.thor.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.dog.thor.entity.Employee;
import org.dog.thor.service.EmployeeService;
import org.dog.thor.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

/**
* @author zhanghaojian
* @description 针对表【employee(员工信息)】的数据库操作Service实现
* @createDate 2022-07-10 22:20:09
*/
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee>
    implements EmployeeService{

}




