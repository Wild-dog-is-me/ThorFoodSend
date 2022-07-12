package org.dog.thor.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.dog.thor.entity.DishFlavor;
import org.dog.thor.service.DishFlavorService;
import org.dog.thor.mapper.DishFlavorMapper;
import org.springframework.stereotype.Service;

/**
* @author zhanghaojian
* @description 针对表【dish_flavor(菜品口味关系表)】的数据库操作Service实现
* @createDate 2022-07-10 22:20:09
*/
@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor>
    implements DishFlavorService{

}




