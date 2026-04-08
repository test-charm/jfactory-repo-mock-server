package com.yaoruozhou.jfactory.cucumber.get;

import org.testcharm.jfactory.Spec;

public class BeanOnlyOneTimes {

    public static class BeanSpec extends Spec<BeanOnlyOneTime> {
        @Override
        protected String getName() {
            return "BeanOnlyOneTime";
        }
    }
}
