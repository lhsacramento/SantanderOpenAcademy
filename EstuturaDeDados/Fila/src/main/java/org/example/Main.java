package org.example;

import dataStructure.Queue;

public class Main {
    public static void main(String[] args) {

        //Crie um problema Java que simule a fila de um atendimento,
        // onde os clientes entram na fila e sao atendidos um por um;

        //Ordem de chegada dos Clientes
        String firstPerson = "Ana";
        Queue clientsQueue = new Queue(firstPerson);
        clientsQueue.enqueue("Marcelo");
        clientsQueue.enqueue("Pedro");
        clientsQueue.enqueue("Luiz");
        clientsQueue.enqueue("Angela");
        clientsQueue.enqueue("Rosana");
        clientsQueue.enqueue("Luiz Carlos");

        System.out.println("Ordem de Chagada Dos Clientes: \n");
        clientsQueue.print();

        //Ordem do Atendimento
        System.out.println("\n Ordem de Atendimento: \n");
        var client = clientsQueue.dequeue();
        while (client != null){
            System.out.println(client);
            client = clientsQueue.dequeue();
        }

    }
}