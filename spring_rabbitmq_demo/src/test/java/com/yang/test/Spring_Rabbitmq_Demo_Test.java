/**  
 * All rights Reserved, Designed By www.bingo.com
 * @Title Spring_Rabbitmq_Demo_Test.java     
 * @author yang          
 * @date 2019年3月25日 上午10:24:32   
 * @version V1.0 
 */
package com.yang.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yang.entity.User;

/**
 * @Package com.yang.test
 * @ClassName Spring_Rabbitmq_Demo_Test
 * @Description TODO
 * @version v1.0.0
 * @author yang
 * @date 2019年3月25日上午10:24:32
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Spring_Rabbitmq_Demo_Test {
	
	@Autowired
	RabbitTemplate rabbitTemplate;
	//交换器
	private String exchange = "yang.direct";
	//路由键
	private String routingKey = "yang.users";
	@Test
	public void test() {
		User user = new User();
		user.setId(1);
		user.setName("yang");
		rabbitTemplate.convertAndSend(exchange, routingKey, user);
	}
	
	@Test
	public void receive() {
		//String message = (String)rabbitTemplate.receiveAndConvert("yang.news");
		User message = (User)rabbitTemplate.receiveAndConvert("yang.users");
		System.out.println(message.toString());
	}
	
}
