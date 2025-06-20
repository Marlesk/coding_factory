package gr.aueb.cf.ch19.maps;

import java.util.Map;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        Map<String,String> countries = Map.of("GR","Greece","EN","England","USA","United States");

        countries.forEach((k,v) -> System.out.println(k + ':' + v));

        var filteredCountries = countries.entrySet().stream()  //μετατροπή map σε set και μετά σε stream, το stream γίνεται μόνο σε list και set
                .filter(e -> e.getKey().length() <= 2)
                .collect(Collectors.toSet());
        filteredCountries.forEach(System.out::println);

    }
}
