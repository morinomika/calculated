package com.example.owner.caluculater;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {
    int number1;
    int number2;
    int ope;
    int answer;

    TextView num1Text;
    TextView num2Text;
    TextView opeText;
    TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //変数の初期化
        number1 = 0;
        number2 = 0;
        ope = 0;
        answer = 0;
        //ラベル関連付け
        num1Text = (TextView) findViewById(R.id.num1);
        num2Text = (TextView) findViewById(R.id.num2);
        opeText = (TextView) findViewById(R.id.ope);
        answerText = (TextView) findViewById(R.id.answer);
        //ラベル初期化
        num1Text.setText("0");
        num2Text.setText("");
        opeText.setText("");
        answerText.setText("");

    }

        //ボタンが押された時
        public void btplus(View v) {
            ope = 1;
            opeText.setText("+");
            num2Text.setText("");
        }

        public void btequal(View v) {
            if (ope == 1) {
                answer = number1 + number2;
                answerText.setText("=" + answer);
                ope = -1;

            }

        }

        public void bt1(View v) {
            //元々表示されていた数字を10倍し、入力された数字を新しく追加する
            if (ope == 0) {
                number1 = number1 * 10 + 1;
                num1Text.setText(number1 + "");
            } else if (ope > 0) {
                number2 = number2 * 10 + 1;
                num2Text.setText(number2 + "");
            }

        }

    public void bt2(View v) {
        //元々表示されていた数字を10倍し、入力された数字を新しく追加する
        if (ope == 0) {
            number1 = number1 * 10 + 2;
            num1Text.setText(number1 + "");
        } else if (ope > 0) {
            number2 = number2 * 10 + 2;
            num2Text.setText(number2 + "");
        }

    }

    public void bt3(View v) {
        //元々表示されていた数字を10倍し、入力された数字を新しく追加する
        if (ope == 0) {
            number1 = number1 * 10 + 3;
            num1Text.setText(number1 + "");
        } else if (ope > 0) {
            number2 = number2 * 10 + 3;
            num2Text.setText(number2 + "");
        }

    }

    public void bt4(View v) {
        //元々表示されていた数字を10倍し、入力された数字を新しく追加する
        if (ope == 0) {
            number1 = number1 * 10 + 4;
            num1Text.setText(number1 + "");
        } else if (ope > 0) {
            number2 = number2 * 10 + 4;
            num2Text.setText(number2 + "");
        }

    }

    public void bt5(View v) {
        //元々表示されていた数字を10倍し、入力された数字を新しく追加する
        if (ope == 0) {
            number1 = number1 * 10 + 5;
            num1Text.setText(number1 + "");
        } else if (ope > 0) {
            number2 = number2 * 10 + 5;
            num2Text.setText(number2 + "");
        }

    }

    public void bt6(View v) {
        //元々表示されていた数字を10倍し、入力された数字を新しく追加する
        if (ope == 0) {
            number1 = number1 * 10 + 6;
            num1Text.setText(number1 + "");
        } else if (ope > 0) {
            number2 = number2 * 10 + 6;
            num2Text.setText(number2 + "");
        }

    }

    public void bt7(View v) {
        //元々表示されていた数字を10倍し、入力された数字を新しく追加する
        if (ope == 0) {
            number1 = number1 * 10 + 7;
            num1Text.setText(number1 + "");
        } else if (ope > 0) {
            number2 = number2 * 10 + 7;
            num2Text.setText(number2 + "");
        }

    }

    public void bt8(View v) {
        //元々表示されていた数字を10倍し、入力された数字を新しく追加する
        if (ope == 0) {
            number1 = number1 * 10 + 8;
            num1Text.setText(number1 + "");
        } else if (ope > 0) {
            number2 = number2 * 10 + 8;
            num2Text.setText(number2 + "");
        }

    }

    public void bt9(View v) {
        //元々表示されていた数字を10倍し、入力された数字を新しく追加する
        if (ope == 0) {
            number1 = number1 * 10 + 9;
            num1Text.setText(number1 + "");
        } else if (ope > 0) {
            number2 = number2 * 10 + 9;
            num2Text.setText(number2 + "");
        }

    }

    public void bt0(View v) {
        //元々表示されていた数字を10倍し、入力された数字を新しく追加する
        if (ope == 0) {
            number1 = number1 * 10 + 0;
            num1Text.setText(number1 + "");
        } else if (ope > 0) {
            number2 = number2 * 10 + 0;
            num2Text.setText(number2 + "");
        }

    }



}

