package com.imooc.o2o.util;

public class PathUtil {
    private static String separator = System.getProperty("file.separator");
    //获取图片基本路径
    public static String getImageBasePath(){
        String os = System.getProperty("os.name");
        String imageBasePath="";
        if(os.startsWith("win")){
            imageBasePath="E:/images/";
        }else{
            imageBasePath="/home/images/";
        }
        imageBasePath.replace("/",separator);
        return imageBasePath;
    }
    //商家上传的图片
    public static String getShopImagePath(Integer shopId){
        String imagePath = "/upload/item/shop/"+shopId+"/";
        return imagePath.replace("/",separator);
    }
}

