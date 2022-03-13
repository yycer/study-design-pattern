package com.yyc.studydesignpattern.oop.oop_09;

/**
 * @author Frankie
 * @since 2022-03-13 6:55 PM
 *
 * 思考: 以下的行为可以抽象出上传和下载图片，而创建存储目录或者生成秘钥可能只是为阿里云而服务的，微信云、青云或私有云可能由其他的操作。
 */
public class AliyunImageStore {

    public void createBucketIfNotExisting(String bucketName) {

    }

    public String generateAccessToken() {
        return "";
    }

    public String uploadToAliyun(Image image, String bucketName, String accessToken) {
        return "";
    }

    public Image downloadFromAliyun(String url, String accessToken) {
        return null;
    }
}