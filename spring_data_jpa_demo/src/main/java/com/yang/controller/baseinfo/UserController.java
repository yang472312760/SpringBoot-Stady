/**  
 * All rights Reserved, Designed By www.bingo.com
 * @Title UserController.java     
 * @author yang          
 * @date 2019年3月9日 上午8:53:27   
 * @version V1.0 
 */
package com.yang.controller.baseinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yang.entitys.baseinfo.User;
import com.yang.service.baseinfo.UserService;

/**
 * @Package com.yang.controller.baseinfo
 * @ClassName UserController
 * @Description TODO
 * @version v1.0.0
 * @author yang
 * @date 2019年3月9日上午8:53:27
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@GetMapping("/getAll")
	public ResponseEntity<List<User>> users(){
		
		List<User> userList = userService.findAll();
		
		ResponseEntity<List<User>> entity = new ResponseEntity<List<User>>(userList, HttpStatus.OK);
		
		return entity;
	}
	
	@GetMapping("/user/{name}")
	public ResponseEntity<User> user(@PathVariable("name") String name){
		
		User user = userService.getUserByName(name);
		
		return new ResponseEntity<User>(user,HttpStatus.OK);
		
	}
	
}
