/**  
 * All rights Reserved, Designed By www.bingo.com
 * @Title Spring_Druid_Demo_Application.java     
 * @author yang          
 * @date 2019年5月15日 下午6:48:34   
 * @version V1.0 
 */
package com.yang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Package com.yang
 * @ClassName Spring_Druid_Demo_Application
 * @Description TODO
 * @version v1.0.0
 * @author yang
 * @date 2019年5月15日下午6:48:34
 */
@SpringBootApplication
@MapperScan("com.yang.mapper")
public class Spring_Druid_Demo_Application {
	
	public static void main(String[] args) {
		
		SpringApplication.run(Spring_Druid_Demo_Application.class, args);
		
	}
	
}
