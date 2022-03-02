package com.company;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;


public class Main
{

    public static void main(String[] args)
    {
        Random rnd = new Random();
        int[] massiv = new int[10];
//заполнение массива случайными числами
        for(int i=0;i<massiv.length;i++) {
            massiv[i] = rnd.nextInt(20);
            System.out.print(massiv[i] + " ");
        }
        System.out.println();
//сортировка
        for (int i = massiv.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (massiv[j] > massiv[j + 1]) {
                    int tmp = massiv[j];
                    massiv[j] = massiv[j + 1];
                    massiv[j + 1] = tmp;
                }
            }
        }
//Вывод масива после сортировки
        for(int i=0;i<massiv.length;i++) {
            System.out.print(massiv[i] + " ");
        }
        System.out.println();

//Считаем кол-во повторов
        int povtorCounter = 0;
        int povtor = massiv[0];
        for(int i=1;i<massiv.length;i++) {
            if (massiv[i]==povtor){
                povtorCounter +=1;
            }
            povtor=massiv[i];
        }
//Создаём масив без повторов
        int massiv1Counter = 1;
        povtor = massiv[0];
        int[] massiv1 = new int[10-povtorCounter];
        massiv1[0]=massiv[0];
        for(int i=1;i<massiv.length;i++) {
            if (massiv[i]==povtor){
                continue;
            }
            massiv1[massiv1Counter]=massiv[i];
            povtor = massiv[i];
            massiv1Counter++;
        }
//вывод массива без повторов
        for(int i=0;i<massiv1.length;i++) {
            System.out.print(massiv1[i] + " ");
        }
    }
}

