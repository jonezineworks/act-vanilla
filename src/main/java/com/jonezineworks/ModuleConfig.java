package com.jonezineworks;

import com.jonezineworks.services.DemoService;
import com.jonezineworks.services.DemoServiceImpl;
import org.osgl.inject.Module;

public class ModuleConfig extends Module {
	@Override
	protected void configure() {
		bind(DemoService.class).to(DemoServiceImpl.class);
	}
}
