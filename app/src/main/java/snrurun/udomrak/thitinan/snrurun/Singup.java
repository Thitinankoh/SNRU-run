package snrurun.udomrak.thitinan.snrurun;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Singup extends AppCompatActivity {

    //EXPLICIT
    private EditText nameEditText,userEditText, passwordEditText;
    private RadioGroup radioGroup;
    private RadioButton choice1RadioButton,choice2RadioButton,choice3RadioButton,choice4RadioButton, choice5RadioButton;
    private String nameString,userString, passwordString,AvataString;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);

        binWindger();

    }

    private  void  binWindger() {
        nameEditText = (EditText) findViewById(R.id.editText);
        userEditText = (EditText) findViewById(R.id.editText2);
        passwordEditText =(EditText) findViewById(R.id.editText3);
        radioGroup = (RadioGroup) findViewById(R.id.ragAvata);
        choice1RadioButton = (RadioButton) findViewById(R.id.radioButton);
        choice2RadioButton = (RadioButton) findViewById(R.id.radioButton2);
        choice3RadioButton = (RadioButton) findViewById(R.id.radioButton4);
        choice4RadioButton = (RadioButton) findViewById(R.id.radioButton5);
        choice5RadioButton = (RadioButton) findViewById(R.id.radioButton6);

    }
    public void clickSingUpSing(View view) {

        //GET value From Edittext
        nameString = nameEditText.getText().toString().trim();
        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();



    }
}
