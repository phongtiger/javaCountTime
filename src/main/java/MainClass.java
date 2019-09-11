import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        StopTime stopTime1 = new StopTime();
        stopTime1.start();
        System.out.println("StartTime " + stopTime1.getStartTime());
        int i =0;
        while (i < 100000){
            System.out.println("XOXO");
            i++;
        }
        stopTime1.stop();
        System.out.println("StopTime " + stopTime1.getStopTime());
        System.out.println("Thoi gian troi qua la " + stopTime1.getElapsedTime());
    }

}