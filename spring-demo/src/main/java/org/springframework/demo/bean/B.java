package org.springframework.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Classname B
 * @Description TODO
 * @Date 2022/1/7 23:19
 * @Created by hzong
 */
@Component
public class B {
	@Autowired
	private C c;
}
