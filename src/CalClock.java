public class CalClock {
    private int hour;
    private int min;

    public CalClock() {
    }


    public void setTime(int hour, int minutes) {
        this.hour += hour;
        this.min += minutes;
        replaceMinInHour(min);
    }

    private void replaceMinInHour(int minutes) {
        if (minutes >= 60) {
            int tempHour = minutes / 60;
            hour += tempHour;
            min = minutes % 60;
        }
    }

    @Override
    public String toString() {
        return "CalcClock{" +
                "hour=" + hour +
                ", min=" + min +
                '}';
    }
}

class ClockTest {
    public static void main(String[] args) {
        CalClock clock = new CalClock();
//        clock.setTime(1, 34);
//        clock.setTime(1, 47);
//        clock.setTime(3, 29);
//        clock.setTime(6, 8);
//        clock.setTime(1, 37);
//        clock.setTime(1, 58);
        clock.setTime(0,61);
        System.out.println(63%60);
        System.out.println(clock);

//        calClock.setClock(1, 34);
////        calClock.setClock(1, 47);
////        calClock.setClock(6, 8);
////        calClock.setClock(3, 29);
////        calClock.setClock(1, 37);
////        calClock.setClock(1, 58);
    }
}

