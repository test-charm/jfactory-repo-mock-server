package com.yaoruozhou.jfactory.cucumber.post;

import org.testcharm.jfactory.Spec;

public class SubPathPostGzipBeans {

    public static class BeanSpec extends Spec<SubPathPostGzipBean> {
        @Override
        protected String getName() {
            return "SubPathPostGzipBean";
        }
    }
}
