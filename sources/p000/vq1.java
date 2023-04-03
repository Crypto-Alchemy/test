package p000;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.p006db.SupportSQLiteStatement;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, mo44877d2 = {"Lvq1;", "T", "Landroidx/room/SharedSQLiteStatement;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "statement", "entity", "Lr37;", "i", "(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V", "j", "(Ljava/lang/Object;)V", "", "entities", "k", "([Ljava/lang/Object;)V", "", "l", "(Ljava/lang/Object;)J", "Landroidx/room/RoomDatabase;", "database", "<init>", "(Landroidx/room/RoomDatabase;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: vq1 */
/* compiled from: EntityInsertionAdapter.kt */
public abstract class vq1<T> extends SharedSQLiteStatement {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vq1(RoomDatabase roomDatabase) {
        super(roomDatabase);
        vx2.m53591g(roomDatabase, "database");
    }

    /* renamed from: i */
    public abstract void mo12130i(SupportSQLiteStatement supportSQLiteStatement, T t);

    /* renamed from: j */
    public final void mo27296j(T t) {
        SupportSQLiteStatement b = mo10162b();
        try {
            mo12130i(b, t);
            b.executeInsert();
        } finally {
            mo10168h(b);
        }
    }

    /* renamed from: k */
    public final void mo27297k(T[] tArr) {
        vx2.m53591g(tArr, "entities");
        SupportSQLiteStatement b = mo10162b();
        try {
            for (T i : tArr) {
                mo12130i(b, i);
                b.executeInsert();
            }
        } finally {
            mo10168h(b);
        }
    }

    /* renamed from: l */
    public final long mo27298l(T t) {
        SupportSQLiteStatement b = mo10162b();
        try {
            mo12130i(b, t);
            return b.executeInsert();
        } finally {
            mo10168h(b);
        }
    }
}
