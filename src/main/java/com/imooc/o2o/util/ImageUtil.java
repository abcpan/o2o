package com.imooc.o2o.util;

import net.coobird.thumbnailator.Thumbnails;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class ImageUtil {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
    private static Random random = new Random();
    public static String generateThumbnail(CommonsMultipartFile file,String path){
                String extensionName = getFileExtensionName(file);
                String randomName = getFileRandomName();
                String realName = randomName+extensionName;
                String finalPath = getAbsoluteImagePath(path);
                File targetFile = new File(finalPath,realName);
                try{
                    Thumbnails.of(file.getInputStream()).size(200,200).outputQuality(0.8f).toFile(targetFile);
                }catch (IOException err){
                    err.printStackTrace();
                }

                return targetFile.getName();

    }

    /**
     * 得到拓展名
     * @param fileName
     * @return
     */
    private static String getFileExtensionName(CommonsMultipartFile fileName){
            String originName = fileName.getOriginalFilename();
            if(originName !=null){
                return originName.substring(originName.lastIndexOf("."));
            }else{
                return "";
            }

    }

    /**
     * 随机生成文件名,当前年月日小时分钟+5位随机数
     * @return
     */
    private static String getFileRandomName(){
            int randomNum = random.nextInt(89999)+10000;
            String timeStr = sdf.format(new Date());
            return timeStr+randomNum;
    }

    /**
     * 得到存在的绝对路径
     * @param targetPath
     * @return
     */
    private static String getAbsoluteImagePath(String targetPath){
            String finalPath = PathUtil.getImageBasePath()+targetPath;
            File  dest = new File(finalPath);
            if(!dest.exists()){
                dest.setWritable(true);
                dest.mkdirs();
            }
            return finalPath;
    }
}
