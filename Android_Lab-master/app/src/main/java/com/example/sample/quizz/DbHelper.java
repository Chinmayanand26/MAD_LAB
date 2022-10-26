package com.example.sample.quizz;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class DbHelper extends SQLiteOpenHelper {

    //DB version, table and database name
    private static final int DB_VERSION = 2;
    private static final String DB_NAME = "quizdb0";
    private static final String DB_TABLE = "quiztable0";

    //table column names
    private static final String KEY_ID = "id";
    private static final String KEY_QUES = "question";
    private static final String KEY_ANSWER = "answer";
    private static final String KEY_OPTA = "optA";
    private static final String KEY_OPTB = "optB";
    private static final String KEY_OPTC = "optC";
    private static final String KEY_EXP = "exp";

    private SQLiteDatabase dbase;
    private int rowCount = 0;

    public DbHelper(Context context){
        super(context,DB_NAME,null,DB_VERSION);
        //  //3rd argument to be passed is CursorFactory instance
    }



    //create table
    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase = db;
        String sqlQuery = "CREATE TABLE IF NOT EXISTS "+
                DB_TABLE+"("+KEY_ID  + " INTEGER PRIMARY KEY," + KEY_QUES +" TEXT," + KEY_ANSWER+" TEXT," + KEY_OPTA +" TEXT," + KEY_OPTB+" TEXT," + KEY_OPTC +" TEXT," +KEY_EXP+" TEXT"+")";
        Log.d("TaskDBHelper", "Query to form table" + sqlQuery);
        db.execSQL(sqlQuery);
        addQuestions();
    }

    private void addQuestions() {
        Question q1 = new Question("Choose the correct option related to Android.", "Android is a web browser", "Android is an Operating System", "Android is a web server", "Android is an Operating System","a");
        this.addQuestionToDB(q1);
        Question q2 = new Question("What is an activity in android?", "Class", "Pacakage", "Single Screen", "Single Screen","a");
        this.addQuestionToDB(q2);
        Question q3 = new Question("Among the following options choose the one for which Android is based on Linux.", "Networking", "Portability", "Both", "Both","a");
        this.addQuestionToDB(q3);
        Question q4 = new Question(". Among the below virtual machines choose the one which is used by the Android operating system?", "Dalvik operating system", "JVM", "Simple Virtual Machine", "SDalvik operating system","a");
        this.addQuestionToDB(q4);
        Question q5 = new Question("Identify the language on which Android is based upon.", "Java", "C++", "Python", "Java","a");
        this.addQuestionToDB(q5);
        Question q6 = new Question("All layout classes are the subclasses of", "android.widget", "android.view.View", "android.view.ViewGroup", "android.view.ViewGroup","a");
        this.addQuestionToDB(q6);
        Question q7 = new Question("The full form of APK is:", "Android Phone Kit", "Android Page Kit", "Android Package Kit", "Android Package Kit","a");
        this.addQuestionToDB(q7);
        Question q8 = new Question("What is manifest XML in android ?", "It has information about layout in an application", "It has all the information about an application", "It has the information about activities in an application", "It has all the information about an application","a");
        this.addQuestionToDB(q8);
        Question q9 = new Question("What is the use of a content provider in Android?", "For sharing the data between applications", "For storing the data in the database", "For sending the data from an application to another application", "For sending the data from an application to another application","a");
        this.addQuestionToDB(q9);
        Question q10 = new Question("While developing android application developers can test their apps on", "Emulators in Android SDK", "Android Phone", "Both", "Both","a");
        this.addQuestionToDB(q10);
        Question q11 = new Question("In android, mini activities are also known as", "Adapter", "Fragments", "None", "Fragments","a");
        this.addQuestionToDB(q11);
        Question q12 = new Question("Among the following choose the one which converts Java bytecode into Dalvik bytecode?", "dex compiler", "Mobile interpretive compare", "Dalvik converter", "dex compiler","a");
        this.addQuestionToDB(q12);
        Question q13 = new Question("The services in android can be stopped using which of the following method?", "system. exit()  method", "stopSelf() and stopService() method", "finish() method", "stopSelf() and stopService() method","a");
        this.addQuestionToDB(q13);
        Question q14 = new Question("Activity in Android can be killed using?", "finishActivity (int requestCode)", "finish() method", "Both", "Both","a");
        this.addQuestionToDB(q14);
        Question q15 = new Question("The full form of ADB is:", "Android Delete Bridge", "Android Debug Bridge", "Android Developed Bridge", "Android Debug Bridge","a");
        this.addQuestionToDB(q15);
        Question q16 = new Question("AVD stands for", "Android Virtual Device", "Android Virtual display", "Active Virtual Display", "Android Virtual Device","a");
        this.addQuestionToDB(q16);
        Question q17 = new Question("Choose among the following tabs in which an error is shown", "ADB logs", "Memory", "Logcat", "Logcat","a");
        this.addQuestionToDB(q17);
        Question q18 = new Question("When was Open Handset Alliance announced?", "2004", "2007", "2022", "2007","a");
        this.addQuestionToDB(q18);
        Question q19 = new Question("Identify the topmost layer of Android architecture", "Applications", "Applications Framework", "Linux Kernel", "Applications Framework","a");
        this.addQuestionToDB(q19);
        Question q20 = new Question("Where should we mention all permissions", "in java file", "in manifest file", "in layout file", "in manifest file","a");
        this.addQuestionToDB(q20);

    }

    //code to add new question
    public void addQuestionToDB(Question q){
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, q.getQuestion());
        values.put(KEY_ANSWER,q.getAnswer());
        values.put(KEY_OPTA,q.getOptA());
        values.put(KEY_OPTB,q.getOptB());
        values.put(KEY_OPTC,q.getOptC());
        values.put(KEY_EXP,q.getExplanation());
        //insert row
        dbase.insert(DB_TABLE, null, values);
    }
    //get all question in listview
    public List <Question> getAllQuestions(){
        List <Question> questionList = new ArrayList<Question>();

        dbase = this.getReadableDatabase();
        String selectQuery = "SELECT * FROM "+DB_TABLE;
        Cursor cursor = dbase.rawQuery(selectQuery,null);
        rowCount = cursor.getCount();

        if(cursor.moveToFirst()){
            do{
                Question q = new Question();
                q.setId(cursor.getInt(0));
                q.setQuestion(cursor.getString(1));
                q.setAnswer(cursor.getString(2));
                q.setOptA(cursor.getString(3));
                q.setOptB(cursor.getString(4));
                q.setOptC(cursor.getString(5));
                q.setExplanation(cursor.getString(5));

                //add question in list
                questionList.add(q);

                //loop all rows
            }while (cursor.moveToNext());
        }
        return questionList;
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+DB_TABLE);
        onCreate(db);
    }

    public int getRowCount(){
        return rowCount;
    }
}