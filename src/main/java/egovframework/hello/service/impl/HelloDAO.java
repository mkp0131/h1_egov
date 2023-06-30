package egovframework.hello.service.impl;
import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.hello.service.HelloVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("helloDAO")
public class HelloDAO extends EgovAbstractDAO {

	public List<?> selectData() throws Exception {
		return list("helloDAO.selectData");
	}
	
	public String insertData(HelloVO vo) throws Exception {
		System.out.println("실행됨 DAO: " + vo.getRegionId());
		return (String) insert("helloDAO.insertData", vo);
	}
	
	public HelloVO selectDetail(String id) throws Exception  {
		return (HelloVO) select("helloDAO.selectDetail", id);
	}
	
	
	public int updateData(HelloVO vo) throws Exception  {
		return update("helloDAO.updateData", vo);
	}

	public int deleteData(String id) {
		// TODO Auto-generated method stub
		
		return (int) delete("helloDAO.deleteData", id);
	}
	
	
}