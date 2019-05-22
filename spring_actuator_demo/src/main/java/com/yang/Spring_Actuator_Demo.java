/**  
 * All rights Reserved, Designed By www.bingo.com
 * @Title Spring_Actuator_Demo.java     
 * @author yang          
 * @date 2019年3月31日 下午10:47:14   
 * @version V1.0 
 */
package com.yang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Package com.yang
 * @ClassName Spring_Actuator_Demo
 * @Description TODO
 * @version v1.0.0
 * @author yang
 * @date 2019年3月31日下午10:47:14
 * 
 * 自定义健康状态指示器
 * 	1、编写一个指示器 实现HealthIndicator接口
 * 	2、指示器名字xxxHealthIndicator
 * 	3、加入容器中
 * 
 */
@SpringBootApplication
public class Spring_Actuator_Demo {
	
	public static void main(String[] args) {
		
		SpringApplication.run(Spring_Actuator_Demo.class, args);
		
	}
	
}
