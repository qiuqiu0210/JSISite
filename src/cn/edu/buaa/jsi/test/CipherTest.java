package cn.edu.buaa.jsi.test;

import cn.edu.buaa.jsi.utils.CipherUtil;

/**
 * Created by Home on 2014/8/17.
 */
public class CipherTest {
    public static void main(String []args) {
        String ps = CipherUtil.generatePassword("123");
        System.out.println(ps);
    }
}
