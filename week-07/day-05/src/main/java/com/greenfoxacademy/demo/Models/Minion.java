package com.greenfoxacademy.demo.Models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Minion {
  private String name;
  private List<String> listOfTricks;
  private String food;
  private String drink;
  private Long id;

  public Minion() {

  }

  public Minion(String name,Long id) {
    this.name = name;
    listOfTricks = new ArrayList<>(Arrays.asList());
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getListOfTricks() {
    return listOfTricks;
  }

  public void setListOfTricks(List<String> listOfTricks) {
    this.listOfTricks = listOfTricks;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
