package edu.csumb.zhaojia.loginandlanding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    private Button Login;

    Credentials mCredentials = new Credentials("din_djarin", "baby_yoda_ftw");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        Login = (Button)findViewById(R.id.btnLogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Username.getText().toString(), Password.getText().toString());
            }
        });

    }

    private void validate(String userName, String userPassword){
        if(!userName.equals(mCredentials.getUsername())){
            Username.setError("Incorrect username");
        }else if(!userPassword.equals(mCredentials.getPassword())){
            Password.setError("Incorrect password");
        }else{
            Intent intent = new Intent(MainActivity.this, Welcome.class);
            startActivity(intent);
        }
    }

    public static boolean checkUsername(String username){
        return username.equals("din_djarin");
    }

    public static boolean checkPassword(String passwrod){
        return passwrod.equals("baby_yoda_ftw");
    }
}
