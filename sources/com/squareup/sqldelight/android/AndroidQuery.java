package com.squareup.sqldelight.android;

import android.database.Cursor;
import androidx.sqlite.p006db.SupportSQLiteDatabase;
import androidx.sqlite.p006db.SupportSQLiteQuery;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u001a\u001a\u00020\n\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b$\u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016R\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR,\u0010#\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070!0 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\"¨\u0006&"}, mo44877d2 = {"Lcom/squareup/sqldelight/android/AndroidQuery;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Lkj;", "", "index", "", "long", "Lr37;", "b", "(ILjava/lang/Long;)V", "", "string", "bindString", "", "f", "Lei;", "g", "Lje6;", "statement", "e", "d", "toString", "c", "close", "a", "Ljava/lang/String;", "sql", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "I", "argCount", "", "Lkotlin/Function1;", "Ljava/util/Map;", "binds", "<init>", "(Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteDatabase;I)V", "sqldelight-android-driver_release"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* compiled from: AndroidSqliteDriver.kt */
public final class AndroidQuery implements SupportSQLiteQuery, C6155kj {

    /* renamed from: a */
    public final String f26947a;

    /* renamed from: d */
    public final SupportSQLiteDatabase f26948d;

    /* renamed from: e */
    public final int f26949e;

    /* renamed from: g */
    public final Map<Integer, rc2<je6, r37>> f26950g = new LinkedHashMap();

    public AndroidQuery(String str, SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        vx2.m53591g(str, "sql");
        vx2.m53591g(supportSQLiteDatabase, "database");
        this.f26947a = str;
        this.f26948d = supportSQLiteDatabase;
        this.f26949e = i;
    }

    /* renamed from: b */
    public void mo39608b(int i, Long l) {
        this.f26950g.put(Integer.valueOf(i), new AndroidQuery$bindLong$1(l, i));
    }

    public void bindString(int i, String str) {
        this.f26950g.put(Integer.valueOf(i), new AndroidQuery$bindString$1(str, i));
    }

    /* renamed from: c */
    public int mo10284c() {
        return this.f26949e;
    }

    public void close() {
    }

    /* renamed from: d */
    public String mo10285d() {
        return this.f26947a;
    }

    /* renamed from: e */
    public void mo10286e(je6 je6) {
        vx2.m53591g(je6, "statement");
        for (rc2<je6, r37> invoke : this.f26950g.values()) {
            invoke.invoke(je6);
        }
    }

    /* renamed from: f */
    public Void execute() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public C5806ei mo39607a() {
        Cursor query = this.f26948d.query((SupportSQLiteQuery) this);
        vx2.m53590f(query, "database.query(this)");
        return new C5806ei(query);
    }

    public String toString() {
        return this.f26947a;
    }
}
