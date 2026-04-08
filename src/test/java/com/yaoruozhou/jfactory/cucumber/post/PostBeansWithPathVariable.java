package com.yaoruozhou.jfactory.cucumber.post;

import org.testcharm.jfactory.Spec;

public class PostBeansWithPathVariable {

    public static class BeanFactory extends Spec<PostBeanWithPathVariable> {
        @Override
        protected String getName() {
            return "PostBeanWithPathVariable";
        }
    }
}
