package estudo.com.minhaideia.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import estudo.com.minhaideia.R;
import estudo.com.minhaideia.controller.ClienteController;
import estudo.com.minhaideia.core.AppUtil;
import estudo.com.minhaideia.model.Cliente;

public class SplashActivity extends AppCompatActivity {


    int tempoDeEspera = 1000 * 5;

    Cliente objCliente;
    ClienteController clienteController;
    TextView textAppVersion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        textAppVersion=findViewById(R.id.textAppVersion);
        textAppVersion.setText(AppUtil.versaoDoAplicativo());

        clienteController = new ClienteController();

        trocarTela();
    }
    private void trocarTela() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                objCliente = new Cliente("Tiago","text@text.com","999565623",30,true);
                Intent trocarDeTela = new Intent(SplashActivity.this, MainActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("nome",objCliente.getNome());
                trocarDeTela.putExtras(bundle);
                startActivity(trocarDeTela);
                finish();
            }
        },tempoDeEspera);


    }
}
