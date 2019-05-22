/**  
 * All rights Reserved, Designed By www.bingo.com
 * @Title spring_rabbitmq_demo.java     
 * @author yang          
 * @date 2019年3月22日 下午10:29:16   
 * @version V1.0 
 */
package com.yang;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Package com.yang
 * @ClassName spring_rabbitmq_demo
 * @Description TODO
 * @version v1.0.0
 * @author yang
 * @date 2019年3月22日下午10:29:16
 * 
 * 
 * 自动配置类
 * 	1、RabbitAutoConfiguration
 *  2、自动配置了连接工厂：ConnectionFactory
 *  3、RabbitProperties：封装了Rabbit所有配置
 *  4、RabbitTemplate：给Rabbit发送和接收消息的
 *  5、AmqpAdmin：系统管理功能组件，创建队列和交换器
 * 
 */
@EnableRabbit
@SpringBootApplication
public class Spring_rabbitmq_demo {

	public static void main(String[] args) {
		
		SpringApplication.run(Spring_rabbitmq_demo.class, args);
		
	}
	
}
