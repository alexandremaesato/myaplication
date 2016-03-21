package clientefeedback.myapplication;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.view.View;

//import android.support.v7.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class MainActivity extends Activity {
    Button botaoCadastrar;
    Button botaoLogin;
    Button btnLoginTeste2;
    Context c;
    WebService ws;
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botaoCadastrar = (Button) findViewById(R.id.button);
        botaoLogin = (Button) findViewById(R.id.buttonLogin);
        btnLoginTeste2 = (Button) findViewById(R.id.btnLoginTeste2);
        c = this;

        Context context = this;
        sharedPreferences = getSharedPreferences(getString(R.string.SharedPreferences), Context.MODE_PRIVATE);

        botaoCadastrar.setOnClickListener(new View.OnClickListener() {
            Intent intent;

            @Override
            public void onClick(View v) {
                intent = new Intent(c, CadastrarActivity.class);
                startActivity(intent);
            }
        });

        botaoLogin.setOnClickListener(new View.OnClickListener() {
            Intent intent;

            @Override
            public void onClick(View v) {
                intent = new Intent(c, LoginActivity.class);
                startActivity(intent);
            }
        });

        btnLoginTeste2.setOnClickListener(new View.OnClickListener() {
            Intent intent;

            @Override
            public void onClick(View v) {
                //intent = new Intent(c,LogindemoActivity.class);
                //startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}