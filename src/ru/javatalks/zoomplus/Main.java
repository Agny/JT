package ru.javatalks.zoomplus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Variants variants = init();
    Scanner input = new Scanner(System.in);
    System.out.println("Введите ваш вариант: ");
    int number = input.nextInt();
    Variant current = variants.find(number).orElse(Variant.empty);
    if (current == Variant.empty) {
      System.out.println("Вариант " + number + " не найден");
    } else {
      System.out.println(current.getNumber() + " является вашим вариантом, идёт расчёт...");
      current.solve();
    }

  }

  private static Variants init() {
    List<Variant> values = new ArrayList<>();
    int[] tasksFirst = {520, 400, 680, 700, 450, 400, 280, 900, 2900, 200, 18, 200, 58};
    int[] tasksSecond = {525, 450, 685, 750, 450, 450, 250, 950, 2950, 205, 15, 205, 55};
    values.add(new Variant(1, tasksFirst));
    values.add(new Variant(2, tasksSecond));
    return new Variants(values);
  }
}


