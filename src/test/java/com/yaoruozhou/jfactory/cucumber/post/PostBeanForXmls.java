package com.yaoruozhou.jfactory.cucumber.post;

import org.testcharm.jfactory.Spec;

public class PostBeanForXmls {

    public static class BeanFactory extends Spec<PostBeanForXml> {
        @Override
        protected String getName() {
            return "PostBeanForXml";
        }
    }
}
