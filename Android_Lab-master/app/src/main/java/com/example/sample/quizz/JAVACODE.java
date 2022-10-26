package com.example.sample.quizz;

public class JAVACODE {
    public static String AgeJCode="package com.example.sample.java_codes;\n" +
            "import com.example.sample.R;\n" +
            "import androidx.appcompat.app.AppCompatActivity;\n" +
            "\n" +
            "import android.app.DatePickerDialog;\n" +
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
            "    Button b1,b2,b3;\n" +
            "    TextView t1,t2;\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_age_calculator);\n" +
            "        b1= findViewById(R.id.bd);\n" +
            "        b2= findViewById(R.id.td);\n" +
            "        b3= findViewById(R.id.age);\n" +
            "        t1= findViewById(R.id.bdate);\n" +
            "        t2= findViewById(R.id.ans);\n" +
            "        SimpleDateFormat sdf= new SimpleDateFormat(\"dd/MM/yyyy\");\n" +
            "\n" +
            "        int year= Calendar.getInstance().get(Calendar.YEAR);\n" +
            "        int month= Calendar.getInstance().get(Calendar.MONTH);\n" +
            "        int date= Calendar.getInstance().get(Calendar.DAY_OF_MONTH);\n" +
            "\n" +
            "        String today=sdf.format(Calendar.getInstance().getTime());\n" +
            "        b2.setText(today);\n" +
            "        b1.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View view) {\n" +
            "                DatePickerDialog dp= new DatePickerDialog(Age_Calculator.this, new DatePickerDialog.OnDateSetListener() {\n" +
            "                    @Override\n" +
            "                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {\n" +
            "int m=i1+1;"+
            "                         String datee = i2+\"/\"+m+\"/\"+i;\n" +
            "                        t1.setText(datee);\n" +
            "\n" +
            "                    }\n" +
            "                }, year,month,date);\n" +
            "                dp.show();\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "b3.setOnClickListener(new View.OnClickListener() {\n" +
            "    @Override\n" +
            "    public void onClick(View view) {\n" +
            "        try {\n" +
            "            Date d1= sdf.parse(today);\n" +
            "            Date d2= sdf.parse(t1.getText().toString());\n" +
            "            long d11= d1.getTime();\n" +
            "            long d22= d2.getTime();\n" +
            "            if(d11>=d22) {\n" +
            "                System.out.println(\"i was here\");\n" +
            "                org.joda.time.Period p = new Period(d11, d22, PeriodType.yearMonthDay());\n" +
            "                int year=p.getYears();\n" +
            "                int month=p.getMonths();\n" +
            "                int day=p.getDays();\n" +
            "                t2.setText( year +\" Years\" + month + \" months\"+day+\"days\");\n" +
            "\n" +
            "            }else\n" +
            "            {\n" +
            "                t2.setText( \"invalid\");\n" +
            "                System.out.println(\" iwas in else\");\n" +
            "            }\n" +
            "        }\n" +
            "        catch (Exception e) {\n" +
            "            e.printStackTrace();\n" +
            "\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "});\n" +
            "    }\n" +
            "}";
    public static String AgeXCode="";
    public static String ArithJCode="package com.example.sample;\n" +
            "\n" +
            "\n" +
            "import androidx.appcompat.app.AppCompatActivity;\n" +
            "\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.EditText;\n" +
            "import android.widget.TextView;\n" +
            "\n" +
            "public class Arithmatics extends AppCompatActivity {\n" +
            "    int num1;\n" +
            "    int num2;\n" +
            "    int ans;\n" +
            "    TextView answer;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_arithmatics);\n" +
            "\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    public void operation(View v) {\n" +
            "\n" +
            "        EditText n1 = (EditText) findViewById(R.id.arith_num1);\n" +
            "        num1 = Integer.valueOf(n1.getText().toString().equals(\"\")? \"0\": n1.getText().toString() );\n" +
            "        EditText n2 = findViewById(R.id.arith_num2);\n" +
            "        num2 = Integer.valueOf(n2.getText().toString().equals(\"\")? \"0\": n2.getText().toString() );\n" +
            "        answer = findViewById(R.id.arith_ans);\n" +
            "        String operation = String.valueOf(v.getTag());\n" +
            "        System.out.println(operation);\n" +
            "\n" +
            "        switch (operation) {\n" +
            "            case \"add\":\n" +
            "                try {\n" +
            "                    ans = num1 + num2;\n" +
            "                    answer.setText(String.valueOf(ans));\n" +
            "                } catch (Exception e) {\n" +
            "                    answer.setText(\"Invalid Numbers\");\n" +
            "                }\n" +
            "                break;\n" +
            "            case \"sub\":\n" +
            "                try {\n" +
            "                    ans = num1 - num2;\n" +
            "                    answer.setText(String.valueOf(ans));\n" +
            "                } catch (Exception e) {\n" +
            "                    answer.setText(\"Invalid Numbers\");\n" +
            "                }\n" +
            "                break;\n" +
            "            case \"mul\":\n" +
            "                try {\n" +
            "                    ans = num1 * num2;\n" +
            "                    answer.setText(String.valueOf(ans));\n" +
            "                } catch (Exception e) {\n" +
            "                    answer.setText(\"Invalid Numbers\");\n" +
            "                }\n" +
            "                break;\n" +
            "            case \"div\":\n" +
            "                try {\n" +
            "                    ans = num1 / num2;\n" +
            "                    answer.setText(String.valueOf(ans));\n" +
            "                } catch (ArithmeticException e) {\n" +
            "                    answer.setText(\"Invalid Numbers\");\n" +
            "                }\n" +
            "                break;\n" +
            "\n" +
            "        }\n" +
            "    }\n" +
            "}";
    public static String ArithXCode="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "\n" +
            "    android:background=\"#FFFFFF\">\n" +
            "\n" +
            "    <ImageView\n" +
            "        android:id=\"@+id/Arith_get_javacode\"\n" +
            "        android:layout_width=\"161dp\"\n" +
            "        android:layout_height=\"151dp\"\n" +
            "        android:layout_marginEnd=\"216dp\"\n" +
            "        android:layout_marginBottom=\"572dp\"\n" +
            "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
            "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
            "        app:srcCompat=\"@drawable/java_button11\" />\n" +
            "\n" +
            "    <ImageView\n" +
            "        android:id=\"@+id/arith_get_xml\"\n" +
            "        android:layout_width=\"173dp\"\n" +
            "        android:layout_height=\"142dp\"\n" +
            "        android:layout_marginEnd=\"16dp\"\n" +
            "        android:layout_marginBottom=\"572dp\"\n" +
            "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
            "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
            "        app:srcCompat=\"@drawable/xml_button22\" />\n" +
            "\n" +

