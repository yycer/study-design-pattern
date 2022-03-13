package com.yyc.studydesignpattern.oop.oop_09.refactor;

import com.yyc.studydesignpattern.oop.oop_09.Image;

/**
 * @author Frankie
 * @since 2022-03-13 7:04 PM
 */
public class AliyunImageStore implements ImageStore {

    private String bucketName;

    public AliyunImageStore(String bucketName) {
        this.bucketName = bucketName;
    }

    @Override
    public String upload(Image image) {
        createBucketIfNotExisting(bucketName);
        String accessToken = generateAccessToken();
        return null;
    }

    @Override
    public Image download(String url) {
        return null;
    }

    private String generateAccessToken() {
        return "";
    }

    private void createBucketIfNotExisting(String bucketName) {
    }
}
