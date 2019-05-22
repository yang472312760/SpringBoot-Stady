/**  
 * All rights Reserved, Designed By www.bingo.com
 * @Title UserServiceImpl.java     
 * @author yang          
 * @date 2019年3月9日 上午8:48:56   
 * @version V1.0 
 */
package com.yang.service.baseinfo.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yang.entitys.baseinfo.User;
import com.yang.repository.info.UserRepository;
import com.yang.service.baseinfo.UserService;

/**
 * @Package com.yang.service.baseinfo.impl
 * @ClassName UserServiceImpl
 * @Description TODO
 * @version v1.0.0
 * @author yang
 * @date 2019年3月9日上午8:48:56
 */
@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserRepository userRepository;

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return (List<User> )userRepository.findAll();
	}

	/**
	 * @Function getUserByName
	 * @Description TODO
	 * @return    
	 * @version v1.0.0
	 * @author yang
	 * @date 2019年3月9日上午9:21:23
	 *
	 * @see com.yang.service.baseinfo.UserService#getUserByName()
	 */
	@Override
	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		return userRepository.getUserByName(name);
	}
	
	
	
}
