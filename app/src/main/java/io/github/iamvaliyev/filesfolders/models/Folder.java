package io.github.iamvaliyev.filesfolders.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by Emil Valiyev on 3/23/17.
 */

public class Folder implements Parcelable {

    String title;
    String path;

    public Folder() {
    }

    public Folder(String title, String path) {
        this.title = title;
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    protected Folder(Parcel in) {
        title = in.readString();
        path = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(path);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Folder> CREATOR = new Parcelable.Creator<Folder>() {
        @Override
        public Folder createFromParcel(Parcel in) {
            return new Folder(in);
        }

        @Override
        public Folder[] newArray(int size) {
            return new Folder[size];
        }
    };
}