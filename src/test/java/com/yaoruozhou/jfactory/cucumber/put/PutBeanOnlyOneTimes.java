package com.yaoruozhou.jfactory.cucumber.put;

import org.testcharm.jfactory.Spec;

public class PutBeanOnlyOneTimes {

    public static class BeanSpec extends Spec<PutBeanOnlyOneTime> {
        @Override
        protected String getName() {
            return "PutBeanOnlyOneTime";
        }
    }
}
