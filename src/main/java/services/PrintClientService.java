package main.java.services;

import main.java.repositories.ClientRepository;

import java.util.Enumeration;

public class PrintClientService {
    private LogService logService = LogService.getInstance();
    private ClientRepository clients = ClientRepository.getInstance();
    public void PrintClients() {

        logService.createLog("PrintClient");

        Enumeration e1 = clients.getClients();

        while (e1.hasMoreElements()) {
            System.out.println(e1.nextElement());
        }
    }
}
