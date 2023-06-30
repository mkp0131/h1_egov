package egovframework.hello.service;

import java.util.List;

import org.springframework.ui.ModelMap;


public interface HelloService {
	List<?> selectData() throws Exception;
	String insertData(HelloVO vo) throws Exception;	
	HelloVO selectDetail(String id) throws Exception;
	int updateData(HelloVO vo) throws Exception;
	int deleteData(String id) throws Exception;
}