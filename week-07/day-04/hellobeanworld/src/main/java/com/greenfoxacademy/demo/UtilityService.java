package com.greenfoxacademy.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class UtilityService {
  ArrayList<String> colors;
  Random random;

  private static final Pattern EMAIL_REGEX =
      Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }

  public boolean validateEmail(String emailString) {
    Matcher matcher = EMAIL_REGEX.matcher(emailString);
    return matcher.find();
  }

  public String caesar(String text, int number) {
    String result = "";
    for(int i = 0; i < text.length(); i++) {
      result += (char)((int)text.charAt(i) + number);
    }
    return result;
  }
}
