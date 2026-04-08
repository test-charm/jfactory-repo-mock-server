package com.yaoruozhou.jfactory.cucumber.post;

import org.testcharm.jfactory.Spec;

public class SubPathPostBeansWithPathVariable {

    public static class BeanFactory extends Spec<SubPathPostBeanWithPathVariable> {
        @Override
        protected String getName() {
            return "SubPathPostBeanWithPathVariable";
        }
    }
}
