package p000;

import java.util.concurrent.Callable;

/* renamed from: gj9 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class gj9 extends wj9 {

    /* renamed from: f */
    public final Callable f29244f;

    public /* synthetic */ gj9(Callable callable, yi9 yi9) {
        super(false, 1, 5, (String) null, (Throwable) null, (oj9) null);
        this.f29244f = callable;
    }

    /* renamed from: a */
    public final String mo42904a() {
        try {
            return (String) this.f29244f.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
