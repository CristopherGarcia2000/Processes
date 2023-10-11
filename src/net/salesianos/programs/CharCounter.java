package net.salesianos.programs;

public class CharCounter {
    public static void main(String[] args) {
        String text = args[0];
        String letter = args[1];
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            String caracterComparar = String.valueOf(text.charAt(i));
            if(caracterComparar.equals(letter)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
