package com.yaoruozhou.jfactory.cucumber.post;

import org.testcharm.jfactory.Spec;

public class SubPathPostBeans {

    public static class BeanFactory extends Spec<SubPathPostBean> {
        @Override
        protected String getName() {
            return "SubPathPostBean";
        }
    }
}
