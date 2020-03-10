package blooddonor.mosulclass.imran.blooddonor;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

import com.bloodmosul.blooddonor.R;

/**
 * Created by IMRAN on 12/19/2017.
 */

public class Intro extends AppCompatActivity {
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intr);

            handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {

                    Intent intent = new Intent(Intro.this, Login.class);
                    startActivity(intent);

                    finish();
                }
            }, 2000);
    }
}
