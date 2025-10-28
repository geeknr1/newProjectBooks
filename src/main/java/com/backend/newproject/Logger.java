package com.backend.newproject;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instance;
    private static final String LOG_FILE = "app.log";
    private PrintWriter writer;

    private Logger() {
        try{
            writer = new PrintWriter(new FileWriter(LOG_FILE, true));
        }catch(IOException e){
            System.err.println("file can't be opened");
        }
    }

    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public String TimeStamp(){
        LocalDateTime now = LocalDateTime.now();
        return now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public void info(String message){
        writer.println(TimeStamp() + "[INFO] " + message);
        writer.flush();
    }

    public void debug(String message){
        writer.println(TimeStamp() + "[DEBUG] " + message);
        writer.flush();
    }

    public void error(String message){
        writer.println(TimeStamp() + "[ERROR] " + message);
        writer.flush();
    }

    }

