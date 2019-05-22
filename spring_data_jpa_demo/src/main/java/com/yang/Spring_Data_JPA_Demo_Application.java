/**  
 * All rights Reserved, Designed By www.bingo.com
 * @Title Spring_Data_JPA_Demo_Application.java     
 * @author yang          
 * @date 2019年3月9日 上午8:36:12   
 * @version V1.0 
 */
package com.yang;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Package com.yang
 * @ClassName Spring_Data_JPA_Demo_Application
 * @Description TODO
 * @version v1.0.0
 * @author yang
 * @date 2019年3月9日上午8:36:12
 */
@SpringBootApplication
public class Spring_Data_JPA_Demo_Application {
	
	public static void main(String[] args) {
		
		SpringApplication application = new SpringApplication(Spring_Data_JPA_Demo_Application.class);
		
		application.setBannerMode(Mode.OFF);
		
		application.run(args);
		
	}

}
