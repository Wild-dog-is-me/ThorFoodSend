package org.dog.thor.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.dog.thor.entity.ShoppingCart;
import org.dog.thor.service.ShoppingCartService;
import org.dog.thor.mapper.ShoppingCartMapper;
import org.springframework.stereotype.Service;

/**
* @author zhanghaojian
* @description 针对表【shopping_cart(购物车)】的数据库操作Service实现
* @createDate 2022-07-10 22:20:09
*/
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart>
    implements ShoppingCartService{

}




