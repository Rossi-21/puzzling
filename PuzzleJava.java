import java.util.ArrayList;
import java.util.Random;
public class PuzzleJava {
    Random randMachine = new Random();
    
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> rolls = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            rolls.add(randMachine.nextInt(0,21));
        }
        return rolls;
    }
}