package com.squareup.sqldelight.android;

import androidx.sqlite.p006db.SupportSQLiteStatement;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo44877d2 = {"Lkj;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 5, 1})
/* compiled from: AndroidSqliteDriver.kt */
public final class AndroidSqliteDriver$execute$1 extends Lambda implements pc2<C6155kj> {
    public final /* synthetic */ String $sql;
    public final /* synthetic */ AndroidSqliteDriver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidSqliteDriver$execute$1(AndroidSqliteDriver androidSqliteDriver, String str) {
        super(0);
        this.this$0 = androidSqliteDriver;
        this.$sql = str;
    }

    public final C6155kj invoke() {
        SupportSQLiteStatement compileStatement = this.this$0.mo39620e().compileStatement(this.$sql);
        vx2.m53590f(compileStatement, "database.compileStatement(sql)");
        return new C5842fj(compileStatement);
    }
}
