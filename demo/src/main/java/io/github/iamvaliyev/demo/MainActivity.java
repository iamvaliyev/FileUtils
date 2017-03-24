package io.github.iamvaliyev.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import io.github.iamvaliyev.filesfolders.models.video.VideoFolder;
import io.github.iamvaliyev.filesfolders.utils.FileUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<VideoFolder> ls = FileUtils.getAllVideoFoldersAndFiles(getApplicationContext());

        TextView txt = (TextView) findViewById(R.id.txtHello);

        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                intent.putExtra("list", ls.get(0));
                startActivity(intent);
            }
        });

    }
}