            "    <androidx.cardview.widget.CardView\n" +
            "        android:layout_width=\"350dp\"\n" +
            "        android:layout_height=\"500dp\"\n" +
            "        app:cardBackgroundColor=\"#7EC6FF\"\n" +
            "        app:cardCornerRadius=\"50dp\"\n" +
            "        app:cardElevation=\"10dp\"\n" +
            "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
            "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
            "        app:layout_constraintHorizontal_bias=\"0.491\"\n" +
            "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
            "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
            "        app:layout_constraintVertical_bias=\"0.783\">\n" +
            "\n" +
            "        <TextView\n" +
            "            android:id=\"@+id/textView9\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:fontFamily=\"casual\"\n" +
            "            android:paddingStart=\"30dp\"\n" +
            "            android:paddingTop=\"40dp\"\n" +
            "            android:text=\"Enter 1st Number\"\n" +
            "            android:textColor=\"#040404\"\n" +
            "            android:textSize=\"16sp\"\n" +
            "            android:textStyle=\"bold\" />\n" +
            "\n" +
            "        <TextView\n" +
            "            android:id=\"@+id/textView10\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:fontFamily=\"casual\"\n" +
            "            android:paddingStart=\"30dp\"\n" +
            "            android:paddingTop=\"120dp\"\n" +
            "            android:text=\"Enter 2nd Number\"\n" +
            "            android:textColor=\"#040404\"\n" +
            "            android:textSize=\"16sp\"\n" +
            "            android:textStyle=\"bold\" />\n" +
            "\n" +
            "        <EditText\n" +
            "            android:id=\"@+id/arith_num1\"\n" +
            "            android:layout_width=\"100dp\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginLeft=\"220dp\"\n" +
            "            android:layout_marginTop=\"20dp\"\n" +
            "            android:fontFamily=\"casual\"\n" +
            "            android:inputType=\"number\"\n" +
            "            android:textColor=\"#010101\"\n" +
            "            android:textStyle=\"bold\" />\n" +
            "\n" +
            "        <EditText\n" +
            "            android:id=\"@+id/arith_num2\"\n" +
            "            android:layout_width=\"100dp\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginLeft=\"220dp\"\n" +
            "            android:layout_marginTop=\"100dp\"\n" +
            "            android:fontFamily=\"casual\"\n" +
            "            android:inputType=\"number\"\n" +
            "            android:textColor=\"#030303\"\n" +
            "            android:textStyle=\"bold\" />\n" +
            "\n" +
            "        <Button\n" +
            "            android:id=\"@+id/sub\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginLeft=\"200dp\"\n" +
            "            android:layout_marginTop=\"200dp\"\n" +
            "            android:fontFamily=\"casual\"\n" +
            "            android:onClick=\"operation\"\n" +
            "            android:tag=\"sub\"\n" +
            "            android:text=\"SUBTRACT\"\n" +
            "            android:textColor=\"#FFFFFF\"\n" +
            "            android:textStyle=\"bold\" />\n" +
            "\n" +
            "        <Button\n" +
            "            android:id=\"@+id/add\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginLeft=\"60dp\"\n" +
            "            android:layout_marginTop=\"200dp\"\n" +
            "            android:elevation=\"20dp\"\n" +
            "            android:fontFamily=\"casual\"\n" +
            "            android:onClick=\"operation\"\n" +
            "            android:tag=\"add\"\n" +
            "            android:text=\"ADD\"\n" +
            "            android:textColor=\"#FFFFFF\"\n" +
            "            android:textStyle=\"bold\"\n" +
            "            app:cardCornerRadius=\"10dp\"\n" +
            "            app:cardElevation=\"20dp\"\n" +
            "            tools:text=\"ADD\" />\n" +
            "\n" +
            "        <Button\n" +
            "            android:id=\"@+id/div\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginLeft=\"200dp\"\n" +
            "            android:layout_marginTop=\"300dp\"\n" +
            "            android:fontFamily=\"casual\"\n" +
            "            android:onClick=\"operation\"\n" +
            "            android:tag=\"div\"\n" +
            "            android:text=\"DIVIDE\"\n" +
            "            android:textStyle=\"bold\" />\n" +
            "\n" +
            "        <Button\n" +
            "            android:id=\"@+id/mul\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginLeft=\"60dp\"\n" +
            "            android:layout_marginTop=\"300dp\"\n" +
            "            android:fontFamily=\"casual\"\n" +
            "            android:onClick=\"operation\"\n" +
            "            android:tag=\"mul\"\n" +
            "            android:text=\"MULTIPLY\"\n" +
            "            android:textStyle=\"bold\" />\n" +
            "\n" +
            "        <TextView\n" +
            "            android:id=\"@+id/textView11\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginLeft=\"60dp\"\n" +
            "            android:layout_marginTop=\"400dp\"\n" +
            "            android:fontFamily=\"casual\"\n" +
            "            android:text=\"ANSWER :\"\n" +
            "            android:textColor=\"#040404\"\n" +
            "            android:textSize=\"20sp\"\n" +
            "            android:textStyle=\"bold\" />\n" +
            "\n" +
            "        <TextView\n" +
            "            android:id=\"@+id/arith_ans\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginLeft=\"180dp\"\n" +
            "            android:layout_marginTop=\"400dp\"\n" +
            "            android:fontFamily=\"casual\"\n" +
            "            android:text=\"_______ \"\n" +
            "            android:textColor=\"#040404\"\n" +
            "            android:textSize=\"20sp\"\n" +
            "            android:textStyle=\"bold\" />\n" +
            "\n" +
            "\n" +
            "    </androidx.cardview.widget.CardView>\n" +
            "\n" +
            "\n" +
            "</androidx.constraintlayout.widget.ConstraintLayout>";


