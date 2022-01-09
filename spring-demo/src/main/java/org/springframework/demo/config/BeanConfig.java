package org.springframework.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.demo.bean.A;
import org.springframework.demo.bean.B;
import org.springframework.demo.bean.C;

/**
 * @Classname BeanConfig
 * @Description TODO
 * @Date 2022/1/9 20:32
 * @Created by hzong
 */
@Configuration
public class BeanConfig {


	@Bean
	public A a(){
		return new A();
	}

	@Bean
	public B b(){
		return new B();
	}

	@Bean
	public C c(){
		return new C();
	}
}
