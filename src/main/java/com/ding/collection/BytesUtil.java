package com.ding.collection;

/**
 * 字节数组处理工具
 */
public class BytesUtil {

    /**
     * 合并多个byte数组
     */
    public static byte[] mergeBytes(byte[][] bytess) {
        int length_result = 0;
        for(int i = 0; i < bytess.length; i ++) {
            length_result += bytess[i].length;
        }
        byte[] result = new byte[length_result];
        int destPos = 0;
        for(int i = 0; i < bytess.length; i ++) {
            System.arraycopy(bytess[i], 0, result, destPos, bytess[i].length);
            destPos += bytess[i].length;
        }
        return result;
    }

    /**
     * 在 byte 数组末尾补 0 ，使它的长度是 multiple 的倍数
     */
    public static byte[] makeBytesMultiple(byte[] bytes, int multiple) throws Exception {
        int length = bytes.length;
        int newLength = (length / multiple + 1) * multiple;
        byte[] temp = new byte[newLength];
        System.arraycopy(bytes, 0, temp, 0, length);
        return temp;
    }
}