    public static String dtimeJcode = "\n" +
            "package com.example.sample.java_codes;\n" +
            "\n" +
            "        import com.example.sample.R;\n" +
            "        import com.example.sample.code;\n" +
            "\n" +
            "        import androidx.appcompat.app.AppCompatActivity;\n" +
            "\n" +
            "        import android.app.DatePickerDialog;\n" +
            "        import android.app.TimePickerDialog;\n" +
            "        import android.content.Intent;\n" +
            "        import android.os.Bundle;\n" +
            "        import android.text.format.Time;\n" +
            "        import android.view.View;\n" +
            "        import android.widget.Button;\n" +
            "        import android.widget.DatePicker;\n" +
            "        import android.widget.TextView;\n" +
            "        import android.widget.TimePicker;\n" +
            "\n" +
            "        import java.time.OffsetTime;\n" +
            "        import java.util.Calendar;\n" +
            "        import java.util.Date;\n" +
            "\n" +
            "public class DatePicker_TimePicker extends AppCompatActivity implements DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {\n" +
            "    TextView date;\n" +
            "    Button btime;\n" +
            "    Button btime2;\n" +
            "    int hour;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.datepicker_timepicker);\n" +
            "        date = findViewById(R.id.showDate);\n" +
            "        Button btdate = findViewById(R.id.picker);\n" +
            "        btime = findViewById(R.id.btime);\n" +
            "        btime2 = findViewById(R.id.btime2);\n" +
            "        Button btjava = findViewById(R.id.btjava);\n" +
            "        Button btxml = findViewById(R.id.btxml);\n" +
            "        btdate.setOnClickListener(btdateListener);\n" +
            "        btime.setOnClickListener(btimeListener);\n" +
            "        btime.setOnClickListener(btime2Listener);\n" +
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
            "            TimePickerDialog tdialog = new TimePickerDialog(DatePicker_TimePicker.this, DatePicker_TimePicker.this, Time.HOUR, Time.MINUTE, true);\n" +
            "            tdialog.show();\n" +
            "\n" +
            "        }\n" +
            "    };View.OnClickListener btime2Listener = new View.OnClickListener() {\n" +
            "        @Override\n" +
            "        public void onClick(View view) {\n" +
            "            TimePickerDialog tdialog2 = new TimePickerDialog(DatePicker_TimePicker.this, DatePicker_TimePicker.this, Time.HOUR, Time.MINUTE, true);\n" +
            "            tdialog2.show();\n" +
            "\n" +
            "        }\n" +
            "    };\n" +
            "\n" +
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
            "        date.setText(datee);\n" +
            "        btime2.setText(datee);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onTimeSet(TimePicker timePicker, int i, int i1) {\n" +
            "        btime.setText(i + \":\" + i1);\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "    \n" +
            "}";



