/**  
 * All rights Reserved, Designed By www.bingo.com
 * @Title ElaesticTest.java     
 * @author yang          
 * @date 2019年3月28日 下午9:31:45   
 * @version V1.0 
 */
package com.yang.elastic;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yang.elastic.entity.Artice;
import com.yang.elastic.entity.Book;
import com.yang.elastic.repository.BookRepository;



/**
 * @Package com.yang.elastic
 * @ClassName ElaesticTest
 * @Description TODO
 * @version v1.0.0
 * @author yang
 * @date 2019年3月28日下午9:31:45
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ElaesticTest {
	
	//@Autowired
	//JestClient jestClient;
	
	@Autowired
	BookRepository bookRepository;
	
	
	@Test
	public void test02() {
		Book book = new Book(1,"yang","yang");
		bookRepository.index(book);
	}
	
	@Test
	public void test() {
		Artice artice = new Artice();
		artice.setId(1);
		artice.setAuthor("yang11");
		artice.setTitle("11");
		artice.setContent("222222222");
		
		//Index build = new Index.Builder(artice).index("yang").type("book").build();
		/*try {
			//jestClient.execute(build);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	
/*	@Test
	public void search() {
		String json = "{\r\n" + 
				"    \"query\" : {\r\n" + 
				"        \"match\" : {\r\n" + 
				"            \"title\" : \"11\"\r\n" + 
				"        }\r\n" + 
				"    }\r\n" + 
				"}";
		Search build = new Search.Builder(json).addIndex("yang").addType("book").build();
		try {
			SearchResult result = jestClient.execute(build);
			System.out.println(result.getJsonString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			 * 
			e.printStackTrace();
		}
	}*/
}
