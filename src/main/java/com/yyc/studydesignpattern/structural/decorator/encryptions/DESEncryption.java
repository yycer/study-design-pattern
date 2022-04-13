package com.yyc.studydesignpattern.structural.decorator.encryptions;

import com.yyc.studydesignpattern.structural.decorator.EncryptionBase;
import com.yyc.studydesignpattern.structural.decorator.EncryptionUtils;

/**
 * @author Frankie
 * @since 2022-04-13 9:05 PM
 *
 * DES: Data Encryption Standard
 */
public class DESEncryption extends EncryptionBase {
    @Override
    public String encrypt(String username, String password) {
        System.out.println("Using DES algorithm to get the basic encryption.");
        return EncryptionUtils.encryptByDES(username + password);
    }
}
