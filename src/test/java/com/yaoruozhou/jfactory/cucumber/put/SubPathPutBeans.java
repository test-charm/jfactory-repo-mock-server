package com.yaoruozhou.jfactory.cucumber.put;

import org.testcharm.jfactory.Spec;

public class SubPathPutBeans {

    public static class BeanFactory extends Spec<SubPathPutBean> {
        @Override
        protected String getName() {
            return "SubPathPutBean";
        }
    }
}
