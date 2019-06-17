package com.imooc.o2o.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FTPTransferUtil {
    private static Logger logger = LoggerFactory.getLogger(PropertiesUtil.class);
    private static String ftpIp = PropertiesUtil.getProperties("ftp.server.ip");
    private static String ftpPort= PropertiesUtil.getProperties("ftp.server.port");
    private static String ftpUser= PropertiesUtil.getProperties("ftp.server.user");
    private static String ftpPassword= PropertiesUtil.getProperties("ftp.server.password");

    public class FTPClient{
        private String ip;
        private int port;
        private String user;
        private String pwd;
        private FTPClient ftpClient;
    }
}
