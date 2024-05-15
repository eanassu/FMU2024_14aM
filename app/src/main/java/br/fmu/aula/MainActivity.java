package br.fmu.aula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumber;
    private EditText editTextNummber2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNummber2 = findViewById(R.id.editTextNumber2);
    }

    public void somar(View view) {
        int x = Integer.parseInt(editTextNumber.getText().toString());
        int y = Integer.parseInt(editTextNummber2.getText().toString());
        int soma = x + y;
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("soma", soma);
        startActivity(intent);
    }

    public void abrirGorjeta( View view ) {
        Intent intent = new Intent(this, GorjetaActivity.class);
        startActivity(intent);
    }

    public void abrirDatabase( View view ) {
        Intent intent = new Intent(this, DatabaseActivity.class);
        startActivity(intent);
    }

    public void abrirDesenho( View viee ) {
        Intent intent = new Intent(this, DesenhoActivity.class);
        startActivity(intent);
    }
}