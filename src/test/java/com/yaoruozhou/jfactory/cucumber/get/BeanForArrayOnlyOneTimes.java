package com.yaoruozhou.jfactory.cucumber.get;

import org.testcharm.jfactory.Spec;

public class BeanForArrayOnlyOneTimes {

    public static class BeanSpec extends Spec<BeanForArrayOnlyOneTime> {
        @Override
        protected String getName() {
            return "BeanForArrayOnlyOneTime";
        }
    }
}
