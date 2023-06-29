package egovframework.hello.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.hello.service.HelloService;
import egovframework.hello.service.HelloVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("helloService")
public class HelloServiceImpl extends EgovAbstractServiceImpl implements HelloService {
	@Resource(name = "helloDAO")
	private HelloDAO helloDAO;
	
	@Override
	public List<?> selectData() throws Exception {
		// TODO Auto-generated method stub
		List<?> result = helloDAO.selectData();
		
		return result;
	}
	
	@Override
	public String insertData(HelloVO vo) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("서비스 실행");
	
		String result = helloDAO.insertData(vo);
		
		System.out.println("처리결과: " + result);
		
		return null;
	}
	
}