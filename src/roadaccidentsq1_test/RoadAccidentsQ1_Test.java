/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package roadaccidentsq1_test;

import java.util.Scanner;

/**
 *
 * @author Samuel Sossen ST10445164
 */
public class RoadAccidentsQ1_Test
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        String[] cities =
        {
            "Cape Town", "Johannesburg", "Port Elizabeth"
        };

        int[][] accidents =
        {
            {
                155, 121
            },
            {
                178, 145
            },
            {
                112, 89
            }
        };
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of car accidents for Cape Town:");
        int carAccidentsCT = scanner.nextInt();

        System.out.println("Enter the number of motor bike accidents for Cape Town:");
        int motorBikeAccidentsCT = scanner.nextInt();

        System.out.println("Enter the number of car accidents for Johannesburg:");
        int carAccidentsJB = scanner.nextInt();

        System.out.println("Enter the number of motor bike accidents for Johannesburg");
        int motorBikeAccidentsJB = scanner.nextInt();

        System.out.println("Enter the number of car accidents for Port Elizabeth:");
        int carAccidentsPE = scanner.nextInt();

        System.out.println("Enter the number of motor bike accidents for Port Elizabeth:");
        int motorBikeAccidentsPE = scanner.nextInt();

        System.out.println("-------------------------------------------------");
        System.out.println("ROAD ACCIDENT REPORT");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-20s %-20s %-20s%n", "", "Car", "Motor Bike");

        for (int i = 0; i < cities.length; i++)
        {
            System.out.printf("%-20s %-20d %-20d%n", cities[i], accidents[i][0], accidents[i][1]);
        }

        System.out.println("-------------------------------------------------");
        System.out.println("ROAD ACCIDENT TOTALS FOR EACH CITY");
        System.out.println("-------------------------------------------------");
        
        int[] totalAccidentsPerCity = new int[cities.length];
        int cityWithMostAccidents = 0;
        for (int i = 0; i < cities.length; i++)
        {
            totalAccidentsPerCity[i] = accidents[i][0] + accidents[i][1];
            System.out.printf("%-20s %-20d%n", cities[i], totalAccidentsPerCity[i]);
            
            if (totalAccidentsPerCity[i] > totalAccidentsPerCity[cityWithMostAccidents])
            {
                cityWithMostAccidents = i;
            }
        }
        System.out.println("");
        System.out.println("CITY WITH THE MOST VEHICLE ACIDENTS: " + cities[cityWithMostAccidents] );
        System.out.println("-------------------------------------------------");

    }

}
