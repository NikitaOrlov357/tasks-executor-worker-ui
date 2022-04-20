package com.nesterov.tasksexecutorworkerui.dto;

import lombok.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class CommandData {
    Long id;
    String command;
    String type;
    Long regularity;
    Long start;
    String owner;
    Date time;

    @Override
    public String toString() {
        return "Command{" +
                "id=" + id +
                ", command='" + command + '\'' +
                ", type='" + type + '\'' +
                ", regularity=" + regularity +
                ", start=" + start + "(" + new Date(start) + ")" +
                ", owner='" + owner + '\'' +
                ", time=" + time +
                '}';
    }

    public void setStart(String start1 ) throws ParseException {
        start1 = start1.replace('T', ' ');
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        this.start = simpleDateFormat.parse(start1).getTime();
        System.out.println();
    }

}

