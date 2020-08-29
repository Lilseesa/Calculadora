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

    Boolean operacion = false;
    Boolean num = false;
    Boolean prueba = false;

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
                if (prueba==true){
                    etOperation.setText("");
                    prueba = false;
                }
                num = true;
                etConcatenar = (EditText)findViewById(R.id.et_operation);
                etOperation.setText(etConcatenar.getText().toString() + "0");
                break;

            case R.id.btn1:
                if (prueba==true){
                    etOperation.setText("");
                    prueba = false;
                }
                num = true;
                etConcatenar = (EditText)findViewById(R.id.et_operation);
                etOperation.setText(etConcatenar.getText().toString() + "1");
                break;

            case R.id.btn2:
                if (prueba==true){
                    etOperation.setText("");
                    prueba = false;
                }
                num = true;
                etConcatenar = (EditText)findViewById(R.id.et_operation);
                etOperation.setText(etConcatenar.getText().toString() + "2");
                break;

            case R.id.btn3:
                if (prueba==true){
                    etOperation.setText("");
                    prueba = false;
                }
                num = true;
                etConcatenar = (EditText)findViewById(R.id.et_operation);
                etOperation.setText(etConcatenar.getText().toString() + "3");
                break;

            case R.id.btn4:
                if (prueba==true){
                    etOperation.setText("");
                    prueba = false;
                }
                num = true;
                etConcatenar = (EditText)findViewById(R.id.et_operation);
                etOperation.setText(etConcatenar.getText().toString() + "4");
                break;

            case R.id.btn5:
                if (prueba==true){
                    etOperation.setText("");
                    prueba = false;
                }
                num = true;
                etConcatenar = (EditText)findViewById(R.id.et_operation);
                etOperation.setText(etConcatenar.getText().toString() + "5");
                break;

            case R.id.btn6:
                if (prueba==true){
                    etOperation.setText("");
                    prueba = false;
                }
                num = true;
                etConcatenar = (EditText)findViewById(R.id.et_operation);
                etOperation.setText(etConcatenar.getText().toString() + "6");
                break;

            case R.id.btn7:
                if (prueba==true){
                    etOperation.setText("");
                    prueba = false;
                }
                num = true;
                etConcatenar = (EditText)findViewById(R.id.et_operation);
                etOperation.setText(etConcatenar.getText().toString() + "7");
                break;

            case R.id.btn8:
                if (prueba==true){
                    etOperation.setText("");
                    prueba = false;
                }
                num = true;
                etConcatenar = (EditText)findViewById(R.id.et_operation);
                etOperation.setText(etConcatenar.getText().toString() + "8");
                break;

            case R.id.btn9:
                if (prueba==true){
                    etOperation.setText("");
                    prueba = false;
                }
                num = true;
                etConcatenar = (EditText)findViewById(R.id.et_operation);
                etOperation.setText(etConcatenar.getText().toString() + "9");
                break;

            case R.id.btn_divide:
                if(num!=true){
                    etOperation.setText("Que le pasa subnormal?");
                } else{
                    if(operacion!=true){
                        operacion = true;
                        operador = "/";
                        etConcatenar = (EditText)findViewById(R.id.et_operation);
                        numero1 = Double.parseDouble(etConcatenar.getText().toString());
                        etOperation.setText("");
                    } else{
                        etOperation.setText("tranquilo rasta");
                        prueba = true;
                    }
                }
                break;

            case R.id.btn_minus:
                if(num!=true){
                    etOperation.setText("Que le pasa subnormal?");
                } else{
                    if(operacion!=true) {
                        operacion = true;
                        operador = "-";
                        etConcatenar = (EditText) findViewById(R.id.et_operation);
                        numero1 = Double.parseDouble(etConcatenar.getText().toString());
                        etOperation.setText("");
                    } else{
                        etOperation.setText("tranquilo rasta");
                        prueba = true;
                    }
                }
                break;

            case R.id.btn_multiply:
                if(num!=true){
                    etOperation.setText("Que le pasa subnormal?");
                } else{
                    if(operacion!=true) {
                        operacion = true;
                        operador = "*";
                        etConcatenar = (EditText) findViewById(R.id.et_operation);
                        numero1 = Double.parseDouble(etConcatenar.getText().toString());
                        etOperation.setText("");
                    } else{
                        etOperation.setText("tranquilo rasta");
                        prueba = true;
                    }
                }
                break;

            case R.id.btn_plus:
                if(num!=true){
                    etOperation.setText("Que le pasa subnormal?");
                } else{
                    if(operacion!=true) {
                        operacion = true;
                        operador = "+";
                        etConcatenar = (EditText) findViewById(R.id.et_operation);
                        numero1 = Double.parseDouble(etConcatenar.getText().toString());
                        etOperation.setText("");
                    } else{
                        etOperation.setText("tranquilo rasta");
                        prueba = true;
                    }
                }
                break;

            case R.id.btn_total:
                if(num!=true){
                    etOperation.setText("Que pendejada está haciendo?");
                }else{
                    operacion = false;
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
                    num = true;
                    operacion = false;
                }
                break;

            case R.id.btn_clear:
                num = false;
                numero1 = -1;
                numero2 = -1;
                etOperation.setText("");
                operacion = false;
                break;
        }
    }
}