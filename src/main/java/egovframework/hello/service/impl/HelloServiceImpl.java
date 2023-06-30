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

	@Override
	public HelloVO selectDetail(String id) throws Exception {
		// TODO Auto-generated method stub
		HelloVO result = helloDAO.selectDetail(id);		
		return result;
	}

	@Override
	public int updateData(HelloVO vo) throws Exception {
		// TODO Auto-generated method stub
		int result = helloDAO.updateData(vo);

		return result;
	}

	@Override
	public int deleteData(String id) throws Exception {
		// TODO Auto-generated method stub
		int result = helloDAO.deleteData(id);
		return result;
	}
	
}