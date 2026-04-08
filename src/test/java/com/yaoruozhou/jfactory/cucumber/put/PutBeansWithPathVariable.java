package com.yaoruozhou.jfactory.cucumber.put;

import org.testcharm.jfactory.Spec;

public class PutBeansWithPathVariable {

    public static class BeanFactory extends Spec<PutBeanWithPathVariable> {
        @Override
        protected String getName() {
            return "PutBeanWithPathVariable";
        }
    }
}
