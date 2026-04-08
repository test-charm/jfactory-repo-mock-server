package com.yaoruozhou.jfactory.cucumber.post;

import org.testcharm.jfactory.Spec;

public class SamePathPostBeans {

    public static class BeanFactory extends Spec<SamePathPostBean> {
        @Override
        protected String getName() {
            return "SamePathPostBean";
        }
    }
}
