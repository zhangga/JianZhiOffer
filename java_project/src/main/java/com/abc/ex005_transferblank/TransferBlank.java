package com.abc.ex005_transferblank;

/**
 * Created by U-Demon
 * Date: 2020/6/8
 */
public class TransferBlank {

    /**
     * 在原字符数组的基础上修改，已知原数组足够长。时间O(n)
     * @param str
     */
    public static void transfer(char[] str) {
        int len = 0, tail = 0;
        // 首先计算替换后的字符串一共需要多长
        while (len < str.length) {
            char ch = str[len];
            if (ch == ' ') {
                tail += 3;
                len++;
            }
            else if (ch == '\0')
                break;
            else {
                tail++;
                len++;
            }
        }

        // 从尾部开始
        while (len >= 0) {
            char ch = str[len--];
            if (ch == ' ') {
                str[tail--] = '0';
                str[tail--] = '2';
                str[tail--] = '%';
            }
            else {
                str[tail--] = ch;
            }
        }
    }

}
