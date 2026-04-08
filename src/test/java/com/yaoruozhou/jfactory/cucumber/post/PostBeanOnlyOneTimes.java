package com.yaoruozhou.jfactory.cucumber.post;

import org.testcharm.jfactory.Spec;

public class PostBeanOnlyOneTimes {

    public static class BeanSpec extends Spec<PostBeanOnlyOneTime> {
        @Override
        protected String getName() {
            return "PostBeanOnlyOneTime";
        }
    }
}
