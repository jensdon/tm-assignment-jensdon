import java.util.Arrays;

public class Main{

    public static void main(String[] args) {

        TuringMachine turingMachine = new TuringMachine();
        boolean state = turingMachine.Run("test");

        System.out.println(state);

    }

}

