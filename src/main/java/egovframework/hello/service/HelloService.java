package egovframework.hello.service;

import java.util.List;

import org.springframework.ui.ModelMap;


public interface HelloService {
	List<?> selectData() throws Exception;
	String insertData(HelloVO vo) throws Exception;	
}