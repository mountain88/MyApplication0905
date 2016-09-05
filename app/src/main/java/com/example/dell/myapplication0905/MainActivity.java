package com.example.dell.myapplication0905;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<User> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //用封装好的数据库及相关方法进行操作
        DBManager dbmanager=new DBManager(this);
        dbmanager.insertRelation(1);
        //用sqliteopenhelper方法帮忙创建数据库
//        MySqliteOpenHelper openHelper=new MySqliteOpenHelper(this,"user.db",null,1);
//        SQLiteDatabase db=openHelper.getWritableDatabase();
//        //==========================将数据库通过输入输出流写入scard中
//        InputStream in=getResources().openRawResource(R.raw.sms);
//        File file=getExternalFilesDir("");//获取文件路径
//        File smsFile=new File(file,"sms.db");
//        try {
//            OutputStream out=new FileOutputStream(smsFile);
//            byte [] buff=new byte[1024];
//            int len=0;
//            while((len=in.read(buff))!=-1){
//                out.write(buff,0,len);
//            }
//            out.close();
//            in.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        //调用数据库
//        SQLiteDatabase db=SQLiteDatabase.openOrCreateDatabase(smsFile,null);
//        String sql="select zname from zsmscategory";
//        Cursor cursor=db.rawQuery(sql,null);
//        TextView textview= (TextView) findViewById(R.id.tv);
//        textview.setText("");
//        while (cursor.moveToNext()){
//            String name=cursor.getString(0);
//            textview.append(name+"\n");
//        }
//        cursor.close();//用完也关闭一下，省的崩溃
//        db.close();
//        String sql="insert into user(name,sex) values('你好','true')";
//        db.execSQL(sql);
        //增
//        ContentValues cv=new ContentValues();
//        cv.put("name","张三");
//        cv.put("sex","true");
//        db.insert("user",null,cv);
        //删
//        String sql1="delete from user where name='张三'";
//        db.execSQL(sql1);
        //改
//        ContentValues cv1=new ContentValues();
//        cv1.put("name","哈哈哈哈哈");
//        db.update("user",cv1,"name=? and sex=?",new String[]{"你好","true"});
        //查
//        Cursor cursor=db.query("user",new String[]{"name","id"},null,null,null,null,null);
//        list=new ArrayList<>();
//        while(cursor.moveToNext()){
//            String name=cursor.getString(0);
//            int id=cursor.getInt(1);
//
//            User user=new User();
//            user.setId(id);
//            user.setName(name);
//            list.add(user);
//            TextView textView= (TextView) findViewById(R.id.tv);
//            textView.setText("");
//            for (User u:list
//                 ) {
//                //将打印出来的东西直接放到textview中去
//                textView.append(u.getId()+" "+u.getName()+"\n");
//
//            }
//
//        }
    }
}
