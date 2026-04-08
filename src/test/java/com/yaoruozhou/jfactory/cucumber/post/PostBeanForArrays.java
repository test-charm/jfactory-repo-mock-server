package com.yaoruozhou.jfactory.cucumber.post;

import org.testcharm.jfactory.Spec;

public class PostBeanForArrays {

    public static class BeanFactory extends Spec<PostBeanForArray> {
        @Override
        protected String getName() {
            return "PostBeanForArray";
        }
    }
}
