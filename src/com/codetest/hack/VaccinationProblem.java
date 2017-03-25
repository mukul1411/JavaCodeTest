package com.codetest.hack;


import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/**
 *
 * @author Atlas08
 *
 *         The world health organization wants to establish a total of B
 *         vaccination clinics across N cities to immunization people against
 *         fatal diseases. Every city must have at least 1 clinic, and a clinic
 *         can only vaccinate people in the same city where they live. The goal
 *         is to minimize the number of vaccination kits needed in the largest
 *         clinic. For example suppose you have.
 *
 *         2 cities and 7 clinics to be opened 200.000 is the population of
 *         first city 50,000 is the population of second city Two clinics can
 *         open in the first city and Five in the second. This way 100,000
 *         people can be immunized in each of the two clinics in first city, and
 *         100.000 people can be immunized in the each clinic in the second city
 *         So the maximum number of people to be immunized in the largest clinic
 *         is 10,000 Input: Two integers in the first line, N, the number of
 *         cities, and B, the total number of clinics to be opened Each of the
 *         following N lines contains an integer ai, the population of city i
 *
 *         Output: One integer representing the maximum number of people to be
 *         immunized in any single clinic
 *
 *         Constraints:
 *
 *         1<=N<=500,000
 *
 *         N<=B<=2,000,000
 *
 *         1<=ai<=5,000,000
 *
 *         Sample input:
 *
 *         2 7
 *
 *         200000
 *
 *         500000
 *
 *         Sample output:
 *
 *         100000
 *
 */
public class VaccinationProblem {

    public static class City {
        private int clinics;
        private double population;
        private double number_of_vacinated;

        public City(int clinics, int population) {
            this.clinics = clinics;
            this.population = population;
            this.number_of_vacinated = population / clinics;
        }

        public double getNumberOfVacinated() {
            return number_of_vacinated;
        }

        @Override
        public String toString() {
            return String.format("City{clinics='%s', population=%f, number_of_vacinated=%f}", clinics, population, population/clinics);
        }
    }

    public static void main(String[] args) throws IOException {

        int n = 0; // the number of city
        int b = 0; // the number of clinic

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number of city and clinics");

        while (in.hasNextLine()) {
            String cityAndClinics = in.nextLine();
            if (cityAndClinics.equals("exit")) {
                System.exit(0);
            }
            List<String> optionStream = Arrays.stream(cityAndClinics.trim().split("\\s+")).map(s -> s.trim()).collect(Collectors.toList());
            if (1 < optionStream.size() && optionStream.size() < 3) {
                n = Integer.parseInt(optionStream.size() > 0 ? optionStream.get(0) : "0"); // number of city
                if (1 <= n && n <= 500000) {

                } else {
                    System.out.println("Enter a number of city and clinics");
                    System.err.println("The number of city should be between 1 and 500000");
                }

                b = Integer.parseInt(optionStream.size() > 1 ? optionStream.get(1) : "0"); // number of clinics
                if (n <= b && b <= 2000000) {

                } else {
                    System.out.println("Enter a number of city and clinics");
                    System.err.println("The number of clinics should be between the number of city and 2000000");
                }

                System.out.println("city => " + n);
                System.out.println("clinics => " + b);
                break;
            } else {
                System.out.println("Enter a number of city and clinics");
                System.err.println("The format for city and clinic seems to be wrong. For example 3 4, 3 8, 2 4");
            }
        }

        List<City> cities = new ArrayList<>();

        IntStream.range(0, n).forEach(s -> {
            System.out.println("Enter a number for the city's population : ");
            int population = in.nextInt();
            if ( 1 <= population && population <= 5000000) {
                cities.add(new City(1, population));
            } else {
                System.err.println("the population should be between 1 and 5000000");
                System.exit(1);
            }
        });

        Comparator<City> vacineComparator = Comparator.comparing(City::getNumberOfVacinated);

        IntStream.range(n, b).forEach(s -> {

            System.out.println("iterate => " + s);
            Stream<City> t = cities.stream();
            cities.stream().sorted(vacineComparator.reversed()).findFirst().map(c -> {
                c.clinics++;
                c.number_of_vacinated = Math.ceil(c.population / c.clinics);
                return c;
            });

            t.forEach(System.out::println);
            System.out.println("==================================================================");
        });

        Double maxNum = cities.stream().sorted(vacineComparator.reversed()).findFirst().get().getNumberOfVacinated();
        System.out.println(" The maximum number of people to be immunized in the largest clinic is : " + maxNum);
        in.close();
    }
}