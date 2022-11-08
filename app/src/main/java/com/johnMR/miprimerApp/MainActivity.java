package com.johnMR.miprimerApp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTexName2;
    private EditText editTextPassword;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }


    private void initView() {
        editTexName2 = findViewById(R.id.editTexName2);
        editTextPassword = findViewById(R.id.editTextPassword);
        button = findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        login();
                        // Toast toast;
                        //Context Contex;
                        // Toast.makeText(  MainActivity.this,  "Alguien medio click :0", Toast.LENGTH_LONG).show();


                    }
                }
        );


    }

    private void login() {
        String username = editTexName2.getText().toString();
        String password = editTextPassword.getText().toString();

        if(username.contentEquals("john") && password.contentEquals("12345")){

            editTextPassword.setError(null);
            editTexName2.setError(null);
            Toast.makeText(this, "Bienvenido a Caminos y trochas", Toast.LENGTH_LONG).show();
            goToCyTActivity();

        }
        else {
            editTexName2.setError("Tu usuario no existe");
            editTextPassword.setError("Esta no es tu contraseña");
        }

    }

    private void goToCyTActivity() {
        // Cambio de ventana - creamos la transaccion
        Intent transaction = new Intent(this, CyTActivity.class);
        // ejecuta
        startActivity(transaction);

    }
}