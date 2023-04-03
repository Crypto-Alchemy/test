package com.squareup.sqldelight.android;

import androidx.sqlite.p006db.SupportSQLiteDatabase;
import androidx.sqlite.p006db.SupportSQLiteOpenHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo44877d2 = {"Landroidx/sqlite/db/SupportSQLiteDatabase;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 5, 1})
/* compiled from: AndroidSqliteDriver.kt */
public final class AndroidSqliteDriver$database$2 extends Lambda implements pc2<SupportSQLiteDatabase> {
    public final /* synthetic */ SupportSQLiteDatabase $database;
    public final /* synthetic */ AndroidSqliteDriver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidSqliteDriver$database$2(AndroidSqliteDriver androidSqliteDriver, SupportSQLiteDatabase supportSQLiteDatabase) {
        super(0);
        this.this$0 = androidSqliteDriver;
        this.$database = supportSQLiteDatabase;
    }

    public final SupportSQLiteDatabase invoke() {
        SupportSQLiteOpenHelper b = this.this$0.f26951a;
        SupportSQLiteDatabase writableDatabase = b == null ? null : b.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        SupportSQLiteDatabase supportSQLiteDatabase = this.$database;
        vx2.m53588d(supportSQLiteDatabase);
        return supportSQLiteDatabase;
    }
}
