package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import p000.b83;
import p000.h83;

@Metadata(mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, mo44877d2 = {"<anonymous>", "Ljava/lang/reflect/Field;", "V", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: KPropertyImpl.kt */
public final class KPropertyImpl$_javaField$1 extends Lambda implements pc2<Field> {
    public final /* synthetic */ KPropertyImpl<V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPropertyImpl$_javaField$1(KPropertyImpl<? extends V> kPropertyImpl) {
        super(0);
        this.this$0 = kPropertyImpl;
    }

    public final Field invoke() {
        Class<?> cls;
        h83 f = si5.f44568a.mo65861f(this.this$0.mo52984x());
        if (f instanceof h83.C7169c) {
            h83.C7169c cVar = (h83.C7169c) f;
            fx4 b = cVar.mo52148b();
            b83.C6854a d = i83.m58869d(i83.f38338a, cVar.mo52151e(), cVar.mo52150d(), cVar.mo52153g(), false, 8, (Object) null);
            if (d == null) {
                return null;
            }
            KPropertyImpl<V> kPropertyImpl = this.this$0;
            if (gd1.m58107e(b) || i83.m58870f(cVar.mo52151e())) {
                cls = kPropertyImpl.mo52982v().mo41920k().getEnclosingClass();
            } else {
                d31 b2 = b.mo51119b();
                if (b2 instanceof if0) {
                    cls = y67.m74286p((if0) b2);
                } else {
                    cls = kPropertyImpl.mo52982v().mo41920k();
                }
            }
            if (cls == null) {
                return null;
            }
            try {
                return cls.getDeclaredField(d.mo50521c());
            } catch (NoSuchFieldException unused) {
                return null;
            }
        } else if (f instanceof h83.C7167a) {
            return ((h83.C7167a) f).mo52145b();
        } else {
            if ((f instanceof h83.C7168b) || (f instanceof h83.C7170d)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
