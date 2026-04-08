package com.yaoruozhou.jfactory.cucumber.put;

import org.testcharm.jfactory.Spec;

public class PutBeans {

    public static class BeanFactory extends Spec<PutBean> {
        @Override
        protected String getName() {
            return "PutBean";
        }
    }
}
