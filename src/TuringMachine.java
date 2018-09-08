public class TuringMachine {

    boolean state;

    public TuringMachine(){

    }

    public boolean Run(String tape){



        char[] chars = tape.toCharArray();

        for (char c : chars) {
            System.out.println(c);
        }

        
        return true;

    }

    public void setState( boolean stateMachine ) {
        state = stateMachine;
    }

    public boolean getState(boolean state) {
        return state;
    }

}


