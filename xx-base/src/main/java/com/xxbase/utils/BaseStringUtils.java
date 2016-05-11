package com.xxbase.utils;


import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 16/05/10.
 */
public class BaseStringUtils {

    private static Logger logger = LoggerFactory.getLogger(BaseStringUtils.class);

    public static <T> Map<String, T> toMap(Collection<T> collection, String propName) throws Exception {

        Map<String, T> result = new HashMap<String, T>();

        for(T t : collection){
            String key = BeanUtils.getProperty(t, propName) + "";
            result.put(key, t);
        }

        return result;
    }

}
