package main.java.repositories;

import main.java.model.Client;

import java.util.Enumeration;
import java.util.Hashtable;

public class ClientRepository {

    private Hashtable<Client, Integer> clients = new Hashtable<Client, Integer>();
    public void addEntry(Client client) {
        if (clients.containsKey(client)) {
            clients.put(client, clients.get(client) + 1);
        }
        clients.putIfAbsent(client, 1);
    }

    public int getSpectacles(Client client) {
        return clients.get(client);
    }


    public Enumeration<Client> getClients() {
        Enumeration e = clients.keys();
        return e;

    }

    public static ClientRepository getInstance() {
        return ClientRepository.SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final ClientRepository INSTANCE = new ClientRepository();
    }
}
