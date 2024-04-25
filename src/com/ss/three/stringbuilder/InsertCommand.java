package com.ss.three.stringbuilder;

public class InsertCommand implements ICommand {
    private int length;
    private int start;

    InsertCommand(int start, int length) {
        this.length = length;
        this.start=start;
    }

    @Override
    public void undo(StringBuilder sb) {
        sb.delete(this.start, this.start + this.length);
    }
}
