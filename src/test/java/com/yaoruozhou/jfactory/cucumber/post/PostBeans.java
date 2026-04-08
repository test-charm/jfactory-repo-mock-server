package com.yaoruozhou.jfactory.cucumber.post;

import org.testcharm.jfactory.Spec;

public class PostBeans {

    public static class BeanFactory extends Spec<PostBean> {
        @Override
        protected String getName() {
            return "PostBean";
        }
    }
}
