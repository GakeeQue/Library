package com.lib.demo.service;

import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.lib.demo.mapper.UserMapper;

@Component
@Service("Test")
public class TestService {

	@Autowired
	UserMapper usermapper;

	@Async("taskExecutor")
	public Future<String> tocontroller(int i) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + i);
		return new AsyncResult<String>("Service层向Controller层通信");
	}
}
