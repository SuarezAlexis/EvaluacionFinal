package mx.unam.dgtic.asesorias.evaluacionfinal;

import androidx.appcompat.app.AppCompatActivity;
import mx.unam.dgtic.asesorias.modelo.Usuario;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        for(int i = 0; i < 10; i++) {
            Usuario u = new Usuario();
            u.setUsername("Usuario" + i);
            u.setNombre("Usuario");
            u.setApellidos("Número " + i);
            u.setEmail("usuario" + i + "@mail.com");
            u.setPassword("123");
            u.setHabilitado(Math.random() < 0.8);
            usuarios.add(u);
        }

        UsuariosAdapter adapter = new UsuariosAdapter(this,usuarios);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("Usuario",parent.getItemIdAtPosition(position));
                intent.putExtras(intent);
                startActivity(intent);
            }
        });
    }
}

