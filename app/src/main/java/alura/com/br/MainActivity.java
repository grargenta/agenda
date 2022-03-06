package alura.com.br;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Toast.makeText(this, "Guilherme", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);
        List<String> alunos = new ArrayList<>(Arrays.asList("Alex","Fran","Jose"));
        TextView primeiroAluno = findViewById(R.id.textView7);
        TextView segundoAluno = findViewById(R.id.textView8);
        primeiroAluno.setText(alunos.get(0));
        segundoAluno.setText((alunos.get(1)));
    }
}
