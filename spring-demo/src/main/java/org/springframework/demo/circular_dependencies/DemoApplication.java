package org.springframework.demo.circular_dependencies;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.demo.circular_dependencies.config.BeanConfig;


/**
 * 循环依赖
 * org.springframework.beans.factory.support.DefaultSingletonBeanRegistry
 */
public class DemoApplication  {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfig.class);

	}


}
