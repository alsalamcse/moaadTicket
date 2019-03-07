package com.moaadticket.moaadticket;
import java.util.Date;

public class MyTask {
    private String Key;//key; unique id for each object .have to be
    private String title;
    private String text;
    private int important;
    private int necessary;
    private Date createdAt;
    private Date dueDate;
    private String owner;


    public MyTask(String key) {
        Key = key;
    }

    public MyTask() {

    }

    public String getKey() {
        return Key;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public int getImportant() {
        return important;
    }

    public int getNecessary() {
        return necessary;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setKey(String key) {
        Key = key;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setImportant(int important) {
        this.important = important;
    }

    public void setNecessary(int necessary) {
        this.necessary = necessary;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
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
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", important=" + important +
                ", necessary=" + necessary +
                ", createdAt=" + createdAt +
                ", dueDate=" + dueDate +
                '}';
    }
}



