package io.github.iamvaliyev.filesfolders.models.audio;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

import io.github.iamvaliyev.filesfolders.models.Folder;
import io.github.iamvaliyev.filesfolders.models.video.Video;

/**
 * Created by Emil Valiyev on 3/23/17.
 */

public class AudioFolders extends Folder implements Parcelable {

    ArrayList<Audio> audios;

    public AudioFolders() {
    }

    public AudioFolders(String title, String path, ArrayList<Audio> audios) {
        super(title, path);
        this.audios = audios;
    }

    public ArrayList<Audio> getAudios() {
        return audios;
    }

    public void setAudios(ArrayList<Audio> audios) {
        this.audios = audios;
    }

    protected AudioFolders(Parcel in) {
        if (in.readByte() == 0x01) {
            audios = new ArrayList<Audio>();
            in.readList(audios, Video.class.getClassLoader());
        } else {
            audios = null;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (audios == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(audios);
        }
    }

    @SuppressWarnings("unused")
    public static final Creator<AudioFolders> CREATOR = new Creator<AudioFolders>() {
        @Override
        public AudioFolders createFromParcel(Parcel in) {
            return new AudioFolders(in);
        }

        @Override
        public AudioFolders[] newArray(int size) {
            return new AudioFolders[size];
        }
    };
}