package net.enygma.mtgmatch;

/**
 * Created by Emily on 7/12/2016.
 */
public class Player {

    private String mName;
    private int mAge;
    private int mDecklistID;
    //maybe have app-owner notes on the player: "Likes lock decks" or "STOLE MY FREAKIN REAPER KING"

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        mAge = age;
    }

    public int getDecklistID() {
        return mDecklistID;
    }

    public void setDecklistID(int decklistID) {
        mDecklistID = decklistID;
    }
}
