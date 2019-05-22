/**  
 * All rights Reserved, Designed By www.bingo.com
 * @Title UserService.java     
 * @author yang          
 * @date 2019年3月27日 下午3:49:41   
 * @version V1.0 
 */
package com.yang.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.yang.entity.User;

/**
 * @Package com.yang.service
 * @ClassName UserService
 * @Description TODO
 * @version v1.0.0
 * @author yang
 * @date 2019年3月27日下午3:49:41
 */
@Service
public class UserService {

	@RabbitListener(queues="yang.users")
	public void receive(User user) {
		System.out.println("收到消息：" + user.toString());
	}
	
}
