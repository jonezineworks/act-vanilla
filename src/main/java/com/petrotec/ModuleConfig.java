package com.petrotec;

import com.petrotec.services.DemoService;
import com.petrotec.services.DemoServiceImpl;
import org.osgl.inject.Module;

public class ModuleConfig extends Module {
	@Override
	protected void configure() {
		bind(DemoService.class).to(DemoServiceImpl.class);
	}
}
