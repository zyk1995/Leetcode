package com.zyk.utils.jdk8;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamStudy {

    public static void main(String[] args) {


        List<Integer> list = Stream.of(1,2,3,4,5,6,7).collect(Collectors.toList());
        //基于数据流的方式，将流装载成相应的 SummaryStatistics进行归约计算,可以实现更多的操作；
        IntSummaryStatistics stats = list.stream().mapToInt(i -> i). summaryStatistics();
        int max = stats.getMax();        //获取最大值
        int min = stats.getMin();        //获取最小值
        double sum =  stats.getSum();    //获取总值
        double avg = stats.getAverage();  //获取平均值
        long count = stats.getCount();     //获取总数量

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
        System.out.println("count = " + count);

    }
}
