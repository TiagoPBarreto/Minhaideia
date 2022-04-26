package estudo.com.minhaideia.view;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import estudo.com.minhaideia.R;
import estudo.com.minhaideia.core.AppUtil;
import estudo.com.minhaideia.model.Cliente;

public class MainActivity extends AppCompatActivity {


    TextView txtNome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Bundle bundle = getIntent().getExtras();
        Log.i(AppUtil.TAG,"onCreate: nome..." +bundle.getString("nome"));

        txtNome = findViewById(R.id.textView);
        txtNome.setText("Bem vindo" +bundle.getString("nome"));
    }
}