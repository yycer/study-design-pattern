package com.yyc.studydesignpattern.oop.oop_09;

/**
 * @author Frankie
 * @since 2022-03-13 6:58 PM
 */
public class ImageProcessingJob1 {
    private static final String BUCKET_NAME = "ai_images_bucket";

    public void process() {
        Image image = new Image();
        AliyunImageStore aliyunImageStore = new AliyunImageStore();

        // 创建存储目录若不存在
        aliyunImageStore.createBucketIfNotExisting(BUCKET_NAME);
        // 生成秘钥
        String accessToken = aliyunImageStore.generateAccessToken();
        // 上传图片到阿里云
        aliyunImageStore.uploadToAliyun(image, BUCKET_NAME, accessToken);
    }
}
