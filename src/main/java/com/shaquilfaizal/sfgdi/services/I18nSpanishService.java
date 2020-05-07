package com.shaquilfaizal.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PT")
@Service("i18nService")
public class I18nSpanishService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Olá Mundo! -- PT";
	}
  
}
