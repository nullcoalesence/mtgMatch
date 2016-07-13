package net.enygma.mtgmatch;

/**
 * Created by Emily on 7/12/2016.
 */
public class Deck {

    private String mFormat;
    private String mColorIdentity;
    private String mPlayType;
    private String mDetails;
    //maybe a "weakness" attribute, like "Doesn't work w/o its commander (R.K.), no utility"

    //We need to save this data too


    public String getFormat() {
        return mFormat;
    }

    public void setFormat(String format) {
        mFormat = format;
    }

    public String getColorIdentity() {
        return mColorIdentity;
    }

    public void setColorIdentity(String colorIdentity) {
        mColorIdentity = colorIdentity;
    }

    public String getPlayType() {
        return mPlayType;
    }

    public void setPlayType(String playType) {
        mPlayType = playType;
    }

    public String getDetails() {
        return mDetails;
    }

    public void setDetails(String details) {
        mDetails = details;
    }
}
