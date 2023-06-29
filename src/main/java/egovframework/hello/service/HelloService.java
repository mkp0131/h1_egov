package egovframework.hello.service;

import java.util.List;

import egovframework.example.sample.service.SampleDefaultVO;

public interface HelloService {
	List<?> selectData() throws Exception;
	String insertData(HelloVO vo) throws Exception;	
}