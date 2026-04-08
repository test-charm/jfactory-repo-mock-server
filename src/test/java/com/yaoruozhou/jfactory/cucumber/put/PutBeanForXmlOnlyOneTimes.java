package com.yaoruozhou.jfactory.cucumber.put;

import org.testcharm.jfactory.Spec;

public class PutBeanForXmlOnlyOneTimes {

    public static class BeanSpec extends Spec<PutBeanForXmlOnlyOneTime> {
        @Override
        protected String getName() {
            return "PutBeanForXmlOnlyOneTime";
        }
    }
}
