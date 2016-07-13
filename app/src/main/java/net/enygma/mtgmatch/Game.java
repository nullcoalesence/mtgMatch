package net.enygma.mtgmatch;

import java.lang.reflect.Array;
import java.sql.Time;

/**
 * Created by Emily on 7/12/2016.
 */
public class Game {
    /*
    A Game/Match is:
    Who: players (2+)
    What: which decks being piloted by which players
    Where: location of game
    When: time of match
    Why: meta-info of players, or say, "Get revenge on Riley for having stolen Reaper King."
     */

    public String getPlayerList() {
        return mPlayerList;
    }

    public void setPlayerList(String playerList) {
        mPlayerList = playerList;
    }

    public int getNumPlayers() {
        return mNumPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        mNumPlayers = numPlayers;
    }

    public Array getPlayerDecks() {
        return mPlayerDecks;
    }

    public void setPlayerDecks(Array playerDecks) {
        mPlayerDecks = playerDecks;
    }

    public String getGameLocation() {
        return mGameLocation;
    }

    public void setGameLocation(String gameLocation) {
        mGameLocation = gameLocation;
    }

    public Time getGameStart() {
        return mGameStart;
    }

    public void setGameStart(Time gameStart) {
        mGameStart = gameStart;
    }

    public Time getGameEnd() {
        return mGameEnd;
    }

    public void setGameEnd(Time gameEnd) {
        mGameEnd = gameEnd;
    }

    public String getMatchReason() {
        return mMatchReason;
    }

    public void setMatchReason(String matchReason) {
        mMatchReason = matchReason;
    }

    private String mPlayerList; //this should be a diff data type
    private int mNumPlayers;
    private Array mPlayerDecks;
    private String mGameLocation; //could gps this shit
    private Time mGameStart;
    private Time mGameEnd;
    private String mMatchReason; //Grudgematch? Test new deck?

}
