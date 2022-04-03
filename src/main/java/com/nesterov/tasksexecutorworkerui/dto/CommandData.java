package com.nesterov.tasksexecutorworkerui.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CommandData {
    Long id;
    String command;
    String type;
    long regularity;
    long start;
    String owner;
    Date time;

    @Override
    public String toString() {
        return "Command{" +
                "id=" + id +
                ", command='" + command + '\'' +
                ", type='" + type + '\'' +
                ", regularity=" + regularity +
                ", start=" + start + "(" + new Date(start * 1000) + ")" +
                ", owner='" + owner + '\'' +
                ", time=" + time +
                '}';
    }



}

