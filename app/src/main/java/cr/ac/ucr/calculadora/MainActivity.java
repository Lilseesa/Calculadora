package cr.ac.ucr.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCero, btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho,
            btnNueve, btnPunto, btnIgual, btnSuma, btnResta, btnMulti, btnDiv, btnLimpiar;

    EditText etOperation, etConcatenar;

    double numero1, numero2, resultado;

    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLimpiar = (Button)findViewById(R.id.btn_clear);
        btnCero = (Button)findViewById(R.id.btn0);
        btnUno = (Button)findViewById(R.id.btn1);
        btnDos = (Button)findViewById(R.id.btn2);
        btnTres = (Button)findViewById(R.id.btn3);
        btnCuatro = (Button)findViewById(R.id.btn4);
        btnCinco = (Button)findViewById(R.id.btn5);
        btnSeis = (Button)findViewById(R.id.btn6);
        btnSiete = (Button)findViewById(R.id.btn7);
        btnOcho = (Button)findViewById(R.id.btn8);
        btnNueve = (Button)findViewById(R.id.btn9);
        btnPunto = (Button)findViewById(R.id.btn_coma);
        btnIgual = (Button)findViewById(R.id.btn_total);
        btnSuma = (Button)findViewById(R.id.btn_plus);
        btnResta = (Button)findViewById(R.id.btn_minus);
        btnMulti = (Button)findViewById(R.id.btn_multiply);
        btnDiv = (Button)findViewById(R.id.btn_divide);
        etOperation = (EditText)findViewById(R.id.et_operation);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.btn0:
                etConcatenar = (EditText)findViewById(R.id.et_operation);
                etOperation.setText(etConcatenar.getText().toString() + "0");
                break;

            case R.id.btn1:
                etConcatenar = (EditText)findViewById(R.id.et_operation);
                etOperation.setText(etConcatenar.getText().toString() + "1");
                break;

            case R.id.btn2:
                etConcatenar = (EditText)findViewById(R.id.et_operation);
                etOperation.setText(etConcatenar.getText().toString() + "2");
                break;

            case R.id.btn3:
                etConcatenar = (EditText)findViewById(R.id.et_operation);
                etOperation.setText(etConcatenar.getText().toString() + "3");
                break;

            case R.id.btn4:
                etConcatenar = (EditText)findViewById(R.id.et_operation);
                etOperation.setText(etConcatenar.getText().toString() + "4");
                break;

            case R.id.btn5:
                etConcatenar = (EditText)findViewById(R.id.et_operation);
                etOperation.setText(etConcatenar.getText().toString() + "5");
                break;

            case R.id.btn6:
                etConcatenar = (EditText)findViewById(R.id.et_operation);
                etOperation.setText(etConcatenar.getText().toString() + "6");
                break;

            case R.id.btn7:
                etConcatenar = (EditText)findViewById(R.id.et_operation);
                etOperation.setText(etConcatenar.getText().toString() + "7");
                break;

            case R.id.btn8:
                etConcatenar = (EditText)findViewById(R.id.et_operation);
                etOperation.setText(etConcatenar.getText().toString() + "8");
                break;

            case R.id.btn9:
                etConcatenar = (EditText)findViewById(R.id.et_operation);
                etOperation.setText(etConcatenar.getText().toString() + "9");
                break;

            case R.id.btn_divide:
                operador = "/";
                etConcatenar = (EditText)findViewById(R.id.et_operation);
                numero1 = Double.parseDouble(etConcatenar.getText().toString());
                etOperation.setText("");
                break;

            case R.id.btn_minus:
                operador = "-";
                etConcatenar = (EditText)findViewById(R.id.et_operation);
                numero1 = Double.parseDouble(etConcatenar.getText().toString());
                etOperation.setText("");
                break;

            case R.id.btn_multiply:
                operador = "*";
                etConcatenar = (EditText)findViewById(R.id.et_operation);
                numero1 = Double.parseDouble(etConcatenar.getText().toString());
                etOperation.setText("");
                break;

            case R.id.btn_plus:
                operador = "+";
                etConcatenar = (EditText)findViewById(R.id.et_operation);
                numero1 = Double.parseDouble(etConcatenar.getText().toString());
                etOperation.setText("");
                break;

            case R.id.btn_total:
                etConcatenar = (EditText)findViewById(R.id.et_operation);
                numero2 = Double.parseDouble(etConcatenar.getText().toString());
                if(operador.equals("+")){
                    etOperation.setText("");
                    resultado = numero1 + numero2;
                }
                if(operador.equals("-")){
                    etOperation.setText("");
                    resultado = numero1 - numero2;
                }
                if(operador.equals("*")){
                    etOperation.setText("");
                    resultado = numero1 * numero2;
                }
                if(operador.equals("/")){
                    etOperation.setText("");
                    if(numero2 != 0){
                        resultado = numero1 / numero2;
                    }else {
                        etOperation.setText("Infinito");
                    }
                }
                etOperation.setText(String.valueOf(resultado));
                break;

            case R.id.btn_clear:
                numero1 = 0;
                numero2 = 0;
                etOperation.setText("");
                break;
        }
    }
}