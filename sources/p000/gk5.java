package p000;

import android.database.sqlite.SQLiteDatabase;
import p000.jk5;

/* renamed from: gk5 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class gk5 implements jk5.C6106b {

    /* renamed from: a */
    public final /* synthetic */ long f29245a;

    public /* synthetic */ gk5(long j) {
        this.f29245a = j;
    }

    public final Object apply(Object obj) {
        return Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(this.f29245a)}));
    }
}
