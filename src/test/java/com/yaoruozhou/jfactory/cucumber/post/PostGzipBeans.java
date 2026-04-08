package com.yaoruozhou.jfactory.cucumber.post;

import org.testcharm.jfactory.Spec;

public class PostGzipBeans {

    public static class BeanSpec extends Spec<PostGzipBean> {
        @Override
        protected String getName() {
            return "PostGzipBean";
        }
    }
}
