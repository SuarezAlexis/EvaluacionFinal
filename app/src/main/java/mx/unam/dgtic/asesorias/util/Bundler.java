package mx.unam.dgtic.asesorias.util;

import android.os.Bundle;

import mx.unam.dgtic.asesorias.modelo.Usuario;

public class Bundler {
    public static void putUsuario(Bundle bundle, Usuario u) {
        bundle.putString("username", u.getUsername());
        bundle.putString("apellidos", u.getApellidos());
        bundle.putString("nombre", u.getNombre());
        bundle.putString("password", u.getPassword());
        bundle.putString("email", u.getEmail());
        bundle.putBoolean("habilitado", u.isHabilitado());
    }

    public static Usuario getUsuario(Bundle bundle) {
        Usuario u = new Usuario();
        u.setNombre(bundle.getString("nombre"));
        u.setApellidos(bundle.getString("apellidos"));
        u.setUsername(bundle.getString("username"));
        u.setPassword(bundle.getString("password"));
        u.setEmail(bundle.getString("email"));
        u.setHabilitado(bundle.getBoolean("habilitado"));
        return u;
    }
}
