package unach.cl.calculadora;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView txtPantalla;
    double primeraVariable;
    double segundaVariable;
    String operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txtPantalla = (TextView)findViewById(R.id.txtPantalla);
        operacion = "";
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void borrar(View v){
        operacion = "";
        primeraVariable = 0;
        segundaVariable = 0;
        txtPantalla.setText( "");
    }
    public void suma(View v){
        primeraVariable = Double.parseDouble(txtPantalla.getText().toString());
        txtPantalla.setText("");
        operacion = "+";
    }
    public void resta(View v){
        primeraVariable = Double.parseDouble(txtPantalla.getText().toString());
        txtPantalla.setText("");
        operacion = "-";
    }
    public void division(View v){
        primeraVariable = Double.parseDouble(txtPantalla.getText().toString());
        txtPantalla.setText("");
        operacion = "/";
    }
    public void multiplicacion(View v){
        primeraVariable = Double.parseDouble(txtPantalla.getText().toString());
        txtPantalla.setText("");
        operacion = "*";
    }
    public void igual(View v){
        double resultado = 0;
        segundaVariable = Double.parseDouble(txtPantalla.getText().toString());
        if (operacion.equals("+")){
            resultado = primeraVariable + segundaVariable;
        }else if (operacion.equals("-")){
            resultado = primeraVariable - segundaVariable;
        }else if (operacion.equals("/")){
            resultado = primeraVariable / segundaVariable;
        }else if (operacion.equals("*")){
            resultado = primeraVariable * segundaVariable;
        }
        txtPantalla.setText(resultado+"");
    }

    public void numero9(View v){
        txtPantalla.setText( txtPantalla.getText().toString()+"9" );
    }
    public void numero8(View v){
        txtPantalla.setText( txtPantalla.getText().toString()+"8" );
    }
    public void numero7(View v){
        txtPantalla.setText( txtPantalla.getText().toString()+"7" );
    }
    public void numero6(View v){
        txtPantalla.setText( txtPantalla.getText().toString()+"6" );
    }
    public void numero5(View v){
        txtPantalla.setText( txtPantalla.getText().toString()+"5" );
    }
    public void numero4(View v){
        txtPantalla.setText( txtPantalla.getText().toString()+"4" );
    }
    public void numero3(View v){
        txtPantalla.setText( txtPantalla.getText().toString()+"3" );
    }
    public void numero2(View v){
        txtPantalla.setText( txtPantalla.getText().toString()+"2" );
    }
    public void numero1(View v){
        txtPantalla.setText( txtPantalla.getText().toString()+"1" );
    }
    public void numero0(View v){
        txtPantalla.setText( txtPantalla.getText().toString()+"0" );
    }

}
