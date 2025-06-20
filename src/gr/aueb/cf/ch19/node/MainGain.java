package gr.aueb.cf.ch19.node;

import java.util.List;

public class MainGain {

    public static void main(String[] args) {
        NodeGen<String> strNode = new NodeGen<>();
        NodeGen<Integer> intNode = new NodeGen<>();
        var doubleNode = new NodeGen<Double>();

        Integer[] intArr = {1,2,3,4,5};
        String[] cities = {"Athens","Paris","London"};

        intNode.setItem(1);

        print(intArr);
        print(cities);

        //String s = (String) intNode.getItem(); @compile time type-cast error
    }

    public static <T> void print(T[] arr) {
        for (T item:arr) {
            System.out.println(item);
        }
    }

//    public static <T> void printList(List<T> list) {
//        for (T t:list) {
//            System.out.println(t);
//        }
//    }

    public static <T> void printList(List<?> list) {
        for (Object obj:list) {
            System.out.println(obj);
        }
    }

    public static void printNode(NodeGen<? extends Number> nodeGen) { //extends περιορίζει το ? άνω όριο
        System.out.println(nodeGen.getItem());
    }

    public static <T extends Number> void printBounded(List<T> list) {
        double sum = 0.0;
        for (T number:list) {
            sum += number.doubleValue(); //επειδή έχω βάλει extend μπορώ και καλώ τις μεθόδους της Number
        }
    }

    //o consumer έχει κάτω όριο ενώ ο producer έχει άνω όριο
    public static <T> void consumerProducer(List<? super T> consumer, List<? extends T> producer) {
        for (T t:producer) {
            consumer.add(t);
        }
    }
}
