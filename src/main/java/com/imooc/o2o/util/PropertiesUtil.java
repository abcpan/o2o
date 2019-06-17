package com.imooc.o2o.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class PropertiesUtil {
    private static Logger logger = LoggerFactory.getLogger(PropertiesUtil.class);
    private static Properties props;
    static{
            props = new Properties();
            try{
                logger.info("开始加载资源配置文件---------->");
                String resource = "configuration.properties";
                props.load(new InputStreamReader(PropertiesUtil.class.getClassLoader().getResourceAsStream(resource),"utf8"));
            }catch(IOException err){
                err.printStackTrace();
            }
    }
    public static String getProperties(String key){
            String value = props.getProperty(key.trim());
            if(value==null){
                return null;
            }else{
                return value.trim();
            }
    }
}
