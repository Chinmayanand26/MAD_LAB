package com.example.sample.java_codes;
import  com.example.sample.R;
import com.example.sample.code;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Permissions extends AppCompatActivity {
    private Button storage, camera,location,contacts,record;

    private static final int CAMERA_PERMISSION_CODE = 100;
    private static final int STORAGE_PERMISSION_CODE = 101;
    private static final int LOCATION_PERMISSION_CODE = 1;
    private static final int CONTACTS_PERMISSION_CODE = 2;
    private static final int RECORD_PERMISSION_CODE = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permissions);
        storage = findViewById(R.id.storage);
        camera = findViewById(R.id.camera);
        location = findViewById(R.id.location);
        contacts = findViewById(R.id.contacts);
        record = findViewById(R.id.record);

        // Set Buttons on Click Listeners
        storage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE);
            }
        });

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                checkPermission(Manifest.permission.CAMERA, CAMERA_PERMISSION_CODE);
            }
        });
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                checkPermission(Manifest.permission.ACCESS_FINE_LOCATION, LOCATION_PERMISSION_CODE);
            }
        });
        contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                checkPermission(Manifest.permission.READ_CONTACTS, CONTACTS_PERMISSION_CODE);
            }
        });
        record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                checkPermission(Manifest.permission.RECORD_AUDIO, RECORD_PERMISSION_CODE);
            }
        });
    }


    public void checkPermission(String permission, int requestCode)
    {
        if (ContextCompat.checkSelfPermission(Permissions.this, permission) == PackageManager.PERMISSION_DENIED) {

            // Requesting the permission
            ActivityCompat.requestPermissions(Permissions.this, new String[] { permission }, requestCode);
        }
        else {
            Toast.makeText(Permissions.this, "Permission already granted", Toast.LENGTH_SHORT).show();
        }
    }

    // This function is called when the user accepts or decline the permission.
    // Request Code is used to check which permission called this function.
    // This request code is provided when the user is prompt for permission.

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           @NonNull String[] permissions,
                                           @NonNull int[] grantResults)
    {
        super.onRequestPermissionsResult(requestCode,
                permissions,
                grantResults);

        if (requestCode == CAMERA_PERMISSION_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(Permissions.this, "Camera Permission Granted", Toast.LENGTH_SHORT) .show();
            }
            else {
                Toast.makeText(Permissions.this, "Camera Permission Denied", Toast.LENGTH_SHORT) .show();
            }
        }
        else if (requestCode == STORAGE_PERMISSION_CODE) {
            if (grantResults.length > 0
                    && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(Permissions.this, "Storage Permission Granted", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(Permissions.this, "Storage Permission Denied", Toast.LENGTH_SHORT).show();
            }
        }
        else if (requestCode == LOCATION_PERMISSION_CODE) {
            if (grantResults.length > 0
                    && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(Permissions.this, "Location Permission Granted", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(Permissions.this, "Location Permission Denied", Toast.LENGTH_SHORT).show();
            }
        }
        else if (requestCode == CONTACTS_PERMISSION_CODE) {
            if (grantResults.length > 0
                    && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(Permissions.this, "Contacts Permission Granted", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(Permissions.this, "Contacts" +
                        " Permission Denied", Toast.LENGTH_SHORT).show();
            }
        }else if (requestCode == RECORD_PERMISSION_CODE) {
            if (grantResults.length > 0
                    && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(Permissions.this, "Recording Permission Granted", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(Permissions.this, "Recording Permission Denied", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void getcode(View v) {
        String tag = v.getTag().toString();
        switch (tag) {
            case "java":
                Intent i1 = new Intent(Permissions.this, code.class);
                i1.putExtra("code", jcode);
                startActivity(i1);
                break;
            case "xml":
                Intent i2 = new Intent(Permissions.this, code.class);
                i2.putExtra("code", xcode);
                startActivity(i2);
                break;
        }
    }
    String jcode="package com.example.sample.java_codes;\n" +
            "import  com.example.sample.R;\n" +
            "import com.example.sample.code;\n" +
            "\n" +
            "import androidx.annotation.NonNull;\n" +
            "import androidx.appcompat.app.AppCompatActivity;\n" +
            "import androidx.core.app.ActivityCompat;\n" +
            "import androidx.core.content.ContextCompat;\n" +
            "\n" +
            "import android.Manifest;\n" +
            "import android.content.Intent;\n" +
            "import android.content.pm.PackageManager;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "public class Permissions extends AppCompatActivity {\n" +
            "    private Button storage, camera,location,contacts,record;\n" +
            "\n" +
            "    private static final int CAMERA_PERMISSION_CODE = 100;\n" +
            "    private static final int STORAGE_PERMISSION_CODE = 101;\n" +
            "    private static final int LOCATION_PERMISSION_CODE = 1;\n" +
            "    private static final int CONTACTS_PERMISSION_CODE = 2;\n" +
            "    private static final int RECORD_PERMISSION_CODE = 3;\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_permissions);\n" +
            "        storage = findViewById(R.id.storage);\n" +
            "        camera = findViewById(R.id.camera);\n" +
            "        location = findViewById(R.id.location);\n" +
            "        contacts = findViewById(R.id.contacts);\n" +
            "        record = findViewById(R.id.record);\n" +
            "\n" +
            "        // Set Buttons on Click Listeners\n" +
            "        storage.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v)\n" +
            "            {\n" +
            "                checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, STORAGE_PERMISSION_CODE);\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        camera.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v)\n" +
            "            {\n" +
            "                checkPermission(Manifest.permission.CAMERA, CAMERA_PERMISSION_CODE);\n" +
            "            }\n" +
            "        });\n" +
            "        location.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v)\n" +
            "            {\n" +
            "                checkPermission(Manifest.permission.ACCESS_FINE_LOCATION, LOCATION_PERMISSION_CODE);\n" +
            "            }\n" +
            "        });\n" +
            "        contacts.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v)\n" +
            "            {\n" +
            "                checkPermission(Manifest.permission.READ_CONTACTS, CONTACTS_PERMISSION_CODE);\n" +
            "            }\n" +
            "        });\n" +
            "        record.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v)\n" +
            "            {\n" +
            "                checkPermission(Manifest.permission.RECORD_AUDIO, RECORD_PERMISSION_CODE);\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "    public void checkPermission(String permission, int requestCode)\n" +
            "    {\n" +
            "        if (ContextCompat.checkSelfPermission(Permissions.this, permission) == PackageManager.PERMISSION_DENIED) {\n" +
            "\n" +
            "            // Requesting the permission\n" +
            "            ActivityCompat.requestPermissions(Permissions.this, new String[] { permission }, requestCode);\n" +
            "        }\n" +
            "        else {\n" +
            "            Toast.makeText(Permissions.this, \"Permission already granted\", Toast.LENGTH_SHORT).show();\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    // This function is called when the user accepts or decline the permission.\n" +
            "    // Request Code is used to check which permission called this function.\n" +
            "    // This request code is provided when the user is prompt for permission.\n" +
            "\n" +
            "    @Override\n" +
            "    public void onRequestPermissionsResult(int requestCode,\n" +
            "                                           @NonNull String[] permissions,\n" +
            "                                           @NonNull int[] grantResults)\n" +
            "    {\n" +
            "        super.onRequestPermissionsResult(requestCode,\n" +
            "                permissions,\n" +
            "                grantResults);\n" +
            "\n" +
            "        if (requestCode == CAMERA_PERMISSION_CODE) {\n" +
            "            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {\n" +
            "                Toast.makeText(Permissions.this, \"Camera Permission Granted\", Toast.LENGTH_SHORT) .show();\n" +
            "            }\n" +
            "            else {\n" +
            "                Toast.makeText(Permissions.this, \"Camera Permission Denied\", Toast.LENGTH_SHORT) .show();\n" +
            "            }\n" +
            "        }\n" +
            "        else if (requestCode == STORAGE_PERMISSION_CODE) {\n" +
            "            if (grantResults.length > 0\n" +
            "                    && grantResults[0] == PackageManager.PERMISSION_GRANTED) {\n" +
            "                Toast.makeText(Permissions.this, \"Storage Permission Granted\", Toast.LENGTH_SHORT).show();\n" +
            "            } else {\n" +
            "                Toast.makeText(Permissions.this, \"Storage Permission Denied\", Toast.LENGTH_SHORT).show();\n" +
            "            }\n" +
            "        }\n" +
            "        else if (requestCode == LOCATION_PERMISSION_CODE) {\n" +
            "            if (grantResults.length > 0\n" +
            "                    && grantResults[0] == PackageManager.PERMISSION_GRANTED) {\n" +
            "                Toast.makeText(Permissions.this, \"Location Permission Granted\", Toast.LENGTH_SHORT).show();\n" +
            "            } else {\n" +
            "                Toast.makeText(Permissions.this, \"Location Permission Denied\", Toast.LENGTH_SHORT).show();\n" +
            "            }\n" +
            "        }\n" +
            "        else if (requestCode == CONTACTS_PERMISSION_CODE) {\n" +
            "            if (grantResults.length > 0\n" +
            "                    && grantResults[0] == PackageManager.PERMISSION_GRANTED) {\n" +
            "                Toast.makeText(Permissions.this, \"Contacts Permission Granted\", Toast.LENGTH_SHORT).show();\n" +
            "            } else {\n" +
            "                Toast.makeText(Permissions.this, \"Contacts\" +\n" +
            "                        \" Permission Denied\", Toast.LENGTH_SHORT).show();\n" +
            "            }\n" +
            "        }else if (requestCode == RECORD_PERMISSION_CODE) {\n" +
            "            if (grantResults.length > 0\n" +
            "                    && grantResults[0] == PackageManager.PERMISSION_GRANTED) {\n" +
            "                Toast.makeText(Permissions.this, \"Recording Permission Granted\", Toast.LENGTH_SHORT).show();\n" +
            "            } else {\n" +
            "                Toast.makeText(Permissions.this, \"Recording Permission Denied\", Toast.LENGTH_SHORT).show();\n" +
            "            }\n" +
            "        }\n" +
            "    }";
    String xcode="  <LinearLayout\n" +
            "        xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "        xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "        xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:orientation=\"vertical\"\n" +
            "\n" +
            "        android:layout_height=\"match_parent\">\n" +
            "\n" +
            "\n" +
            "        <Button\n" +
            "            android:id=\"@+id/storage\"\n" +
            "            android:layout_width=\"300dp\"\n" +
            "            android:layout_height=\"40dp\"\n" +
            "            android:text=\"Storage\"\n" +
            "            android:background=\"@drawable/button\"\n" +
            "            android:layout_marginTop=\"30dp\"\n" +
            "            android:layout_marginLeft=\"30dp\"\n" +
            "            android:padding=\"8dp\"\n" +
            "            android:layout_centerHorizontal=\"true\"/>\n" +
            "\n" +
            "        <!--Button to request camera permission-->\n" +
            "        <Button\n" +
            "            android:id=\"@+id/camera\"\n" +
            "            android:layout_width=\"300dp\"\n" +
            "            android:layout_height=\"40dp\"\n" +
            "            android:text=\"Camera\"\n" +
            "\n" +
            "            android:background=\"@drawable/button\"\n" +
            "            android:layout_marginTop=\"30dp\"\n" +
            "            android:layout_marginLeft=\"30dp\"\n" +
            "            android:padding=\"8dp\"\n" +
            "            android:layout_centerHorizontal=\"true\"/>\n" +
            "        <Button\n" +
            "            android:id=\"@+id/location\"\n" +
            "            android:layout_width=\"300dp\"\n" +
            "            android:layout_height=\"40dp\"\n" +
            "\n" +
            "            android:background=\"@drawable/button\"\n" +
            "            android:text=\"Location\"\n" +
            "            android:layout_marginTop=\"30dp\"\n" +
            "            android:layout_marginLeft=\"30dp\"\n" +
            "            android:padding=\"8dp\"\n" +
            "            android:layout_centerHorizontal=\"true\"/>\n" +
            "        <Button\n" +
            "            android:id=\"@+id/contacts\"\n" +
            "            android:layout_width=\"300dp\"\n" +
            "            android:layout_height=\"40dp\"\n" +
            "\n" +
            "            android:background=\"@drawable/button\"\n" +
            "            android:text=\"Contacts\"\n" +
            "            android:layout_marginTop=\"30dp\"\n" +
            "            android:layout_marginLeft=\"30dp\"\n" +
            "            android:padding=\"8dp\"\n" +
            "            android:layout_centerHorizontal=\"true\"/>\n" +
            "        <Button\n" +
            "            android:id=\"@+id/record\"\n" +
            "            android:layout_width=\"300dp\"\n" +
            "            android:layout_height=\"40dp\"\n" +
            "\n" +
            "            android:background=\"@drawable/button\"\n" +
            "            android:text=\"Recording\"\n" +
            "            android:layout_marginTop=\"30dp\"\n" +
            "            android:layout_marginLeft=\"30dp\"\n" +
            "            android:padding=\"8dp\"\n" +
            "            android:layout_centerHorizontal=\"true\"/>\n" +
            "\n" +
            "    </LinearLayout>";
}