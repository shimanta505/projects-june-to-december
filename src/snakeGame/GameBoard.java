package snakeGame;

import java.util.*;

public class GameBoard {
    static Scanner input =new Scanner(System.in);
    static List<GameEntry> gameEntries =new ArrayList<>();
    static boolean insertion =false;
    static int topEntry =0;
    public static void main(String[] args) {


        System.out.println("do you want to enter the system then press y or n");

        String userInput = input.nextLine();

        if (userInput.equalsIgnoreCase("y")) {
            showMenu();
        } else if(userInput.equalsIgnoreCase("n")){
            System.out.println("you decided not to enter");
        }else {
            input.close();
        }
    }
    public static void showMenu(){
        if (!insertion){
            System.out.println("how many entry you want to show");
            int entry =input.nextInt();
            topEntry=entry;insertion=true;input.nextLine();
        }
        System.out.println("enter S to save");
        System.out.println("enter R to show top results");
        System.out.println("enter E to exit from the program");
        String command = input.nextLine();
        if (command.equalsIgnoreCase("s")){
            addEntry();
        }else if(command.equalsIgnoreCase("r")){
            showEntry();
        }else if (command.equalsIgnoreCase("e")){
            System.out.println("you are successfully out from the program");
            input.close();
        }
        input.close();
    }
    public static void addEntry(){
        System.out.println("enter member name");
        String name =input.nextLine();
        System.out.println("enter member score");
        int score = input.nextInt();input.nextLine();

        GameEntry gameEntry = new GameEntry(name,score);
        gameEntries.add(gameEntry);
        showMenu();
    }
    public static List<GameEntry> shortingResult(){
       List<GameEntry> gameEntryList =new LinkedList<>(gameEntries);

        for (int i = 0; i <gameEntryList.size() ; i++) {
            boolean check = false;
            for (int j = 0; j <gameEntryList.size()-1-i ; j++) {

                if (gameEntryList.get(j).getScore()<gameEntryList.get(j+1).getScore()){
                    GameEntry gameEntry =gameEntryList.get(j);
                    gameEntryList.set(j,gameEntryList.get(j+1));
                    gameEntryList.set(j+1,gameEntry);check=true;
                }
            }
            if (!check){
                break;
            }
        }

        gameEntries=gameEntryList;


        return gameEntryList;
    }
    public static void showEntry(){

        List<GameEntry> gameEntryList =new ArrayList<>(shortingResult());
        gameEntries.clear();

        if (gameEntryList.size()>=topEntry){
            for (int i = 0; i < topEntry; i++) {
                System.out.println(gameEntryList.get(i).getName()+" score "+gameEntryList.get(i).getScore());
                gameEntries.add(gameEntryList.get(i));
            }
        }else {
            for (GameEntry gameEntry : gameEntryList) {
                System.out.println(gameEntry.getName() + " score " + gameEntry.getScore());
                gameEntries.add(gameEntry);
            }
        }



        showMenu();
    }
}
