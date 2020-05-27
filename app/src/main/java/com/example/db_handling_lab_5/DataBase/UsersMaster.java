package com.example.db_handling_lab_5.DataBase;

import android.provider.BaseColumns;

public final class UsersMaster {

    private UsersMaster(){}

    public static class Users implements BaseColumns{
        public static final String TABLE_NME = "users";
        public static final String COLUMN_NAME_USERNAME = "username";
        public static final String COLUMN_NAME_PASSWORD = "password";
    }
}
