/**  
 * All rights Reserved, Designed By www.bingo.com
 * @Title MyRabbitMqConfig.java     
 * @author yang          
 * @date 2019年3月25日 上午10:22:55   
 * @version V1.0 
 */
package com.yang.conf;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Package com.yang.conf
 * @ClassName MyRabbitMqConfig
 * @Description TODO
 * @version v1.0.0
 * @author yang
 * @date 2019年3月25日上午10:22:55
 */
@Configuration
public class MyRabbitMqConfig {
	
	@Bean
	public MessageConverter messageConverter() {
		return new Jackson2JsonMessageConverter();
	}
	
}
