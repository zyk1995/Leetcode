package com.zyk.utils.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapStudy {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("beijing changcheng", "beijing gugong", "beijing tiantan", "gugong tiananmen");

        //map

        //map只能将分割结果转成一个List,所以输出为list对象

        list.stream().map(item -> Arrays.stream(item.split(" "))).forEach(System.out::println);

        //如果我们想要每个list里的元素，还需要一层foreach

        list.stream().map(item -> Arrays.stream(item.split(" "))).forEach(n->{
            n.forEach(System.out::println);
        });

        System.out.println("************* ");

        //flatmap

        //flatmap可以将字符串分割成各自的list之后直接合并成一个List

        //也就是flatmap可以将一个2维的集合转成1维度

        list.stream().flatMap(item -> Arrays.stream(item.split(" "))).collect(Collectors.toList()).forEach(System.out::println);

    }
}
