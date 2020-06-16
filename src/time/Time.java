package time;

public class Time {
    int h;
    int m;

    public Time(int h, int m) {
        this.h = h % 24;
        this.m = m % 60;
    }

    public void showtime() {
        if (this.m < 10){
            System.out.println(this.h + ":0" + this.m);
        } else {
            System.out.println(this.h + ":" + this.m);
        }
    }

    public boolean isMorning() {
        return this.h > 5 && this.h < 13;
    }

    public boolean isDay() {
        return this.h > 12 && this.h < 18;
    }

    public boolean isEvening() {
        return this.h > 17 && this.h < 24;
    }
    public boolean isNight() {
        return this.h < 6;
    }

    public String sayHello() {
        if (isMorning() == true) {
            return "Доброе утро";
        }
        if (isDay() == true) {
            return "Добрый день";
        }
        if (isEvening() == true) {
            return "Добрый вечер";
        }
        return "Доброй ночи";
    }

    public void add(int plusm) {
        h = (h + (m + plusm) / 60) % 24;
        m = (m + plusm) % 60;
    }
}
