package p000;

import android.content.Context;
import kotlin.Metadata;
import net.safemoon.androidwallet.database.mainRoom.MainRoomDatabase;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, mo44877d2 = {"Llr0;", "", "Landroid/content/Context;", "context", "Lgr0;", "a", "Lr37;", "b", "Lgr0;", "instance", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: lr0 */
/* compiled from: ContactTokenProvider.kt */
public final class lr0 {

    /* renamed from: a */
    public static final lr0 f40678a = new lr0();

    /* renamed from: b */
    public static gr0 f40679b;

    /* renamed from: a */
    public final gr0 mo55965a(Context context) {
        vx2.m53591g(context, "context");
        if (f40679b == null) {
            synchronized (this) {
                if (f40679b == null) {
                    f40679b = new gr0(MainRoomDatabase.f41647p.mo57110b(context).mo57107P());
                }
                r37 r37 = r37.f33317a;
            }
        }
        gr0 gr0 = f40679b;
        vx2.m53588d(gr0);
        return gr0;
    }

    /* renamed from: b */
    public final void mo55966b() {
        f40679b = null;
    }
}
