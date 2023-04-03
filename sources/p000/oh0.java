package p000;

import com.facebook.common.references.SharedReference;
import java.io.Closeable;
import java.io.PrintWriter;
import java.io.StringWriter;
import p000.nh0;

/* renamed from: oh0 */
/* compiled from: CloseableReferenceFactory */
public class oh0 {

    /* renamed from: a */
    public final nh0.C2897c f15892a;

    /* renamed from: oh0$a */
    /* compiled from: CloseableReferenceFactory */
    public class C2955a implements nh0.C2897c {

        /* renamed from: a */
        public final /* synthetic */ ph0 f15893a;

        public C2955a(ph0 ph0) {
            this.f15893a = ph0;
        }

        /* renamed from: a */
        public void mo23688a(SharedReference<Object> sharedReference, Throwable th) {
            String str;
            this.f15893a.mo24600a(sharedReference, th);
            Object f = sharedReference.mo13174f();
            if (f != null) {
                str = f.getClass().getName();
            } else {
                str = "<value is null>";
            }
            oy1.m24437x("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(sharedReference)), str, oh0.m23814d(th));
        }

        /* renamed from: b */
        public boolean mo23689b() {
            return this.f15893a.mo24601b();
        }
    }

    public oh0(ph0 ph0) {
        this.f15892a = new C2955a(ph0);
    }

    /* renamed from: d */
    public static String m23814d(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: b */
    public <U extends Closeable> nh0<U> mo23950b(U u) {
        return nh0.m23182x(u, this.f15892a);
    }

    /* renamed from: c */
    public <T> nh0<T> mo23951c(T t, rf5<T> rf5) {
        return nh0.m23184z(t, rf5, this.f15892a);
    }
}
