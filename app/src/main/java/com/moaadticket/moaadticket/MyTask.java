package com.moaadticket.moaadticket;
import android.widget.EditText;

import java.sql.Time;
import java.util.Date;

public class MyTask {
    private String Key;//key; unique id for each object .have to be
    private String tvDate ,tvMatch ,tvTime;
    private String text;
    private String edtMatch;
    private Date createdAt;
    private Date edtDate;
    private String owner;
    private Time edtTime;


    public MyTask(String key) {
        Key = key;
    }

    public MyTask() {

    }

    public String getKey() {
        return Key;
    }

    public String getEdtMatch() {
        return edtMatch;
    }

    public String getTvTime() {
        return tvTime;
    }

    public String getTvDate() {
        return tvDate;
    }

    public String getText() {
        return text;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getDueDate() {
        return edtDate;
    }

    public void setKey(String key) {
        Key = key;
    }

    public void setTitle(String title) {
        this.tvMatch = tvMatch;
    }

    public void setText(EditText text) {
        this.text = edtMatch;
    }



    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setDueDate(Date dueDate) {
        this.edtDate = dueDate;
    }
    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "MyTask{" +
                "Key='" + Key + '\'' +
                ", tvMatch='" + tvDate + '\'' +
                ", tvMatch='" + tvTime + '\'' +
                ", tvMatch='" + tvMatch + '\'' +
                ", text='" + text + '\'' +
                ", createdAt=" + createdAt +
                ", dueDate=" + edtDate+
                '}';
    }

    public void setTime(EditText edtTime) {
    }
}



