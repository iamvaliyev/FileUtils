package io.github.iamvaliyev.filesfolders.models.video;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

import io.github.iamvaliyev.filesfolders.models.Folder;

/**
 * Created by Emil Valiyev on 3/23/17.
 */

public class VideoFolder extends Folder implements Parcelable {

    ArrayList<Video> videos;

    public VideoFolder() {
    }

    public VideoFolder(String title, String path, ArrayList<Video> videos) {
        super(title, path);
        this.videos = videos;
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<Video> videos) {
        this.videos = videos;
    }

    protected VideoFolder(Parcel in) {
        super(in);
        if (in.readByte() == 0x01) {
            videos = new ArrayList<>();
            in.readList(videos, Video.class.getClassLoader());
        } else {
            videos = null;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        if (videos == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(videos);
        }
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<VideoFolder> CREATOR = new Parcelable.Creator<VideoFolder>() {
        @Override
        public VideoFolder createFromParcel(Parcel in) {
            return new VideoFolder(in);
        }

        @Override
        public VideoFolder[] newArray(int size) {
            return new VideoFolder[size];
        }
    };
}