package com.example.sample.java_codes;

import com.example.sample.R;
import com.example.sample.code;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import org.joda.time.Period;
import org.joda.time.PeriodType;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Age_Calculator extends AppCompatActivity {
    Button b1, b2, b3;
    TextView t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_calculator);
        b1 = findViewById(R.id.bd);
        b2 = findViewById(R.id.td);
        b3 = findViewById(R.id.age);
        t1 = findViewById(R.id.bdate);
        t2 = findViewById(R.id.ans);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH);
        int date = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        String today = sdf.format(Calendar.getInstance().getTime());
        b2.setText("Today's Date:" + today);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog dp = new DatePickerDialog(Age_Calculator.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        int m = i1 + 1;
                        String datee = i2 + "/" + m + "/" + i;
                        t1.setText(datee);

                    }
                }, year, month, date);
                dp.show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Date d1 = sdf.parse(today);
                    Date d2 = sdf.parse(t1.getText().toString());
                    long d11 = d1.getTime();
                    long d22 = d2.getTime();
                    if (d11 >= d22) {
                        org.joda.time.Period p = new Period(d11, d22, PeriodType.yearMonthDay());
                        int year = p.getYears();
                        int month = p.getMonths();
                        int day = p.getDays();
                        t2.setText(year + " Years " + month + " months" + day + "days");

                    } else {
                        t2.setText("Select valid BirthDate");
                    }
                } catch (Exception e) {
                    e.printStackTrace();

                }

            }
        });
    }

    public void viewCode(View v) {
        String tag = v.getTag().toString();

        switch (tag) {
            case "java":
                Intent i1 = new Intent(Age_Calculator.this, code.class);
                i1.putExtra("code", jcode);
                startActivity(i1);
                break;
            case "xml":
                Intent i2 = new Intent(Age_Calculator.this, code.class);
                i2.putExtra("code", xcode);
                startActivity(i2);
                break;
        }
    }
    String xcode=" <LinearLayout\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"match_parent\"\n" +
            "            android:layout_marginTop=\"30dp\"\n" +
            "            android:paddingTop=\"20dp\"\n" +
            "            android:orientation=\"vertical\">\n" +
            "\n" +
            "            <Button\n" +
            "                android:id=\"@+id/bd\"\n" +
            "                android:layout_width=\"300dp\"\n" +
            "                android:layout_height=\"40dp\"\n" +
            "                android:layout_marginLeft=\"20dp\"\n" +
            "                android:layout_marginTop=\"0dp\"\n" +
            "                android:layout_marginRight=\"10dp\"\n" +
            "                android:layout_marginBottom=\"10dp\"\n" +
            "                android:background=\"@drawable/button2\"\n" +
            "                android:elevation=\"10dp\"\n" +
            "                android:fontFamily=\"monospace\"\n" +
            "                android:text=\"Select BirthDate\"\n" +
            "                android:textColor=\"@color/black\" />\n" +
            "\n" +
            "            <TextView\n" +
            "                android:id=\"@+id/bdate\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:layout_marginLeft=\"10dp\"\n" +
            "                android:layout_marginTop=\"0dp\"\n" +
            "                android:layout_marginRight=\"10dp\"\n" +
            "                android:layout_marginBottom=\"10dp\"\n" +
            "                android:fontFamily=\"monospace\"\n" +
            "                android:padding=\"15dp\"\n" +
            "                android:shadowColor=\"@android:color/transparent\"\n" +
            "                android:text=\"\"\n" +
            "                android:textAlignment=\"center\"\n" +
            "                android:textColor=\"#000000\"\n" +
            "                android:textSize=\"20sp\" />\n" +
            "\n" +
            "            <Button\n" +
            "                android:id=\"@+id/td\"\n" +
            "                android:layout_width=\"300dp\"\n" +
            "                android:layout_height=\"40dp\"\n" +
            "                android:layout_marginLeft=\"20dp\"\n" +
            "                android:layout_marginTop=\"0dp\"\n" +
            "                android:layout_marginRight=\"10dp\"\n" +
            "                android:layout_marginBottom=\"10dp\"\n" +
            "\n" +
            "                android:background=\"@drawable/button2\"\n" +
            "                android:elevation=\"10dp\"\n" +
            "                android:fontFamily=\"monospace\"\n" +
            "                android:text=\"Todays' Date\"\n" +
            "                android:textColor=\"@color/black\" />\n" +
            "\n" +
            "            <Button\n" +
            "                android:id=\"@+id/age\"\n" +
            "                android:layout_width=\"300dp\"\n" +
            "                android:layout_height=\"40dp\"\n" +
            "                android:layout_marginLeft=\"20dp\"\n" +
            "                android:layout_marginTop=\"10dp\"\n" +
            "                android:layout_marginRight=\"10dp\"\n" +
            "                android:layout_marginBottom=\"10dp\"\n" +
            "                android:background=\"@drawable/button\"\n" +
            "                android:shadowColor=\"@android:color/transparent\"\n" +
            "                android:text=\"Calculate Age\"\n" +
            "                android:textColor=\"@color/white\" />\n" +
            "\n" +
            "            <TextView\n" +
            "                android:id=\"@+id/ans\"\n" +
            "                android:textAlignment=\"center\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:layout_marginLeft=\"20dp\"\n" +
            "                android:layout_marginTop=\"0dp\"\n" +
            "                android:layout_marginRight=\"10dp\"\n" +
            "                android:layout_marginBottom=\"10dp\"\n" +
            "                android:padding=\"15dp\"\n" +
            "                android:shadowColor=\"@android:color/transparent\"\n" +
            "                android:text=\"\"\n" +
            "                android:textColor=\"#000000\"\n" +
            "                android:textSize=\"17sp\"\n" +
            "                android:textStyle=\"bold\" />\n" +
            "        </LinearLayout>";
    String jcode="package com.example.sample.java_codes;\n" +
            "\n" +
            "import com.example.sample.R;\n" +
            "import com.example.sample.code;\n" +
            "import com.example.sample.xml_codes.JAVACODE;\n" +
            "\n" +
            "import androidx.appcompat.app.AppCompatActivity;\n" +
            "\n" +
            "import android.app.DatePickerDialog;\n" +
            "import android.content.Intent;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.DatePicker;\n" +
            "import android.widget.TextView;\n" +
            "\n" +
            "import org.joda.time.Period;\n" +
            "import org.joda.time.PeriodType;\n" +
            "\n" +
            "import java.text.ParseException;\n" +
            "import java.text.ParsePosition;\n" +
            "import java.text.SimpleDateFormat;\n" +
            "import java.util.Calendar;\n" +
            "import java.util.Date;\n" +
            "\n" +
            "public class Age_Calculator extends AppCompatActivity {\n" +
            "    Button b1, b2, b3;\n" +
            "    TextView t1, t2;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_age_calculator);\n" +
            "        b1 = findViewById(R.id.bd);\n" +
            "        b2 = findViewById(R.id.td);\n" +
            "        b3 = findViewById(R.id.age);\n" +
            "        t1 = findViewById(R.id.bdate);\n" +
            "        t2 = findViewById(R.id.ans);\n" +
            "        SimpleDateFormat sdf = new SimpleDateFormat(\"dd/MM/yyyy\");\n" +
            "\n" +
            "        int year = Calendar.getInstance().get(Calendar.YEAR);\n" +
            "        int month = Calendar.getInstance().get(Calendar.MONTH);\n" +
            "        int date = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);\n" +
            "\n" +
            "        String today = sdf.format(Calendar.getInstance().getTime());\n" +
            "        b2.setText(\"Today's Date:\" + today);\n" +
            "        b1.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View view) {\n" +
            "                DatePickerDialog dp = new DatePickerDialog(Age_Calculator.this, new DatePickerDialog.OnDateSetListener() {\n" +
            "                    @Override\n" +
            "                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {\n" +
            "                        int m = i1 + 1;\n" +
            "                        String datee = i2 + \"/\" + m + \"/\" + i;\n" +
            "                        t1.setText(datee);\n" +
            "\n" +
            "                    }\n" +
            "                }, year, month, date);\n" +
            "                dp.show();\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        b3.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View view) {\n" +
            "                try {\n" +
            "                    Date d1 = sdf.parse(today);\n" +
            "                    Date d2 = sdf.parse(t1.getText().toString());\n" +
            "                    long d11 = d1.getTime();\n" +
            "                    long d22 = d2.getTime();\n" +
            "                    if (d11 >= d22) {\n" +
            "                        org.joda.time.Period p = new Period(d11, d22, PeriodType.yearMonthDay());\n" +
            "                        int year = p.getYears();\n" +
            "                        int month = p.getMonths();\n" +
            "                        int day = p.getDays();\n" +
            "                        t2.setText(year + \" Years- \" + month + \" months\" + day + \"days\");\n" +
            "\n" +
            "                    } else {\n" +
            "                        t2.setText(\"Select valid BirthDate\");\n" +
            "                    }\n" +
            "                } catch (Exception e) {\n" +
            "                    e.printStackTrace();\n" +
            "\n" +
            "                }\n" +
            "\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "\n}";
}