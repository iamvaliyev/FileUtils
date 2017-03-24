package io.github.iamvaliyev.filesfolders.models.video;

import android.os.Parcel;
import android.os.Parcelable;

import io.github.iamvaliyev.filesfolders.models.Media;

/**
 * Created by Emil Valiyev on 3/23/17.
 */

public class Video extends Media implements Parcelable {

    String ALBUM;
    String ARTIST;
    String BOOKMARK;
    String BUCKET_DISPLAY_NAME;
    String BUCKET_ID;
    String CATEGORY;
    String DATE_TAKEN;
    String DESCRIPTION;
    String DURATION;
    String IS_PRIVATE;
    String LANGUAGE;
    String LATITUDE;
    String LONGITUDE;
    String MINI_THUMB_MAGIC;
    String RESOLUTION;
    String TAGS;

    public Video() {
    }

    public Video(String _COUNT, String _ID, String DATA, String DATE_ADDED, String DATE_MODIFIED, String DISPLAY_NAME, String HEIGHT, String MIME_TYPE, String SIZE, String TITLE, String WIDTH, String ALBUM, String ARTIST, String BOOKMARK, String BUCKET_DISPLAY_NAME, String BUCKET_ID, String CATEGORY, String DATE_TAKEN, String DESCRIPTION, String DURATION, String IS_PRIVATE, String LANGUAGE, String LATITUDE, String LONGITUDE, String MINI_THUMB_MAGIC, String RESOLUTION, String TAGS) {
        super(_COUNT, _ID, DATA, DATE_ADDED, DATE_MODIFIED, DISPLAY_NAME, HEIGHT, MIME_TYPE, SIZE, TITLE, WIDTH);
        this.ALBUM = ALBUM;
        this.ARTIST = ARTIST;
        this.BOOKMARK = BOOKMARK;
        this.BUCKET_DISPLAY_NAME = BUCKET_DISPLAY_NAME;
        this.BUCKET_ID = BUCKET_ID;
        this.CATEGORY = CATEGORY;
        this.DATE_TAKEN = DATE_TAKEN;
        this.DESCRIPTION = DESCRIPTION;
        this.DURATION = DURATION;
        this.IS_PRIVATE = IS_PRIVATE;
        this.LANGUAGE = LANGUAGE;
        this.LATITUDE = LATITUDE;
        this.LONGITUDE = LONGITUDE;
        this.MINI_THUMB_MAGIC = MINI_THUMB_MAGIC;
        this.RESOLUTION = RESOLUTION;
        this.TAGS = TAGS;
    }

    public String getALBUM() {
        return ALBUM;
    }

    public void setALBUM(String ALBUM) {
        this.ALBUM = ALBUM;
    }

    public String getARTIST() {
        return ARTIST;
    }

    public void setARTIST(String ARTIST) {
        this.ARTIST = ARTIST;
    }

    public String getBOOKMARK() {
        return BOOKMARK;
    }

    public void setBOOKMARK(String BOOKMARK) {
        this.BOOKMARK = BOOKMARK;
    }

    public String getBUCKET_DISPLAY_NAME() {
        return BUCKET_DISPLAY_NAME;
    }

    public void setBUCKET_DISPLAY_NAME(String BUCKET_DISPLAY_NAME) {
        this.BUCKET_DISPLAY_NAME = BUCKET_DISPLAY_NAME;
    }

    public String getBUCKET_ID() {
        return BUCKET_ID;
    }

    public void setBUCKET_ID(String BUCKET_ID) {
        this.BUCKET_ID = BUCKET_ID;
    }

    public String getCATEGORY() {
        return CATEGORY;
    }

    public void setCATEGORY(String CATEGORY) {
        this.CATEGORY = CATEGORY;
    }

    public String getDATE_TAKEN() {
        return DATE_TAKEN;
    }

    public void setDATE_TAKEN(String DATE_TAKEN) {
        this.DATE_TAKEN = DATE_TAKEN;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getDURATION() {
        return DURATION;
    }

    public void setDURATION(String DURATION) {
        this.DURATION = DURATION;
    }

    public String getIS_PRIVATE() {
        return IS_PRIVATE;
    }

    public void setIS_PRIVATE(String IS_PRIVATE) {
        this.IS_PRIVATE = IS_PRIVATE;
    }

    public String getLANGUAGE() {
        return LANGUAGE;
    }

    public void setLANGUAGE(String LANGUAGE) {
        this.LANGUAGE = LANGUAGE;
    }

    public String getLATITUDE() {
        return LATITUDE;
    }

    public void setLATITUDE(String LATITUDE) {
        this.LATITUDE = LATITUDE;
    }

    public String getLONGITUDE() {
        return LONGITUDE;
    }

    public void setLONGITUDE(String LONGITUDE) {
        this.LONGITUDE = LONGITUDE;
    }

    public String getMINI_THUMB_MAGIC() {
        return MINI_THUMB_MAGIC;
    }

    public void setMINI_THUMB_MAGIC(String MINI_THUMB_MAGIC) {
        this.MINI_THUMB_MAGIC = MINI_THUMB_MAGIC;
    }

    public String getRESOLUTION() {
        return RESOLUTION;
    }

    public void setRESOLUTION(String RESOLUTION) {
        this.RESOLUTION = RESOLUTION;
    }

    public String getTAGS() {
        return TAGS;
    }

    public void setTAGS(String TAGS) {
        this.TAGS = TAGS;
    }

    protected Video(Parcel in) {
        ALBUM = in.readString();
        ARTIST = in.readString();
        BOOKMARK = in.readString();
        BUCKET_DISPLAY_NAME = in.readString();
        BUCKET_ID = in.readString();
        CATEGORY = in.readString();
        DATE_TAKEN = in.readString();
        DESCRIPTION = in.readString();
        DURATION = in.readString();
        IS_PRIVATE = in.readString();
        LANGUAGE = in.readString();
        LATITUDE = in.readString();
        LONGITUDE = in.readString();
        MINI_THUMB_MAGIC = in.readString();
        RESOLUTION = in.readString();
        TAGS = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(ALBUM);
        dest.writeString(ARTIST);
        dest.writeString(BOOKMARK);
        dest.writeString(BUCKET_DISPLAY_NAME);
        dest.writeString(BUCKET_ID);
        dest.writeString(CATEGORY);
        dest.writeString(DATE_TAKEN);
        dest.writeString(DESCRIPTION);
        dest.writeString(DURATION);
        dest.writeString(IS_PRIVATE);
        dest.writeString(LANGUAGE);
        dest.writeString(LATITUDE);
        dest.writeString(LONGITUDE);
        dest.writeString(MINI_THUMB_MAGIC);
        dest.writeString(RESOLUTION);
        dest.writeString(TAGS);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Video> CREATOR = new Parcelable.Creator<Video>() {
        @Override
        public Video createFromParcel(Parcel in) {
            return new Video(in);
        }

        @Override
        public Video[] newArray(int size) {
            return new Video[size];
        }
    };
}