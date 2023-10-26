package org.springframework.context.support;

import com.anudip.springdemo.Restaurant;

public interface ClassPathXmlApplicationContext {

	Restaurant getBean(String string);

}
