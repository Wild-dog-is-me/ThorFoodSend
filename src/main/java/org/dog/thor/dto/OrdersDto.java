package org.dog.thor.dto;

import lombok.Data;
import org.dog.thor.entity.OrderDetail;
import org.dog.thor.entity.Orders;

import java.util.List;

@Data
public class OrdersDto extends Orders {

    private String userName;

    private String phone;

    private String address;

    private String consignee;

    private List<OrderDetail> orderDetails;
	
}
