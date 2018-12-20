package com.petrotec.controllers;

import act.controller.Controller;
import com.petrotec.services.DemoService;
import org.osgl.mvc.annotation.GetAction;

import javax.inject.Inject;
import java.time.LocalDateTime;
import java.util.List;

@Controller("/demo")
public class DemoController extends Controller.Util {

	@Inject
	private DemoService demoService;

	@GetAction("helloWorld")
	public String helloWorld() {
		return demoService.helloWorld();
	}

	@GetAction("helloWorldList")
	public List<String> helloWorldList() {
		return demoService.helloWorldList();
	}

	@GetAction("timestamp")
	public LocalDateTime timestamp() {
		return demoService.timestamp();
	}

}
