package cn.edu.buaa.jsi.utils;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Properties;

/**
 * 常用工具（暂时未分类）
 * @author songliu
 * @since 2014/08/17
 */
public class CommonUtils extends StringUtils{
    public static boolean isBlank (final String str) {
        return (str == null) || (str.trim().length() <= 0);
    }
    public static boolean isBlank (final Object[] objs) {
        return (objs == null) || (objs.length <= 0);
    }
    //一些常用工具

    //读取配置文件
    public static Properties getProperties(String fileName){
        InputStream inputStream = CommonUtils.class.getClassLoader().getResourceAsStream(fileName);
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
            return properties;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // 计算文件的 MD5 值
    public static String getFileMD5(File file) {
        if (!file.isFile()) {
            return null;
        }
        MessageDigest digest = null;
        FileInputStream in = null;
        byte buffer[] = new byte[8192];
        int len;
        try {
            digest =MessageDigest.getInstance("MD5");
            in = new FileInputStream(file);
            while ((len = in.read(buffer)) != -1) {
                digest.update(buffer, 0, len);
            }
            BigInteger bigInt = new BigInteger(1, digest.digest());
            return bigInt.toString(16);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    // 计算文件的 SHA-1 值
    public static String getFileSha1(File file) {
        if (!file.isFile()) {
            return null;
        }
        MessageDigest digest = null;
        FileInputStream in = null;
        byte buffer[] = new byte[8192];
        int len;
        try {
            digest =MessageDigest.getInstance("SHA-1");
            in = new FileInputStream(file);
            while ((len = in.read(buffer)) != -1) {
                digest.update(buffer, 0, len);
            }
            BigInteger bigInt = new BigInteger(1, digest.digest());
            return bigInt.toString(16);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
