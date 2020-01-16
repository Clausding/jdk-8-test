package com.ding.io;

import java.io.*;
import java.util.Properties;

public class PropertyFileUtil {

    /**
     * 测试方法
     */
    public static void main(String[] args) {
        String filePath = "file/1.property";
        writeProps(filePath, "salary", "$10");
    }

    /**
     * 写入property文件
     */
    public static void writeProps(String path, String key, String value) {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new BufferedInputStream(new FileInputStream(path));
            Properties properties = new Properties();
            properties.load(in);
            properties.setProperty(key, value);
            out = new FileOutputStream(path);
            properties.store(out, null);
        } catch (IOException e) {
            System.out.printf("[写入property文件][异常][异常信息===%s===]", e.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.printf("[写入property文件][异常][异常信息===%s===]", e.getMessage());
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    System.out.printf("[写入property文件][异常][异常信息===%s===]", e.getMessage());
                }
            }
        }
    }

    public static String getValue(String filePath, String key) {
        InputStream in = null;
        Properties properties = null;
        try {
            properties = new Properties();
            in = new BufferedInputStream(new FileInputStream(filePath));
            properties.load(in);
        } catch (IOException e) {
            System.out.printf("[读取property文件][失败][===%s===]", e.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.printf("[读取property文件][关闭输入流失败][===%s===]", e.getMessage());
                }
            }
        }
        return properties.getProperty(key);
    }

}
