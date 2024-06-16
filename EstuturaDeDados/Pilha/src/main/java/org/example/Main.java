package org.example;

import dataStructure.Stack;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //Utilizando uma pilha, inverta uma sequencia de dados recebidos do usuário.


    public static void main(String[] args) {
        String[] animals = {"Zebra","Cavalo","Papaleguas","Formiga","Cachorro"};
        Stack myStack = new Stack(animals[0]);

        for(int i = 1; i < animals.length; i++){
            myStack.push(animals[i]);
        }

        String[] animalsInverted = new String[animals.length];

        for(int i = 0; i < animalsInverted.length; i++){
            animalsInverted[i] = myStack.pop().getValue();
        }

        System.out.println(Arrays.toString(animalsInverted));

    }
}