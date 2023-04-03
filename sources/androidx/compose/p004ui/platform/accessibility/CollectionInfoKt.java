package androidx.compose.p004ui.platform.accessibility;

import androidx.compose.p004ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p004ui.semantics.SemanticsNode;
import androidx.compose.p004ui.semantics.SemanticsProperties;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import p000.C3335t8;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000\u001a\u0016\u0010\u000b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\tH\u0002\u001a\u0014\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\r0\r*\u00020\fH\u0002\u001a\u001c\u0010\u0013\u001a\n \u000e*\u0004\u0018\u00010\u00120\u0012*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0000H\u0002\"\u0018\u0010\u0016\u001a\u00020\u0007*\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, mo44877d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "node", "Lt8;", "info", "Lr37;", "d", "e", "", "b", "", "items", "a", "Lgj0;", "Lt8$b;", "kotlin.jvm.PlatformType", "f", "Lhj0;", "itemNode", "Lt8$c;", "g", "c", "(Lgj0;)Z", "isLazyCollection", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.accessibility.CollectionInfoKt */
/* compiled from: CollectionInfo.kt */
public final class CollectionInfoKt {
    /* renamed from: a */
    public static final boolean m3152a(List<SemanticsNode> list) {
        List list2;
        long j;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            list2 = ck0.m33062j();
        } else {
            list2 = new ArrayList();
            SemanticsNode semanticsNode = list.get(0);
            int l = ck0.m33064l(list);
            int i = 0;
            while (i < l) {
                i++;
                SemanticsNode semanticsNode2 = list.get(i);
                SemanticsNode semanticsNode3 = semanticsNode2;
                SemanticsNode semanticsNode4 = semanticsNode;
                list2.add(tf4.m27727d(wf4.m29550a(Math.abs(tf4.m27734k(semanticsNode4.mo4000f().mo115d()) - tf4.m27734k(semanticsNode3.mo4000f().mo115d())), Math.abs(tf4.m27735l(semanticsNode4.mo4000f().mo115d()) - tf4.m27735l(semanticsNode3.mo4000f().mo115d())))));
                semanticsNode = semanticsNode2;
            }
        }
        if (list2.size() == 1) {
            j = ((tf4) CollectionsKt___CollectionsKt.m47329Z(list2)).mo26442r();
        } else if (!list2.isEmpty()) {
            Object Z = CollectionsKt___CollectionsKt.m47329Z(list2);
            int l2 = ck0.m33064l(list2);
            if (1 <= l2) {
                int i2 = 1;
                while (true) {
                    Z = tf4.m27727d(tf4.m27739p(((tf4) Z).mo26442r(), ((tf4) list2.get(i2)).mo26442r()));
                    if (i2 == l2) {
                        break;
                    }
                    i2++;
                }
            }
            j = ((tf4) Z).mo26442r();
        } else {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        if (tf4.m27729f(j) < tf4.m27728e(j)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m3153b(SemanticsNode semanticsNode) {
        vx2.m53591g(semanticsNode, "<this>");
        vt5 h = semanticsNode.mo4002h();
        SemanticsProperties semanticsProperties = SemanticsProperties.f2125a;
        if (SemanticsConfigurationKt.m3168a(h, semanticsProperties.mo4022a()) == null && SemanticsConfigurationKt.m3168a(semanticsNode.mo4002h(), semanticsProperties.mo4038q()) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m3154c(gj0 gj0) {
        if (gj0.mo20600b() < 0 || gj0.mo20599a() < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final void m3155d(SemanticsNode semanticsNode, C3335t8 t8Var) {
        int i;
        vx2.m53591g(semanticsNode, "node");
        vx2.m53591g(t8Var, "info");
        vt5 h = semanticsNode.mo4002h();
        SemanticsProperties semanticsProperties = SemanticsProperties.f2125a;
        gj0 gj0 = (gj0) SemanticsConfigurationKt.m3168a(h, semanticsProperties.mo4022a());
        if (gj0 != null) {
            t8Var.mo26243h0(m3157f(gj0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (SemanticsConfigurationKt.m3168a(semanticsNode.mo4002h(), semanticsProperties.mo4038q()) != null) {
            List<SemanticsNode> o = semanticsNode.mo4009o();
            int size = o.size();
            for (int i2 = 0; i2 < size; i2++) {
                SemanticsNode semanticsNode2 = o.get(i2);
                if (semanticsNode2.mo4002h().mo27319k(SemanticsProperties.f2125a.mo4039r())) {
                    arrayList.add(semanticsNode2);
                }
            }
        }
        int i3 = 1;
        if (!arrayList.isEmpty()) {
            boolean a = m3152a(arrayList);
            if (a) {
                i = 1;
            } else {
                i = arrayList.size();
            }
            if (a) {
                i3 = arrayList.size();
            }
            t8Var.mo26243h0(C3335t8.C3337b.m27595b(i, i3, false, 0));
        }
    }

    /* renamed from: e */
    public static final void m3156e(SemanticsNode semanticsNode, C3335t8 t8Var) {
        int i;
        int i2;
        vx2.m53591g(semanticsNode, "node");
        vx2.m53591g(t8Var, "info");
        vt5 h = semanticsNode.mo4002h();
        SemanticsProperties semanticsProperties = SemanticsProperties.f2125a;
        hj0 hj0 = (hj0) SemanticsConfigurationKt.m3168a(h, semanticsProperties.mo4023b());
        if (hj0 != null) {
            t8Var.mo26246i0(m3158g(hj0, semanticsNode));
        }
        SemanticsNode m = semanticsNode.mo4007m();
        if (m != null && SemanticsConfigurationKt.m3168a(m.mo4002h(), semanticsProperties.mo4038q()) != null) {
            gj0 gj0 = (gj0) SemanticsConfigurationKt.m3168a(m.mo4002h(), semanticsProperties.mo4022a());
            if ((gj0 == null || !m3154c(gj0)) && semanticsNode.mo4002h().mo27319k(semanticsProperties.mo4039r())) {
                ArrayList arrayList = new ArrayList();
                List<SemanticsNode> o = m.mo4009o();
                int size = o.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    SemanticsNode semanticsNode2 = o.get(i4);
                    if (semanticsNode2.mo4002h().mo27319k(SemanticsProperties.f2125a.mo4039r())) {
                        arrayList.add(semanticsNode2);
                        if (semanticsNode2.mo4005k().mo3432W() < semanticsNode.mo4005k().mo3432W()) {
                            i3++;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    boolean a = m3152a(arrayList);
                    if (a) {
                        i = 0;
                    } else {
                        i = i3;
                    }
                    if (a) {
                        i2 = i3;
                    } else {
                        i2 = 0;
                    }
                    C3335t8.C3338c a2 = C3335t8.C3338c.m27596a(i, 1, i2, 1, false, ((Boolean) semanticsNode.mo4002h().mo27322r(SemanticsProperties.f2125a.mo4039r(), CollectionInfoKt$setCollectionItemInfo$itemInfo$1.INSTANCE)).booleanValue());
                    if (a2 != null) {
                        t8Var.mo26246i0(a2);
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public static final C3335t8.C3337b m3157f(gj0 gj0) {
        return C3335t8.C3337b.m27595b(gj0.mo20600b(), gj0.mo20599a(), false, 0);
    }

    /* renamed from: g */
    public static final C3335t8.C3338c m3158g(hj0 hj0, SemanticsNode semanticsNode) {
        return C3335t8.C3338c.m27596a(hj0.mo21198c(), hj0.mo21199d(), hj0.mo21196a(), hj0.mo21197b(), false, ((Boolean) semanticsNode.mo4002h().mo27322r(SemanticsProperties.f2125a.mo4039r(), CollectionInfoKt$toAccessibilityCollectionItemInfo$1.INSTANCE)).booleanValue());
    }
}
