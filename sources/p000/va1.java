package p000;

import java.util.Iterator;
import java.util.Set;

/* renamed from: va1 */
/* compiled from: DefaultUserAgentPublisher */
public class va1 implements q57 {

    /* renamed from: a */
    public final String f34896a;

    /* renamed from: b */
    public final fh2 f34897b;

    public va1(Set<gg3> set, fh2 fh2) {
        this.f34896a = m53316e(set);
        this.f34897b = fh2;
    }

    /* renamed from: c */
    public static sm0<q57> m53314c() {
        return sm0.m51835c(q57.class).mo47823b(ic1.m45607l(gg3.class)).mo47827f(new ua1()).mo47825d();
    }

    /* renamed from: d */
    public static /* synthetic */ q57 m53315d(xm0 xm0) {
        return new va1(xm0.mo29968b(gg3.class), fh2.m44315a());
    }

    /* renamed from: e */
    public static String m53316e(Set<gg3> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<gg3> it = set.iterator();
        while (it.hasNext()) {
            gg3 next = it.next();
            sb.append(next.mo42429b());
            sb.append('/');
            sb.append(next.mo42430c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String mo46970a() {
        if (this.f34897b.mo42596b().isEmpty()) {
            return this.f34896a;
        }
        return this.f34896a + ' ' + m53316e(this.f34897b.mo42596b());
    }
}
