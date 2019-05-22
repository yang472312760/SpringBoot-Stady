/**  
 * All rights Reserved, Designed By www.bingo.com
 * @Title UserRepository.java     
 * @author yang          
 * @date 2019年3月9日 上午8:39:47   
 * @version V1.0 
 */
package com.yang.repository.info;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.yang.entitys.baseinfo.User;

/**
 * @Package com.yang.repository.info
 * @ClassName UserRepository
 * @Description TODO
 * @version v1.0.0
 * @author yang
 * @date 2019年3月9日上午8:39:47
 */
public interface UserRepository extends CrudRepository<User, Integer> {

	@Query("select new User(id,name) from User  where name = ?1")
	public User getUserByName(String name);

}
