package es.androidesverdesfritos.flavors;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import recogerdatos.Identificadores;

public class MainActivity extends Activity {
	private static RelativeLayout contenedor;
	private static TextView texto;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		contenedor = (RelativeLayout) findViewById(R.id.contenedor_donde_estoy);
		texto = (TextView) findViewById(R.id.donde_estoy);

		contenedor.setBackgroundColor(Identificadores.getColor());
		texto.setText(getApplicationContext().getResources().getString(R.string.texto_flavor_color));

	}
}
