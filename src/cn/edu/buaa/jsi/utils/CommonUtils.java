package cn.edu.buaa.jsi.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Home on 2014/8/17.
 */
public class CommonUtils extends StringUtils{
    public static boolean isBlank (final String str) {
        return (str == null) || (str.trim().length() <= 0);
    }
    public static boolean isBlank (final Object[] objs) {
        return (objs == null) || (objs.length <= 0);
    }
    //一些常用工具
}
