package p000;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import androidx.sqlite.p006db.SupportSQLiteOpenHelper;
import androidx.sqlite.p006db.framework.FrameworkSQLiteOpenHelper;

/* renamed from: ec2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class ec2 implements DatabaseErrorHandler {

    /* renamed from: a */
    public final /* synthetic */ SupportSQLiteOpenHelper.C1390a f11128a;

    /* renamed from: b */
    public final /* synthetic */ FrameworkSQLiteOpenHelper.C1397b f11129b;

    public /* synthetic */ ec2(SupportSQLiteOpenHelper.C1390a aVar, FrameworkSQLiteOpenHelper.C1397b bVar) {
        this.f11128a = aVar;
        this.f11129b = bVar;
    }

    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        FrameworkSQLiteOpenHelper.OpenHelper.m9940b(this.f11128a, this.f11129b, sQLiteDatabase);
    }
}
