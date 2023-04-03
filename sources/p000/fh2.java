package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: fh2 */
/* compiled from: GlobalLibraryVersionRegistrar */
public class fh2 {

    /* renamed from: b */
    public static volatile fh2 f28879b;

    /* renamed from: a */
    public final Set<gg3> f28880a = new HashSet();

    /* renamed from: a */
    public static fh2 m44315a() {
        fh2 fh2 = f28879b;
        if (fh2 == null) {
            synchronized (fh2.class) {
                fh2 = f28879b;
                if (fh2 == null) {
                    fh2 = new fh2();
                    f28879b = fh2;
                }
            }
        }
        return fh2;
    }

    /* renamed from: b */
    public Set<gg3> mo42596b() {
        Set<gg3> unmodifiableSet;
        synchronized (this.f28880a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f28880a);
        }
        return unmodifiableSet;
    }
}
