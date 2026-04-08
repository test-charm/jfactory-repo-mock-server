package com.yaoruozhou.jfactory.cucumber.get;

import org.testcharm.jfactory.Spec;

public class GzipBeanForXmlOnlyOneTimes {

    public static class BeanSpec extends Spec<GzipBeanForXmlOnlyOneTime> {
        @Override
        protected String getName() {
            return "GzipBeanForXmlOnlyOneTime";
        }
    }
}
