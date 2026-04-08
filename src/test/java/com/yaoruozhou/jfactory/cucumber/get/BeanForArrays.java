package com.yaoruozhou.jfactory.cucumber.get;

import org.testcharm.jfactory.Spec;

public class BeanForArrays {

    public static class BeanFactory extends Spec<BeanForArray> {
        @Override
        protected String getName() {
            return "BeanForArray";
        }
    }
}
