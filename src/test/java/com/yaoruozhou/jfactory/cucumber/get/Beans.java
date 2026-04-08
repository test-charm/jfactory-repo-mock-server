package com.yaoruozhou.jfactory.cucumber.get;

import org.testcharm.jfactory.Spec;
import org.testcharm.jfactory.Trait;

public class Beans {

    public static class BeanFactory extends Spec<Bean> {
        @Override
        protected String getName() {
            return "Bean";
        }

        @Trait
        public void strValue() {
            property("someString").value("someStringValue");
        }

        @Trait
        public void intValue() {
            property("someInt").value(42);
        }

    }
}
