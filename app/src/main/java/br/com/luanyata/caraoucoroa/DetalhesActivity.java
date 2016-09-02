package br.com.luanyata.caraoucoroa;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class DetalhesActivity extends AppCompatActivity {
    private ImageView resultadoMoeda;
    private ImageView btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);


        resultadoMoeda = (ImageView) findViewById(R.id.idMoeda);
        btnVoltar = (ImageView) findViewById(R.id.idBtnVoltar);


        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String opcao = bundle.getString("resultado");

            if (opcao.equals("Cara"))
                resultadoMoeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            else
                resultadoMoeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
        }

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
