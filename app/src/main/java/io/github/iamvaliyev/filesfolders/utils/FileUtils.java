package io.github.iamvaliyev.filesfolders.utils;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashSet;

import io.github.iamvaliyev.filesfolders.models.audio.Audio;
import io.github.iamvaliyev.filesfolders.models.audio.AudioFolders;
import io.github.iamvaliyev.filesfolders.models.video.Video;
import io.github.iamvaliyev.filesfolders.models.video.VideoFolder;

/**
 * Created by Emil Valiyev on 3/23/17.
 */

public class FileUtils {

    public static ArrayList<Audio> getAllAudioFiles(Context context) {

        ArrayList<Audio> files = new ArrayList<>();

        HashSet<String> videoItemHashSet = new HashSet<>();
        String[] projection = {MediaStore.Audio.AudioColumns._ID,
                MediaStore.Audio.AudioColumns.ALBUM,
                MediaStore.Audio.AudioColumns.ALBUM_ID,
                MediaStore.Audio.AudioColumns.ALBUM_KEY,
                MediaStore.Audio.AudioColumns.ARTIST,
                MediaStore.Audio.AudioColumns.ARTIST_ID,
                MediaStore.Audio.AudioColumns.ARTIST_KEY,
                MediaStore.Audio.AudioColumns.BOOKMARK,
                MediaStore.Audio.AudioColumns.COMPOSER,
                MediaStore.Audio.AudioColumns.DURATION,
                MediaStore.Audio.AudioColumns.IS_ALARM,
                MediaStore.Audio.AudioColumns.IS_MUSIC,
                MediaStore.Audio.AudioColumns.IS_NOTIFICATION,
                MediaStore.Audio.AudioColumns.IS_PODCAST,
                MediaStore.Audio.AudioColumns.IS_RINGTONE,
                MediaStore.Audio.AudioColumns.TITLE_KEY,
                MediaStore.Audio.AudioColumns.TITLE,
                MediaStore.Audio.AudioColumns.TRACK,
                MediaStore.Audio.AudioColumns.YEAR, // MediaColumns
                MediaStore.Audio.Media.DATA,
                MediaStore.Audio.Media.DATE_ADDED,
                MediaStore.Audio.Media.DATE_MODIFIED,
                MediaStore.Audio.Media.DISPLAY_NAME,
                MediaStore.Audio.Media.MIME_TYPE,
                MediaStore.Audio.Media.SIZE,
                MediaStore.Audio.Media.TITLE};
        Cursor cursor = context.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, projection, null, null, null);
        try {
            cursor.moveToFirst();
            do {
                Audio audio = new Audio();
                audio.setDATA(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DATA)));
                audio.setDATE_ADDED(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DATE_ADDED)));
                audio.setDATE_MODIFIED(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DATE_MODIFIED)));
                audio.setDISPLAY_NAME(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DISPLAY_NAME)));
                audio.setMIME_TYPE(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.MIME_TYPE)));
                audio.setSIZE(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.SIZE)));
                audio.setTITLE(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.TITLE)));
                audio.setHEIGHT("");
                audio.setWIDTH("");

                audio.setALBUM(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.ALBUM)));
                audio.setALBUM_ID(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.ALBUM_ID)));
                audio.setALBUM_KEY(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.ALBUM_KEY)));
                audio.setARTIST(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.ARTIST)));
                audio.setARTIST_ID(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.ARTIST_ID)));
                audio.setARTIST_KEY(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.ARTIST_KEY)));
                audio.setBOOKMARK(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.BOOKMARK)));
                audio.setCOMPOSER(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.COMPOSER)));
                audio.setDURATION(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DURATION)));
                audio.setIS_ALARM(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.IS_ALARM)));
                audio.setIS_MUSIC(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.IS_MUSIC)));
                audio.setIS_NOTIFICATION(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.IS_NOTIFICATION)));
                audio.setIS_PODCAST(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.IS_PODCAST)));
                audio.setIS_RINGTONE(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.IS_RINGTONE)));
                audio.setTITLE_KEY(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.TITLE_KEY)));
                audio.setTRACK(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.TRACK)));
                audio.setYEAR(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.YEAR)));
                files.add(audio);

                videoItemHashSet.add((cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DATA))));
            } while (cursor.moveToNext());

            cursor.close();
        } catch (Exception e) {

        }

        return files;
    }


    public static ArrayList<AudioFolders> getAllAudioFoldersAndFile(Context context) {

        ArrayList<AudioFolders> folders = new ArrayList<>();
        ArrayList<String> foldersPaths = new ArrayList<>();
        ArrayList<Audio> files = new ArrayList<>();

        HashSet<String> videoItemHashSet = new HashSet<>();
        String[] projection = {MediaStore.Audio.AudioColumns._ID,
                MediaStore.Audio.AudioColumns.ALBUM,
                MediaStore.Audio.AudioColumns.ALBUM_ID,
                MediaStore.Audio.AudioColumns.ALBUM_KEY,
                MediaStore.Audio.AudioColumns.ARTIST,
                MediaStore.Audio.AudioColumns.ARTIST_ID,
                MediaStore.Audio.AudioColumns.ARTIST_KEY,
                MediaStore.Audio.AudioColumns.BOOKMARK,
                MediaStore.Audio.AudioColumns.COMPOSER,
                MediaStore.Audio.AudioColumns.DURATION,
                MediaStore.Audio.AudioColumns.IS_ALARM,
                MediaStore.Audio.AudioColumns.IS_MUSIC,
                MediaStore.Audio.AudioColumns.IS_NOTIFICATION,
                MediaStore.Audio.AudioColumns.IS_PODCAST,
                MediaStore.Audio.AudioColumns.IS_RINGTONE,
                MediaStore.Audio.AudioColumns.TITLE_KEY,
                MediaStore.Audio.AudioColumns.TITLE,
                MediaStore.Audio.AudioColumns.TRACK,
                MediaStore.Audio.AudioColumns.YEAR, // MediaColumns
                MediaStore.Audio.Media.DATA,
                MediaStore.Audio.Media.DATE_ADDED,
                MediaStore.Audio.Media.DATE_MODIFIED,
                MediaStore.Audio.Media.DISPLAY_NAME,
                MediaStore.Audio.Media.MIME_TYPE,
                MediaStore.Audio.Media.SIZE,
                MediaStore.Audio.Media.TITLE};
        Cursor cursor = context.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, projection, null, null, null);
        try {
            cursor.moveToFirst();
            do {
                Audio audio = new Audio();
                audio.setDATA(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DATA)));
                audio.setDATE_ADDED(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DATE_ADDED)));
                audio.setDATE_MODIFIED(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DATE_MODIFIED)));
                audio.setDISPLAY_NAME(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DISPLAY_NAME)));
                audio.setHEIGHT("");
                audio.setMIME_TYPE(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.MIME_TYPE)));
                audio.setSIZE(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.SIZE)));
                audio.setTITLE(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.TITLE)));
                audio.setWIDTH("");

                audio.setALBUM(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.ALBUM)));
                audio.setALBUM_ID(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.ALBUM_ID)));
                audio.setALBUM_KEY(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.ALBUM_KEY)));
                audio.setARTIST(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.ARTIST)));
                audio.setARTIST_ID(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.ARTIST_ID)));
                audio.setARTIST_KEY(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.ARTIST_KEY)));
                audio.setBOOKMARK(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.BOOKMARK)));
                audio.setCOMPOSER(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.COMPOSER)));
                audio.setDURATION(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DURATION)));
                audio.setIS_ALARM(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.IS_ALARM)));
                audio.setIS_MUSIC(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.IS_MUSIC)));
                audio.setIS_NOTIFICATION(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.IS_NOTIFICATION)));
                audio.setIS_PODCAST(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.IS_PODCAST)));
                audio.setIS_RINGTONE(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.IS_RINGTONE)));
                audio.setTITLE_KEY(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.TITLE_KEY)));
                audio.setTRACK(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.TRACK)));
                audio.setYEAR(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.YEAR)));
                files.add(audio);

                videoItemHashSet.add((cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DATA))));
            } while (cursor.moveToNext());

            cursor.close();
        } catch (Exception e) {

        }

        for (Audio audio : files) {

            String[] sp = audio.getDATA().split("/");

            if (foldersPaths.contains(audio.getDATA().replace(sp[sp.length - 1], ""))) {
                folders.get(foldersPaths.indexOf(audio.getDATA().replace(sp[sp.length - 1], ""))).getAudios().add(audio);
            } else {
                AudioFolders videoFolder = new AudioFolders();
                videoFolder.setTitle(sp[sp.length - 2]);
                videoFolder.setPath(audio.getDATA().replace(sp[sp.length - 1], ""));

                ArrayList<Audio> ls = new ArrayList<>();
                ls.add(audio);
                videoFolder.setAudios(ls);
                folders.add(videoFolder);


                foldersPaths.add(audio.getDATA().replace(sp[sp.length - 1], ""));
            }
        }

        for (int i = 0; i < folders.size(); i++) {
            Log.e("VideoFolder", folders.get(i).getTitle() + " -- " + folders.get(i).getPath() + " -- " + folders.get(i).getAudios().size());
        }

        return folders;
    }

    public static ArrayList<Video> getAllVideoFiles(Context context) {

        ArrayList<Video> files = new ArrayList<>();

        HashSet<String> videoItemHashSet = new HashSet<>();
        String[] projection = {MediaStore.Video.VideoColumns._ID,
                MediaStore.Video.VideoColumns.ALBUM,
                MediaStore.Video.Media.ARTIST,
                MediaStore.Video.Media.BOOKMARK,
                MediaStore.Video.Media.BUCKET_DISPLAY_NAME,
                MediaStore.Video.Media.BUCKET_ID,
                MediaStore.Video.Media.CATEGORY,
                MediaStore.Video.Media.DATE_TAKEN,
                MediaStore.Video.Media.DESCRIPTION,
                MediaStore.Video.Media.DURATION,
                MediaStore.Video.Media.IS_PRIVATE,
                MediaStore.Video.Media.LANGUAGE,
                MediaStore.Video.Media.LATITUDE,
                MediaStore.Video.Media.LONGITUDE,
                MediaStore.Video.Media.MINI_THUMB_MAGIC,
                MediaStore.Video.Media.RESOLUTION,
                MediaStore.Video.Media.TAGS, // MediaColumns
                MediaStore.Video.Media.DATA,
                MediaStore.Video.Media.DATE_ADDED,
                MediaStore.Video.Media.DATE_MODIFIED,
                MediaStore.Video.Media.DISPLAY_NAME,
                MediaStore.Video.Media.HEIGHT,
                MediaStore.Video.Media.MIME_TYPE,
                MediaStore.Video.Media.SIZE,
                MediaStore.Video.Media.TITLE,
                MediaStore.Video.Media.WIDTH};
        Cursor cursor = context.getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, projection, null, null, null);
        try {
            cursor.moveToFirst();
            do {
                Video video = new Video();
                video.setALBUM(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.ALBUM)));
                video.setARTIST(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.ARTIST)));
                video.setBOOKMARK(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.BOOKMARK)));
                video.setBUCKET_DISPLAY_NAME(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.BUCKET_DISPLAY_NAME)));
                video.setBUCKET_ID(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.BUCKET_ID)));
                video.setCATEGORY(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.CATEGORY)));
                video.setDATE_TAKEN(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DATE_TAKEN)));
                video.setDESCRIPTION(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DESCRIPTION)));
                video.setDURATION(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DURATION)));
                video.setIS_PRIVATE(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.IS_PRIVATE)));
                video.setLANGUAGE(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.LANGUAGE)));
                video.setLATITUDE(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.LATITUDE)));
                video.setLONGITUDE(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.LONGITUDE)));
                video.setMINI_THUMB_MAGIC(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.MINI_THUMB_MAGIC)));
                video.setRESOLUTION(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.RESOLUTION)));
                video.setTAGS(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.TAGS)));
                video.setDATA(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DATA)));
                video.setDATE_ADDED(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DATE_ADDED)));
                video.setDATE_MODIFIED(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DATE_MODIFIED)));
                video.setDISPLAY_NAME(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DISPLAY_NAME)));
                video.setHEIGHT(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.HEIGHT)));
                video.setMIME_TYPE(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.MIME_TYPE)));
                video.setSIZE(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.SIZE)));
                video.setTITLE(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.TITLE)));
                video.setWIDTH(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.WIDTH)));

                files.add(video);

                videoItemHashSet.add((cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DATA))));
            } while (cursor.moveToNext());

            cursor.close();
        } catch (Exception e) {

        }

        return files;
    }

    public static ArrayList<VideoFolder> getAllVideoFoldersAndFiles(Context context) {

        ArrayList<VideoFolder> folders = new ArrayList<>();
        ArrayList<String> foldersPaths = new ArrayList<>();
        ArrayList<Video> files = new ArrayList<>();

        HashSet<String> videoItemHashSet = new HashSet<>();
        String[] projection = {MediaStore.Video.VideoColumns._ID,
                MediaStore.Video.VideoColumns.ALBUM,
                MediaStore.Video.Media.ARTIST,
                MediaStore.Video.Media.BOOKMARK,
                MediaStore.Video.Media.BUCKET_DISPLAY_NAME,
                MediaStore.Video.Media.BUCKET_ID,
                MediaStore.Video.Media.CATEGORY,
                MediaStore.Video.Media.DATE_TAKEN,
                MediaStore.Video.Media.DESCRIPTION,
                MediaStore.Video.Media.DURATION,
                MediaStore.Video.Media.IS_PRIVATE,
                MediaStore.Video.Media.LANGUAGE,
                MediaStore.Video.Media.LATITUDE,
                MediaStore.Video.Media.LONGITUDE,
                MediaStore.Video.Media.MINI_THUMB_MAGIC,
                MediaStore.Video.Media.RESOLUTION,
                MediaStore.Video.Media.TAGS, // MediaColumns
                MediaStore.Video.Media.DATA,
                MediaStore.Video.Media.DATE_ADDED,
                MediaStore.Video.Media.DATE_MODIFIED,
                MediaStore.Video.Media.DISPLAY_NAME,
                MediaStore.Video.Media.HEIGHT,
                MediaStore.Video.Media.MIME_TYPE,
                MediaStore.Video.Media.SIZE,
                MediaStore.Video.Media.TITLE,
                MediaStore.Video.Media.WIDTH};
        Cursor cursor = context.getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, projection, null, null, null);
        try {
            cursor.moveToFirst();
            do {
                Video video = new Video();
                video.setALBUM(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.ALBUM)));
                video.setARTIST(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.ARTIST)));
                video.setBOOKMARK(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.BOOKMARK)));
                video.setBUCKET_DISPLAY_NAME(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.BUCKET_DISPLAY_NAME)));
                video.setBUCKET_ID(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.BUCKET_ID)));
                video.setCATEGORY(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.CATEGORY)));
                video.setDATE_TAKEN(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DATE_TAKEN)));
                video.setDESCRIPTION(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DESCRIPTION)));
                video.setDURATION(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DURATION)));
                video.setIS_PRIVATE(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.IS_PRIVATE)));
                video.setLANGUAGE(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.LANGUAGE)));
                video.setLATITUDE(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.LATITUDE)));
                video.setLONGITUDE(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.LONGITUDE)));
                video.setMINI_THUMB_MAGIC(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.MINI_THUMB_MAGIC)));
                video.setRESOLUTION(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.RESOLUTION)));
                video.setTAGS(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.TAGS)));
                video.setDATA(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DATA)));
                video.setDATE_ADDED(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DATE_ADDED)));
                video.setDATE_MODIFIED(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DATE_MODIFIED)));
                video.setDISPLAY_NAME(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DISPLAY_NAME)));
                video.setHEIGHT(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.HEIGHT)));
                video.setMIME_TYPE(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.MIME_TYPE)));
                video.setSIZE(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.SIZE)));
                video.setTITLE(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.TITLE)));
                video.setWIDTH(cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.WIDTH)));

                files.add(video);

                videoItemHashSet.add((cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DATA))));
            } while (cursor.moveToNext());

            cursor.close();
        } catch (Exception e) {

        }

        for (Video video : files) {

            String[] sp = video.getDATA().split("/");

            if (foldersPaths.contains(video.getDATA().replace(sp[sp.length - 1], ""))) {
                folders.get(foldersPaths.indexOf(video.getDATA().replace(sp[sp.length - 1], ""))).getVideos().add(video);
            } else {
                VideoFolder videoFolder = new VideoFolder();
                videoFolder.setTitle(sp[sp.length - 2]);
                videoFolder.setPath(video.getDATA().replace(sp[sp.length - 1], ""));

                ArrayList<Video> ls = new ArrayList<>();
                ls.add(video);
                videoFolder.setVideos(ls);
                folders.add(videoFolder);


                foldersPaths.add(video.getDATA().replace(sp[sp.length - 1], ""));
            }
        }

        for (int i = 0; i < folders.size(); i++) {
            Log.e("VideoFolder", folders.get(i).getVideos().get(0).getTITLE() + " -- " + folders.get(i).getVideos().get(0).getDATA() + " -- " + folders.get(i).getVideos().size());
        }

        return folders;
    }
}
