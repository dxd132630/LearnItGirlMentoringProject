package deepti.litg2puzzle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class WelcomeScreen extends Activity {

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        ImageView image = (ImageView) findViewById(R.id.imageView1);

        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, NewGameScreen.class);
                startActivity(intent);

            }

        });

    }

}