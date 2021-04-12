import java.util.ArrayList;

public class Person {
    ArrayList<Game> games;
    String name;
    double budget;

    public ArrayList<Game> getGames() {
        return games;
    }

    public void addGame(Game game) {
        games.add(game);
    }

    public void removeGame(Game game) {
        games.remove(game);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Person(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

    public String koop(Game game){
        if (game.getPrice() < getBudget() && !games.contains(game)){
            setBudget(getBudget() - game.getPrice());
            games.add(game);
            return game.name+ "gekocht door"+ name + "voor €"+ game.getPrice()+ "\nNieuw budget: €"+ budget;
        }
        else{
            return "Deze persoon heeft niet voldoende budget, en/of bezit de game al.";
        }
    }

    public String verkoop(Person buyer, Game game){
        if (!buyer.games.contains(game) && buyer.budget > game.getPrice()){
            buyer.addGame(game);
            removeGame(game);
            buyer.setBudget(buyer.getBudget() - game.getPrice());
            setBudget(getBudget() + game.getPrice());
            return game.name+ " verkocht aan "+ buyer.name+ "voor €"+ game.getPrice();
        }
        else{
            return "Deze gebruiker heeft niet voldoende budget, en/of bezit de game al.";
        }
    }
}
