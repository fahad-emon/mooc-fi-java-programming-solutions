
public class Main {

    public static void main(String[] args) {
        // SimpleDate date = new SimpleDate(13, 2, 2015);
        // System.out.println("Friday of the examined week is " + date);

        // SimpleDate newDate = date.afterNumberOfDays(7);
        // int week = 1;
        // while (week <= 7) {
        // System.out.println("Friday after " + week + " weeks is " + newDate);
        // newDate = newDate.afterNumberOfDays(7);

        // week = week + 1;
        // }

        // System.out.println("The date after 790 days from the examined Friday is ...
        // try it out yourself!");
        // System.out.println("Try " + date.afterNumberOfDays(790));

        SimpleDate now = new SimpleDate(13, 2, 2015);
        SimpleDate afterOneWeek = now;
        afterOneWeek.advance(7);

        System.out.println("Now: " + now);
        System.out.println("After one week: " + afterOneWeek);
    }
}
// ootput
/*
 * Friday of the examined week is 13.2.2015
 * Friday after 1 weeks is 20.2.2015
 * Friday after 2 weeks is 27.2.2015
 * Friday after 3 weeks is 4.3.2015
 * Friday after 4 weeks is 11.3.2015
 * Friday after 5 weeks is 18.3.2015
 * Friday after 6 weeks is 25.3.2015
 * Friday after 7 weeks is 2.4.2015
 * The date after 790 days from the examined Friday is ... try it out yourself!
 */