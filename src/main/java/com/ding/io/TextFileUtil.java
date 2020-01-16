package com.ding.io;

import java.io.*;

public class TextFileUtil {

    /**
     * 测试方法
     */
    public static void main(String[] args) {
        String filePath = "file/1.txt";
        String str = "一棵橡树";
        byte[] bytes = str.getBytes();
        bytes2File(bytes, filePath);
    }

    /**
     * 字节数组 ---> 文件
     */
    public static void bytes2File(byte[] bytes, String filePath) {
        FileOutputStream fos = null;
        try {
            File file = new File(filePath);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            fos = new FileOutputStream(file);
            fos.write(bytes);
        } catch (IOException e) {
            System.out.printf("[字节数组转文件][失败][失败信息===%s===]", e.getMessage());
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    System.out.printf("[字节数组转文件][关闭输出流失败][失败信息===%s===]", e.getMessage());
                }
            }
        }
    }

    /**
     * 输入流 ---> 字符串
     */
    public static String inputStream2String(InputStream is) {
        StringBuffer sb = new StringBuffer();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            System.out.printf("[输入流转字符串][失败][失败信息===%s===]", e.getMessage());
        } finally {
            try {
                is.close();
            } catch (Exception e) {
                System.out.printf("[输入流转字符串][输入流关闭失败][失败信息===%s===]", e.getMessage());
            }
        }
        return sb.toString();
    }

    /**
     * 文件 ---> 字节数组
     */
    public static byte[] file2Bytes(String filePath) {
        File file = new File(filePath);
        return file2Bytes(file);
    }

    /**
     * 文件路径 ---> 字节数组
     */
    public static byte[] file2Bytes(File file) {
        FileInputStream fis = null;
        byte[] bytes = null;
        try {
            fis = new FileInputStream(file);
            bytes = new byte[fis.available()];
            fis.read(bytes);
        } catch (IOException e) {
            System.out.printf("[读取文件][失败][失败信息===%s===]", e.getMessage());
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.printf("[读取文件][关闭输入流失败][失败信息===%s===]", e.getMessage());
                }
            }
        }
        return bytes;
    }
}
