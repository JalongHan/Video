package haoqu.com.video;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity{

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String rtspUrl = "rtsp://192.168.0.133:5544/new";
        videoView = (VideoView)this.findViewById(R.id.video_view);
//        videoView.setMediaController(new MediaController(this));
        final MediaController controll = new MediaController(MainActivity.this);
        videoView.setVideoPath("rtsp://192.168.0.133:5544/new");
        videoView.setMediaController(controll);
        videoView.requestFocus();
        videoView.start();
        controll.show();


    }

//    private void playRtspStream(String rtspUrl) {
//        videoView.setVideoURI(Uri.parse(rtspUrl));
//        videoView.requestFocus();
//        videoView.setOnPreparedListener(this);
//        videoView.setOnCompletionListener(this);
//        videoView.setOnErrorListener(this);
////        videoview.setOnInfoListener(this);
//    }

//
//    @Override
//    public void onPrepared(MediaPlayer mp) {
//        videoView.start();
//    }
//
//    @Override
//    public void onCompletion(MediaPlayer mp) {
//
//    }
//
//    @Override
//    public boolean onError(MediaPlayer mp, int what, int extra) {
//        return false;
//    }
}
