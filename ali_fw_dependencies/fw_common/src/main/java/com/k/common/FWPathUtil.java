package com.k.common;

public class FWPathUtil {

    public static String getResource() {
        String res;
        res = "src/main/resources/";
        return res;
    }

    public static String getResource(String path) {
        String res;
        res = getResource().concat(path);
        return res;
    }

    public static String getTargetPath() {
        final String res;
        res = "target/";
        return res;
    }

}
