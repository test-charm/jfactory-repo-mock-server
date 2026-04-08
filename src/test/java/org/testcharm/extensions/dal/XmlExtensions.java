package org.testcharm.extensions.dal;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.SneakyThrows;
import org.testcharm.dal.DAL;
import org.testcharm.dal.runtime.Extension;

import java.util.Map;

public class XmlExtensions implements Extension {

    @Override
    public void extend(DAL dal) {
        dal.getRuntimeContextBuilder().registerStaticMethodExtension(Methods.class);
    }

    public static class Methods {

        private static final XmlMapper xmlMapper = new XmlMapper();

        public static Object xml(byte[] data) {
            return xml(new String(data));
        }

        @SneakyThrows
        public static Object xml(CharSequence data) {
            return xmlMapper.readValue(data.toString(), Map.class);
        }
    }

}
