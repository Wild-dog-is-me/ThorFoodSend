package org.dog.thor.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.dog.thor.entity.User;
import org.dog.thor.service.UserService;
import org.dog.thor.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author zhanghaojian
* @description 针对表【user(用户信息)】的数据库操作Service实现
* @createDate 2022-07-10 22:20:09
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




