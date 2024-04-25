package com.ss.three.stringbuilder;

public class ReverseCommand implements ICommand{
    @Override
    public void undo(StringBuilder sb) {
        sb.reverse();
    }
}
