package com.javauser.narfu.three.stringbuilder;

public class StringBilderMain {
    public static void startStringDilder(){
        LocalStringBulder stringBuilder = new LocalStringBulder("Hello");
        stringBuilder.append("Hello");
        System.out.println(stringBuilder); // Output: Hello

        stringBuilder.delete(1, 3);
        System.out.println(stringBuilder); // Output: Ho
        stringBuilder.undo();
        System.out.println(stringBuilder); // Output: Hello
        stringBuilder.append("fdssdfsdf");
        System.out.println(stringBuilder);
        stringBuilder.undo();
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        stringBuilder.undo();
        System.out.println(stringBuilder);
        stringBuilder.replace(3, 6, "852");
        System.out.println(stringBuilder);
        stringBuilder.undo();
        System.out.println(stringBuilder);
        stringBuilder.insert(5, "Da");
        System.out.println(stringBuilder);
        stringBuilder.undo();
        System.out.println(stringBuilder);
    }
}
