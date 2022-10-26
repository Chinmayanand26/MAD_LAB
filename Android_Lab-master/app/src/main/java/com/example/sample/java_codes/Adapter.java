package com.example.sample.java_codes;
import com.example.sample.R;
import com.example.sample.code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Toast;

public class Adapter extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
String str[]={"Select  ⤵","\uD83C\uDDE6\uD83C\uDDFA Australia","\uD83C\uDDEE\uD83C\uDDF3 India","\uD83C\uDDFA\uD83C\uDDF8 USA","\uD83C\uDDEF\uD83C\uDDF5  Japan","\uD83C\uDFF4\uDB40\uDC67\uDB40\uDC62\uDB40\uDC65\uDB40\uDC6E\uDB40\uDC67\uDB40\uDC7F England"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);
        String arr[]=getResources().getStringArray(R.array.level);
        ImageView imf= findViewById(R.id.adpt_get_jcode);
        ImageView imf2= findViewById(R.id.adpt_get_xml);
        Spinner spinner= (Spinner) findViewById(R.id.spin);
        Spinner spinnerlevel=findViewById(R.id.spin2);
        ArrayAdapter<String> spinnerlevelArrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.level));
        spinnerlevel.setAdapter(spinnerlevelArrayAdapter);
        spinnerlevel.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i!=0) {
                    Toast.makeText(Adapter.this, "Your Occupation is:\n" + arr[i], Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        ArrayAdapter arrayAdapter= new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,str);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(this);



    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if(i!=0) {
            Toast.makeText(this, "Your Country is:\n" + str[i], Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void viewCode(View v){
        String tag= v.getTag().toString();
        switch (tag){
            case "java":
                Intent i1= new Intent(Adapter.this, code.class);
                i1.putExtra("code",jcode);
                startActivity(i1);
                break;
            case "xml" :
                Intent i2= new Intent(Adapter.this,code.class);
                i2.putExtra("code",xcode);
                startActivity(i2);
                break;
        }

    }
    String jcode="package com.example.sample.java_codes;\n" +
            "import com.example.sample.R;\n" +
            "\n" +
            "import androidx.appcompat.app.AppCompatActivity;\n" +
            "\n" +
            "import android.widget.AdapterView;\n" +
            "import android.widget.Spinner;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.ArrayAdapter;\n" +
            "import android.widget.ImageView;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "import java.util.ArrayList;\n" +
            "\n" +
            "public class Adapter extends AppCompatActivity implements AdapterView.OnItemSelectedListener {\n" +
            "String str[]={\"Select  ⤵\",\"\\uD83C\\uDDE6\\uD83C\\uDDFA Australia\",\"\\uD83C\\uDDEE\\uD83C\\uDDF3 India\",\"\\uD83C\\uDDFA\\uD83C\\uDDF8 USA\",\"\\uD83C\\uDDEF\\uD83C\\uDDF5  Japan\",\"\\uD83C\\uDFF4\\uDB40\\uDC67\\uDB40\\uDC62\\uDB40\\uDC65\\uDB40\\uDC6E\\uDB40\\uDC67\\uDB40\\uDC7F England\"};\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_adapter);\n" +
            "        String arr[]=getResources().getStringArray(R.array.level);\n" +
            "        ImageView imf= findViewById(R.id.adpt_get_javacode);\n" +
            "        Spinner spinner= (Spinner) findViewById(R.id.spin);\n" +
            "        Spinner spinnerlevel=findViewById(R.id.spin2);\n" +
            "        ArrayAdapter<String> spinnerlevelArrayAdapter = new ArrayAdapter<String>(\n" +
            "                this,\n" +
            "                android.R.layout.simple_spinner_dropdown_item,\n" +
            "                getResources().getStringArray(R.array.level));\n" +
            "        spinnerlevel.setAdapter(spinnerlevelArrayAdapter);\n" +
            "        spinnerlevel.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {\n" +
            "            @Override\n" +
            "            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {\n" +
            "                if(i!=0) {\n" +
            "                    Toast.makeText(Adapter.this, \"Your Occupation is:\\n\" + arr[i], Toast.LENGTH_SHORT).show();\n" +
            "                }\n" +
            "            }\n" +
            "\n" +
            "            @Override\n" +
            "            public void onNothingSelected(AdapterView<?> adapterView) {\n" +
            "\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "\n" +
            "        ArrayAdapter arrayAdapter= new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,str);\n" +
            "        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);\n" +
            "        spinner.setAdapter(arrayAdapter);\n" +
            "        spinner.setOnItemSelectedListener(this);\n" +
            "\n" +
            "\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {\n" +
            "        if(i!=0) {\n" +
            "            Toast.makeText(this, \"Your Country is:\\n\" + str[i], Toast.LENGTH_SHORT).show();\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onNothingSelected(AdapterView<?> adapterView) {\n" +
            "\n" +
            "    }\n" +
            "}";
    String xcode=" <LinearLayout\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"match_parent\"\n" +
            "            android:orientation=\"vertical\">\n" +
            "\n" +
            "\n" +
            "        <TextView\n" +
            "            android:id=\"@+id/textView\"\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:textAlignment=\"center\"\n" +
            "            android:layout_marginStart=\"32dp\"\n" +
            "            android:layout_marginTop=\"32dp\"\n" +
            "            android:layout_marginEnd=\"32dp\"\n" +
            "            android:text=\"Select Your Country\"\n" +
            "            android:textColor=\"@color/black\"\n" +
            "            android:textSize=\"20sp\"\n" +
            "            android:textStyle=\"bold\"\n" +
            "            android:fontFamily=\"monospace\"\n" +
            "            app:layout_constraintEnd_toEndOf=\"parent\"\n" +
            "            app:layout_constraintStart_toStartOf=\"parent\"\n" +
            "            app:layout_constraintTop_toTopOf=\"parent\" />\n" +
            "\n" +
            "        <Spinner\n" +
            "            android:id=\"@+id/spin\"\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"40dp\"\n" +
            "            android:layout_margin=\"15dp\"\n" +
            "            android:background=\"#2196F3\"\n" +
            "            android:elevation=\"10dp\" />\n" +
            "            <TextView\n" +
            "            android:id=\"@+id/textView3\"\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:textAlignment=\"center\"\n" +
            "            android:layout_marginStart=\"32dp\"\n" +
            "            android:layout_marginTop=\"20dp\"\n" +
            "            android:layout_marginEnd=\"32dp\"\n" +
            "            android:text=\"Your Occupation\"\n" +
            "            android:textColor=\"@color/black\"\n" +
            "            android:textSize=\"19sp\"\n" +
            "            android:textStyle=\"bold\"\n" +
            "            android:fontFamily=\"monospace\"\n" +
            "            app:layout_constraintEnd_toEndOf=\"parent\"\n" +
            "            app:layout_constraintStart_toStartOf=\"parent\"\n" +
            "            app:layout_constraintTop_toTopOf=\"parent\" />\n" +
            "\n" +
            "        <Spinner\n" +
            "            android:id=\"@+id/spin2\"\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"40dp\"\n" +
            "            android:layout_marginTop=\"10dp\"\n" +
            "            android:layout_marginLeft=\"40dp\"\n" +
            "            android:layout_marginRight=\"40dp\"\n" +
            "            android:background=\"#2196F3\"\n" +
            "            android:elevation=\"10dp\" />\n" +
            "\n" +
            "\n" +
            "\n" +
            "        </LinearLayout>";
}