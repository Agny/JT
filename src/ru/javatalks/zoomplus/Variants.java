package ru.javatalks.zoomplus;

import java.util.List;
import java.util.Optional;

public class Variants {
  private List<Variant> values;

  public Variants(List<Variant> values) {
    this.values = values;
  }

  public Optional<Variant> find(final int variantNumber) {
    return values.stream().filter(variant -> variant.getNumber() == variantNumber).findFirst();
  }
}

class Variant {
  public final static Variant empty = new Variant(-1, new int[]{});
  private int number;
  private int[] tasks;

  public Variant(int number, int[] tasks) {
    this.number = number;
    this.tasks = tasks;
  }

  public int getNumber() {
    return number;
  }

  public int[] getTasks() {
    return tasks;
  }

  //TODO: метод решения задач в варианте
  public int[] solve() {
    return new int[0];
  }
}
