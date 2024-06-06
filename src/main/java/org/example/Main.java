package org.example;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(3);
        TimeUnit.SECONDS.sleep(1);
        System.out.println(2);
        TimeUnit.SECONDS.sleep(1);
        System.out.println(1);
        TimeUnit.SECONDS.sleep(1);
        Scanner sc = new Scanner(System.in);

        String[] words = { "Ball", "cat", "Apple", "dog", "Car", "house", "Tree", "bicycle", "Phone", "shirt", "Book", "guitar", "Cup", "jacket", "Plane", "camera", "Flower", "lamp", "Table", "pencil", "Window", "bottle", "Chair", "clock", "Desk", "spoon", "Pen", "fork", "Computer", "plate", "Monitor", "mouse", "Keyboard", "glasses", "Notebook", "bag", "Paper", "wallet", "Magazine", "shoe", "Television", "hat", "Radio", "umbrella", "Lamp", "glove", "Mirror", "scarf", "Brush", "sock", "Toothbrush", "tie", "Fan", "ring", "Printer", "bracelet", "Phone", "necklace", "Tablet", "earring", "Camera", "belt", "Laptop", "watch", "Charger", "headphone", "Remote", "jewelry", "DVD", "wallet", "Router", "key", "Speaker", "coin", "Microphone", "notebook", "Switch", "pen", "Clock", "badge", "Light", "pin", "Fan", "clip", "Air conditioner", "tape", "Heater", "stapler", "Vacuum", "stamp", "Blender", "glue", "Microwave", "scissors", "Oven", "eraser" };

        Random ran = new Random();
        for (int i = 1; i <= 10; i++) {
            System.out.print(words[ran.nextInt(words.length)] + " ");
        }
        System.out.println();

        double start = LocalTime.now().toNanoOfDay();
        String typed_words = sc.nextLine();
        double end = LocalTime.now().toNanoOfDay();

        double total_time = end - start;
        double seconds = total_time / 1_000_000_000.0;

        int numChars = typed_words.length();
        double wordsTyped = (double) numChars / 5;
        double wpmCalculation = (wordsTyped / seconds) * 60;

        int WPM = (int) wpmCalculation;






        System.out.println("Words per minute: " + WPM);
    }
}
