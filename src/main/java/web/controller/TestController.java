package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/testParent")
public class TestController {
	
	public TestController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/test")
	public void test(){
		System.out.println("--------");
	}
}
