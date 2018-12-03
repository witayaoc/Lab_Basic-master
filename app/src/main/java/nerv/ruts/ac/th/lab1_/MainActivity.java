package nerv.ruts.ac.th.lab1_;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MediaPlayer p1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1 = MediaPlayer.create(this,R.raw.beach);
                p1.start();
        p1.setLooping(true);


    }
}
