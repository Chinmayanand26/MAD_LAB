package com.example.sample;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import br.tiagohm.codeview.CodeView;
import br.tiagohm.codeview.Language;
import br.tiagohm.codeview.Theme;

public class code extends AppCompatActivity implements CodeView.OnHighlightListener {
    String CODE;
    CodeView mCodeView;
    private ProgressDialog mProgressDialog;
    private int themePos = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        CODE= extras.getString("code");
        setContentView(R.layout.code_view);

        mCodeView = (CodeView) findViewById(R.id.code_view1);

        mCodeView.setOnHighlightListener(this)
                .setOnHighlightListener(this)
                .setTheme(Theme.MONOKAI)
                .setCode(CODE)
                .setLanguage(Language.JAVA)
                .setWrapLine(true)
                .setFontSize(12)
                .setZoomEnabled(true)
                .setShowLineNumber(true)
                .setStartLineNumber(1)
                .apply();
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.change_theme_action:
//                setHighlightTheme(++themePos);
//                return true;
//            case R.id.show_line_number_action:
//                mCodeView.toggleLineNumber();
//                break;
//        }
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    public void onStartCodeHighlight() {
        mProgressDialog = ProgressDialog.show(this, null, "Wait...", true);
    }

    @Override
    public void onFinishCodeHighlight() {
        if (mProgressDialog != null) {
            mProgressDialog.dismiss();
        }
        Toast.makeText(this, "line count: " + mCodeView.getLineCount(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLanguageDetected(Language language, int relevance) {
        Toast.makeText(this, "language: " + language + " relevance: " + relevance, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFontSizeChanged(int sizeInPx) {
        Log.d("TAG", "font-size: " + sizeInPx + "px");
    }

    @Override
    public void onLineClicked(int lineNumber, String content) {
        Toast.makeText(this, "line: " + lineNumber + " java: " + content, Toast.LENGTH_SHORT).show();
    }

    private void setHighlightTheme(int pos) {
        mCodeView.setTheme(Theme.ALL.get(pos)).apply();
        Toast.makeText(this, Theme.ALL.get(pos).getName(), Toast.LENGTH_SHORT).show();
    }
}