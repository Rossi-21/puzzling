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

    public String getLetter() {
        String [] alphBeta = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        return alphBeta[randMachine.nextInt(0,25)];
       
    }
    
}