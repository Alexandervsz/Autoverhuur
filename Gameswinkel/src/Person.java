import java.text.DecimalFormat;
import java.util.LinkedHashSet;

public class Person {
    private final LinkedHashSet<Game> games = new LinkedHashSet<>();
    private String name;
    private double budget;

    public LinkedHashSet<Game> getGames() {
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
        if (game.getPrice() <= getBudget() && !getGames().contains(game)) {
            setBudget(getBudget() - game.getPrice());
            games.add(game);
            return "gelukt";
        } else {
            return "niet gelukt";
        }
    }

    public String verkoop(Game game, Person buyer) {
        if (buyer.getBudget() >= game.getPrice() && getGames().contains(game) && !buyer.getGames().contains(game)) {
            buyer.addGame(game);
            removeGame(game);
            buyer.setBudget(buyer.getBudget() - game.getPrice());
            setBudget(getBudget() + game.getPrice());
            return "gelukt";
        } else {
            return "niet gelukt";
        }
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (Game game : getGames()) {
            output.append(game.toString());
            output.append("\n");
        }


        return getName() + " heeft een budget van €" + round(getBudget(), 0.01) + " en bezit de volgende games:\n" + output;
    }

    public static String round(double number, double margin) {
        number += margin;
        DecimalFormat f = new DecimalFormat("##.00");
        return f.format(number);

    }

}
