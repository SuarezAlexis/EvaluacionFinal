package mx.unam.dgtic.asesorias.evaluacionfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import mx.unam.dgtic.asesorias.modelo.Usuario;

public class UsuariosAdapter extends BaseAdapter {
    private static LayoutInflater inflater = null;
    private Context context;
    private ArrayList<Usuario> usuarios;

    public UsuariosAdapter(Context context, ArrayList<Usuario> usuarios) {
        this.context = context;
        this.usuarios = usuarios;
        this.inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return usuarios.size();
    }

    @Override
    public Object getItem(int position) {
        return usuarios.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final View view = inflater.inflate(R.layout.list_item,null);
        TextView usernameTextView = view.findViewById(R.id.usernameTextView);
        TextView nombreTextView = view.findViewById(R.id.nombreTextView);
        TextView emailTextView = view.findViewById(R.id.emailTextView);
        ImageView habilitadoImageView = view.findViewById(R.id.habilitadoImageView);
        ImageView avatarImageView = view.findViewById(R.id.avatarImageView);

        Usuario u = usuarios.get(position);
        usernameTextView.setText(u.getUsername());
        nombreTextView.setText(u.getNombre() + " " + u.getApellidos());
        emailTextView.setText(u.getEmail());
        habilitadoImageView.setImageResource(u.isHabilitado()? android.R.drawable.presence_online : android.R.drawable.presence_invisible);

        return null;
    }
}
