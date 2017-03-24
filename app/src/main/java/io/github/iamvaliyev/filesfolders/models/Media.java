package io.github.iamvaliyev.filesfolders.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Emil Valiyev on 3/23/17.
 */

public class Media extends BaseMedia implements Parcelable {

    String DATA;
    String DATE_ADDED;
    String DATE_MODIFIED;
    String DISPLAY_NAME;
    String HEIGHT;
    String MIME_TYPE;
    String SIZE;
    String TITLE;
    String WIDTH;

    public Media() {
    }

    public Media(String _COUNT, String _ID, String DATA, String DATE_ADDED, String DATE_MODIFIED, String DISPLAY_NAME, String HEIGHT, String MIME_TYPE, String SIZE, String TITLE, String WIDTH) {
        super(_COUNT, _ID);
        this.DATA = DATA;
        this.DATE_ADDED = DATE_ADDED;
        this.DATE_MODIFIED = DATE_MODIFIED;
        this.DISPLAY_NAME = DISPLAY_NAME;
        this.HEIGHT = HEIGHT;
        this.MIME_TYPE = MIME_TYPE;
        this.SIZE = SIZE;
        this.TITLE = TITLE;
        this.WIDTH = WIDTH;
    }

    public String getDATA() {
        return DATA;
    }

    public void setDATA(String DATA) {
        this.DATA = DATA;
    }

    public String getDATE_ADDED() {
        return DATE_ADDED;
    }

    public void setDATE_ADDED(String DATE_ADDED) {
        this.DATE_ADDED = DATE_ADDED;
    }

    public String getDATE_MODIFIED() {
        return DATE_MODIFIED;
    }

    public void setDATE_MODIFIED(String DATE_MODIFIED) {
        this.DATE_MODIFIED = DATE_MODIFIED;
    }

    public String getDISPLAY_NAME() {
        return DISPLAY_NAME;
    }

    public void setDISPLAY_NAME(String DISPLAY_NAME) {
        this.DISPLAY_NAME = DISPLAY_NAME;
    }

    public String getHEIGHT() {
        return HEIGHT;
    }

    public void setHEIGHT(String HEIGHT) {
        this.HEIGHT = HEIGHT;
    }

    public String getMIME_TYPE() {
        return MIME_TYPE;
    }

    public void setMIME_TYPE(String MIME_TYPE) {
        this.MIME_TYPE = MIME_TYPE;
    }

    public String getSIZE() {
        return SIZE;
    }

    public void setSIZE(String SIZE) {
        this.SIZE = SIZE;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getWIDTH() {
        return WIDTH;
    }

    public void setWIDTH(String WIDTH) {
        this.WIDTH = WIDTH;
    }

    protected Media(Parcel in) {
        super(in);
        DATA = in.readString();
        DATE_ADDED = in.readString();
        DATE_MODIFIED = in.readString();
        DISPLAY_NAME = in.readString();
        HEIGHT = in.readString();
        MIME_TYPE = in.readString();
        SIZE = in.readString();
        TITLE = in.readString();
        WIDTH = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(DATA);
        dest.writeString(DATE_ADDED);
        dest.writeString(DATE_MODIFIED);
        dest.writeString(DISPLAY_NAME);
        dest.writeString(HEIGHT);
        dest.writeString(MIME_TYPE);
        dest.writeString(SIZE);
        dest.writeString(TITLE);
        dest.writeString(WIDTH);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Media> CREATOR = new Parcelable.Creator<Media>() {
        @Override
        public Media createFromParcel(Parcel in) {
            return new Media(in);
        }

        @Override
        public Media[] newArray(int size) {
            return new Media[size];
        }
    };
}