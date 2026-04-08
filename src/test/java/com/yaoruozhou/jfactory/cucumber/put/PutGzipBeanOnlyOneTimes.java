package com.yaoruozhou.jfactory.cucumber.put;

import org.testcharm.jfactory.Spec;

public class PutGzipBeanOnlyOneTimes {

    public static class BeanSpec extends Spec<PutGzipBeanOnlyOneTime> {
        @Override
        protected String getName() {
            return "PutGzipBeanOnlyOneTime";
        }
    }
}
