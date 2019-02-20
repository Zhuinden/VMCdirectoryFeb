package com.example.vmcdirectory.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

import com.example.vmcdirectory.Model.Patients;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;
import java.util.List;

public class Database extends SQLiteAssetHelper {

    private static final String DB_Name = "patientrooms.db";
    private static final int DB_VER = 1;

    public Database(Context context) {
        super(context, DB_Name, null, DB_VER);
    }

    //Function get all Patients
    public List<Patients> getPatients() {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String[] sqlSelect = {"id", "patient", "rn", "secretary", "room_phone", "case_manager", "pharmacist", "nutritionist", "wound"};
        String tableName = "patientrooms";

        qb.setTables(tableName);
        Cursor cursor = qb.query(db, sqlSelect, null, null, null, null, null);
        List<Patients> result = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                Patients patients = new Patients();
                patients.setId(cursor.getInt(cursor.getColumnIndex("id")));
                patients.setPatient(cursor.getString(cursor.getColumnIndex("patient")));
                patients.setRn(cursor.getString(cursor.getColumnIndex("rn")));
                patients.setSecretary(cursor.getString(cursor.getColumnIndex("secretary")));
                ;
                patients.setRoom_phone(cursor.getString(cursor.getColumnIndex("room_phone")));
                ;
                patients.setCase_manager(cursor.getString(cursor.getColumnIndex("case_manager")));
                ;
                patients.setPharmacist(cursor.getString(cursor.getColumnIndex("pharmacist")));
                ;
                patients.setNutritionist(cursor.getString(cursor.getColumnIndex("nutritionist")));
                ;
                patients.setWound(cursor.getString(cursor.getColumnIndex("wound")));
                ;

                result.add(patients);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return result;
    }

    //Function get all Patient rooms
    public List<String> getpatient() {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String[] sqlSelect = {"patient"};
        String tableName = "patientrooms";

        qb.setTables(tableName);
        Cursor cursor = qb.query(db, sqlSelect, null, null, null, null, null);
        List<String> result = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                result.add(cursor.getString(cursor.getColumnIndex("patient")));
            } while (cursor.moveToNext());
        }
        cursor.close();
        return result;

    }

    //Function get patient by room
    public List<Patients> getpatientbyroom(String patient) {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String[] sqlSelect = {"id", "patient", "rn", "secretary", "room_phone", "case_manager", "pharmacist", "nutritionist", "wound"};
        String tableName = "patientrooms";

        qb.setTables(tableName);
        //
        Cursor cursor = qb.query(db, sqlSelect, "patient = ?", new String[]{patient}, null, null, null);
        List<Patients> result = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                Patients patients = new Patients();
                patients.setId(cursor.getInt(cursor.getColumnIndex("id")));
                patients.setPatient(cursor.getString(cursor.getColumnIndex("patient")));
                patients.setRn(cursor.getString(cursor.getColumnIndex("rn")));
                patients.setSecretary(cursor.getString(cursor.getColumnIndex("secretary")));
                ;
                patients.setRoom_phone(cursor.getString(cursor.getColumnIndex("room_phone")));
                ;
                patients.setCase_manager(cursor.getString(cursor.getColumnIndex("case_manager")));
                ;
                patients.setPharmacist(cursor.getString(cursor.getColumnIndex("pharmacist")));
                ;
                patients.setNutritionist(cursor.getString(cursor.getColumnIndex("nutritionist")));
                ;
                patients.setWound(cursor.getString(cursor.getColumnIndex("wound")));
                ;

                result.add(patients);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return result;
    }
}
