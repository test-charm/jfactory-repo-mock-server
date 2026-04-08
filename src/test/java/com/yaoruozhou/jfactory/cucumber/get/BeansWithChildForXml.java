package com.yaoruozhou.jfactory.cucumber.get;

import org.testcharm.jfactory.Spec;

public class BeansWithChildForXml {

    public static class BeanFactory extends Spec<BeanWithChildForXml> {
        @Override
        protected String getName() {
            return "BeanWithChildForXml";
        }
    }
}
