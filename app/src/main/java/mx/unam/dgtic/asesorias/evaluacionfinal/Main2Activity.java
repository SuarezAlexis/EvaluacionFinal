package mx.unam.dgtic.asesorias.evaluacionfinal;

import androidx.appcompat.app.AppCompatActivity;
import mx.unam.dgtic.asesorias.modelo.Usuario;
import mx.unam.dgtic.asesorias.util.Bundler;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView usernameTextView;
    TextView nombreTextView;
    TextView apellidosTextView;
    TextView emailTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        usernameTextView = findViewById(R.id.usernameTextView);
        nombreTextView = findViewById(R.id.nombreTextView);
        apellidosTextView = findViewById(R.id.apellidosTextView);
        emailTextView = findViewById(R.id.emailTextView);

        Bundle bundle = getIntent().getExtras();
        Usuario u = Bundler.getUsuario(bundle);
        Toast.makeText(this,"Usuario seleccionado: " + u.getUsername(), Toast.LENGTH_SHORT).show();
        Log.d("DEBUG", "Usuario seleccionado: " + u);

        usernameTextView.setText(u.getUsername());
        nombreTextView.setText(u.getNombre());
        apellidosTextView.setText(u.getApellidos());
        emailTextView.setText(u.getEmail());

    }
}
