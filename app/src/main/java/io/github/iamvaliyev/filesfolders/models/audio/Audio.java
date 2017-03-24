package io.github.iamvaliyev.filesfolders.models.audio;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

import io.github.iamvaliyev.filesfolders.models.Media;

/**
 * Created by Emil Valiyev on 3/24/17.
 */

public class Audio extends Media implements Parcelable {

    String ALBUM;
    String ALBUM_ID;
    String ALBUM_KEY;
    String ARTIST;
    String ARTIST_ID;
    String ARTIST_KEY;
    String BOOKMARK;
    String COMPOSER;
    String DURATION;
    String IS_ALARM;
    String IS_MUSIC;
    String IS_NOTIFICATION;
    String IS_PODCAST;
    String IS_RINGTONE;
    String TITLE_KEY;
    String TRACK;
    String YEAR;

    public Audio() {

    }

    public Audio(String _COUNT, String _ID, String DATA, String DATE_ADDED, String DATE_MODIFIED, String DISPLAY_NAME, String HEIGHT, String MIME_TYPE, String SIZE, String TITLE, String WIDTH, String ALBUM, String ALBUM_ID, String ALBUM_KEY, String ARTIST, String ARTIST_ID, String ARTIST_KEY, String BOOKMARK, String COMPOSER, String DURATION, String IS_ALARM, String IS_MUSIC, String IS_NOTIFICATION, String IS_PODCAST, String IS_RINGTONE, String TITLE_KEY, String TRACK, String YEAR) {
        super(_COUNT, _ID, DATA, DATE_ADDED, DATE_MODIFIED, DISPLAY_NAME, HEIGHT, MIME_TYPE, SIZE, TITLE, WIDTH);
        this.ALBUM = ALBUM;
        this.ALBUM_ID = ALBUM_ID;
        this.ALBUM_KEY = ALBUM_KEY;
        this.ARTIST = ARTIST;
        this.ARTIST_ID = ARTIST_ID;
        this.ARTIST_KEY = ARTIST_KEY;
        this.BOOKMARK = BOOKMARK;
        this.COMPOSER = COMPOSER;
        this.DURATION = DURATION;
        this.IS_ALARM = IS_ALARM;
        this.IS_MUSIC = IS_MUSIC;
        this.IS_NOTIFICATION = IS_NOTIFICATION;
        this.IS_PODCAST = IS_PODCAST;
        this.IS_RINGTONE = IS_RINGTONE;
        this.TITLE_KEY = TITLE_KEY;
        this.TRACK = TRACK;
        this.YEAR = YEAR;
    }

    public String getALBUM() {
        return ALBUM;
    }

    public void setALBUM(String ALBUM) {
        this.ALBUM = ALBUM;
    }

    public String getALBUM_ID() {
        return ALBUM_ID;
    }

    public void setALBUM_ID(String ALBUM_ID) {
        this.ALBUM_ID = ALBUM_ID;
    }

    public String getALBUM_KEY() {
        return ALBUM_KEY;
    }

    public void setALBUM_KEY(String ALBUM_KEY) {
        this.ALBUM_KEY = ALBUM_KEY;
    }

    public String getARTIST() {
        return ARTIST;
    }

    public void setARTIST(String ARTIST) {
        this.ARTIST = ARTIST;
    }

    public String getARTIST_ID() {
        return ARTIST_ID;
    }

    public void setARTIST_ID(String ARTIST_ID) {
        this.ARTIST_ID = ARTIST_ID;
    }

    public String getARTIST_KEY() {
        return ARTIST_KEY;
    }

    public void setARTIST_KEY(String ARTIST_KEY) {
        this.ARTIST_KEY = ARTIST_KEY;
    }

    public String getBOOKMARK() {
        return BOOKMARK;
    }

    public void setBOOKMARK(String BOOKMARK) {
        this.BOOKMARK = BOOKMARK;
    }

    public String getCOMPOSER() {
        return COMPOSER;
    }

    public void setCOMPOSER(String COMPOSER) {
        this.COMPOSER = COMPOSER;
    }

    public String getDURATION() {
        return DURATION;
    }

    public void setDURATION(String DURATION) {
        this.DURATION = DURATION;
    }

    public String getIS_ALARM() {
        return IS_ALARM;
    }

    public void setIS_ALARM(String IS_ALARM) {
        this.IS_ALARM = IS_ALARM;
    }

    public String getIS_MUSIC() {
        return IS_MUSIC;
    }

    public void setIS_MUSIC(String IS_MUSIC) {
        this.IS_MUSIC = IS_MUSIC;
    }

    public String getIS_NOTIFICATION() {
        return IS_NOTIFICATION;
    }

    public void setIS_NOTIFICATION(String IS_NOTIFICATION) {
        this.IS_NOTIFICATION = IS_NOTIFICATION;
    }

    public String getIS_PODCAST() {
        return IS_PODCAST;
    }

    public void setIS_PODCAST(String IS_PODCAST) {
        this.IS_PODCAST = IS_PODCAST;
    }

    public String getIS_RINGTONE() {
        return IS_RINGTONE;
    }

    public void setIS_RINGTONE(String IS_RINGTONE) {
        this.IS_RINGTONE = IS_RINGTONE;
    }

    public String getTITLE_KEY() {
        return TITLE_KEY;
    }

    public void setTITLE_KEY(String TITLE_KEY) {
        this.TITLE_KEY = TITLE_KEY;
    }

    public String getTRACK() {
        return TRACK;
    }

    public void setTRACK(String TRACK) {
        this.TRACK = TRACK;
    }

    public String getYEAR() {
        return YEAR;
    }

    public void setYEAR(String YEAR) {
        this.YEAR = YEAR;
    }

    protected Audio(Parcel in) {
        ALBUM = in.readString();
        ALBUM_ID = in.readString();
        ALBUM_KEY = in.readString();
        ARTIST = in.readString();
        ARTIST_ID = in.readString();
        ARTIST_KEY = in.readString();
        BOOKMARK = in.readString();
        COMPOSER = in.readString();
        DURATION = in.readString();
        IS_ALARM = in.readString();
        IS_MUSIC = in.readString();
        IS_NOTIFICATION = in.readString();
        IS_PODCAST = in.readString();
        IS_RINGTONE = in.readString();
        TITLE_KEY = in.readString();
        TRACK = in.readString();
        YEAR = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(ALBUM);
        dest.writeString(ALBUM_ID);
        dest.writeString(ALBUM_KEY);
        dest.writeString(ARTIST);
        dest.writeString(ARTIST_ID);
        dest.writeString(ARTIST_KEY);
        dest.writeString(BOOKMARK);
        dest.writeString(COMPOSER);
        dest.writeString(DURATION);
        dest.writeString(IS_ALARM);
        dest.writeString(IS_MUSIC);
        dest.writeString(IS_NOTIFICATION);
        dest.writeString(IS_PODCAST);
        dest.writeString(IS_RINGTONE);
        dest.writeString(TITLE_KEY);
        dest.writeString(TRACK);
        dest.writeString(YEAR);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Audio> CREATOR = new Parcelable.Creator<Audio>() {
        @Override
        public Audio createFromParcel(Parcel in) {
            return new Audio(in);
        }

        @Override
        public Audio[] newArray(int size) {
            return new Audio[size];
        }
    };
}