package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	ivedimas();
	skaiciavimas();
    }
    static float sanaudos;
    static float atstumas;
    public static void ivedimas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite atstuma KM");
        atstumas = sc.nextFloat();
        System.out.println("Įveskite kuro sanaudas L");
        sanaudos = sc.nextFloat();
    }
    public static void skaiciavimas() {
        float atsakymas = (sanaudos * 100 / atstumas);
        System.out.println("Jusu vidutines sanaudos: " + atsakymas);
    }}