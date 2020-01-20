package com.zyk.utils.jdk8;

import java.util.Optional;

public class OptionalStudy {

    public static void main(String[] args) {
        OptionalStudy obj = null;

        if (Optional.ofNullable(obj).isPresent()) {
            System.out.println("obj is not null");
        } else {
            System.out.println("obh is null");
        }
    }
}
