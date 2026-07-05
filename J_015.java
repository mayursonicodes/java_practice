/*
Create a class Player with below attributes:

playerId - int
playerName - String
runs - int
playerType - String
matchType - String

The above attributes should be private, write getters, setters and parameterized constructor as required.

Implement two static methods - findPlayerWithLowestRuns and findPlayerByMatchType in Solution class.

findPlayer WithLowestRuns method:
This method will take array of Player objects and a String value as input parameters.
The method will return the least runs of the Player from array of Player objects for the given player type (String parameter passed).
If no Player with the above condition are present in array of Player objects then the method should return 0.

findPlayerByMatchType method:
This method will take array of Player objects and String value as input parameters and return the array of Player objects belonging to the match type passed as input parameter in Descending order of playerId.
If no Player with the above condition are present in the array of Player objects, then the method should retumn null.

For findPlayerWithLowestRuns method - The main method should print the returned runs as it is if the returned value is greater than 0 or it should print "No such player".

Eg: 25
where 25 is the lowest runs of the Player.

For findPlayerByMatchType method - The main method should print the playerld from the returned Player array for each Player if the returned value is not null.
If the returned value is null then it should print "No Player with given match Type"

Eg:
13
11
where 13 and 11 are the playerId's.
*/

import java.util.*;

class Player{
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    Player(int a, String b, int c, String d, String e){
        playerId = a;
        playerName = b;
        runs = c;
        playerType = d;
        matchType = e;
    }

    int getRuns(){
        return runs;
    }

    String getMatchType(){
        return matchType;
    }

    String getPlayerType(){
        return playerType;
    }

    int getPlayerId(){
        return playerId;
    }
}

public class J_015{

    static int findPlayerWithLowestRuns(Player[] players, String playerType){
        int lowestRun = Integer.MAX_VALUE;
        for(Player player: players){
            if((player.getRuns() < lowestRun) && (player.getPlayerType().equals(playerType))){
                lowestRun = player.getRuns();
            }
        }
        
        if(lowestRun != Integer.MAX_VALUE){
            return lowestRun;
        }
        else{
            return 0;
        }
    }

    static Player[] findPlayerByMatchType(Player[] players, String matchType){
        ArrayList<Player> sameMatchType = new ArrayList<>();
        for(Player player: players){
            if(player.getMatchType().equals(matchType)){
                sameMatchType.add(player);
            }
        }

        if(sameMatchType.size() == 0){
            return null;
        }
        
        Player finalAns[] = new Player[sameMatchType.size()];

        for(int i=0; i<sameMatchType.size(); i++){
            finalAns[i] = sameMatchType.get(i);
        }

        for(int i=0; i<finalAns.length; i++){
            for(int j=i+1; j<finalAns.length; j++){
                if(finalAns[i].getPlayerId() < finalAns[j].getPlayerId()){
                    Player temp = finalAns[i];
                    finalAns[i] = finalAns[j];
                    finalAns[j] = temp;
                }
            }
        }
        return finalAns;
    }

    public static void main(String[] args){
        
    }
}