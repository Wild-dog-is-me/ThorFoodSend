package org.dog.thor.service;

import org.dog.thor.dto.DishDto;
import org.dog.thor.entity.Dish;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author zhanghaojian
* @description 针对表【dish(菜品管理)】的数据库操作Service
* @createDate 2022-07-13 19:12:52
*/
public interface DishService extends IService<Dish> {

    public void saveWithFlavor(DishDto dishDto);

    public DishDto getByIdWithFlavor(Long id);

    public void updateWithFlavor(DishDto dishDto);
}
