package gr.aueb.cf.ch19.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainList {

    public static void main(String[] args) {
        //List<String> cities = new LinkedList<>();
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Athens");
        cities.add("NY");
        cities.add("London");

        String cities1 = cities.get(0);
        int nyPosition = cities.indexOf("London");

        if (nyPosition != -1) {
            cities.set(nyPosition,"New York");
        } else {
            System.out.println("NY not exists");
        }

        if (cities.contains("Athens")) {
            cities.remove("Athens");
        } else {
            System.out.println("Athens not exists");
        }

        cities.removeIf(c -> c.startsWith("A)"));

        //Iterator
        for (int i = 0; i <= cities.size() - 1; i++) {
            System.out.println(cities.get(i));
        }

        for (String city : cities) {
            System.out.println(city);
        }

        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        cities.forEach(System.out::println); // (city -> System.out.println(city))

        Iterator<String> iter = cities.iterator();
        while (iter.hasNext()) {
            if(iter.next().equals("NY")) {
                //cities.remove(city);
                iter.remove();
            }
        }

    }

}
