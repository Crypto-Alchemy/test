package p000;

import android.os.Looper;
import com.google.android.gms.common.api.C4013a;
import com.google.android.gms.common.api.C4023b;
import com.google.android.gms.common.api.internal.C4028a;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: zz7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zz7 extends fy7 {
    @NotOnlyInitialized

    /* renamed from: c */
    public final C4023b f36324c;

    public zz7(C4023b bVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f36324c = bVar;
    }

    /* renamed from: e */
    public final <A extends C4013a.C4015b, T extends C4028a<? extends eg5, A>> T mo30500e(T t) {
        return this.f36324c.mo30564h(t);
    }

    /* renamed from: f */
    public final Looper mo30501f() {
        return this.f36324c.mo30566j();
    }

    /* renamed from: j */
    public final void mo30505j(j18 j18) {
    }
}
