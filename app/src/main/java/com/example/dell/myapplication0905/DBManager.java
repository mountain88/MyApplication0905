package com.example.dell.myapplication0905;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by dell on 2016-09-05.
 */
public class DBManager {
    private File smsFile;
    public DBManager(Context context){
        //创建数据库
        File file=context.getExternalFilesDir("");
        smsFile=new File(file,"sms.db");
        //判断是否存在文件，不存在创建，存在不创建
        if(smsFile.exists()){
            return;
        }else{
            copy(context);
        }

    }

    private void copy(Context context) {
        InputStream in=context.getResources().openRawResource(R.raw.sms);
        try {
            OutputStream out=new FileOutputStream(smsFile);
            byte[] buff=new byte[1024];
            int len=0;
            while((len=in.read(buff))!=-1){
                out.write(buff,0,len);
            }
            out.close();
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //添加数据
    public void insertRelation(int contentid){
        String sql="insert into zsmsrelation(zcategory_id,zcontent)values(-1,"+contentid+")";
        SQLiteDatabase db=SQLiteDatabase.openOrCreateDatabase(smsFile,null);
        db.execSQL(sql);
        db.close();

    }
    public void delete(){

    }
}
