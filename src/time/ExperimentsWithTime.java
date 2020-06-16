package time;

public class ExperimentsWithTime {
    public static void main(String[] args) {
        Time time1 = new Time(6, 40);
        time1.add(220);
        time1.showtime();
        System.out.println(time1.sayHello());
        System.out.println("isDay: " + time1.isDay());
        System.out.println("isEvening: " + time1.isEvening());
        System.out.println("isNight: " + time1.isNight());
        System.out.println("isMorning: " + time1.isMorning());
    }
}
