package com.yyc.studydesignpattern.structural.decorator;

import com.yyc.studydesignpattern.structural.decorator.encryptionDecorators.AESEncryptionDecorator;
import com.yyc.studydesignpattern.structural.decorator.encryptionDecorators.DESEncryptionDecorator;
import com.yyc.studydesignpattern.structural.decorator.encryptions.MD5Encryption;

/**
 * @author Frankie
 * @since 2022-04-13 9:05 PM
 */
public class Client {
    public static void main(String[] args) {

        // MD5 -> AES -> DES
        EncryptionBase encryptionBase = new DESEncryptionDecorator(new AESEncryptionDecorator(new MD5Encryption()));
        encryptionBase.encrypt("yyc", "123");
    }
}
