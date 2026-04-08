package com.yaoruozhou.jfactory.cucumber;

import com.yaoruozhou.jfactory.MockServerDataRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.testcharm.jfactory.JFactory;

@Configuration
public class FactoryConfig {

    @Bean
    @Scope("prototype")
    public JFactory factorySet() {
        return new EntityFactory(new MockServerDataRepositoryImpl(MockServer.getClientAndServer()));
    }

}
