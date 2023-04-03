package p000;

import androidx.room.AutoClosingRoomOpenHelper;
import androidx.sqlite.p006db.SupportSQLiteOpenHelper;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Lut;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "configuration", "Landroidx/room/AutoClosingRoomOpenHelper;", "a", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;", "delegate", "Ltt;", "b", "Ltt;", "autoCloser", "<init>", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper$b;Ltt;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ut */
/* compiled from: AutoClosingRoomOpenHelperFactory.kt */
public final class C3431ut implements SupportSQLiteOpenHelper.C1392b {

    /* renamed from: a */
    public final SupportSQLiteOpenHelper.C1392b f18572a;

    /* renamed from: b */
    public final C3383tt f18573b;

    public C3431ut(SupportSQLiteOpenHelper.C1392b bVar, C3383tt ttVar) {
        vx2.m53591g(bVar, "delegate");
        vx2.m53591g(ttVar, "autoCloser");
        this.f18572a = bVar;
        this.f18573b = ttVar;
    }

    /* renamed from: a */
    public AutoClosingRoomOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        vx2.m53591g(configuration, "configuration");
        return new AutoClosingRoomOpenHelper(this.f18572a.create(configuration), this.f18573b);
    }
}
