package academy.programming;

public class Main {

    public static void main(String[] args) {
        System.out.println("Today is "+printDayOfTheWeek(1));
        System.out.println("Today is "+printDayOfTheWeek(2));
        System.out.println("Today is "+printDayOfTheWeek(3));
        System.out.println("Today is "+printDayOfTheWeek(4));
        System.out.println("Today is "+printDayOfTheWeek(5));
        System.out.println("Today is "+printDayOfTheWeek(6));
        System.out.println("Today is "+printDayOfTheWeek(7));
        System.out.println(printDayOfTheWeek(100));

    }

    private static String printDayOfTheWeek(int day){
        String last;
        switch(day){
            case 1:
                last="Saturday";
                break;

            case 2:
                last="Sunday";
                break;

            case 3:
                last="Monday";
                break;

            case 4:
                last= "Tuesday";
                break;

            case 5:
                last= "Wednesday";
                break;

            case 6:
                last= "Thursday";
                break;

            case 7:
                last= "Friday";
                break;


            default:
                last= "Invalid day";
                break;
        }
        return last;
    }
}
