package com.salgaral.app.miprimeraapp;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity{

   /* private final static String TAG = "Debug"; */

    public EditText edit_name;
    public TextView textView;

    /*Button boton = (Button) findViewById(R.id.button); //Definimos el boton
    //boton.setOnClickListener(this); //Le asignamos el evento onclick
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* Button btn_submit = (Button)findViewById(R.id.btn_submit);
        /*btn_submit.setOnClickListener(new View.OnClickListener() {
        });*/
    }


    public void onClick(View view) {
        edit_name = (EditText) findViewById(R.id.edit_name);
        textView = (TextView) findViewById(R.id.textView);

        String s = edit_name.getText().toString();
        textView.setText("Hola " + s);

        /*Log.e(TAG, "Hizo Click");
        Toast.makeText(getApplicationContext(), "Hizo Click", Toast.LENGTH_SHORT).show();*/

    }


    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    /*public void onClick(View control_pulsado) {
        TextView campo_texto = (TextView)findViewById(R.id.textView); //Definimos el campo de texto
        campo_texto.setText("Hola mundo"); //Cambiamos su contenido

    }*/
}
