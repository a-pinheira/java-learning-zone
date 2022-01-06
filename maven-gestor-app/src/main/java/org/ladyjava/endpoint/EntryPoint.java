package org.ladyjava.endpoint;

import org.ladyjava.model.Employee;
import org.ladyjava.model.person;

public class EntryPoint {
    private String mode;

    public EntryPoint(String mode) {
        this.mode = mode;
    }

    public void printMode() {
        System.out.println("App esta rodando em " + this.mode + "mode. \n");
    }

    public static void main(String[] args) {
        EntryPoint ep = new EntryPoint( mode: "DEV" );
        ep.printMode();
        Employee admin = new Employee(name: "admin", id: 0, role: "admin" );
        System.out.println("Novo user admin criado para o EntryPoint!");

    }
}
