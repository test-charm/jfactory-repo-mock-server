package com.yaoruozhou.jfactory.cucumber.get;

import org.testcharm.jfactory.Spec;

public class BeanForXmls {

    public static class BeanSpec extends Spec<BeanForXml> {
        @Override
        protected String getName() {
            return "BeanForXml";
        }
    }
}
