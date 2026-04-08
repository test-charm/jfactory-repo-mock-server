package com.yaoruozhou.jfactory.cucumber.put;

import org.testcharm.jfactory.Spec;

public class PutBeansWithChild {

    public static class BeanFactory extends Spec<PutBeanWithChild> {
        @Override
        protected String getName() {
            return "PutBeanWithChild";
        }
    }
}
