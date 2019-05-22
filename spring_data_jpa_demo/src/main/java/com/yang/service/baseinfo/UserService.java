/**  
 * All rights Reserved, Designed By www.bingo.com
 * @Title UserService.java     
 * @author yang          
 * @date 2019年3月9日 上午8:48:31   
 * @version V1.0 
 */
package com.yang.service.baseinfo;

import java.util.List;

import com.yang.entitys.baseinfo.User;

/**
 * @Package com.yang.service.baseinfo
 * @ClassName UserService
 * @Description TODO
 * @version v1.0.0
 * @author yang
 * @date 2019年3月9日上午8:48:31
 */
public interface UserService {
	
	/**
	 * 
	 * @Function findAll
	 * @Description TODO
	 * @return     
	 * @version v1.0.0
	 * @author yang
	 * @date 2019年3月9日上午8:52:46
	 */
	public List<User> findAll();
	
	public User getUserByName(String name);
	
}
