package com.yaoruozhou.jfactory.cucumber.get;

import org.testcharm.jfactory.Spec;

public class GzipBeanOnlyOneTimes {

    public static class BeanSpec extends Spec<GzipBeanOnlyOneTime> {
        @Override
        protected String getName() {
            return "GzipBeanOnlyOneTime";
        }
    }
}
