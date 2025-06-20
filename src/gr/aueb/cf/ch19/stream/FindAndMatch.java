package gr.aueb.cf.ch19.stream;

import java.util.List;
import java.util.Optional;

public class FindAndMatch {

    public static void main(String[] args) throws Exception {
        List<String> names = List.of("Alice","Bob","Charlie","David");

        Optional<String> query = names.stream() //return empty if is not exist
                .filter(name -> name.equals("Alice"))
                .findFirst();

//        if (query.isPresent()) {
//            System.out.println("Firstname:" + query.get());
//        }
        query.ifPresent(q -> System.out.println("Firstname:" + q));

        String strFirst = names.stream()
                .filter(name -> name.equals("Bob"))
                .findFirst().orElse(null);

        String strFirst2 = names.stream()
                .filter(name -> name.equals("Maria"))
                .findFirst().orElseThrow(() -> new Exception("Maria is not exist"));
        boolean isBobExists = names.stream()
                .anyMatch(name -> name.equals("Bob"));

        boolean allAreBob = names.stream()
                .allMatch(name -> name.equals("Bob"));

    }
}
