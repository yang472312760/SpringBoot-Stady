/**  
 * All rights Reserved, Designed By www.bingo.com
 * @Title Bookrepository.java     
 * @author yang          
 * @date 2019年3月28日 下午10:18:08   
 * @version V1.0 
 */
package com.yang.elastic.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.elasticsearch.repository.cdi.ElasticsearchRepositoryBean;

import com.yang.elastic.entity.Book;

/**
 * @Package com.yang.elastic.repository
 * @ClassName Bookrepository
 * @Description TODO
 * @version v1.0.0
 * @author yang
 * @date 2019年3月28日下午10:18:08
 */
public interface BookRepository extends ElasticsearchRepository<Book, Integer>{

}
