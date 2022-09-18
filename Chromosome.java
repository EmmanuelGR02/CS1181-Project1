import java.util.ArrayList;
import java.util.Random;

public class Chromosome extends ArrayList<Item> implements Comparable<Chromosome>{
    private static Random rng;

    // Empty Constructor
    public Chromosome() {

    }

    public Chromosome(ArrayList<Item> items) {

    }

    public Chromosome crossover(Chromosome other) {
        return other;
    }

    // public void mutate() {

    // }

    // public int getFitness() {

    // }

    public int compareTo(Chromosome other) {
        return 1;
    }
    
    // public int compareTo(Chromosome o) {
    //     return 0;
    // }

    // public String toString() {

    // }
    
}
