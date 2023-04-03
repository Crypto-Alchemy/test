package p000;

import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0000\u001a \u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, mo44877d2 = {"Lnr4;", "", "a", "b", "e", "ignoreConsumed", "Ltf4;", "d", "(Lnr4;Z)J", "Lsw2;", "size", "c", "(Lnr4;J)Z", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: gr4 */
/* compiled from: PointerEvent.kt */
public final class gr4 {
    /* renamed from: a */
    public static final boolean m18367a(nr4 nr4) {
        vx2.m53591g(nr4, "<this>");
        if (nr4.mo23791i() || !nr4.mo23788f()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m18368b(nr4 nr4) {
        vx2.m53591g(nr4, "<this>");
        if (!nr4.mo23791i() || nr4.mo23788f()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m18369c(nr4 nr4, long j) {
        vx2.m53591g(nr4, "$this$isOutOfBounds");
        long e = nr4.mo23787e();
        float k = tf4.m27734k(e);
        float l = tf4.m27735l(e);
        int f = sw2.m27143f(j);
        int e2 = sw2.m27142e(j);
        if (k < Utils.FLOAT_EPSILON || k > ((float) f) || l < Utils.FLOAT_EPSILON || l > ((float) e2)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final long m18370d(nr4 nr4, boolean z) {
        long o = tf4.m27738o(nr4.mo23787e(), nr4.mo23790h());
        if (z || !nr4.mo23793k()) {
            return o;
        }
        return tf4.f18145b.mo26446c();
    }

    /* renamed from: e */
    public static final boolean m18371e(nr4 nr4) {
        vx2.m53591g(nr4, "<this>");
        return !tf4.m27732i(m18370d(nr4, true), tf4.f18145b.mo26446c());
    }
}
