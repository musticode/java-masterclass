package org.master.Classes.Collections.SetHashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i<20; i++){
            squares.add(i * i );
            cubes.add(i * i * i);
        }

        System.out.println("squares size "+squares.size());
        System.out.println("cubes size "+cubes.size());

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("union size: "+union.size());

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("intersection size: "+ intersection.size());
        for (int i : intersection){
            System.out.println(i + " root " + Math.sqrt(i) + ", cube root: "+ Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence  = "one day in a house";
        String[] wordsArray = sentence.split(" ");
        words.addAll(Arrays.asList(wordsArray));
        for (String s: words){
            System.out.println(s);
        }

        //addAll methods
        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();

        String[] natureWords = {"nature", "test", "test2"};
        nature.addAll(Arrays.asList(natureWords));

        String[] divineWords = {"divine", "test3", "test4"};
        divine.addAll(Arrays.asList(divineWords));

        //different
        System.out.println("nature-divine");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("divine-nature");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);






    }
 public static void printSet(Set<String> set){
    System.out.println("\t");
    for (String s: set){
        System.out.println(s);
    }

 }

}
