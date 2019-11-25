public class MainController {

    public static void main(String[] args) {
        new MainController();
    }

    private String r1,r2,r3,r4,r5;
    private Spielfeld s;
    private Stack<String> stringStack;

    public MainController(){
        s = new Spielfeld(this);
        stringStack = new Stack<>();
        fillStack();
    }

    public void fillStack(){
        double ungeradeZahl = 0;
        for(int i = 0; i < 5;i++) {
            ungeradeZahl = Math.random();
            if (ungeradeZahl < 0.2) {
                stringStack.push("Stein");
            } else if (ungeradeZahl > 0.2 && ungeradeZahl < 0.4) {
                stringStack.push("Papier");
            } else if (ungeradeZahl > 0.4 && ungeradeZahl < 0.6) {
                stringStack.push("Schere");
            } else if (ungeradeZahl > 0.6 && ungeradeZahl < 0.8) {
                stringStack.push("Echse");
            } else if (ungeradeZahl > 0.8) {
                stringStack.push("Spock");
            }
        }
    }

    public void checkAndHandleSSPES(String pString, String cString){
        if(!stringStack.isEmpty()) {
            if (pString.equals("Stein")) {
                if (cString.equals("Stein")) {
                    s.getScenarioLabel().setText("Unentschieden");
                    stringStack.pop();
                    endscore();
                }
                if (cString.equals("Schere")) {
                    s.getScenarioLabel().setText("Gewonnen");
                    stringStack.pop();
                    endscore();
                }
                if (cString.equals("Papier")) {
                    s.getScenarioLabel().setText("Verloren");
                    stringStack.pop();
                    endscore();
                }
                if (cString.equals("Echse")) {
                    s.getScenarioLabel().setText("Gewonnen");
                    stringStack.pop();
                    endscore();
                }
                if (cString.equals("Spock")) {
                    s.getScenarioLabel().setText("Verloren");
                    stringStack.pop();
                    endscore();
                }
            }

            if (pString.equals("Papier")) {
                if (cString.equals("Stein")) {
                    s.getScenarioLabel().setText("Gewonnen");
                    stringStack.pop();
                    endscore();
                }
                if (cString.equals("Papier")) {
                    s.getScenarioLabel().setText("Unentschieden");
                    stringStack.pop();
                    endscore();
                }
                if (cString.equals("Schere")) {
                    s.getScenarioLabel().setText("Verloren");
                    stringStack.pop();
                    endscore();
                }
                if (cString.equals("Echse")) {
                    s.getScenarioLabel().setText("Verloren");
                    stringStack.pop();
                    endscore();
                }
                if (cString.equals("Spock")) {
                    s.getScenarioLabel().setText("Gewonnen");
                    stringStack.pop();
                    endscore();
                }
            }

            if (pString.equals("Schere")) {
                if (cString.equals("Stein")) {
                    s.getScenarioLabel().setText("Verloren");
                    stringStack.pop();
                    endscore();
                }
                if (cString.equals("Papier")) {
                    s.getScenarioLabel().setText("Gewonnen");
                    stringStack.pop();
                    endscore();
                }
                if (cString.equals("Schere")) {
                    s.getScenarioLabel().setText("Unentschieden");
                    stringStack.pop();
                    endscore();
                }
                if (cString.equals("Echse")) {
                    s.getScenarioLabel().setText("Gewonnen");
                    stringStack.pop();
                    endscore();
                }
                if (cString.equals("Spock")) {
                    s.getScenarioLabel().setText("Verloren");
                    stringStack.pop();
                    endscore();
                }
            }

            if (pString.equals("Echse")) {
                if (cString.equals("Stein")) {
                    s.getScenarioLabel().setText("Verloren");
                    stringStack.pop();
                    endscore();
                }
                if (cString.equals("Papier")) {
                    s.getScenarioLabel().setText("Gewonnen");
                    stringStack.pop();
                    endscore();
                }
                if (cString.equals("Schere")) {
                    s.getScenarioLabel().setText("Verloren");
                    stringStack.pop();
                    endscore();

                }
                if (cString.equals("Echse")) {
                    s.getScenarioLabel().setText("Unentschieden");
                    stringStack.pop();
                    endscore();
                }
                if (cString.equals("Spock")) {
                    s.getScenarioLabel().setText("Gewonnen");
                    stringStack.pop();
                    endscore();
                }
            }

            if (pString.equals("Spock")) {
                if (cString.equals("Stein")) {
                    s.getScenarioLabel().setText("Gewonnen");
                    stringStack.pop();
                    endscore();
                }
                if (cString.equals("Papier")) {
                    s.getScenarioLabel().setText("Verloren");
                    stringStack.pop();
                    endscore();
                }
                if (cString.equals("Schere")) {
                    s.getScenarioLabel().setText("Gewonnen");
                    stringStack.pop();
                    endscore();
                }
                if (cString.equals("Echse")) {
                    s.getScenarioLabel().setText("Verloren");
                    stringStack.pop();
                    endscore();
                }
                if (cString.equals("Spock")) {
                    s.getScenarioLabel().setText("Unentschieden");
                    stringStack.pop();
                    endscore();
                }
            }
        }else{
            fillStack();
            r1 = null;
            r2 = null;
            r3 = null;
            r4 = null;
            r5 = null;
            System.out.println("Ich werde aufgerufen");
        }
    }

    public void endscore(){
        if(r1 == null){
            r1 = s.getScenarioLabel().getText();
        }else if(r2 == null) {
            r2 = s.getScenarioLabel().getText();
        }else if(r3 == null){
            r3 = s.getScenarioLabel().getText();
        }else if(r4 == null){
            r4 = s.getScenarioLabel().getText();
        }else if(r5 == null){
            r5 = s.getScenarioLabel().getText();
        }
        System.out.println(r1+","+ r2 + "," + r3 + "," + r4 + "," + r5);

    }
    public Stack getStringStack(){
        return stringStack;
    }

    public String getTopString(){
        if(stringStack.top().equals("Stein")){
            return "Stein";
        }
        if(stringStack.top().equals("Schere")){
            return "Schere";
        }
        if(stringStack.top().equals("Papier")){
            return "Papier";
        }
        if(stringStack.top().equals("Echse")){
            return "Echse";
        }
        if(stringStack.top().equals("Spock")){
            return "Spock";
        }
        return null;
    }
}
