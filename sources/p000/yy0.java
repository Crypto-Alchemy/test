package p000;

import android.content.Context;
import kotlin.Metadata;
import net.safemoon.androidwallet.database.room.ApplicationRoomDatabase;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, mo44877d2 = {"Lyy0;", "", "Landroid/content/Context;", "context", "Lxy0;", "a", "Lr37;", "b", "Lxy0;", "instance", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: yy0 */
/* compiled from: CustomTokenProvider.kt */
public final class yy0 {

    /* renamed from: a */
    public static final yy0 f46294a = new yy0();

    /* renamed from: b */
    public static xy0 f46295b;

    /* renamed from: a */
    public final xy0 mo67189a(Context context) {
        vx2.m53591g(context, "context");
        if (f46295b == null) {
            synchronized (this) {
                if (f46295b == null) {
                    f46295b = new xy0(ApplicationRoomDatabase.C8270m.m65847c(ApplicationRoomDatabase.f41664p, context, (String) null, 2, (Object) null).mo57113U());
                }
                r37 r37 = r37.f33317a;
            }
        }
        xy0 xy0 = f46295b;
        vx2.m53588d(xy0);
        return xy0;
    }

    /* renamed from: b */
    public final void mo67190b() {
        f46295b = null;
    }
}
