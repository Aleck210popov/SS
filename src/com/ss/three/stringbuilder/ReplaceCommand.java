package com.javauser.narfu.three.stringbuilder;

public class ReplaceCommand implements ICommand{
    private int start;
    private int end;
    private String replaced;
    ReplaceCommand(int start, int end, String replaced){
        this.start=start;
        this.end=end;
        this.replaced=replaced;
    }

    @Override
    public void undo(StringBuilder sb) {
        sb.replace(this.start, this.end, this.replaced);
    }
}
