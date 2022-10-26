package com.example.sample.java_codes;

import com.example.sample.R;
import com.example.sample.code;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class DatePicker_TimePicker extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    TextView date;
    int hour;
    Button btime;
    Button btime2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datepicker_timepicker);
        date = findViewById(R.id.showDate);
        Button btdate = findViewById(R.id.picker);

        btime = findViewById(R.id.btime1);
        btime2 = findViewById(R.id.btime2);
        btdate.setOnClickListener(btdateListener);
        btime.setOnClickListener(btimeListener);
        btime2.setOnClickListener(btime2Listener);
    }

    View.OnClickListener btdateListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

//                 DatePickerDialog dateDialog= new DatePickerDialog(DatePicker.this,  DatePicker.this, Calendar.YEAR,Calendar.MONTH,Calendar.DAY_OF_MONTH);
            showDate();

        }
    };
    View.OnClickListener btimeListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            TimePickerDialog tdialog = new TimePickerDialog(DatePicker_TimePicker.this, ontimesetListener1, Time.HOUR, Time.MINUTE, true);
            tdialog.show();

        }
    };
    View.OnClickListener btime2Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            TimePickerDialog tdialog2 = new TimePickerDialog(DatePicker_TimePicker.this, android.R.style.Theme_Holo_Light_Dialog, ontimesetListener2, Time.HOUR, Time.MINUTE, true);
            tdialog2.show();

        }

    };

    TimePickerDialog.OnTimeSetListener ontimesetListener1 = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker timePicker, int i, int i1) {
            btime.setText(i + ":" + i1);
        }
    };
    TimePickerDialog.OnTimeSetListener ontimesetListener2 = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker timePicker, int i, int i1) {
            btime2.setText(i + ":" + i1);
        }
    };

    private void showDate() {
        DatePickerDialog dateDialog = new DatePickerDialog(this, this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DATE));

        dateDialog.show();
    }

    @Override
    public void onDateSet(android.widget.DatePicker datePicker, int i, int i1, int i2) {
        String datee = i2 + "/" + i1 + "/" + i;
        date.setText("Selected Date: " + datee);
        btime2.setText(datee);
    }


    public void getcode(View v) {
        String tag = v.getTag().toString();
        switch (tag) {
            case "java":
                Intent i1 = new Intent(DatePicker_TimePicker.this, code.class);
                i1.putExtra("code", jcode);
                startActivity(i1);
                break;
            case "xml":
                Intent i2 = new Intent(DatePicker_TimePicker.this, code.class);
                i2.putExtra("code", xcode);
                startActivity(i2);
                break;
        }
    }

    String jcode = "package com.example.sample.java_codes;\n" +
            "\n" +
            "import com.example.sample.R;\n" +
            "import com.example.sample.code;\n" +
            "import com.example.sample.xml_codes.JAVACODE;\n" +
            "\n" +
            "import androidx.appcompat.app.AppCompatActivity;\n" +
            "\n" +
            "import android.app.DatePickerDialog;\n" +
            "import android.app.TimePickerDialog;\n" +
            "import android.content.Intent;\n" +
            "import android.os.Bundle;\n" +
            "import android.text.format.Time;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.TextView;\n" +
            "import android.widget.TimePicker;\n" +
            "\n" +
            "import java.util.Calendar;\n" +
            "\n" +
            "public class DatePicker_TimePicker extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {\n" +
            "    TextView date;\n" +
            "    int hour;\n" +
            "    Button btime;\n" +
            "    Button btime2;\n" +
            " \n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.datepicker_timepicker);\n" +
            "        date = findViewById(R.id.showDate);\n" +
            "        Button btdate = findViewById(R.id.picker);\n" +
            "\n" +
            "        btime = findViewById(R.id.btime1);\n" +
            "        btime2 = findViewById(R.id.btime2);\n" +
            "        btdate.setOnClickListener(btdateListener);\n" +
            "        btime.setOnClickListener(btimeListener);\n" +
            "        btime2.setOnClickListener(btime2Listener);\n" +
            "    }\n" +
            "\n" +
            "    View.OnClickListener btdateListener = new View.OnClickListener() {\n" +
            "        @Override\n" +
            "        public void onClick(View view) {\n" +
            "\n" +
            "//                 DatePickerDialog dateDialog= new DatePickerDialog(DatePicker.this,  DatePicker.this, Calendar.YEAR,Calendar.MONTH,Calendar.DAY_OF_MONTH);\n" +
            "            showDate();\n" +
            "\n" +
            "        }\n" +
            "    };\n" +
            "    View.OnClickListener btimeListener = new View.OnClickListener() {\n" +
            "        @Override\n" +
            "        public void onClick(View view) {\n" +
            "            TimePickerDialog tdialog = new TimePickerDialog(DatePicker_TimePicker.this, ontimesetListener1, Time.HOUR, Time.MINUTE, true);\n" +
            "            tdialog.show();\n" +
            "\n" +
            "        }\n" +
            "    };\n" +
            "    View.OnClickListener btime2Listener = new View.OnClickListener() {\n" +
            "        @Override\n" +
            "        public void onClick(View view) {\n" +
            "            TimePickerDialog tdialog2 = new TimePickerDialog(DatePicker_TimePicker.this, android.R.style.Theme_Holo_Light_Dialog ,ontimesetListener2, Time.HOUR, Time.MINUTE, true);\n" +
            "            tdialog2.show();\n" +
            "\n" +
            "        }\n" +
            "\n" +
            "    };\n" +
            "\n" +
            "    TimePickerDialog.OnTimeSetListener ontimesetListener1= new TimePickerDialog.OnTimeSetListener() {\n" +
            "        @Override\n" +
            "        public void onTimeSet(TimePicker timePicker, int i, int i1) {\n" +
            "            btime.setText(i + \":\" + i1);\n" +
            "        }\n" +
            "    };TimePickerDialog.OnTimeSetListener ontimesetListener2= new TimePickerDialog.OnTimeSetListener() {\n" +
            "        @Override\n" +
            "        public void onTimeSet(TimePicker timePicker, int i, int i1) {\n" +
            "            btime2.setText(i + \":\" + i1);\n" +
            "        }\n" +
            "    };\n" +
            "\n" +
            "    private void showDate() {\n" +
            "        DatePickerDialog dateDialog = new DatePickerDialog(this, this,\n" +
            "                Calendar.getInstance().get(Calendar.YEAR),\n" +
            "                Calendar.getInstance().get(Calendar.MONTH),\n" +
            "                Calendar.getInstance().get(Calendar.DATE));\n" +
            "\n" +
            "        dateDialog.show();\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onDateSet(android.widget.DatePicker datePicker, int i, int i1, int i2) {\n" +
            "        String datee = i2 + \"/\" + i1 + \"/\" + i;\n" +
            "        date.setText(\"Selected Date: \"+datee);\n" +
            "        btime2.setText(datee);\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "\n" +
            "}";
    String xcode = " <LinearLayout\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:orientation=\"vertical\">\n" +
            "\n" +
            "\n" +
            "            <Button\n" +
            "                android:id=\"@+id/picker\"\n" +
            "                android:layout_width=\"wrap_content\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:layout_marginLeft=\"82dp\"\n" +
            "                android:layout_marginTop=\"50dp\"\n" +
            "                android:background=\"@drawable/button\"\n" +
            "                android:fontFamily=\"monospace\"\n" +
            "\n" +
            "                android:padding=\"10dp\"\n" +
            "                android:text=\"Click to Pick a Date\"\n" +
            "                android:textColor=\"#ffffff\"\n" +
            "                android:textColorHighlight=\"#00BCD4\"\n" +
            "                android:textColorLink=\"#03A9F4\"\n" +
            "                app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
            "                app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
            "\n" +
            "            <TextView\n" +
            "                android:id=\"@+id/showDate\"\n" +
            "                android:layout_width=\"wrap_content\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:layout_marginLeft=\"70dp\"\n" +
            "                android:layout_marginTop=\"20dp\"\n" +
            "                android:fontFamily=\"monospace\"\n" +
            "\n" +
            "                android:text=\"Selected Date: 00/00/0000\"\n" +
            "                android:textStyle=\"bold\"\n" +
            "                app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
            "                app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
            "\n" +
            "    <Button\n" +
            "        android:id=\"@+id/btime1\"\n" +
            "        android:layout_width=\"140dp\"\n" +
            "        android:layout_height=\"40dp\"\n" +
            "        android:layout_marginTop=\"50dp\"\n" +
            "        android:layout_marginLeft=\"105dp\"\n" +
            "        android:background=\"@drawable/button\"\n" +
            "        android:textColor=\"#ffffff\"\n" +
            "        android:text=\"Analog\"\n" +
            "        android:fontFamily=\"monospace\"\n" +
            "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
            "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
            "\n" +
            "    <Button\n" +
            "        android:id=\"@+id/btime2\"\n" +
            "        android:layout_width=\"140dp\"\n" +
            "        android:layout_height=\"40dp\"\n" +
            "        android:layout_marginTop=\"50dp\"\n" +
            "        android:layout_marginLeft=\"105dp\"\n" +
            "        android:background=\"@drawable/button\"\n" +
            "        android:textColor=\"#ffffff\"\n" +
            "        android:text=\"Digital\"\n" +
            "        android:fontFamily=\"monospace\"\n" +
            "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
            "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
            "\n" +
            "    <EditText\n" +
            "        android:id=\"@+id/eText\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginEnd=\"120dp\"\n" +
            "        android:layout_marginBottom=\"120dp\"\n" +
            "        android:visibility=\"invisible\"\n" +
            "        android:ems=\"10\"\n" +
            "        android:inputType=\"textPersonName\"\n" +
            "        android:text=\"Pick Date\"\n" +
            "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
            "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
            "\n" +
            "\n" +
            "        </LinearLayout>";


}