   public static String dtimeXcode = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    tools:context=\".java_codes.DatePicker_TimePicker\">\n" +
            "\n" +
            "    <Button\n" +
            "        android:id=\"@+id/picker\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginEnd=\"132dp\"\n" +
            "        android:layout_marginBottom=\"557dp\"\n" +
            "        android:text=\"Click to Pick Date\"\n" +
            "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
            "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
            "\n" +
            "    <TextView\n" +
            "        android:id=\"@+id/showDate\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginEnd=\"162dp\"\n" +
            "        android:layout_marginBottom=\"450dp\"\n" +
            "        android:text=\"No Date Selected\"\n" +
            "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
            "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
            "\n" +
            "    <Button\n" +
            "        android:id=\"@+id/btjava\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginStart=\"32dp\"\n" +
            "        android:layout_marginBottom=\"659dp\"\n" +
            "        android:text=\"java\"\n" +
            "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
            "        app:layout_constraintStart_toStartOf=\"parent\" />\n" +
            "\n" +
            "    <Button\n" +
            "        android:id=\"@+id/btxml\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginEnd=\"44dp\"\n" +
            "        android:layout_marginBottom=\"659dp\"\n" +
            "        android:text=\"xml\"\n" +
            "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
            "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
            "\n" +
            "    <Button\n" +
            "        android:id=\"@+id/btime\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginEnd=\"149dp\"\n" +
            "        android:layout_marginBottom=\"325dp\"\n" +
            "        android:text=\"Select Time\"\n" +
            "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
            "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
            "\n" +
            "    <Button\n" +
            "        android:id=\"@+id/btime2\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginEnd=\"156dp\"\n" +
            "        android:layout_marginBottom=\"210dp\"\n" +
            "        android:text=\"Digital Clock\"\n" +
            "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
            "        app:layout_constraintEnd_toEndOf=\"parent\" />\n" +
            "\n" +
            "</androidx.constraintlayout.widget.ConstraintLayout>";
}
