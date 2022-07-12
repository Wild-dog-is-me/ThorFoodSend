package org.dog.thor.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.dog.thor.entity.OrderDetail;
import org.dog.thor.service.OrderDetailService;
import org.dog.thor.mapper.OrderDetailMapper;
import org.springframework.stereotype.Service;

/**
* @author zhanghaojian
* @description 针对表【order_detail(订单明细表)】的数据库操作Service实现
* @createDate 2022-07-10 22:20:09
*/
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail>
    implements OrderDetailService{

}




