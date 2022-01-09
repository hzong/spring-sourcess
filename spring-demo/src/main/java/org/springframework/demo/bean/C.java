package org.springframework.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Classname C
 * @Description TODO
 * @Date 2022/1/7 23:20
 * @Created by hzong
 */
@Component
public class C {
	@Autowired
	private A a;
}
