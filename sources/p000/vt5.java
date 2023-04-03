package p000;

import androidx.compose.p004ui.semantics.SemanticsPropertyKey;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u00012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002B\u0007¢\u0006\u0004\b1\u00102J$\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ3\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u000fH\u0002J,\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u0006\u0010\u001c\u001a\u00020\u0000J\u0013\u0010\u001e\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020!H\u0016R&\u0010&\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010-\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00100\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,¨\u00063"}, mo44877d2 = {"Lvt5;", "Leu5;", "", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "T", "key", "q", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Ljava/lang/Object;", "Lkotlin/Function0;", "defaultValue", "r", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Lpc2;)Ljava/lang/Object;", "s", "", "iterator", "value", "Lr37;", "e", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Ljava/lang/Object;)V", "", "k", "child", "w", "(Lvt5;)V", "peer", "j", "n", "other", "equals", "", "hashCode", "", "toString", "", "a", "Ljava/util/Map;", "props", "d", "Z", "u", "()Z", "B", "(Z)V", "isMergingSemanticsOfDescendants", "t", "A", "isClearingSemantics", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: vt5 */
/* compiled from: SemanticsConfiguration.kt */
public final class vt5 implements eu5, Iterable<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>>, a93 {

    /* renamed from: a */
    public final Map<SemanticsPropertyKey<?>, Object> f18893a = new LinkedHashMap();

    /* renamed from: d */
    public boolean f18894d;

    /* renamed from: e */
    public boolean f18895e;

    /* renamed from: A */
    public final void mo27313A(boolean z) {
        this.f18895e = z;
    }

    /* renamed from: B */
    public final void mo27314B(boolean z) {
        this.f18894d = z;
    }

    /* renamed from: e */
    public <T> void mo19491e(SemanticsPropertyKey<T> semanticsPropertyKey, T t) {
        vx2.m53591g(semanticsPropertyKey, "key");
        this.f18893a.put(semanticsPropertyKey, t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt5)) {
            return false;
        }
        vt5 vt5 = (vt5) obj;
        if (vx2.m53586b(this.f18893a, vt5.f18893a) && this.f18894d == vt5.f18894d && this.f18895e == vt5.f18895e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f18893a.hashCode() * 31) + ut5.m28422a(this.f18894d)) * 31) + ut5.m28422a(this.f18895e);
    }

    public Iterator<Map.Entry<SemanticsPropertyKey<?>, Object>> iterator() {
        return this.f18893a.entrySet().iterator();
    }

    /* renamed from: j */
    public final void mo27318j(vt5 vt5) {
        vx2.m53591g(vt5, "peer");
        if (vt5.f18894d) {
            this.f18894d = true;
        }
        if (vt5.f18895e) {
            this.f18895e = true;
        }
        for (Map.Entry next : vt5.f18893a.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) next.getKey();
            Object value = next.getValue();
            if (!this.f18893a.containsKey(semanticsPropertyKey)) {
                this.f18893a.put(semanticsPropertyKey, value);
            } else if (value instanceof C3574x7) {
                Object obj = this.f18893a.get(semanticsPropertyKey);
                vx2.m53589e(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                C3574x7 x7Var = (C3574x7) obj;
                Map<SemanticsPropertyKey<?>, Object> map = this.f18893a;
                String b = x7Var.mo27684b();
                if (b == null) {
                    b = ((C3574x7) value).mo27684b();
                }
                nd2 a = x7Var.mo27683a();
                if (a == null) {
                    a = ((C3574x7) value).mo27683a();
                }
                map.put(semanticsPropertyKey, new C3574x7(b, a));
            }
        }
    }

    /* renamed from: k */
    public final <T> boolean mo27319k(SemanticsPropertyKey<T> semanticsPropertyKey) {
        vx2.m53591g(semanticsPropertyKey, "key");
        return this.f18893a.containsKey(semanticsPropertyKey);
    }

    /* renamed from: n */
    public final vt5 mo27320n() {
        vt5 vt5 = new vt5();
        vt5.f18894d = this.f18894d;
        vt5.f18895e = this.f18895e;
        vt5.f18893a.putAll(this.f18893a);
        return vt5;
    }

    /* renamed from: q */
    public final <T> T mo27321q(SemanticsPropertyKey<T> semanticsPropertyKey) {
        vx2.m53591g(semanticsPropertyKey, "key");
        T t = this.f18893a.get(semanticsPropertyKey);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Key not present: " + semanticsPropertyKey + " - consider getOrElse or getOrNull");
    }

    /* renamed from: r */
    public final <T> T mo27322r(SemanticsPropertyKey<T> semanticsPropertyKey, pc2<? extends T> pc2) {
        vx2.m53591g(semanticsPropertyKey, "key");
        vx2.m53591g(pc2, "defaultValue");
        T t = this.f18893a.get(semanticsPropertyKey);
        if (t == null) {
            return pc2.invoke();
        }
        return t;
    }

    /* renamed from: s */
    public final <T> T mo27323s(SemanticsPropertyKey<T> semanticsPropertyKey, pc2<? extends T> pc2) {
        vx2.m53591g(semanticsPropertyKey, "key");
        vx2.m53591g(pc2, "defaultValue");
        T t = this.f18893a.get(semanticsPropertyKey);
        if (t == null) {
            return pc2.invoke();
        }
        return t;
    }

    /* renamed from: t */
    public final boolean mo27324t() {
        return this.f18895e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (this.f18894d) {
            sb.append(str);
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.f18895e) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry next : this.f18893a.entrySet()) {
            Object value = next.getValue();
            sb.append(str);
            sb.append(((SemanticsPropertyKey) next.getKey()).mo4057a());
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return s73.m26717a(this, (String) null) + "{ " + sb + " }";
    }

    /* renamed from: u */
    public final boolean mo27326u() {
        return this.f18894d;
    }

    /* renamed from: w */
    public final void mo27327w(vt5 vt5) {
        vx2.m53591g(vt5, "child");
        for (Map.Entry next : vt5.f18893a.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) next.getKey();
            Object value = next.getValue();
            Object obj = this.f18893a.get(semanticsPropertyKey);
            vx2.m53589e(semanticsPropertyKey, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object b = semanticsPropertyKey.mo4058b(obj, value);
            if (b != null) {
                this.f18893a.put(semanticsPropertyKey, b);
            }
        }
    }
}
