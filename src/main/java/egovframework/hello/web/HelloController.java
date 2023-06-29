package egovframework.hello.web;
import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
	public String hello(HelloVO vo) throws Exception {
		System.out.println("post");
		System.out.println(vo.getRegionId());
		System.out.println(vo.getRegionName());
		helloService.insertData(vo);
		

		return "hello/hello";
	}
}
