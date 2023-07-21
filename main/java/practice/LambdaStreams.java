package practice;




import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaStreams {

    public static void main(java.lang.String[] args) {

        int answer = IntStream.rangeClosed(1, 50)
                .filter(i -> i % 2 != 0)
                .sum();
        System.out.println(answer);


//        List<String> names = Arrays.asList("Dimitri", "Tom", "Sayed");
//
//        List <String> uniquesValues = names.stream()
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println(uniquesValues);
//
//        IntStream.rangeClosed(0,50).forEach(System.out::println);
//        };


//        int total = IntStream.rangeClosed(0,10).map(i-> i* 2).sum();
//        System.out.println(total);
//
//        int total1 = IntStream.rangeClosed(0,10).map(i-> i).sum();
//        System.out.println(total1);
//
//        int total3 = IntStream.rangeClosed(0,5).map(i ->i).sum();
//        System.out.println(total3);
//
//        LambdaStreams obj = new LambdaStreams();
//        System.out.println(obj.isPlural(1));
    }

        public boolean isPlural ( float a){

            return a != 1f;
        }

    }

