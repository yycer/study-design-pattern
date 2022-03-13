package com.yyc.studydesignpattern.oop.oop_09.refactor;

import com.yyc.studydesignpattern.oop.oop_09.Image;

/**
 * @author Frankie
 * @since 2022-03-13 7:02 PM
 */
public interface ImageStore {
    String upload(Image image);
    Image download(String url);
}
