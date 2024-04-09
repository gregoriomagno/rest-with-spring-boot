package br.com.magno;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	private static  final String template = "Hello, %s";
	
	private static  final AtomicLong counter = new AtomicLong();

	
	public String requestMethodName(@RequestParam String param) {
		return new String();
	}
	
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "Word")String name) {
		
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
