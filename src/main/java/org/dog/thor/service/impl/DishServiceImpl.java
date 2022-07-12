package org.dog.thor.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.dog.thor.entity.Dish;
import org.dog.thor.service.DishService;
import org.dog.thor.mapper.DishMapper;
import org.springframework.stereotype.Service;

/**
* @author zhanghaojian
* @description 针对表【dish(菜品管理)】的数据库操作Service实现
* @createDate 2022-07-10 22:20:09
*/
@Service
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish>
    implements DishService{

}




