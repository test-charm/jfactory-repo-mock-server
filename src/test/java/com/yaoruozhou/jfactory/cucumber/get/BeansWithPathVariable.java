package com.yaoruozhou.jfactory.cucumber.get;

import org.testcharm.jfactory.Spec;

public class BeansWithPathVariable {

    public static class BeanFactory extends Spec<BeanWithPathVariable> {
        @Override
        protected String getName() {
            return "BeanWithPathVariable";
        }
    }
}
