package egovframework.hello.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

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
		
//		model.addAllAttributes("regionList", result);
		
		
		return result;
	}
	
	@Override
	public String insertData(HelloVO vo) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("서비스 실행");
	
		String result = helloDAO.insertData(vo);
		
		if( result == null) {
			System.out.println("저장완료");
		}
		else {			
			System.out.println("저장실패: " + result);
		}
		
		return null;
	}
	
}