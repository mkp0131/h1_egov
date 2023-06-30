package egovframework.hello.web;
import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.EgovSampleService;
import egovframework.hello.service.HelloService;
import egovframework.hello.service.HelloVO;

@Controller
public class HelloController {

	@Resource(name = "helloService")
	private HelloService helloService;
	
	@RequestMapping(value = "/hello.do")
	public String hello(ModelMap model) throws Exception {
		System.out.println("안녕");
		List<?> result = helloService.selectData();
		
		for (Object item : result) {
			System.out.println(item);
		}
		
		model.addAttribute("regionList", result);
		
		

		return "hello/hello";
	}
	
	@RequestMapping(value = "/helloPost.do")
	public String helloPost(HelloVO vo) throws Exception {
		System.out.println("post");
		System.out.println(vo.getRegionId());
		System.out.println(vo.getRegionName());
		helloService.insertData(vo);
		

		return "redirect:/hello.do";
	}
	
	@RequestMapping(value = "/helloDetail.do")
	public String helloDetail(String id, ModelMap model) throws Exception {
		System.out.println("helloDetail: " + id);
		
		HelloVO result = helloService.selectDetail(id);
		model.addAttribute("data", result);

		return "hello/helloDetail";
	}
	
	
	@PostMapping(value = "/helloModi.do")
	public String helloModi(HelloVO vo) throws Exception {
		
		
		int result = helloService.updateData(vo);
		
		if(result == 1) {
			System.out.println("수정 완료");
		}
		else {
			System.out.println("수정 에러");
		}
		
		
		return "redirect:/hello.do";
	}
	
	@GetMapping(value = "/helloDelete.do")
	public String helloDelete(String id) throws Exception {
		int result = helloService.deleteData(id);
		
		if(result == 1) {
			System.out.println("삭제 완료");
		}
		else {
			System.out.println("삭제 에러");
		}
		
		
		return "redirect:/hello.do";
	}
}
