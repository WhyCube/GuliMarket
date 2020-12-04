package com.why.mailorder;

import com.why.mailorder.entity.OrderEntity;
import com.why.mailorder.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MailOrderApplicationTests {

    @Autowired
    OrderService orderService;
    @Test
    void contextLoads() {
        OrderEntity orderEntity=new OrderEntity();
        orderEntity.setBillContent("测试！");
        orderService.save(orderEntity);
        System.out.println("成功");
    }

}
