package p000;

import java.util.List;

/* renamed from: rd5 */
/* compiled from: RenderingUtils.kt */
public final class rd5 {
    /* renamed from: a */
    public static final String m71511a(v82 v82) {
        vx2.m53591g(v82, "<this>");
        List<r24> h = v82.mo66449h();
        vx2.m53590f(h, "pathSegments()");
        return m71513c(h);
    }

    /* renamed from: b */
    public static final String m71512b(r24 r24) {
        vx2.m53591g(r24, "<this>");
        if (m71514d(r24)) {
            StringBuilder sb = new StringBuilder();
            String d = r24.mo65594d();
            vx2.m53590f(d, "asString()");
            sb.append('`' + d);
            sb.append('`');
            return sb.toString();
        }
        String d2 = r24.mo65594d();
        vx2.m53590f(d2, "asString()");
        return d2;
    }

    /* renamed from: c */
    public static final String m71513c(List<r24> list) {
        vx2.m53591g(list, "pathSegments");
        StringBuilder sb = new StringBuilder();
        for (r24 next : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(m71512b(next));
        }
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: d */
    public static final boolean m71514d(r24 r24) {
        boolean z;
        boolean z2;
        String d = r24.mo65594d();
        vx2.m53590f(d, "asString()");
        if (!vb3.f45255a.contains(d)) {
            int i = 0;
            while (true) {
                if (i >= d.length()) {
                    z = false;
                    break;
                }
                char charAt = d.charAt(i);
                if (Character.isLetterOrDigit(charAt) || charAt == '_') {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    z = true;
                    break;
                }
                i++;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
