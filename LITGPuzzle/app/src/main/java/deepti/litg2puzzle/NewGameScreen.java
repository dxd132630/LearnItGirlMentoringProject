package deepti.litg2puzzle;

/**
 * Created by deepti on 3/4/16.
 */

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class NewGameScreen extends Activity {

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageView image = (ImageView) findViewById(R.id.imageView2);
        setContentView(R.layout.new_game_screen);
    }

}
