package com.ss.three.threemain;


import com.javauser.narfu.three.converter.BaseConverter;
import com.javauser.narfu.three.lambda.LambdaMain;
import com.javauser.narfu.three.stringbuilder.StringBilderMain;
import com.ss.three.collections.DuplicateCollections;
import com.ss.three.collections.ListPerformanceTest;
import com.ss.three.collections.MapWords;

public class ThreeMain {
    public static void main(String[] args) {
        StringBilderMain.startStringDilder();
        System.out.println();
        LambdaMain.lambdaStart();
        System.out.println();
        MapWords.startMapWords();
        System.out.println();
        DuplicateCollections.startDuplicateCollections();
        System.out.println();
        ListPerformanceTest.startListPerformanceTest();
        System.out.println();
        BaseConverter.startBaseConvert();
    }
}
