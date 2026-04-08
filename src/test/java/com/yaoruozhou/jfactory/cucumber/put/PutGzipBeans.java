package com.yaoruozhou.jfactory.cucumber.put;

import org.testcharm.jfactory.Spec;

public class PutGzipBeans {

    public static class BeanSpec extends Spec<PutGzipBean> {
        @Override
        protected String getName() {
            return "PutGzipBean";
        }
    }
}
