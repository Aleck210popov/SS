package com.javauser.narfu.three.stringbuilder;

public class AppendCommand implements ICommand{
    private int length;
    AppendCommand(int length){
        this.length=length;
    }
    @Override
    public void undo(StringBuilder sb) {
        sb.delete(sb.length() - this.length, sb.length());
    }
}
