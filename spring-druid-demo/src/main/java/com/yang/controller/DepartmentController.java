/**  
 * All rights Reserved, Designed By www.bingo.com
 * @Title DepartmentController.java     
 * @author yang          
 * @date 2019年5月15日 下午6:58:17   
 * @version V1.0 
 */
package com.yang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yang.entitys.Department;
import com.yang.service.DepartmentService;

/**
 * @Package com.yang.controller
 * @ClassName DepartmentController
 * @Description TODO
 * @version v1.0.0
 * @author yang
 * @date 2019年5月15日下午6:58:17
 */
@RestController
public class DepartmentController {
	
	@Autowired private DepartmentService departmentService;
	
	@GetMapping("/dept/list")
	public List<Department> getList(){
		return departmentService.getList();
	}
	
}
