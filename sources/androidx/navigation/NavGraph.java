package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.NavDestination;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 @2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001AB\u0017\u0012\u000e\u0010=\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000<¢\u0006\u0004\b>\u0010?J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017J\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0001J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0010\u001a\u00020\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0007J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0007J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u000fH\u0007J\u000e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u000fJ\b\u0010\u001e\u001a\u00020\u0012H\u0016J\u0013\u0010!\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002J\b\u0010\"\u001a\u00020\u000fH\u0016R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010#8G¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010\u001c\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R.\u00102\u001a\u0004\u0018\u00010\u00122\b\u0010,\u001a\u0004\u0018\u00010\u00128\u0006@BX\u000e¢\u0006\u0012\n\u0004\b-\u0010*\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00128WX\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R$\u00109\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f8G@BX\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0011\u0010;\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b:\u0010/¨\u0006B"}, mo44877d2 = {"Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavDestination;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Lr37;", "H", "Li44;", "navDeepLinkRequest", "Landroidx/navigation/NavDestination$a;", "F", "node", "Q", "", "resId", "R", "", "route", "T", "", "searchParents", "S", "U", "", "iterator", "X", "startDestId", "b0", "toString", "", "other", "equals", "hashCode", "Lj66;", "C", "Lj66;", "V", "()Lj66;", "nodes", "I", "Ljava/lang/String;", "startDestIdName", "startDestRoute", "L", "a0", "()Ljava/lang/String;", "d0", "(Ljava/lang/String;)V", "startDestinationRoute", "u", "displayName", "Z", "()I", "c0", "(I)V", "startDestinationId", "W", "startDestDisplayName", "Landroidx/navigation/Navigator;", "navGraphNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "M", "Companion", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: NavGraph.kt */
public class NavGraph extends NavDestination implements Iterable<NavDestination>, a93 {

    /* renamed from: M */
    public static final Companion f6067M = new Companion((DefaultConstructorMarker) null);

    /* renamed from: C */
    public final j66<NavDestination> f6068C = new j66<>();

    /* renamed from: H */
    public int f6069H;

    /* renamed from: I */
    public String f6070I;

    /* renamed from: L */
    public String f6071L;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007¨\u0006\u0007"}, mo44877d2 = {"Landroidx/navigation/NavGraph$Companion;", "", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavDestination;", "a", "<init>", "()V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: NavGraph.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final NavDestination mo8586a(NavGraph navGraph) {
            vx2.m53591g(navGraph, "<this>");
            return (NavDestination) SequencesKt___SequencesKt.m63033w(SequencesKt__SequencesKt.m63015j(navGraph.mo8573R(navGraph.mo8580Z()), NavGraph$Companion$findStartDestination$1.INSTANCE));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0016\u0010\r\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, mo44877d2 = {"androidx/navigation/NavGraph$a", "", "Landroidx/navigation/NavDestination;", "", "hasNext", "a", "Lr37;", "remove", "", "I", "index", "d", "Z", "wentToNext", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.navigation.NavGraph$a */
    /* compiled from: NavGraph.kt */
    public static final class C1125a implements Iterator<NavDestination>, a93 {

        /* renamed from: a */
        public int f6072a = -1;

        /* renamed from: d */
        public boolean f6073d;

        /* renamed from: e */
        public final /* synthetic */ NavGraph f6074e;

        public C1125a(NavGraph navGraph) {
            this.f6074e = navGraph;
        }

        /* renamed from: a */
        public NavDestination next() {
            if (hasNext()) {
                this.f6073d = true;
                j66<NavDestination> V = this.f6074e.mo8577V();
                int i = this.f6072a + 1;
                this.f6072a = i;
                NavDestination w = V.mo21767w(i);
                vx2.m53590f(w, "nodes.valueAt(++index)");
                return w;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f6072a + 1 < this.f6074e.mo8577V().mo21766v()) {
                return true;
            }
            return false;
        }

        public void remove() {
            if (this.f6073d) {
                j66<NavDestination> V = this.f6074e.mo8577V();
                V.mo21767w(this.f6072a).mo8553M((NavGraph) null);
                V.mo21763t(this.f6072a);
                this.f6072a--;
                this.f6073d = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element".toString());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavGraph(Navigator<? extends NavGraph> navigator) {
        super((Navigator<? extends NavDestination>) navigator);
        vx2.m53591g(navigator, "navGraphNavigator");
    }

    /* renamed from: F */
    public NavDestination.C1124a mo8550F(i44 i44) {
        vx2.m53591g(i44, "navDeepLinkRequest");
        NavDestination.C1124a F = super.mo8550F(i44);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            NavDestination.C1124a F2 = ((NavDestination) it.next()).mo8550F(i44);
            if (F2 != null) {
                arrayList.add(F2);
            }
        }
        return (NavDestination.C1124a) CollectionsKt___CollectionsKt.m47344o0(ck0.m33067o(F, (NavDestination.C1124a) CollectionsKt___CollectionsKt.m47344o0(arrayList)));
    }

    /* renamed from: H */
    public void mo8404H(Context context, AttributeSet attributeSet) {
        vx2.m53591g(context, "context");
        vx2.m53591g(attributeSet, "attrs");
        super.mo8404H(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, i55.NavGraphNavigator);
        vx2.m53590f(obtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        mo8583c0(obtainAttributes.getResourceId(i55.NavGraphNavigator_startDestination, 0));
        this.f6070I = NavDestination.f6051A.mo8565b(context, this.f6069H);
        r37 r37 = r37.f33317a;
        obtainAttributes.recycle();
    }

    /* renamed from: Q */
    public final void mo8572Q(NavDestination navDestination) {
        boolean z;
        boolean z2;
        vx2.m53591g(navDestination, "node");
        int w = navDestination.mo8563w();
        String E = navDestination.mo8549E();
        boolean z3 = false;
        if (w == 0 && E == null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
        } else if (mo8549E() == null || (!vx2.m53586b(E, mo8549E()))) {
            if (w != mo8563w()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                NavDestination i = this.f6068C.mo21756i(w);
                if (i != navDestination) {
                    if (navDestination.mo8548D() == null) {
                        z3 = true;
                    }
                    if (z3) {
                        if (i != null) {
                            i.mo8553M((NavGraph) null);
                        }
                        navDestination.mo8553M(this);
                        this.f6068C.mo21762r(navDestination.mo8563w(), navDestination);
                        return;
                    }
                    throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
                }
                return;
            }
            throw new IllegalArgumentException(("Destination " + navDestination + " cannot have the same id as graph " + this).toString());
        } else {
            throw new IllegalArgumentException(("Destination " + navDestination + " cannot have the same route as graph " + this).toString());
        }
    }

    /* renamed from: R */
    public final NavDestination mo8573R(int i) {
        return mo8574S(i, true);
    }

    /* renamed from: S */
    public final NavDestination mo8574S(int i, boolean z) {
        NavDestination i2 = this.f6068C.mo21756i(i);
        if (i2 != null) {
            return i2;
        }
        if (!z || mo8548D() == null) {
            return null;
        }
        NavGraph D = mo8548D();
        vx2.m53588d(D);
        return D.mo8573R(i);
    }

    /* renamed from: T */
    public final NavDestination mo8575T(String str) {
        boolean z;
        if (str == null || yb6.m74325B(str)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return mo8576U(str, true);
        }
        return null;
    }

    /* renamed from: U */
    public final NavDestination mo8576U(String str, boolean z) {
        vx2.m53591g(str, "route");
        NavDestination i = this.f6068C.mo21756i(NavDestination.f6051A.mo8564a(str).hashCode());
        if (i != null) {
            return i;
        }
        if (!z || mo8548D() == null) {
            return null;
        }
        NavGraph D = mo8548D();
        vx2.m53588d(D);
        return D.mo8575T(str);
    }

    /* renamed from: V */
    public final j66<NavDestination> mo8577V() {
        return this.f6068C;
    }

    /* renamed from: W */
    public final String mo8578W() {
        if (this.f6070I == null) {
            String str = this.f6071L;
            if (str == null) {
                str = String.valueOf(this.f6069H);
            }
            this.f6070I = str;
        }
        String str2 = this.f6070I;
        vx2.m53588d(str2);
        return str2;
    }

    /* renamed from: X */
    public final int mo8579X() {
        return mo8580Z();
    }

    /* renamed from: Z */
    public final int mo8580Z() {
        return this.f6069H;
    }

    /* renamed from: a0 */
    public final String mo8581a0() {
        return this.f6071L;
    }

    /* renamed from: b0 */
    public final void mo8582b0(int i) {
        mo8583c0(i);
    }

    /* renamed from: c0 */
    public final void mo8583c0(int i) {
        boolean z;
        if (i != mo8563w()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f6071L != null) {
                mo8584d0((String) null);
            }
            this.f6069H = i;
            this.f6070I = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i + " cannot use the same id as the graph " + this).toString());
    }

    /* renamed from: d0 */
    public final void mo8584d0(String str) {
        int i;
        if (str == null) {
            i = 0;
        } else if (!(!vx2.m53586b(str, mo8549E()))) {
            throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
        } else if (!yb6.m74325B(str)) {
            i = NavDestination.f6051A.mo8564a(str).hashCode();
        } else {
            throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
        }
        this.f6069H = i;
        this.f6071L = str;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof NavGraph)) {
            return false;
        }
        List<T> E = SequencesKt___SequencesKt.m63021E(SequencesKt__SequencesKt.m63008c(k66.m20549a(this.f6068C)));
        NavGraph navGraph = (NavGraph) obj;
        Iterator<T> a = k66.m20549a(navGraph.f6068C);
        while (a.hasNext()) {
            E.remove((NavDestination) a.next());
        }
        if (!super.equals(obj) || this.f6068C.mo21766v() != navGraph.f6068C.mo21766v() || mo8580Z() != navGraph.mo8580Z() || !E.isEmpty()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int Z = mo8580Z();
        j66<NavDestination> j66 = this.f6068C;
        int v = j66.mo21766v();
        for (int i = 0; i < v; i++) {
            Z = (((Z * 31) + j66.mo21761p(i)) * 31) + j66.mo21767w(i).hashCode();
        }
        return Z;
    }

    public final Iterator<NavDestination> iterator() {
        return new C1125a(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        NavDestination T = mo8575T(this.f6071L);
        if (T == null) {
            T = mo8573R(mo8580Z());
        }
        sb.append(" startDestination=");
        if (T == null) {
            String str = this.f6071L;
            if (str != null) {
                sb.append(str);
            } else {
                String str2 = this.f6070I;
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    sb.append("0x" + Integer.toHexString(this.f6069H));
                }
            }
        } else {
            sb.append("{");
            sb.append(T.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: u */
    public String mo8562u() {
        if (mo8563w() != 0) {
            return super.mo8562u();
        }
        return "the root navigation";
    }
}
