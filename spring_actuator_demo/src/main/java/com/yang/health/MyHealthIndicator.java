/**  
 * All rights Reserved, Designed By www.bingo.com
 * @Title MyHealthIndicator.java     
 * @author yang          
 * @date 2019年3月31日 下午11:33:05   
 * @version V1.0 
 */
package com.yang.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @Package com.yang.health
 * @ClassName MyHealthIndicator
 * @Description TODO
 * @version v1.0.0
 * @author yang
 * @date 2019年3月31日下午11:33:05
 */
@Component
public class MyHealthIndicator implements HealthIndicator{

	@Override
	public Health health() {
		return Health.down().withDetail("msg", "服务异常").build();
	}

}
