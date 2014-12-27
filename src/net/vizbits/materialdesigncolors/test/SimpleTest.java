package net.vizbits.materialdesigncolors.test;

import java.awt.Color;

import net.vizbits.materialdesigncolors.MaterialColor;

public class SimpleTest {
  public static void main(String[] args) {

    Color color = Color.decode(MaterialColor.AMBER_200);
    System.out.println(color.toString());
  }
}
