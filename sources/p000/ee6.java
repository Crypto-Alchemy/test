package p000;

import android.database.Cursor;
import android.os.Bundle;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, mo44877d2 = {"Lee6;", "", "Landroid/database/Cursor;", "cursor", "Landroid/os/Bundle;", "extras", "Lr37;", "a", "<init>", "()V", "sqlite_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ee6 */
/* compiled from: SupportSQLiteCompat.kt */
public final class ee6 {

    /* renamed from: a */
    public static final ee6 f11140a = new ee6();

    /* renamed from: a */
    public static final void m16083a(Cursor cursor, Bundle bundle) {
        vx2.m53591g(cursor, "cursor");
        vx2.m53591g(bundle, "extras");
        cursor.setExtras(bundle);
    }
}
