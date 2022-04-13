package com.yyc.studydesignpattern.structural.decorator.encryptions;

import com.yyc.studydesignpattern.structural.decorator.EncryptionBase;
import com.yyc.studydesignpattern.structural.decorator.EncryptionUtils;

/**
 * @author Frankie
 * @since 2022-04-13 9:04 PM
 *
 * AES: Advanced Encryption Standard
 */
public class AESEncryption extends EncryptionBase {
    @Override
    public String encrypt(String username, String password) {
        System.out.println("Using AES algorithm to get the basic encryption.");
        return EncryptionUtils.encryptByMD5(username + password);
    }
}
