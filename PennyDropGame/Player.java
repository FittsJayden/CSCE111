public class Player {
    String name;
    int pennies;

    public Player(String newName, int newPennies) {
        name = newName;
        pennies = newPennies;
    }
    
    public Player(String name) {
        this.name = name;
        pennies = 12;
    }
    public void setPennies(int pennies) {
        this.pennies = pennies;
    }

    public String getName() {
        return name;
    }
    public int getPennies() {
        return pennies;
    }
    public void playPenny() {
        this.pennies -= 1;
    }
    public void addPennies(int pennies) {
        this.pennies += pennies;
    }
    public boolean winCheck() {
        return (pennies > 0) ? false : true;
    }
}
