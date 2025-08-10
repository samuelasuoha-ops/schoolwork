package lab6;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        final int DAYS = 5, RESEARCH_ASSISTANTS = 3;
        int assistantCount = 1, dayCount, raGreaterThan_6 = 0;
        double hourDay = 0, averageHours = 0, raTotalHours = 0, weeksAverage = 0;

        Scanner in = new Scanner(System.in);

        while (assistantCount <= RESEARCH_ASSISTANTS) {
            dayCount = 1;
            raTotalHours = 0;
            averageHours = 0;
            while (dayCount <= DAYS) {
                System.out.println("Please enter hours worked on day " + dayCount +
                        " by Research Assistant: " + assistantCount);
                hourDay = in.nextInt();
                raTotalHours = raTotalHours + hourDay;
                dayCount++;
            }

            /*calculating average hours worked per day for an assistant and printing
            it to screen  if the average is greater than 6 */

            averageHours = raTotalHours / DAYS;
            System.out.println("Research Assistant" + assistantCount + "'s average hours" +
                    " per day is  " + averageHours);
            if (averageHours > 6) {
                raGreaterThan_6++;
            }
            assistantCount++;
        }
        System.out.println("The number of Research Assistants with an average of " +
                "greater than six hours is " + raGreaterThan_6);
        System.out.println("Finished Processing");
    }

}
