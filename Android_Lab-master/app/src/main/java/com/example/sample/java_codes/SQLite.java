package com.example.sample.java_codes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.sample.R;
import com.example.sample.code;
import com.example.sample.databinding.ActivitySqliteBinding;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;


public class SQLite extends AppCompatActivity {
    ActivitySqliteBinding sqliteBinding;
    SQLiteDatabase sqLiteDatabase;
    boolean isCreated = true;
    ContentValues name1;
    HashMap<String, String> map = new HashMap<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sqliteBinding = ActivitySqliteBinding.inflate(getLayoutInflater());
        setContentView(sqliteBinding.getRoot());

    }

    public void insert(View v) {
        sqLiteDatabase = openOrCreateDatabase("me", MODE_PRIVATE, null);
        if (sqLiteDatabase != null) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS students (id integer NOT NULL PRIMARY KEY AUTOINCREMENT, name varchar,roll varchar) ");
            name1 = new ContentValues();
            name1.put("name", sqliteBinding.editTextTextPersonName.getText().toString());
            name1.put("roll", sqliteBinding.rollno.getText().toString());
            sqLiteDatabase.insert("students", null, name1);
            sqliteBinding.editTextTextPersonName.setText("");
            sqliteBinding.rollno.setText("");
            Toast.makeText(this, "Inserted successfully", Toast.LENGTH_SHORT).show();
        } else if (sqLiteDatabase == null) {
            Toast.makeText(this, "unable to connect to db", Toast.LENGTH_SHORT).show();
        } else {

        }
    }

    public void show(View v) {
        sqLiteDatabase = openOrCreateDatabase("me", MODE_PRIVATE, null);
        File dbFile = getDatabasePath("me");
        System.out.println(dbFile.getAbsoluteFile());
        Cursor c = sqLiteDatabase.rawQuery("select * from students", null);
        String allvalues =
                "";
        if (c.moveToFirst()) {
            do {
                String column1 = c.getString(0);
                String column2 = c.getString(1);
                String column3 = c.getString(2);
                allvalues += "Id="+column1 + ": Name=" + column2 +": Roll no=" + column3 + "\n";
            } while (c.moveToNext());
        }
        Toast.makeText(this, allvalues, Toast.LENGTH_SHORT).show();
    }

    public void delete(View v) {
        sqLiteDatabase = openOrCreateDatabase("me", MODE_PRIVATE, null);
        String[] s = {sqliteBinding.editTextTextPersonName.getText().toString()};
         try {


             sqLiteDatabase.delete("students", "name=?", s);


             Toast.makeText(this, "One Record Deleted", Toast.LENGTH_SHORT).show();
         }catch (Exception e){


             Toast.makeText(this, "Operation Failed!!", Toast.LENGTH_SHORT).show();
         }
    }

    public void update(View v) {
        sqLiteDatabase = openOrCreateDatabase("me", MODE_PRIVATE, null);
        try {


            String name = sqliteBinding.editTextTextPersonName.getText().toString();
            String roll = sqliteBinding.rollno.getText().toString();
            sqLiteDatabase.execSQL("UPDATE students SET name = "+"'"+name+"' "+ "WHERE roll = "+"'"+roll+"'");

//            sqLiteDatabase.execSQL(strSQL);

            Toast.makeText(this, "Updated Sucessfully", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, "Invalid Values", Toast.LENGTH_SHORT).show();
        }
    }

    String xcode="   <androidx.cardview.widget.CardView\n" +
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
            "            android:fontFamily=\"monospace\"\n" +
            "            android:paddingStart=\"30dp\"\n" +
            "            android:paddingTop=\"40dp\"\n" +
            "            android:text=\"Enter Student Name\"\n" +
            "            android:textColor=\"#040404\"\n" +
            "            android:textSize=\"16sp\"\n" +
            "            android:textStyle=\"bold\" />\n" +
            "\n" +
            "        <TextView\n" +
            "            android:id=\"@+id/textView10\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:fontFamily=\"monospace\"\n" +
            "            android:paddingStart=\"30dp\"\n" +
            "            android:paddingTop=\"120dp\"\n" +
            "            android:text=\"Enter Roll Number\"\n" +
            "            android:textColor=\"#040404\"\n" +
            "            android:textSize=\"16sp\"\n" +
            "            android:textStyle=\"bold\" />\n" +
            "\n" +
            "        <EditText\n" +
            "            android:id=\"@+id/editTextTextPersonName\"\n" +
            "            android:inputType=\"textPersonName\"\n" +
            "            android:layout_width=\"100dp\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginLeft=\"220dp\"\n" +
            "            android:layout_marginTop=\"20dp\"\n" +
            "            android:fontFamily=\"monospace\"\n" +
            "            android:textColor=\"#010101\"\n" +
            "            android:textStyle=\"bold\" />\n" +
            "\n" +
            "        <EditText\n" +
            "            android:id=\"@+id/rollno\"\n" +
            "            android:layout_width=\"100dp\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginLeft=\"220dp\"\n" +
            "            android:layout_marginTop=\"100dp\"\n" +
            "            android:fontFamily=\"monospace\"\n" +
            "            android:inputType=\"number\"\n" +
            "            android:textColor=\"#030303\"\n" +
            "            android:textStyle=\"bold\" />\n" +
            "\n" +
            "        <Button\n" +
            "            android:id=\"@+id/button\"\n" +
            "            android:background=\"@drawable/button\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginLeft=\"200dp\"\n" +
            "            android:layout_marginTop=\"200dp\"\n" +
            "            android:fontFamily=\"casual\"\n" +
            "            android:onClick=\"insert\"\n" +
            "            android:tag=\"sub\"\n" +
            "            android:text=\"INSERT\"\n" +
            "            android:textStyle=\"bold\" />\n" +
            "\n" +
            "        <Button\n" +
            "            android:id=\"@+id/button5\"\n" +
            "            android:background=\"@drawable/button\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginLeft=\"60dp\"\n" +
            "            android:layout_marginTop=\"200dp\"\n" +
            "            android:elevation=\"20dp\"\n" +
            "            android:fontFamily=\"casual\"\n" +
            "            android:onClick=\"show\"\n" +
            "            android:tag=\"add\"\n" +
            "            android:text=\"SHOW\"\n" +
            "            android:textStyle=\"bold\"\n" +
            "            app:cardCornerRadius=\"10dp\"\n" +
            "            app:cardElevation=\"20dp\"\n" +
            "            tools:text=\"ADD\" />\n" +
            "\n" +
            "        <Button\n" +
            "            android:id=\"@+id/button3\"\n" +
            "            android:background=\"@drawable/button\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginLeft=\"200dp\"\n" +
            "            android:layout_marginTop=\"300dp\"\n" +
            "            android:fontFamily=\"casual\"\n" +
            "            android:onClick=\"update\"\n" +
            "            android:tag=\"div\"\n" +
            "            android:text=\"UPDATE\"\n" +
            "            android:textStyle=\"bold\" />\n" +
            "\n" +
            "        <Button\n" +
            "            android:id=\"@+id/button4\"\n" +
            "            android:background=\"@drawable/button\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginLeft=\"60dp\"\n" +
            "            android:layout_marginTop=\"300dp\"\n" +
            "            android:fontFamily=\"casual\"\n" +
            "            android:onClick=\"delete\"\n" +
            "            android:tag=\"mul\"\n" +
            "            android:text=\"DELETE\"\n" +
            "            android:textStyle=\"bold\" />\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "    </androidx.cardview.widget.CardView>\n" +
            "</androidx.constraintlayout.widget.ConstraintLayout>";
    String jcode="package com.example.sample.java_codes;\n" +
            "\n" +
            "import androidx.appcompat.app.AppCompatActivity;\n" +
            "\n" +
            "import android.content.ContentValues;\n" +
            "import android.database.Cursor;\n" +
            "import android.database.sqlite.SQLiteDatabase;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.ArrayAdapter;\n" +
            "import android.widget.EditText;\n" +
            "import android.widget.Spinner;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "import com.example.sample.R;\n" +
            "import com.example.sample.databinding.ActivitySqliteBinding;\n" +
            "\n" +
            "import java.io.File;\n" +
            "import java.util.ArrayList;\n" +
            "import java.util.HashMap;\n" +
            "\n" +
            "\n" +
            "public class SQLite extends AppCompatActivity {\n" +
            "    ActivitySqliteBinding sqliteBinding;\n" +
            "    SQLiteDatabase sqLiteDatabase;\n" +
            "    boolean isCreated = true;\n" +
            "    ContentValues name1;\n" +
            "    HashMap<String, String> map = new HashMap<>();\n" +
            "\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        sqliteBinding = ActivitySqliteBinding.inflate(getLayoutInflater());\n" +
            "        setContentView(sqliteBinding.getRoot());\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    public void insert(View v) {\n" +
            "        sqLiteDatabase = openOrCreateDatabase(\"me\", MODE_PRIVATE, null);\n" +
            "        if (sqLiteDatabase != null) {\n" +
            "            sqLiteDatabase.execSQL(\"CREATE TABLE IF NOT EXISTS students (id integer NOT NULL PRIMARY KEY AUTOINCREMENT, name varchar,roll varchar) \");\n" +
            "            name1 = new ContentValues();\n" +
            "            name1.put(\"name\", sqliteBinding.editTextTextPersonName.getText().toString());\n" +
            "            name1.put(\"roll\", sqliteBinding.rollno.getText().toString());\n" +
            "            sqLiteDatabase.insert(\"students\", null, name1);\n" +
            "            sqliteBinding.editTextTextPersonName.setText(\"\");\n" +
            "            sqliteBinding.rollno.setText(\"\");\n" +
            "            Toast.makeText(this, \"Inserted successfully\", Toast.LENGTH_SHORT).show();\n" +
            "        } else if (sqLiteDatabase == null) {\n" +
            "            Toast.makeText(this, \"unable to connect to db\", Toast.LENGTH_SHORT).show();\n" +
            "        } else {\n" +
            "\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    public void show(View v) {\n" +
            "        sqLiteDatabase = openOrCreateDatabase(\"me\", MODE_PRIVATE, null);\n" +
            "        File dbFile = getDatabasePath(\"me\");\n" +
            "        System.out.println(dbFile.getAbsoluteFile());\n" +
            "        Cursor c = sqLiteDatabase.rawQuery(\"select * from students\", null);\n" +
            "        String allvalues =\n" +
            "                \"\";\n" +
            "        if (c.moveToFirst()) {\n" +
            "            do {\n" +
            "                String column1 = c.getString(0);\n" +
            "                String column2 = c.getString(1);\n" +
            "                String column3 = c.getString(2);\n" +
            "                allvalues += \"Id=\"+column1 + \": Name=\" + column2 +\": Roll no=\" + column3 + \"\\n\";\n" +
            "            } while (c.moveToNext());\n" +
            "        }\n" +
            "        Toast.makeText(this, allvalues, Toast.LENGTH_SHORT).show();\n" +
            "    }\n" +
            "\n" +
            "    public void delete(View v) {\n" +
            "        sqLiteDatabase = openOrCreateDatabase(\"me\", MODE_PRIVATE, null);\n" +
            "        String[] s = {sqliteBinding.editTextTextPersonName.getText().toString()};\n" +
            "         try {\n" +
            "\n" +
            "\n" +
            "             sqLiteDatabase.delete(\"students\", \"name=?\", s);\n" +
            "\n" +
            "\n" +
            "             Toast.makeText(this, \"One Record Deleted\", Toast.LENGTH_SHORT).show();\n" +
            "         }catch (Exception e){\n" +
            "\n" +
            "\n" +
            "             Toast.makeText(this, \"Operation Failed!!\", Toast.LENGTH_SHORT).show();\n" +
            "         }\n" +
            "    }\n" +
            "\n" +
            "    public void update(View v) {\n" +
            "        sqLiteDatabase = openOrCreateDatabase(\"me\", MODE_PRIVATE, null);\n" +
            "        try {\n" +
            "\n" +
            "\n" +
            "            String name = sqliteBinding.editTextTextPersonName.getText().toString();\n" +
            "            String roll = sqliteBinding.rollno.getText().toString();\n" +
            "            sqLiteDatabase.execSQL(\"UPDATE students SET name = \"+\"'\"+name+\"' \"+ \"WHERE roll = \"+\"'\"+roll+\"'\");\n" +
            "\n" +
            "//            sqLiteDatabase.execSQL(strSQL);\n" +
            "\n" +
            "            Toast.makeText(this, \"Updated Sucessfully\", Toast.LENGTH_SHORT).show();\n" +
            "        }catch (Exception e){\n" +
            "            Toast.makeText(this, \"Invalid Values\", Toast.LENGTH_SHORT).show();\n" +
            "        }\n" +
            "    }\n}";

    public void getcode(View v) {
        String tag = v.getTag().toString();
        switch (tag) {
            case "java":
                Intent i1 = new Intent(SQLite.this, code.class);
                i1.putExtra("code", jcode);
                startActivity(i1);
                break;
            case "xml":
                Intent i2 = new Intent(SQLite.this, code.class);
                i2.putExtra("code", xcode);
                startActivity(i2);
                break;
        }
    }
}