import java.util.Date;

public class StopTime {

    private Date startTime, stopTime;
    private long start, stop;
    Date date = new Date();

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }


    public Date creatStartTime() {
        Date time = date;
        return time;
    }

    public void start() {
        this.startTime = creatStartTime();
        this.start = System.currentTimeMillis();
    }

    public void stop() {
        this.stopTime = creatStartTime();
        this.stop = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return (stop - start);
    }

}


