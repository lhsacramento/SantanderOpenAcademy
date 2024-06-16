package org.example;

import dataStructure.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList listaLigada = new LinkedList("elemento 0");

        listaLigada.append("elemento 1");
        listaLigada.append("elemento 2");
        listaLigada.append("elemento 3");
        listaLigada.append("elemento 4");
        listaLigada.append("elemento 5");


//        System.out.println(listaLigada.getHead().data);
//        System.out.println(listaLigada.getTail().data);
//        System.out.println(listaLigada.getLength());
//        System.out.println(listaLigada.get(2));
//        System.out.println(listaLigada.removeLast().data);
//        listaLigada.prepend("elemento 0");
//        listaLigada.removeFirst();
//        listaLigada.insert(1, "elemento 2.5");
//        listaLigada.set(20,"elemento 4.5");
//        listaLigada.remove(-50);
        listaLigada.print();
        listaLigada.print();
    }
}