package p000;

import android.content.Context;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\f"}, mo44877d2 = {"Lqu4;", "Lxo2;", "Landroid/content/Context;", "context", "Lto2;", "b", "Lr37;", "a", "Lto2;", "instance", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: qu4 */
/* compiled from: PrefillUserDefaultTokenUseCaseProvider.kt */
public final class qu4 implements xo2 {

    /* renamed from: a */
    public static final qu4 f44243a = new qu4();

    /* renamed from: b */
    public static to2 f44244b;

    /* renamed from: a */
    public void mo50768a() {
        C7126gf.f38011a.mo50768a();
        c67.f37071a.mo50768a();
        va5.f45251a.mo66466b();
        f44244b = null;
    }

    /* renamed from: b */
    public final to2 mo65529b(Context context) {
        vx2.m53591g(context, "context");
        if (f44244b == null) {
            synchronized (this) {
                if (f44244b == null) {
                    f44244b = new ru4(C7126gf.f38011a.mo51908b(context), c67.f37071a.mo50813b(context));
                }
                r37 r37 = r37.f33317a;
            }
        }
        to2 to2 = f44244b;
        vx2.m53588d(to2);
        return to2;
    }
}
