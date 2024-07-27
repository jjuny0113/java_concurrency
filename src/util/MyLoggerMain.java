package util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static util.MyLogger.log;

public class MyLoggerMain {
    public static void main(String[] arg){
        log("hello thread");
        log(123);

    }
}
