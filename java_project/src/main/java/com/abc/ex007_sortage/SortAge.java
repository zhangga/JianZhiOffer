package com.abc.ex007_sortage;

/**
 * 对公司的人员年龄进行排序。
 * 时间复杂度O(n)，可以使用不大于n的额外空间。
 * Created by U-Demon
 * Date: 2020/6/12
 */
public class SortAge {

    public static void sort(int[] ages) {
        int ageMax = 99;
        int[] ageCounts = new int[ageMax+1];
        for (int age : ages) {
            ageCounts[age]++;
        }

        int index = 0;
        for (int i = 0; i < ageCounts.length; i++) {
            for (int j = 0; j < ageCounts[i]; j++) {
                ages[index++] = i;
            }
        }
    }

}
