package com.yyc.studydesignpattern.oop.oop_09.refactor;

import com.yyc.studydesignpattern.oop.oop_09.Image;

/**
 * @author Frankie
 * @since 2022-03-13 7:08 PM
 */
public class ImageProcessingJob2 {
    private static final String BUCKET_NAME = "ai_images_bucket";

    public void process() {
        Image image = new Image();
        // 上传阿里云
        ImageStore aliyunImageStore = new AliyunImageStore(BUCKET_NAME);
        aliyunImageStore.upload(image);

        // 上传私有云
        ImageStore privateImageStore = new PrivateImageStore();
        privateImageStore.upload(image);
    }
}
