package p000;

import android.database.sqlite.SQLiteDatabase;
import p000.fn5;

/* renamed from: dn5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class dn5 implements fn5.C5844a {
    /* renamed from: a */
    public final void mo29657a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
