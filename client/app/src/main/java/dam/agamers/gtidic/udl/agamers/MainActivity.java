package dam.agamers.gtidic.udl.agamers;


import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        run();
    }
    public void run() {
        Intent intent = new Intent(getApplicationContext(), Inici_de_sessio.class);
        startActivity(intent);
        finish();
    }
}

/*

}
 */