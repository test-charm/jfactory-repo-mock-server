package com.yaoruozhou.jfactory.cucumber.get;

import org.testcharm.jfactory.Spec;

public class BeansWithTwoPathVariables {

    public static class BeanFactory extends Spec<BeanWithTwoPathVariables> {
        @Override
        protected String getName() {
            return "BeanWithTwoPathVariables";
        }
    }
}
