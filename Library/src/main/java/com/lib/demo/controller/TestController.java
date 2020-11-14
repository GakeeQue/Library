package com.lib.demo.controller;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lib.demo.service.AsycnTest;
import com.lib.demo.service.TestService;

@RestController
public class TestController {

	@Autowired
	AsycnTest asycntest;

	@Autowired
	TestService testservice;

	@RequestMapping("/hello")
	public String returnHello() {
		return "Hello String Boot!!";
	}

	@RequestMapping("/Asycn")
	public String returnasycn() {
		asycntest.testTask(2);
		asycntest.strTask("16888888");
		return "异步操作";
	}

	@RequestMapping("/test")
	public String returntest() throws InterruptedException, ExecutionException {
		Future<String> future = testservice.tocontroller(4);
		System.out.println(future.get());
		return future.get();
	}

}
