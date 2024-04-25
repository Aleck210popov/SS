package com.ss.three.stringbuilder;

import java.util.Stack;

public final class LocalStringBulder {
    private Stack<ICommand> stackCommand;
    private StringBuilder sb;
    {
        stackCommand = new Stack<>();
    }
    LocalStringBulder(){
        sb = new StringBuilder();
    }
    LocalStringBulder(String str){
        sb = new StringBuilder(str);
    }
    LocalStringBulder(int capacity){
        sb = new StringBuilder(capacity);
    }
    public void delete(int start, int end){
        String deleted = sb.substring(start, end);
        sb.delete(start, end);
        stackCommand.push(new DeleteCommand(start, deleted));
    }
    public void append(String str) {
        sb.append(str);
        stackCommand.push(new AppendCommand(str.length()));
    }
    public void reverse(){
        sb.reverse();
        stackCommand.push(new ReverseCommand());
    }
    public void replace(int start, int end, String replaced){
        String deleted = sb.substring(start, end);
        sb.replace(start, end, replaced);
        stackCommand.push(new ReplaceCommand(start, end, deleted));
    }
    public void insert(int start, String str){
        sb.insert(start, str);
        stackCommand.push(new InsertCommand(start, str.length()));
    }
    public void undo(){
        if (!stackCommand.isEmpty()) {
            ICommand lastCommand = stackCommand.pop();
            lastCommand.undo(sb);
        }
    }
    @Override
    public String toString() {
        return sb.toString();
    }
}
