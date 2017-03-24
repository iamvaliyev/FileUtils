package io.github.iamvaliyev.filesfolders.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Emil Valiyev on 3/23/17.
 */

public class BaseMedia implements Parcelable {
    String _COUNT;
    String _ID;

    public BaseMedia() {
    }

    public BaseMedia(String _COUNT, String _ID) {
        this._COUNT = _COUNT;
        this._ID = _ID;
    }

    public String get_COUNT() {
        return _COUNT;
    }

    public void set_COUNT(String _COUNT) {
        this._COUNT = _COUNT;
    }

    public String get_ID() {
        return _ID;
    }

    public void set_ID(String _ID) {
        this._ID = _ID;
    }

    protected BaseMedia(Parcel in) {
        _COUNT = in.readString();
        _ID = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(_COUNT);
        dest.writeString(_ID);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<BaseMedia> CREATOR = new Parcelable.Creator<BaseMedia>() {
        @Override
        public BaseMedia createFromParcel(Parcel in) {
            return new BaseMedia(in);
        }

        @Override
        public BaseMedia[] newArray(int size) {
            return new BaseMedia[size];
        }
    };
}