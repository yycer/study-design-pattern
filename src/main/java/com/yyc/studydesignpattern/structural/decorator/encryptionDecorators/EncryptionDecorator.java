package com.yyc.studydesignpattern.structural.decorator.encryptionDecorators;

import com.yyc.studydesignpattern.structural.decorator.EncryptionBase;

/**
 * @author Frankie
 * @since 2022-04-13 9:15 PM
 */
public class EncryptionDecorator extends EncryptionBase {

    private EncryptionBase base;

    public EncryptionDecorator(EncryptionBase base) {
        this.base = base;
    }

    @Override
    public String encrypt(String username, String password) {
        return base.encrypt(username, password);
    }
}
