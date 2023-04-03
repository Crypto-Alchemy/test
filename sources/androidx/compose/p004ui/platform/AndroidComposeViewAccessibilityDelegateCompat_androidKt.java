package androidx.compose.p004ui.platform;

import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.p004ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p004ui.semantics.SemanticsNode;
import androidx.compose.p004ui.semantics.SemanticsProperties;
import androidx.compose.p004ui.semantics.SemanticsPropertyKey;
import androidx.compose.p004ui.unit.LayoutDirection;
import com.github.mikephil.charting.utils.Utils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u001a\"\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0005H\u0002\u001a\u0014\u0010\t\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a\f\u0010\n\u001a\u00020\u0002*\u00020\u0005H\u0002\u001a\f\u0010\u000b\u001a\u00020\u0002*\u00020\u0005H\u0002\u001a\u001a\u0010\u000f\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002\u001a\u0018\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011*\u00020\u0010H\u0000\u001a\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0016*\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0012H\u0000\"\u0018\u0010\u001b\u001a\u00020\u0002*\u00020\u00058BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u001d\u001a\u00020\u0002*\u00020\u00058BX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a\"\u0018\u0010\u001f\u001a\u00020\u0002*\u00020\u00058BX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001a¨\u0006 "}, mo44877d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function1;", "", "selector", "n", "Landroidx/compose/ui/semantics/SemanticsNode;", "k", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$g;", "oldNode", "u", "q", "l", "Lx7;", "", "other", "j", "Lcu5;", "", "", "Lbu5;", "o", "", "Lsn5;", "id", "m", "r", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "isPassword", "t", "isTextField", "s", "isRtl", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt */
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {
    /* renamed from: j */
    public static final boolean m3023j(C3574x7<?> x7Var, Object obj) {
        if (x7Var == obj) {
            return true;
        }
        if (!(obj instanceof C3574x7)) {
            return false;
        }
        C3574x7 x7Var2 = (C3574x7) obj;
        if (!vx2.m53586b(x7Var.mo27684b(), x7Var2.mo27684b())) {
            return false;
        }
        if (x7Var.mo27683a() == null && x7Var2.mo27683a() != null) {
            return false;
        }
        if (x7Var.mo27683a() == null || x7Var2.mo27683a() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static final boolean m3024k(SemanticsNode semanticsNode) {
        if (SemanticsConfigurationKt.m3168a(semanticsNode.mo4002h(), SemanticsProperties.f2125a.mo4025d()) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static final boolean m3025l(SemanticsNode semanticsNode) {
        boolean z;
        vt5 a;
        if (m3033t(semanticsNode) && !vx2.m53586b(SemanticsConfigurationKt.m3168a(semanticsNode.mo4013s(), SemanticsProperties.f2125a.mo4028g()), Boolean.TRUE)) {
            return true;
        }
        LayoutNode n = m3027n(semanticsNode.mo4005k(), C0413x93be146e.INSTANCE);
        if (n != null) {
            yt5 j = au5.m10806j(n);
            if (j == null || (a = zt5.m31502a(j)) == null) {
                z = false;
            } else {
                z = vx2.m53586b(SemanticsConfigurationKt.m3168a(a, SemanticsProperties.f2125a.mo4028g()), Boolean.TRUE);
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static final sn5 m3026m(List<sn5> list, int i) {
        vx2.m53591g(list, "<this>");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).mo25913d() == i) {
                return list.get(i2);
            }
        }
        return null;
    }

    /* renamed from: n */
    public static final LayoutNode m3027n(LayoutNode layoutNode, rc2<? super LayoutNode, Boolean> rc2) {
        for (LayoutNode V = layoutNode.mo3430V(); V != null; V = V.mo3430V()) {
            if (rc2.invoke(V).booleanValue()) {
                return V;
            }
        }
        return null;
    }

    /* renamed from: o */
    public static final Map<Integer, bu5> m3028o(cu5 cu5) {
        vx2.m53591g(cu5, "<this>");
        SemanticsNode a = cu5.mo18291a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (a.mo4005k().mo3440a() && a.mo4005k().mo3459l0()) {
            Region region = new Region();
            region.set(c95.m11756a(a.mo4000f()));
            m3029p(region, a, linkedHashMap, a);
        }
        return linkedHashMap;
    }

    /* renamed from: p */
    public static final void m3029p(Region region, SemanticsNode semanticsNode, Map<Integer, bu5> map, SemanticsNode semanticsNode2) {
        boolean z;
        int i;
        a95 a95;
        qe3 j;
        boolean z2 = false;
        if (!semanticsNode2.mo4005k().mo3440a() || !semanticsNode2.mo4005k().mo3459l0()) {
            z = true;
        } else {
            z = false;
        }
        if (region.isEmpty() && semanticsNode2.mo4003i() != semanticsNode.mo4003i()) {
            return;
        }
        if (!z || semanticsNode2.mo4014t()) {
            Rect a = c95.m11756a(semanticsNode2.mo4012r());
            Region region2 = new Region();
            region2.set(a);
            if (semanticsNode2.mo4003i() == semanticsNode.mo4003i()) {
                i = -1;
            } else {
                i = semanticsNode2.mo4003i();
            }
            if (region2.op(region, region2, Region.Op.INTERSECT)) {
                Integer valueOf = Integer.valueOf(i);
                Rect bounds = region2.getBounds();
                vx2.m53590f(bounds, "region.bounds");
                map.put(valueOf, new bu5(semanticsNode2, bounds));
                List<SemanticsNode> o = semanticsNode2.mo4009o();
                for (int size = o.size() - 1; -1 < size; size--) {
                    m3029p(region, semanticsNode, map, o.get(size));
                }
                region.op(a, region, Region.Op.REVERSE_DIFFERENCE);
            } else if (semanticsNode2.mo4014t()) {
                SemanticsNode m = semanticsNode2.mo4007m();
                if (!(m == null || (j = m.mo4004j()) == null || !j.mo3440a())) {
                    z2 = true;
                }
                if (z2) {
                    a95 = m.mo4000f();
                } else {
                    a95 = new a95(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 10.0f, 10.0f);
                }
                map.put(Integer.valueOf(i), new bu5(semanticsNode2, c95.m11756a(a95)));
            } else if (i == -1) {
                Integer valueOf2 = Integer.valueOf(i);
                Rect bounds2 = region2.getBounds();
                vx2.m53590f(bounds2, "region.bounds");
                map.put(valueOf2, new bu5(semanticsNode2, bounds2));
            }
        }
    }

    /* renamed from: q */
    public static final boolean m3030q(SemanticsNode semanticsNode) {
        return semanticsNode.mo4002h().mo27319k(SemanticsProperties.f2125a.mo4034m());
    }

    /* renamed from: r */
    public static final boolean m3031r(SemanticsNode semanticsNode) {
        return semanticsNode.mo4002h().mo27319k(SemanticsProperties.f2125a.mo4035n());
    }

    /* renamed from: s */
    public static final boolean m3032s(SemanticsNode semanticsNode) {
        if (semanticsNode.mo4004j().getLayoutDirection() == LayoutDirection.Rtl) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static final boolean m3033t(SemanticsNode semanticsNode) {
        return semanticsNode.mo4013s().mo27319k(tt5.f18260a.mo26567o());
    }

    /* renamed from: u */
    public static final boolean m3034u(SemanticsNode semanticsNode, AndroidComposeViewAccessibilityDelegateCompat.C0405g gVar) {
        Iterator<Map.Entry<SemanticsPropertyKey<?>, Object>> it = gVar.mo3870b().iterator();
        while (it.hasNext()) {
            if (!semanticsNode.mo4002h().mo27319k((SemanticsPropertyKey) it.next().getKey())) {
                return true;
            }
        }
        return false;
    }
}
