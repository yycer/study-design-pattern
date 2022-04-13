package com.yyc.studydesignpattern.structural.decorator.encryptionDecorators;

import com.yyc.studydesignpattern.structural.decorator.EncryptionBase;
import com.yyc.studydesignpattern.structural.decorator.EncryptionUtils;

/**
 * @author Frankie
 * @since 2022-04-13 9:06 PM
 */
public class AESEncryptionDecorator extends EncryptionDecorator {

    public AESEncryptionDecorator(EncryptionBase base) {
        super(base);
    }

    @Override
    public String encrypt(String username, String password) {
        String encrypt = super.encrypt(username, password);
        System.out.println("Execute encrypt method in AESEncryptionDecorator.");
        return EncryptionUtils.encryptByAES(encrypt);
    }
}
