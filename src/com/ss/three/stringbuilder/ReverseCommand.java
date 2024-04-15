package com.javauser.narfu.three.stringbuilder;

public class ReverseCommand implements ICommand{
    @Override
    public void undo(StringBuilder sb) {
        sb.reverse();
    }
}
