package p000;

import android.content.Context;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, mo44877d2 = {"Lv72;", "", "Landroid/content/Context;", "context", "Lzn2;", "a", "b", "Lzn2;", "instance", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: v72 */
/* compiled from: ForceTokenLogoUpdateUseCaseProvider.kt */
public final class v72 {

    /* renamed from: a */
    public static final v72 f45229a = new v72();

    /* renamed from: b */
    public static zn2 f45230b;

    /* renamed from: a */
    public final zn2 mo66425a(Context context) {
        vx2.m53591g(context, "context");
        if (f45230b == null) {
            synchronized (this) {
                if (f45230b == null) {
                    f45230b = new u72(c67.f37071a.mo50813b(context), va5.f45251a.mo66465a(context), ih2.f38385a);
                }
                r37 r37 = r37.f33317a;
            }
        }
        zn2 zn2 = f45230b;
        vx2.m53588d(zn2);
        return zn2;
    }
}
