package androidx.room;

import androidx.sqlite.p006db.SupportSQLiteStatement;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C6169a;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H$J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, mo44877d2 = {"Landroidx/room/SharedSQLiteStatement;", "", "", "e", "Lr37;", "c", "Landroidx/sqlite/db/SupportSQLiteStatement;", "b", "statement", "h", "d", "", "canUseCached", "g", "Landroidx/room/RoomDatabase;", "a", "Landroidx/room/RoomDatabase;", "database", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lock", "Lef3;", "f", "()Landroidx/sqlite/db/SupportSQLiteStatement;", "stmt", "<init>", "(Landroidx/room/RoomDatabase;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SharedSQLiteStatement.kt */
public abstract class SharedSQLiteStatement {

    /* renamed from: a */
    public final RoomDatabase f6914a;

    /* renamed from: b */
    public final AtomicBoolean f6915b = new AtomicBoolean(false);

    /* renamed from: c */
    public final ef3 f6916c = C6169a.m47232a(new SharedSQLiteStatement$stmt$2(this));

    public SharedSQLiteStatement(RoomDatabase roomDatabase) {
        vx2.m53591g(roomDatabase, "database");
        this.f6914a = roomDatabase;
    }

    /* renamed from: b */
    public SupportSQLiteStatement mo10162b() {
        mo10163c();
        return mo10167g(this.f6915b.compareAndSet(false, true));
    }

    /* renamed from: c */
    public void mo10163c() {
        this.f6914a.mo10117c();
    }

    /* renamed from: d */
    public final SupportSQLiteStatement mo10164d() {
        return this.f6914a.mo10121g(mo10165e());
    }

    /* renamed from: e */
    public abstract String mo10165e();

    /* renamed from: f */
    public final SupportSQLiteStatement mo10166f() {
        return (SupportSQLiteStatement) this.f6916c.getValue();
    }

    /* renamed from: g */
    public final SupportSQLiteStatement mo10167g(boolean z) {
        if (z) {
            return mo10166f();
        }
        return mo10164d();
    }

    /* renamed from: h */
    public void mo10168h(SupportSQLiteStatement supportSQLiteStatement) {
        vx2.m53591g(supportSQLiteStatement, "statement");
        if (supportSQLiteStatement == mo10166f()) {
            this.f6915b.set(false);
        }
    }
}
