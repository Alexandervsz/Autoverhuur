import java.util.ArrayList;

public class Person {
    ArrayList<Game> games = new ArrayList<>();
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

    public String koop(Game game) {
        if (game.getPrice() <= getBudget() && !checkinlist(game)) {
            setBudget(getBudget() - game.getPrice());
            games.add(game);
            return game.name + " gekocht door " + name + " voor €" + round(game.getPrice()) + "\nNieuw budget: €" + round(budget);
        } else {
            return "Deze persoon heeft niet voldoende budget, en/of bezit de game al.";
        }
    }

    public String verkoop(Game game, Person buyer) {
        if (!buyer.checkinlist(game) && checkinlist(game) && buyer.budget >= game.getPrice()) {
            buyer.addGame(game);
            removeGame(game);
            buyer.setBudget(buyer.getBudget() - game.getPrice());
            setBudget(getBudget() + game.getPrice());
            return name + " verkoopt " + game.name + " aan " + buyer.name + " voor €" + round(game.getPrice());
        } else {
            return "Deze gebruiker heeft niet voldoende budget, en/of bezit de game al.";
        }
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        if (games != null) {
            for (Game game : getGames()) {
                output.append(game.getName()).append(", uitgegeven in ").append(game.getReleaseYear()).append("; nieuwprijs: ").append(round(game.getOriginPrice())).append(" nu voor: ").append(round(game.getPrice()));
                output.append("\n");
            }
        }

        return getName() + " heeft een budget van €" + round(getBudget()) + " en bezit de volgende games:\n" + output;
    }

    public double round(double number) {
        double scale = Math.pow(10, 2);
        return Math.round(number * scale) / scale;

    }

    public boolean checkinlist(Game checkGame) {
        for (Game game : this.getGames()) {
            if (game.getName().equals(checkGame.getName())) {
                return true;
            }

        }
        return false;
    }
}
