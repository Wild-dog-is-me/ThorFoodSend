package org.dog.thor.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.dog.thor.entity.Orders;
import org.dog.thor.service.OrdersService;
import org.dog.thor.mapper.OrdersMapper;
import org.springframework.stereotype.Service;

/**
* @author zhanghaojian
* @description 针对表【orders(订单表)】的数据库操作Service实现
* @createDate 2022-07-10 22:20:09
*/
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders>
    implements OrdersService{

}




