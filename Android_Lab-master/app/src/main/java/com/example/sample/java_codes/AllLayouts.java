package com.example.sample.java_codes;

import com.example.sample.R;
import com.example.sample.code;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AllLayouts extends AppCompatActivity {
String jcode;
String jcode1="package com.example.sample.java_codes;\n" +
        "\n" +
        "import com.example.sample.R;\n" +
        "import com.example.sample.code;\n" +
        "\n" +
        "import androidx.appcompat.app.AppCompatActivity;\n" +
        "\n" +
        "import android.content.Intent;\n" +
        "import android.os.Bundle;\n" +
        "import android.view.View;\n" +
        "import android.widget.Button;\n" +
        "\n" +
        "public class AllLayouts extends AppCompatActivity {\n" +
        "String jcode=\"\";\n" +
        "String xcode=\"\";\n" +
        "    @Override\n" +
        "    protected void onCreate(Bundle savedInstanceState) {\n" +
        "        super.onCreate(savedInstanceState);\n" +
        "        setContentView(R.layout.activity_all_layouts);\n" +
        "\n" +
        "    }\n" +
        "    public void viewCode(View v){\n" +
        "        String tag= v.getTag().toString();\n" +
        "        switch (tag){\n" +
        "            case \"java\":\n" +
        "                Intent i1= new Intent(AllLayouts.this,code.class);\n" +
        "                i1.putExtra(\"code\",jcode);\n" +
        "                break;\n" +
        "            case \"xml\" :\n" +
        "                Intent i2= new Intent(AllLayouts.this,code.class);\n" +
        "                i2.putExtra(\"code\",xcode);\n" +
        "                break;\n" +
        "        }\n" +
        "        \n" +
        "    }\n" +
        "//Linear Layout\n" +
        "//Constrain Layout\n" +
        "//Frame Layout" +
        "\n //Table Layout" +
        "\n//\n}";
String xcode="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
        "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
        "    android:layout_width=\"match_parent\"\n" +
        "    android:layout_height=\"match_parent\"\n" +
        "    android:background=\"#ffffff\"\n" +
        "    tools:context=\".java_codes.AllLayouts\">\n" +
        "\n" +
        "\n" +
        "    <ImageView\n" +
        "        android:id=\"@+id/lay_get_javacode\"\n" +
        "        android:layout_width=\"161dp\"\n" +
        "        android:layout_height=\"151dp\"\n" +
        "        android:layout_marginEnd=\"216dp\"\n" +
        "        android:layout_marginBottom=\"572dp\"\n" +
        "        android:onClick=\"viewCode\"\n" +
        "        android:tag=\"java\"\n" +
        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:srcCompat=\"@drawable/java_button11\" />\n" +
        "\n" +
        "    <ImageView\n" +
        "        android:id=\"@+id/lay_get_xml\"\n" +
        "        android:layout_width=\"173dp\"\n" +
        "        android:layout_height=\"142dp\"\n" +
        "        android:layout_marginEnd=\"16dp\"\n" +
        "        android:layout_marginBottom=\"572dp\"\n" +
        "        android:onClick=\"viewCode\"\n" +
        "        android:tag=\"xml\"\n" +
        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:srcCompat=\"@drawable/xml_button22\" />\n" +
        "\n" +
        "    <TextView\n" +
        "        android:id=\"@+id/textView2\"\n" +
        "        android:layout_width=\"wrap_content\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:layout_marginBottom=\"572dp\"\n" +
        "        android:fontFamily=\"monospace\"\n" +
        "        android:shadowColor=\"@color/text_shadow\"\n" +
        "        android:shadowDx=\"-1\"\n" +
        "        android:shadowDy=\"-1\"\n" +
        "        android:shadowRadius=\"2\"\n" +
        "        android:text=\"Get Java Code\"\n" +
        "        android:textColor=\"#03A9F4\"\n" +
        "        android:textSize=\"14sp\"\n" +
        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintHorizontal_bias=\"0.145\"\n" +
        "        app:layout_constraintStart_toStartOf=\"parent\" />\n" +
        "\n" +
        "    <TextView\n" +
        "        android:id=\"@+id/textView4\"\n" +
        "        android:layout_width=\"wrap_content\"\n" +
        "        android:layout_height=\"wrap_content\"\n" +
        "        android:layout_marginBottom=\"572dp\"\n" +
        "        android:fontFamily=\"monospace\"\n" +
        "        android:shadowColor=\"@color/text_shadow\"\n" +
        "        android:shadowDx=\"-1\"\n" +
        "        android:shadowDy=\"-1\"\n" +
        "        android:shadowRadius=\"2\"\n" +
        "        android:text=\"Get XML Code\"\n" +
        "        android:textColor=\"#03A9F4\"\n" +
        "        android:textSize=\"14sp\"\n" +
        "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintHorizontal_bias=\"0.834\"\n" +
        "        app:layout_constraintStart_toStartOf=\"parent\" />\n" +
        "\n" +
        "    <ScrollView\n" +
        "        android:layout_width=\"409dp\"\n" +
        "        android:layout_height=\"570dp\"\n" +
        "        android:layout_marginTop=\"1dp\"\n" +
        "        android:layout_marginEnd=\"1dp\"\n" +
        "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "        app:layout_constraintTop_toBottomOf=\"@+id/lay_get_javacode\">\n" +
        "\n" +
        "        <LinearLayout\n" +
        "            android:layout_width=\"match_parent\"\n" +
        "            android:layout_height=\"wrap_content\"\n" +
        "            android:orientation=\"vertical\">\n" +
        "                        <androidx.cardview.widget.CardView\n" +
        "                            android:layout_width=\"350dp\"\n" +
        "                            android:layout_height=\"500dp\"\n" +
        "                            android:layout_marginTop=\"20dp\"\n" +
        "                            android:layout_marginLeft=\"12dp\"\n" +
        "                            android:layout_gravity=\"center\"\n" +
        "                            app:cardBackgroundColor=\"#7EC6FF\"\n" +
        "                            app:cardCornerRadius=\"50dp\"\n" +
        "                            app:cardElevation=\"10dp\">\n" +
        "\n" +
        "                            <TextView\n" +
        "                                android:layout_width=\"match_parent\"\n" +
        "                                android:layout_height=\"41dp\"\n" +
        "                                android:fontFamily=\"monospace\"\n" +
        "                                android:text=\"Linear Layout\"\n" +
        "                                android:textAlignment=\"center\"\n" +
        "                                android:textColor=\"#000000\"\n" +
        "                                android:textSize=\"24sp\"\n" +
        "                                android:textStyle=\"bold\"\n" +
        "                                android:layout_marginTop=\"10dp\"/>\n" +
        "\n" +
        "                            <LinearLayout\n" +
        "                                android:layout_width=\"match_parent\"\n" +
        "                                android:layout_height=\"match_parent\"\n" +
        "                                android:layout_marginTop=\"30dp\"\n" +
        "                                android:paddingTop=\"20dp\"\n" +
        "                                android:orientation=\"vertical\">\n" +
        "                                <Button\n" +
        "                                    android:layout_width=\"match_parent\"\n" +
        "                                    android:layout_height=\"wrap_content\"\n" +
        "                                    android:text=\"Vertical orientation\"\n" +
        "                                    android:shadowColor=\"@android:color/transparent\"\n" +
        "                                    android:padding=\"15dp\"\n" +
        "                                    android:layout_marginRight=\"10dp\"\n" +
        "                                    android:layout_marginLeft=\"10dp\"\n" +
        "                                    android:layout_marginBottom=\"10dp\"\n" +
        "                                    android:layout_marginTop=\"0dp\"/>\n" +
        "\n" +
        "                                <Button\n" +
        "                                    android:layout_width=\"match_parent\"\n" +
        "                                    android:layout_height=\"wrap_content\"\n" +
        "                                    android:text=\"Vertical orientation\"\n" +
        "                                    android:shadowColor=\"@android:color/transparent\"\n" +
        "                                    android:padding=\"15dp\"\n" +
        "                                    android:layout_marginRight=\"10dp\"\n" +
        "                                    android:layout_marginLeft=\"10dp\"\n" +
        "                                    android:layout_marginBottom=\"10dp\"\n" +
        "                                    android:layout_marginTop=\"0dp\"\n" +
        "                                    android:textColor=\"@color/white\"/>\n" +
        "                                <Button\n" +
        "                                    android:layout_width=\"match_parent\"\n" +
        "                                    android:layout_height=\"wrap_content\"\n" +
        "                                    android:text=\"Vertical orientation\"\n" +
        "                                    android:shadowColor=\"@android:color/transparent\"\n" +
        "                                    android:padding=\"15dp\"\n" +
        "                                    android:layout_marginRight=\"10dp\"\n" +
        "                                    android:layout_marginLeft=\"10dp\"\n" +
        "                                    android:layout_marginBottom=\"10dp\"\n" +
        "                                    android:layout_marginTop=\"0dp\"\n" +
        "                                    android:textColor=\"@color/white\"/>\n" +
        "                                <Button\n" +
        "                                    android:layout_width=\"match_parent\"\n" +
        "                                    android:layout_height=\"wrap_content\"\n" +
        "                                    android:text=\"Vertical orientation\"\n" +
        "                                    android:shadowColor=\"@android:color/transparent\"\n" +
        "                                    android:padding=\"15dp\"\n" +
        "                                    android:layout_marginRight=\"10dp\"\n" +
        "                                    android:layout_marginLeft=\"10dp\"\n" +
        "                                    android:layout_marginBottom=\"10dp\"\n" +
        "                                    android:layout_marginTop=\"0dp\"\n" +
        "                                    android:textColor=\"@color/white\"/>\n" +
        "\n" +
        "                                <View\n" +
        "                                    android:layout_width=\"match_parent\"\n" +
        "                                    android:layout_height=\"5dp\"\n" +
        "android:layout_marginBottom=\"20dp\"\n" +
        "                                    android:layout_marginTop=\"20dp\"\n" +
        "                                    android:background=\"?android:attr/listDivider\"\n" +
        "                                    android:backgroundTint=\"#000000\" />\n" +
        "                                <LinearLayout\n" +
        "                                    android:layout_width=\"match_parent\"\n" +
        "                                    android:layout_height=\"wrap_content\"\n" +
        "                                    android:orientation=\"horizontal\">\n" +
        "\n" +
        "                                    <CheckBox\n" +
        "                                        android:layout_width=\"wrap_content\"\n" +
        "                                        android:layout_height=\"wrap_content\"\n" +
        "                                        android:text=\"Horizontal\"\n" +
        "                                        android:layout_marginRight=\"10dp\"\n" +
        "                                        android:layout_marginLeft=\"10dp\"\n" +
        "                                        android:layout_marginBottom=\"10dp\"\n" +
        "                                        android:layout_marginTop=\"0dp\"\n" +
        "                                        android:textColor=\"@color/white\"\n" +
        "                                        android:buttonTint=\"@color/white\"\n" +
        "                                        android:checked=\"true\"/>\n" +
        "                                    <CheckBox\n" +
        "                                        android:layout_width=\"wrap_content\"\n" +
        "                                        android:layout_height=\"wrap_content\"\n" +
        "                                        android:text=\"Horizontal\"\n" +
        "                                        android:layout_marginRight=\"10dp\"\n" +
        "                                        android:layout_marginLeft=\"10dp\"\n" +
        "                                        android:layout_marginBottom=\"10dp\"\n" +
        "                                        android:layout_marginTop=\"0dp\"\n" +
        "                                        android:textColor=\"@color/white\"\n" +
        "                                        android:buttonTint=\"@color/white\"\n" +
        "                                        android:checked=\"true\"/>\n" +
        "                                    <CheckBox\n" +
        "                                        android:layout_width=\"wrap_content\"\n" +
        "                                        android:layout_height=\"wrap_content\"\n" +
        "                                        android:text=\"Horizonta\"\n" +
        "                                        android:layout_marginRight=\"10dp\"\n" +
        "                                        android:layout_marginLeft=\"10dp\"\n" +
        "                                        android:layout_marginBottom=\"10dp\"\n" +
        "                                        android:layout_marginTop=\"0dp\"\n" +
        "                                        android:textColor=\"@color/white\"\n" +
        "                                        android:buttonTint=\"@color/white\"\n" +
        "                                        android:checked=\"true\"/>\n" +
        "\n" +
        "\n" +
        "                                </LinearLayout><LinearLayout\n" +
        "                                    android:layout_width=\"match_parent\"\n" +
        "                                    android:layout_height=\"wrap_content\"\n" +
        "                                    android:orientation=\"horizontal\">\n" +
        "\n" +
        "                                    <TextView\n" +
        "                                        android:layout_width=\"wrap_content\"\n" +
        "                                        android:layout_height=\"wrap_content\"\n" +
        "                                        android:text=\"Horizontal\"\n" +
        "                                        android:layout_marginRight=\"40dp\"\n" +
        "                                        android:layout_marginLeft=\"20dp\"\n" +
        "                                        android:layout_marginBottom=\"10dp\"\n" +
        "                                        android:layout_marginTop=\"0dp\"\n" +
        "                                        android:textColor=\"@color/white\"\n" +
        "                                        android:buttonTint=\"@color/white\"\n" +
        "                                        android:checked=\"true\"/>\n" +
        "                                    <TextView\n" +
        "                                        android:layout_width=\"wrap_content\"\n" +
        "                                        android:layout_height=\"wrap_content\"\n" +
        "                                        android:text=\"Horizontal\"\n" +
        "                                        android:layout_marginRight=\"40dp\"\n" +
        "                                        android:layout_marginLeft=\"10dp\"\n" +
        "                                        android:layout_marginBottom=\"10dp\"\n" +
        "                                        android:layout_marginTop=\"0dp\"\n" +
        "                                        android:textColor=\"@color/white\"\n" +
        "                                        android:buttonTint=\"@color/white\"\n" +
        "                                        android:checked=\"true\"/>\n" +
        "                                    <TextView\n" +
        "                                        android:layout_width=\"wrap_content\"\n" +
        "                                        android:layout_height=\"wrap_content\"\n" +
        "                                        android:text=\"Horizonta\"\n" +
        "                                        android:layout_marginRight=\"10dp\"\n" +
        "                                        android:layout_marginLeft=\"10dp\"\n" +
        "                                        android:layout_marginBottom=\"10dp\"\n" +
        "                                        android:layout_marginTop=\"0dp\"\n" +
        "                                        android:textColor=\"@color/white\"\n" +
        "                                        android:buttonTint=\"@color/white\"\n" +
        "                                        android:checked=\"true\"/>\n" +
        "\n" +
        "\n" +
        "                                </LinearLayout><LinearLayout\n" +
        "                                    android:layout_width=\"match_parent\"\n" +
        "                                    android:layout_height=\"wrap_content\"\n" +
        "                                    android:orientation=\"horizontal\">\n" +
        "\n" +
        "                                    <RadioButton\n" +
        "                                        android:layout_width=\"wrap_content\"\n" +
        "                                        android:layout_height=\"wrap_content\"\n" +
        "                                        android:text=\"Horizontal\"\n" +
        "                                        android:layout_marginRight=\"10dp\"\n" +
        "                                        android:layout_marginLeft=\"10dp\"\n" +
        "                                        android:layout_marginBottom=\"10dp\"\n" +
        "                                        android:layout_marginTop=\"0dp\"\n" +
        "                                        android:textColor=\"@color/white\"\n" +
        "                                        android:buttonTint=\"@color/white\"\n" +
        "                                        android:checked=\"true\"/>\n" +
        "                                    <RadioButton\n" +
        "                                        android:layout_width=\"wrap_content\"\n" +
        "                                        android:layout_height=\"wrap_content\"\n" +
        "                                        android:text=\"Horizontal\"\n" +
        "                                        android:layout_marginRight=\"10dp\"\n" +
        "                                        android:layout_marginLeft=\"10dp\"\n" +
        "                                        android:layout_marginBottom=\"10dp\"\n" +
        "                                        android:layout_marginTop=\"0dp\"\n" +
        "                                        android:textColor=\"@color/white\"\n" +
        "                                        android:buttonTint=\"@color/white\"\n" +
        "                                        android:checked=\"true\"/>\n" +
        "                                    <RadioButton\n" +
        "                                        android:layout_width=\"wrap_content\"\n" +
        "                                        android:layout_height=\"wrap_content\"\n" +
        "                                        android:text=\"Horizonta\"\n" +
        "                                        android:layout_marginRight=\"10dp\"\n" +
        "                                        android:layout_marginLeft=\"10dp\"\n" +
        "                                        android:layout_marginBottom=\"10dp\"\n" +
        "                                        android:layout_marginTop=\"0dp\"\n" +
        "                                        android:textColor=\"@color/white\"\n" +
        "                                        android:buttonTint=\"@color/white\"\n" +
        "                                        android:checked=\"true\"/>\n" +
        "\n" +
        "\n" +
        "                                </LinearLayout>\n" +
        "\n" +
        "\n" +
        "                            </LinearLayout>\n" +
        "                        </androidx.cardview.widget.CardView>\n" +
        "                        <androidx.cardview.widget.CardView\n" +
        "                            android:layout_width=\"350dp\"\n" +
        "                            android:layout_height=\"500dp\"\n" +
        "                            android:layout_marginTop=\"40dp\"\n" +
        "\n" +
        "                            android:layout_marginLeft=\"12dp\"\n" +
        "                            android:layout_gravity=\"center\"\n" +
        "                            app:cardBackgroundColor=\"#7EC6FF\"\n" +
        "                            app:cardCornerRadius=\"50dp\"\n" +
        "                            app:cardElevation=\"10dp\">\n" +
        "\n" +
        "\n" +
        "                            <FrameLayout\n" +
        "                                android:layout_width=\"match_parent\"\n" +
        "                                android:layout_height=\"match_parent\"\n" +
        "                                android:orientation=\"vertical\">\n" +
        "\n" +
        "                                <ImageView\n" +
        "                                    android:id=\"@+id/imgvw1\"\n" +
        "                                    android:layout_width=\"wrap_content\"\n" +
        "                                    android:layout_height=\"wrap_content\"\n" +
        "                                    android:scaleType=\"centerCrop\"\n" +
        "                                    android:src=\"@drawable/frame_back\" />\n" +
        "                                <TextView\n" +
        "                                    android:layout_width=\"match_parent\"\n" +
        "                                    android:layout_height=\"41dp\"\n" +
        "                                    android:fontFamily=\"monospace\"\n" +
        "                                    android:text=\"Frame Layout\"\n" +
        "                                    android:textAlignment=\"center\"\n" +
        "                                    android:textColor=\"#000000\"\n" +
        "                                    android:textSize=\"24sp\"\n" +
        "                                    android:layout_marginTop=\"10dp\"\n" +
        "                                    android:textStyle=\"bold\" />\n" +
        "                                <TextView\n" +
        "                                    android:id=\"@+id/txtvw1\"\n" +
        "                                    android:layout_width=\"match_parent\"\n" +
        "                                    android:layout_height=\"wrap_content\"\n" +
        "                                    android:layout_marginTop=\"50dp\"\n" +
        "                                    android:background=\"#4C374A\"\n" +
        "                                    android:padding=\"10dp\"\n" +
        "                                    android:text=\"New York City, USA\"\n" +
        "                                    android:textColor=\"#FFFFFF\"\n" +
        "                                    android:textSize=\"20sp\" />\n" +
        "                                <TextView\n" +
        "                                    android:id=\"@+id/txtvw2\"\n" +
        "                                    android:layout_width=\"150dp\"\n" +
        "                                    android:layout_height=\"wrap_content\"\n" +
        "                                    android:layout_gravity=\"right|bottom\"\n" +
        "                                    android:background=\"#AA000000\"\n" +
        "                                    android:padding=\"10dp\"\n" +
        "\n" +
        "                                    android:text=\"21/Aug/2017\"\n" +
        "                                    android:textColor=\"#FFFFFF\"\n" +
        "                                    android:textSize=\"18sp\" />\n" +
        "                            </FrameLayout>\n" +
        "                        </androidx.cardview.widget.CardView>\n" +
        "                        <androidx.cardview.widget.CardView\n" +
        "                android:layout_width=\"350dp\"\n" +
        "                android:layout_height=\"500dp\"\n" +
        "                android:layout_marginTop=\"40dp\"\n" +
        "\n" +
        "                            android:layout_marginLeft=\"12dp\"\n" +
        "                            android:layout_gravity=\"center\"\n" +
        "                app:cardBackgroundColor=\"#7EC6FF\"\n" +
        "                app:cardCornerRadius=\"50dp\"\n" +
        "                app:cardElevation=\"10dp\">\n" +
        "\n" +
        "                <TextView\n" +
        "                    android:layout_width=\"match_parent\"\n" +
        "                    android:layout_height=\"41dp\"\n" +
        "                    android:fontFamily=\"monospace\"\n" +
        "                    android:text=\"Table Layout\"\n" +
        "                    android:textAlignment=\"center\"\n" +
        "                    android:textColor=\"#000000\"\n" +
        "                    android:textSize=\"24sp\"\n" +
        "                    android:layout_marginTop=\"10dp\"\n" +
        "                    android:textStyle=\"bold\" />\n" +
        "\n" +
        "                <HorizontalScrollView\n" +
        "                    android:layout_width=\"409dp\"\n" +
        "                    android:layout_height=\"570dp\"\n" +
        "                    android:layout_marginTop=\"1dp\"\n" +
        "                    android:layout_marginEnd=\"1dp\"\n" +
        "                    app:layout_constraintEnd_toEndOf=\"parent\"\n" +
        "                    app:layout_constraintTop_toBottomOf=\"@+id/lay_get_javacode\">\n" +
        "\n" +
        "                <LinearLayout\n" +
        "                    android:layout_width=\"wrap_content\"\n" +
        "                    android:layout_height=\"wrap_content\"\n" +
        "android:layout_marginLeft=\"10dp\"\n" +
        "                    android:orientation=\"vertical\">\n" +
        "\n" +
        "                    <TableLayout\n" +
        "                        android:layout_width=\"match_parent\"\n" +
        "                        android:layout_height=\"match_parent\"\n" +
        "                        android:layout_marginTop=\"50dp\"\n" +
        "                        android:paddingLeft=\"10dp\"\n" +
        "                        android:paddingRight=\"10dp\">\n" +
        "\n" +
        "                        <TableRow\n" +
        "                            android:background=\"#0079D6\"\n" +
        "                            android:padding=\"5dp\">\n" +
        "\n" +
        "                            <TextView\n" +
        "                                android:layout_width=\"wrap_content\"\n" +
        "                                android:layout_height=\"wrap_content\"\n" +
        "                                android:layout_weight=\"1\"\n" +
        "                                android:text=\"UserId\" />\n" +
        "\n" +
        "                            <TextView\n" +
        "                                android:layout_width=\"wrap_content\"\n" +
        "                                android:layout_height=\"wrap_content\"\n" +
        "                                android:layout_weight=\"1\"\n" +
        "                                android:text=\"User Name\" />\n" +
        "\n" +
        "                            <TextView\n" +
        "                                android:layout_width=\"wrap_content\"\n" +
        "                                android:layout_height=\"wrap_content\"\n" +
        "                                android:layout_weight=\"1\"\n" +
        "                                android:text=\"Location\" />\n" +
        "                        </TableRow>\n" +
        "\n" +
        "                        <TableRow\n" +
        "                            android:background=\"#DAE8FC\"\n" +
        "                            android:padding=\"5dp\">\n" +
        "\n" +
        "                            <TextView\n" +
        "                                android:layout_width=\"wrap_content\"\n" +
        "                                android:layout_height=\"wrap_content\"\n" +
        "                                android:layout_weight=\"1\"\n" +
        "                                android:text=\"1\"\n" +
        "                                android:textColor=\"#000000\" />\n" +
        "\n" +
        "                            <TextView\n" +
        "                                android:layout_width=\"wrap_content\"\n" +
        "                                android:layout_height=\"wrap_content\"\n" +
        "                                android:layout_weight=\"1\"\n" +
        "                                android:text=\"Sushant Joshi\"\n" +
        "                                android:textColor=\"#000000\" />\n" +
        "\n" +
        "                            <TextView\n" +
        "                                android:layout_width=\"wrap_content\"\n" +
        "                                android:layout_height=\"wrap_content\"\n" +
        "                                android:layout_weight=\"1\"\n" +
        "                                android:text=\"Guhagar\"\n" +
        "                                android:textColor=\"#000000\" />\n" +
        "                        </TableRow>\n" +
        "\n" +
        "                        <TableRow\n" +
        "                            android:background=\"#DAE8FC\"\n" +
        "                            android:padding=\"5dp\">\n" +
        "\n" +
        "                            <TextView\n" +
        "                                android:layout_width=\"wrap_content\"\n" +
        "                                android:layout_height=\"wrap_content\"\n" +
        "                                android:layout_weight=\"1\"\n" +
        "                                android:text=\"2\"\n" +
        "                                android:textColor=\"#000000\" />\n" +
        "\n" +
        "                            <TextView\n" +
        "                                android:layout_width=\"wrap_content\"\n" +
        "                                android:layout_height=\"wrap_content\"\n" +
        "                                android:layout_weight=\"1\"\n" +
        "                                android:text=\"Keyur Gandhi\"\n" +
        "                                android:textColor=\"#000000\" />\n" +
        "\n" +
        "                            <TextView\n" +
        "                                android:layout_width=\"wrap_content\"\n" +
        "                                android:layout_height=\"wrap_content\"\n" +
        "                                android:layout_weight=\"1\"\n" +
        "                                android:text=\"Ratnagiri\"\n" +
        "                                android:textColor=\"#000000\"/>\n" +
        "                        </TableRow>\n" +
        "\n" +
        "                        <TableRow\n" +
        "                            android:background=\"#DAE8FC\"\n" +
        "                            android:padding=\"5dp\">\n" +
        "\n" +
        "                            <TextView\n" +
        "                                android:layout_width=\"wrap_content\"\n" +
        "                                android:layout_height=\"wrap_content\"\n" +
        "                                android:layout_weight=\"1\"\n" +
        "                                android:text=\"3\"\n" +
        "                                android:textColor=\"#000000\" />\n" +
        "\n" +
        "                            <TextView\n" +
        "                                android:layout_width=\"wrap_content\"\n" +
        "                                android:layout_height=\"wrap_content\"\n" +
        "                                android:layout_weight=\"1\"\n" +
        "                                android:text=\"Suyog Kokaje\"\n" +
        "                                android:textColor=\"#010101\" />\n" +
        "\n" +
        "                            <TextView\n" +
        "                                android:layout_width=\"wrap_content\"\n" +
        "                                android:layout_height=\"wrap_content\"\n" +
        "                                android:layout_weight=\"1\"\n" +
        "                                android:text=\"Devrukh\"\n" +
        "                                android:textColor=\"#000000\" />\n" +
        "                        </TableRow>\n" +
        "                    </TableLayout>\n" +
        "\n" +
        "                    <View\n" +
        "                        android:id=\"@+id/divider\"\n" +
        "                        android:layout_width=\"match_parent\"\n" +
        "                        android:layout_marginTop=\"20dp\"\n" +
        "                        android:layout_marginBottom=\"20dp\"\n" +
        "                        android:layout_height=\"5dp\"\n" +
        "\n" +
        "                        android:background=\"?android:attr/listDivider\"\n" +
        "                        android:backgroundTint=\"#000000\" />\n" +
        "\n" +
        "                    <TableLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
        "                        android:id=\"@+id/table_layout\"\n" +
        "                        android:layout_width=\"match_parent\"\n" +
        "                        android:layout_height=\"match_parent\">\n" +
        "\n" +
        "                        <TableRow\n" +
        "                            android:id=\"@+id/row_1\"\n" +
        "                            android:layout_width=\"match_parent\"\n" +
        "                            android:layout_height=\"match_parent\"\n" +
        "                            android:layout_marginTop=\"4dp\"\n" +
        "                            android:background=\"#3F51B5\">\n" +
        "\n" +
        "                            <TextView\n" +
        "                                android:layout_width=\"match_parent\"\n" +
        "                                android:layout_height=\"wrap_content\"\n" +
        "                                android:layout_weight=\"1\"\n" +
        "                                android:gravity=\"center\"\n" +
        "                                android:padding=\"32dp\"\n" +
        "                                android:text=\"Row 1\"\n" +
        "                                android:textColor=\"#fff\" />\n" +
        "                        </TableRow>\n" +
        "\n" +
        "                        <TableRow\n" +
        "                            android:id=\"@+id/row_2\"\n" +
        "                            android:layout_width=\"match_parent\"\n" +
        "                            android:layout_height=\"match_parent\"\n" +
        "                            android:layout_marginTop=\"2dp\">\n" +
        "\n" +
        "                            <TextView\n" +
        "                                android:layout_width=\"match_parent\"\n" +
        "                                android:layout_height=\"wrap_content\"\n" +
        "                                android:layout_weight=\"1\"\n" +
        "                                android:background=\"#3F51B5\"\n" +
        "                                android:gravity=\"center\"\n" +
        "                                android:padding=\"32dp\"\n" +
        "                                android:text=\"Row 2\\nColumn 1\"\n" +
        "                                android:textColor=\"#fff\" />\n" +
        "\n" +
        "                            <TextView\n" +
        "                                android:layout_width=\"match_parent\"\n" +
        "                                android:layout_height=\"wrap_content\"\n" +
        "                                android:layout_marginLeft=\"2dp\"\n" +
        "                                android:layout_marginRight=\"2dp\"\n" +
        "                                android:layout_weight=\"1\"\n" +
        "                                android:background=\"#3F51B5\"\n" +
        "                                android:gravity=\"center\"\n" +
        "                                android:padding=\"32dp\"\n" +
        "                                android:text=\"Row 2\\nColumn 2\"\n" +
        "                                android:textColor=\"#fff\" />\n" +
        "\n" +
        "                            <TextView\n" +
        "                                android:layout_width=\"match_parent\"\n" +
        "                                android:layout_height=\"wrap_content\"\n" +
        "                                android:layout_weight=\"1\"\n" +
        "                                android:background=\"#3F51B5\"\n" +
        "                                android:gravity=\"center\"\n" +
        "                                android:padding=\"32dp\"\n" +
        "                                android:text=\"Row 2\\nColumn 3\"\n" +
        "                                android:textColor=\"#fff\" />\n" +
        "                        </TableRow>\n" +
        "\n" +
        "                        <TableRow\n" +
        "                            android:id=\"@+id/row_3\"\n" +
        "                            android:layout_width=\"match_parent\"\n" +
        "                            android:layout_height=\"match_parent\"\n" +
        "                            android:layout_marginTop=\"2dp\">\n" +
        "\n" +
        "                            <TextView\n" +
        "                                android:layout_width=\"match_parent\"\n" +
        "                                android:layout_height=\"wrap_content\"\n" +
        "                                android:layout_marginRight=\"2dp\"\n" +
        "                                android:layout_weight=\"2\"\n" +
        "                                android:background=\"#3F51B5\"\n" +
        "                                android:gravity=\"center\"\n" +
        "                                android:padding=\"32dp\"\n" +
        "                                android:text=\"Row 3\\nColumn 1\"\n" +
        "                                android:textColor=\"#fff\" />\n" +
        "\n" +
        "                            <TextView\n" +
        "                                android:layout_width=\"match_parent\"\n" +
        "                                android:layout_height=\"wrap_content\"\n" +
        "                                android:layout_weight=\"1\"\n" +
        "                                android:background=\"#3F51B5\"\n" +
        "                                android:gravity=\"center\"\n" +
        "                                android:padding=\"32dp\"\n" +
        "                                android:text=\"Row3\\nCol 2\"\n" +
        "                                android:textColor=\"#fff\" />\n" +
        "\n" +
        "                        </TableRow>\n" +
        "\n" +
        "\n" +
        "                    </TableLayout>\n" +
        "                </LinearLayout>\n" +
        "                </HorizontalScrollView>\n" +
        "\n" +
        "            </androidx.cardview.widget.CardView>\n" +
        "\n" +
        "            <androidx.cardview.widget.CardView\n" +
        "                android:layout_width=\"350dp\"\n" +
        "                android:layout_height=\"500dp\"\n" +
        "android:layout_marginTop=\"40dp\"\n" +
        "                android:layout_marginLeft=\"12dp\"\n" +
        "                android:layout_gravity=\"center\"\n" +
        "                app:cardBackgroundColor=\"#244D6F\"\n" +
        "\n" +
        "                app:cardCornerRadius=\"50dp\"\n" +
        "                app:cardElevation=\"10dp\">\n" +
        "\n" +
        "\n" +
        "                <ImageView\n" +
        "                    android:layout_width=\"match_parent\"\n" +
        "                    android:layout_height=\"match_parent\"\n" +
        "                    android:src=\"@drawable/constrain_layout\"/>\n" +
        "                <TextView\n" +
        "                    android:layout_width=\"match_parent\"\n" +
        "                    android:layout_height=\"41dp\"\n" +
        "                    android:fontFamily=\"monospace\"\n" +
        "                    android:text=\"Constrain Layout\"\n" +
        "                    android:textAlignment=\"center\"\n" +
        "                    android:textColor=\"#000000\"\n" +
        "                    android:textSize=\"24sp\"\n" +
        "                    android:textStyle=\"bold\" />\n" +
        "            </androidx.cardview.widget.CardView>\n" +
        "\n" +
        "\n" +
        "        </LinearLayout>\n" +
        "\n" +
        "    </ScrollView>\n" +
        "\n" +
        "\n" +
        "</androidx.constraintlayout.widget.ConstraintLayout>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_layouts);

      jcode=getString(R.string.jcode_all_layouts);

    }
    public void viewCode(View v){
        String tag= v.getTag().toString();
        switch (tag){
            case "java":
                Intent i1= new Intent(AllLayouts.this,code.class);
                i1.putExtra("code",jcode);
                startActivity(i1);
                break;
            case "xml" :
                Intent i2= new Intent(AllLayouts.this,code.class);
                i2.putExtra("code",xcode);
                startActivity(i2);
                break;
        }

    }
}


