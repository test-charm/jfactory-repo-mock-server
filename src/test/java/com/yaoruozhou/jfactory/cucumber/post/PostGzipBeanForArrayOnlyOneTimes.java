package com.yaoruozhou.jfactory.cucumber.post;

import org.testcharm.jfactory.Spec;

public class PostGzipBeanForArrayOnlyOneTimes {

    public static class BeanSpec extends Spec<PostGzipBeanForArrayOnlyOneTime> {
        @Override
        protected String getName() {
            return "PostGzipBeanForArrayOnlyOneTime";
        }
    }
}
