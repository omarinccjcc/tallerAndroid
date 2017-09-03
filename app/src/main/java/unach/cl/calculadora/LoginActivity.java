package unach.cl.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    public EditText txtLogin;
    public EditText txtPassword;
    public Button btbIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtLogin = (EditText)findViewById(R.id.txtLogin);
        txtPassword = (EditText)findViewById(R.id.txtPassword);
        btbIngresar = (Button) findViewById(R.id.btbIngresar);
        btbIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("txtLogin>>>>> ",txtLogin.getText().toString());
                Log.i("txtPassword>> ",txtPassword.getText().toString());
                if("admin".equals(txtLogin.getText().toString()) && "12345".equals(txtPassword.getText().toString()) ){
                    goSuccess();
                }else{
                    Toast.makeText(LoginActivity.this, "El usuario o clave incorrecta  ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void goSuccess(){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
