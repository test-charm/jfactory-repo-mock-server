package com.yaoruozhou.jfactory.cucumber.post;

import org.testcharm.jfactory.Spec;

public class PostBeansWithChildForXml {

    public static class BeanFactory extends Spec<PostBeanWithChildForXml> {
        @Override
        protected String getName() {
            return "PostBeanWithChildForXml";
        }
    }
}
