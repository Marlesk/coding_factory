package gr.aueb.cf.ch19.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterMain {

    public static void main(String[] args) {
        List<String> cities = List.of("Athens","London","Toronto","Tokyo");
        var tCities1 = cities.stream()
                .filter(city -> city.startsWith("T"))
                .collect(Collectors.toList());  //mutable list
        var tCities2 = cities.stream()
                .filter(city -> city.startsWith("T"))
                .toList(); //immutable list

        tCities1.add("Paris");

        tCities1.forEach(System.out::println);
        System.out.println();
        tCities2.forEach(System.out::println);
        System.out.println();

        Set<String> uniqueCityNames = tCities1.stream()
                .collect(Collectors.toSet());
        uniqueCityNames.forEach(System.out::println);
        System.out.println();

        var strCities = tCities1.stream()
                .collect((Collectors.joining(",")));
        System.out.println(strCities);

    }
}
