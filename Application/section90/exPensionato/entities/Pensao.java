package Application.section90.exPensionato.entities;

public class Pensao {
    private int rent; //aluguel
    private String name;
    private String email;
    private int room;

    public Pensao(int rent, String name, String email, int room) {
        this.rent = rent;
        this.name = name;
        this.email = email;
        this.room = room;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
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

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String toString(){
        return room + ": "
                +name + ", "
                +email;
    }
}
