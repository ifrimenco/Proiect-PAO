package main.java.model;

import main.java.repositories.ClientRepository;

public class Client {
    private String name;
    private String email;
    private String phone;
    private ClientRepository clients = ClientRepository.getInstance();

    public Client(String name, String email, String phone) {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isRegular() {
        if (clients.getSpectacles(this) > 4) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Client client = (Client) obj;
        if (name != null ? !name.equals(client.name) : client.name != null) return false;
        if (phone != null ? !phone.equals(client.phone) : client.phone != null) return false;
        return email != null ? !email.equals(client.email) : client.email == null;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
