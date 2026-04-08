package com.yaoruozhou.jfactory.cucumber.post;

import org.testcharm.jfactory.Spec;

public class PostBeansWithTwoPathVariables {

    public static class BeanFactory extends Spec<PostBeanWithTwoPathVariables> {
        @Override
        protected String getName() {
            return "PostBeanWithTwoPathVariables";
        }
    }
}
