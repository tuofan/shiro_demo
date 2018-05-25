package com.shiro.cryptography;

import org.apache.shiro.codec.Base64;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tuofan on 2018-5-24.
 * cryptography test
 */
public class CryptographyTest {

    @Test
    public void cryptographyTest(){
        String str = "hello";
        String base64Encoded = Base64.encodeToString(str.getBytes());
        String str2 = Base64.decodeToString(base64Encoded);
        Assert.assertEquals(str, str2);
    }
}
