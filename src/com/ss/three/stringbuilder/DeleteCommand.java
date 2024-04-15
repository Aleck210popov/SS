package com.javauser.narfu.three.stringbuilder;

public class DeleteCommand implements ICommand{
    private int start;
    private String deleted;
    DeleteCommand(int start, String deleted){
        this.start=start;
        this.deleted=deleted;
    }

    @Override
    public void undo(StringBuilder sb) {
        sb.insert(this.start, this.deleted);
    }
}
