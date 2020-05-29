package main.java.services;

import main.java.model.Client;
import main.java.repositories.ClientRepository;

public class AddClientEntryService {
    private LogService logService = LogService.getInstance();
    private ClientRepository clients = ClientRepository.getInstance();
    public void addEntry(Client client) {
        clients.addEntry(client);
        logService.createLog("addEntry");
    }
}
