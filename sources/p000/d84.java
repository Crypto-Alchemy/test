package p000;

import kotlin.Metadata;
import p000.sw3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a&\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0000\"%\u0010\u0010\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u00018@X\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, mo44877d2 = {"", "Lc84;", "other", "d", "(II)I", "Lsw3$b;", "element", "a", "Lsw3$c;", "node", "b", "", "c", "(I)Z", "getIncludeSelfInTraversal-H91voCI$annotations", "(I)V", "includeSelfInTraversal", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: d84 */
/* compiled from: NodeKind.kt */
public final class d84 {
    /* renamed from: a */
    public static final int m14844a(sw3.C3309b bVar) {
        vx2.m53591g(bVar, "element");
        g84 g84 = g84.f12195a;
        int a = g84.mo20425a();
        if (bVar instanceof re3) {
            a = m14847d(a, g84.mo20429e());
        }
        if (bVar instanceof kx2) {
            a = m14847d(a, g84.mo20428d());
        }
        if (bVar instanceof cj1) {
            a = m14847d(a, g84.mo20426b());
        }
        if (bVar instanceof wt5) {
            a = m14847d(a, g84.mo20434j());
        }
        if (bVar instanceof ur4) {
            a = m14847d(a, g84.mo20433i());
        }
        if ((bVar instanceof vw3) || (bVar instanceof ax3) || (bVar instanceof p62)) {
            a = m14847d(a, g84.mo20431g());
        }
        if (bVar instanceof ih4) {
            a = m14847d(a, g84.mo20427c());
        }
        if (bVar instanceof cm4) {
            a = m14847d(a, g84.mo20432h());
        }
        if ((bVar instanceof nh4) || (bVar instanceof rh4) || (bVar instanceof rl3)) {
            return m14847d(a, g84.mo20430f());
        }
        return a;
    }

    /* renamed from: b */
    public static final int m14845b(sw3.C3310c cVar) {
        vx2.m53591g(cVar, "node");
        g84 g84 = g84.f12195a;
        int a = g84.mo20425a();
        if (cVar instanceof se3) {
            a = m14847d(a, g84.mo20429e());
        }
        if (cVar instanceof dj1) {
            a = m14847d(a, g84.mo20426b());
        }
        if (cVar instanceof yt5) {
            a = m14847d(a, g84.mo20434j());
        }
        if (cVar instanceof vr4) {
            a = m14847d(a, g84.mo20433i());
        }
        if (cVar instanceof yw3) {
            a = m14847d(a, g84.mo20431g());
        }
        if (cVar instanceof dm4) {
            a = m14847d(a, g84.mo20432h());
        }
        if (cVar instanceof ke3) {
            a = m14847d(a, g84.mo20430f());
        }
        if (cVar instanceof gh2) {
            a = m14847d(a, g84.mo20427c());
        }
        if (cVar instanceof lx2) {
            return m14847d(a, g84.mo20428d());
        }
        return a;
    }

    /* renamed from: c */
    public static final boolean m14846c(int i) {
        if ((i & g84.f12195a.mo20430f()) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final int m14847d(int i, int i2) {
        return i | i2;
    }
}
