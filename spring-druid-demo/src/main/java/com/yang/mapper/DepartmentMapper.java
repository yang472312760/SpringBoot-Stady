/**  
 * All rights Reserved, Designed By www.bingo.com
 * @Title DepartmentMapper.java     
 * @author yang          
 * @date 2019年5月15日 下午6:52:01   
 * @version V1.0 
 */
package com.yang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.yang.entitys.Department;

/**
 * @Package com.yang.mapper
 * @ClassName DepartmentMapper
 * @Description TODO
 * @version v1.0.0
 * @author yang
 * @date 2019年5月15日下午6:52:01
 */
@Mapper
public interface DepartmentMapper {
	
	List<Department> getList();
	
}
