package com.yaoruozhou.jfactory;

import org.testcharm.jfactory.DataRepository;

import java.util.function.Function;

public interface MockServerDataRepository extends DataRepository {
    void setUrlParams(String urlParams);

    void setRootClass(Class<?> clazz);

    void setPathVariables(String pathVariables);

    void setSerializer(Function<Object, String> serializer);

    void setXmlSerializer(Function<Object, String> xmlSerializer);
}
