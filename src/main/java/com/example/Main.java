// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package com.example;

public class Main {
   public Main() {
   }

   public static void main(String[] args) {
      System.out.println("Bienvenue dans le système de gestion des patients");
      System.out.println("Veuillez choisir une option :");
      System.out.println("1. Activer la récupération de données de santé");
      System.out.println("2. Visualiser les données d'un patient");
      int choix = 0;
      System.out.println("Suivie de votre santé");
      switch (choix) {
         case 1:
            System.out.println("Récupération des données de santé activée.");
            System.out.println("Récupération en cours...");
            break;
         case 2:
            System.out.println("Visualiser les données d'un patient");
            break;
         default:
            System.out.println("Choix incorrect");
      }

   }
}
