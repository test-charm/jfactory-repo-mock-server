package com.yaoruozhou.jfactory.cucumber.get;

import org.testcharm.jfactory.Spec;

public class SubPathBeans {

    public static class BeanFactory extends Spec<SubPathBean> {
        @Override
        protected String getName() {
            return "SubPathBean";
        }

    }
}
