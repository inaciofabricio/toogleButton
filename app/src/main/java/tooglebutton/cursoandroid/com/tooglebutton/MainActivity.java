package tooglebutton.cursoandroid.com.tooglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton botao;
    private TextView textoExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (ToggleButton) findViewById(R.id.toggleButtonId);
        textoExibicao = (TextView) findViewById(R.id.texttoExibicaoId);

        botao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                textoExibicao.setText("");
                if(isChecked){
                    textoExibicao.setText("Mostrar");
                }
            }
        });

    }
}
