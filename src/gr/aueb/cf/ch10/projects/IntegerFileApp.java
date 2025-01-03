package gr.aueb.cf.ch10.projects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * Project 01
 */
public class IntegerFileApp {

    public static void main(String[] args) {
        String fp = "C:/Users/maria/Desktop/projects-java/numbers.txt";
        try {
            ReadFile(fp);
        } catch (IOException e) {
            System.out.println("Σφάλμα κατά την ανάγνωση του αρχείου: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Σφάλμα στο αρχείο: " + e.getMessage());
        }
    }

    //Μέθοδος που διαβάζει το αρχείο και ρίχνει exceptions
    public static void ReadFile(String fp) throws IOException, Exception {
        try (BufferedReader bf = new BufferedReader(new FileReader(fp))) {
            String line;
            String[] tokens;
            int[] arr = new int[49];
            int count = 0;
            int window = 0;

            if ((line = bf.readLine()) == null) {
                throw new Exception("Το αρχείο είναι κενό.");
            }

            do {
                tokens = line.split("\\s+");

                if (tokens.length < 6 || tokens.length > 49) {
                    throw new Exception("Το αρχείο πρέπει να περιέχει τουλάχιστον 6 αριθμούς και το πολύ 49 αριθμούς.");
                }

                for (String token : tokens) {
                    int numbers = convertStringToInt(token);
                    if (numbers != -1) {
                        arr[count++] = numbers;
                    }
                }
            } while ((line = bf.readLine()) != null);

            int[] arr2 = Arrays.copyOf(arr, count);
            sortAndPrintNumbers(arr2);
            window = count - 6;
            combination(window,arr2);

        }
    }

    // Μέθοδος που μετατρέπει τα String σε Integer και ρίχνει εξαίρεση
    public static int convertStringToInt(String token) throws Exception {
        try {
            int number = Integer.parseInt(token);
            if (number >= 1 && number <= 49) {
                return number;
            } else {
                throw new Exception("Αριθμός εκτός εύρους (1-49): " + number);
            }
        } catch (NumberFormatException e) {
            throw new Exception("Μη έγκυρος αριθμός: " + token);
        }
    }

    // Μέθοδος για την ταξινόμηση και την εκτύπωση των αριθμών
    public static void sortAndPrintNumbers(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Ταξινομημένοι αριθμοί:");
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    //Μέθοδος που θα παράγει όλες τις δυνατές εξάδες
    public static void combination(int window, int[] numbers) throws Exception {
        int[] result = new int[6];
        try (PrintStream ps = new PrintStream("C:/Users/maria/Desktop/projects-java/combinations.txt", StandardCharsets.UTF_8)) {
            for (int i = 0; i <= window; i++) {
                for (int j = i + 1; j <= window + 1; j++) {
                    for (int k = j + 1; k <= window + 2; k++) {
                        for (int l = k + 1; l <= window + 3; l++) {
                            for (int m = l + 1; m <= window + 4; m++) {
                                for (int n = m + 1; n <= window + 5; n++) {
                                    result[0] = numbers[i];
                                    result[1] = numbers[j];
                                    result[2] = numbers[k];
                                    result[3] = numbers[l];
                                    result[4] = numbers[m];
                                    result[5] = numbers[n];

                                    if (!isEven(result,4) && !isOfdd(result,4) && !isContiguous(result,2) && !isSameEnding(result,3) && !isSameTen(result,3)) {
                                        ps.printf("%d %d %d %d %d %d\n",
                                                result[0], result[1], result[2], result[3], result[4], result[5]);
                                        System.out.printf("%d %d %d %d %d %d\n",
                                                result[0], result[1], result[2], result[3], result[4], result[5]);
                                    }
                                }
                            }
                        }
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isEven(int[] arr, int threshold) {
        int count = 0;
        for (int item : arr) {
            if (item % 2 == 0) {
                count++;
            }
        }
        return count > threshold;

    }

    public static boolean isOfdd(int[] arr, int threshold) {
        int count = 0;
        for (int item : arr) {
            if (item % 2 != 0) {
                count++;
            }
        }
        return count > threshold;
    }

    public static boolean isContiguous(int[] arr, int threshold) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1] - 1) {
                count++;
            }
        }
        return count > threshold;
    }

    public static boolean isSameEnding(int[] arr, int threshold) {
        int[] numb = new int[10];
        boolean isEnding = false;
        for (int item : arr) {
            numb[item % 10]++;
        }
        for (int n : numb) {
            if (n > threshold) {
                isEnding = true;
            }
        }
        return isEnding;
    }

    public static boolean isSameTen(int[] arr, int threshold) {
        int[] ten = new int[5];
        boolean isTen = false;

        for (int num : arr) {
            ten[num/10]++;
        }
        for (int n : ten) {
            if (n > threshold) {
                isTen = true;
            }
        }
        return isTen;
    }
}







