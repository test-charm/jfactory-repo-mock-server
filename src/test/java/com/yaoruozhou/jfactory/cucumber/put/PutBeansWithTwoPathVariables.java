package com.yaoruozhou.jfactory.cucumber.put;

import org.testcharm.jfactory.Spec;

public class PutBeansWithTwoPathVariables {

    public static class BeanFactory extends Spec<PutBeanWithTwoPathVariables> {
        @Override
        protected String getName() {
            return "PutBeanWithTwoPathVariables";
        }
    }
}
