package org.dog.thor.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.dog.thor.entity.Category;
import org.dog.thor.service.CategoryService;
import org.dog.thor.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author zhanghaojian
* @description 针对表【category(菜品及套餐分类)】的数据库操作Service实现
* @createDate 2022-07-10 22:20:09
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService{

}




