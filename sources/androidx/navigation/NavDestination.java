package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.navigation.NavDeepLink;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.SequencesKt__SequencesKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 ;2\u00020\u0001:\u0002_)B\u000f\u0012\u0006\u0010-\u001a\u00020\b¢\u0006\u0004\b[\u0010TB\u0019\b\u0016\u0012\u000e\u0010]\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\\¢\u0006\u0004\b[\u0010^J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0017J\u0014\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0007J\b\u0010\u0016\u001a\u00020\u0015H\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0001\u0010\u0018\u001a\u00020\u0017J\u0018\u0010\u001d\u001a\u00020\u00062\b\b\u0001\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0019J\u0016\u0010!\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fJ\u0014\u0010$\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0007J\b\u0010%\u001a\u00020\bH\u0016J\u0013\u0010'\u001a\u00020\u00152\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010(\u001a\u00020\u0017H\u0016R\u0017\u0010-\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R.\u00106\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010.8\u0006@GX\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010*R$\u0010?\u001a\u0004\u0018\u0001088\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000b0@8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010AR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00190C8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\"\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001f0G8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010HR,\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0018\u001a\u00020\u00178G@FX\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR.\u0010P\u001a\u0004\u0018\u00010\b2\b\u0010P\u001a\u0004\u0018\u00010\b8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bQ\u0010*\u001a\u0004\bR\u0010,\"\u0004\bS\u0010TR\u001d\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001f0U8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010Z\u001a\u00020\b8WX\u0004¢\u0006\u0006\u001a\u0004\bY\u0010,¨\u0006`"}, mo44877d2 = {"Landroidx/navigation/NavDestination;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Lr37;", "H", "", "uriPattern", "k", "Landroidx/navigation/NavDeepLink;", "navDeepLink", "j", "Li44;", "navDeepLinkRequest", "Landroidx/navigation/NavDestination$a;", "F", "previousDestination", "", "q", "", "O", "", "id", "Lc44;", "s", "actionId", "action", "J", "argumentName", "Ld44;", "argument", "e", "Landroid/os/Bundle;", "args", "n", "toString", "other", "equals", "hashCode", "a", "Ljava/lang/String;", "B", "()Ljava/lang/String;", "navigatorName", "Landroidx/navigation/NavGraph;", "<set-?>", "d", "Landroidx/navigation/NavGraph;", "D", "()Landroidx/navigation/NavGraph;", "M", "(Landroidx/navigation/NavGraph;)V", "parent", "idName", "", "g", "Ljava/lang/CharSequence;", "A", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "", "Ljava/util/List;", "deepLinks", "Lj66;", "r", "Lj66;", "actions", "", "Ljava/util/Map;", "_arguments", "x", "I", "w", "()I", "L", "(I)V", "route", "y", "E", "N", "(Ljava/lang/String;)V", "", "t", "()Ljava/util/Map;", "arguments", "u", "displayName", "<init>", "Landroidx/navigation/Navigator;", "navigator", "(Landroidx/navigation/Navigator;)V", "Companion", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: NavDestination.kt */
public class NavDestination {

    /* renamed from: A */
    public static final Companion f6051A = new Companion((DefaultConstructorMarker) null);

    /* renamed from: B */
    public static final Map<String, Class<?>> f6052B = new LinkedHashMap();

    /* renamed from: a */
    public final String f6053a;

    /* renamed from: d */
    public NavGraph f6054d;

    /* renamed from: e */
    public String f6055e;

    /* renamed from: g */
    public CharSequence f6056g;

    /* renamed from: k */
    public final List<NavDeepLink> f6057k;

    /* renamed from: r */
    public final j66<c44> f6058r;

    /* renamed from: s */
    public Map<String, d44> f6059s;

    /* renamed from: x */
    public int f6060x;

    /* renamed from: y */
    public String f6061y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007R$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000b*\u00020\n8FX\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR$\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, mo44877d2 = {"Landroidx/navigation/NavDestination$Companion;", "", "Landroid/content/Context;", "context", "", "id", "", "b", "route", "a", "Landroidx/navigation/NavDestination;", "Lhw5;", "c", "(Landroidx/navigation/NavDestination;)Lhw5;", "getHierarchy$annotations", "(Landroidx/navigation/NavDestination;)V", "hierarchy", "", "Ljava/lang/Class;", "classes", "Ljava/util/Map;", "<init>", "()V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: NavDestination.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo8564a(String str) {
            if (str == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + str;
        }

        /* renamed from: b */
        public final String mo8565b(Context context, int i) {
            String str;
            vx2.m53591g(context, "context");
            if (i <= 16777215) {
                return String.valueOf(i);
            }
            try {
                str = context.getResources().getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                str = String.valueOf(i);
            }
            vx2.m53590f(str, "try {\n                co….toString()\n            }");
            return str;
        }

        /* renamed from: c */
        public final hw5<NavDestination> mo8566c(NavDestination navDestination) {
            vx2.m53591g(navDestination, "<this>");
            return SequencesKt__SequencesKt.m63015j(navDestination, NavDestination$Companion$hierarchy$1.INSTANCE);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B1\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0002R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Landroidx/navigation/NavDestination$a;", "", "other", "", "a", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/NavDestination;", "d", "()Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "e", "()Landroid/os/Bundle;", "matchingArgs", "", "Z", "isExactDeepLink", "g", "hasMatchingAction", "k", "I", "mimeTypeMatchLevel", "<init>", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;ZZI)V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.navigation.NavDestination$a */
    /* compiled from: NavDestination.kt */
    public static final class C1124a implements Comparable<C1124a> {

        /* renamed from: a */
        public final NavDestination f6062a;

        /* renamed from: d */
        public final Bundle f6063d;

        /* renamed from: e */
        public final boolean f6064e;

        /* renamed from: g */
        public final boolean f6065g;

        /* renamed from: k */
        public final int f6066k;

        public C1124a(NavDestination navDestination, Bundle bundle, boolean z, boolean z2, int i) {
            vx2.m53591g(navDestination, "destination");
            this.f6062a = navDestination;
            this.f6063d = bundle;
            this.f6064e = z;
            this.f6065g = z2;
            this.f6066k = i;
        }

        /* renamed from: a */
        public int compareTo(C1124a aVar) {
            vx2.m53591g(aVar, "other");
            boolean z = this.f6064e;
            if (z && !aVar.f6064e) {
                return 1;
            }
            if (!z && aVar.f6064e) {
                return -1;
            }
            Bundle bundle = this.f6063d;
            if (bundle != null && aVar.f6063d == null) {
                return 1;
            }
            if (bundle == null && aVar.f6063d != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = aVar.f6063d;
                vx2.m53588d(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z2 = this.f6065g;
            if (z2 && !aVar.f6065g) {
                return 1;
            }
            if (z2 || !aVar.f6065g) {
                return this.f6066k - aVar.f6066k;
            }
            return -1;
        }

        /* renamed from: d */
        public final NavDestination mo8569d() {
            return this.f6062a;
        }

        /* renamed from: e */
        public final Bundle mo8570e() {
            return this.f6063d;
        }
    }

    public NavDestination(String str) {
        vx2.m53591g(str, "navigatorName");
        this.f6053a = str;
        this.f6057k = new ArrayList();
        this.f6058r = new j66<>();
        this.f6059s = new LinkedHashMap();
    }

    /* renamed from: r */
    public static /* synthetic */ int[] m8281r(NavDestination navDestination, NavDestination navDestination2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                navDestination2 = null;
            }
            return navDestination.mo8559q(navDestination2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
    }

    /* renamed from: A */
    public final CharSequence mo8546A() {
        return this.f6056g;
    }

    /* renamed from: B */
    public final String mo8547B() {
        return this.f6053a;
    }

    /* renamed from: D */
    public final NavGraph mo8548D() {
        return this.f6054d;
    }

    /* renamed from: E */
    public final String mo8549E() {
        return this.f6061y;
    }

    /* renamed from: F */
    public C1124a mo8550F(i44 i44) {
        Bundle bundle;
        boolean z;
        int i;
        vx2.m53591g(i44, "navDeepLinkRequest");
        if (this.f6057k.isEmpty()) {
            return null;
        }
        C1124a aVar = null;
        for (NavDeepLink next : this.f6057k) {
            Uri c = i44.mo21451c();
            if (c != null) {
                bundle = next.mo8523f(c, mo8561t());
            } else {
                bundle = null;
            }
            String a = i44.mo21449a();
            if (a == null || !vx2.m53586b(a, next.mo8520d())) {
                z = false;
            } else {
                z = true;
            }
            boolean z2 = z;
            String b = i44.mo21450b();
            if (b != null) {
                i = next.mo8525h(b);
            } else {
                i = -1;
            }
            if (bundle != null || z2 || i > -1) {
                C1124a aVar2 = new C1124a(this, bundle, next.mo8530l(), z2, i);
                if (aVar == null || aVar2.compareTo(aVar) > 0) {
                    aVar = aVar2;
                }
            }
        }
        return aVar;
    }

    /* renamed from: H */
    public void mo8404H(Context context, AttributeSet attributeSet) {
        vx2.m53591g(context, "context");
        vx2.m53591g(attributeSet, "attrs");
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, i55.Navigator);
        vx2.m53590f(obtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        mo8554N(obtainAttributes.getString(i55.Navigator_route));
        int i = i55.Navigator_android_id;
        if (obtainAttributes.hasValue(i)) {
            mo8552L(obtainAttributes.getResourceId(i, 0));
            this.f6055e = f6051A.mo8565b(context, this.f6060x);
        }
        this.f6056g = obtainAttributes.getText(i55.Navigator_android_label);
        r37 r37 = r37.f33317a;
        obtainAttributes.recycle();
    }

    /* renamed from: J */
    public final void mo8551J(int i, c44 c44) {
        boolean z;
        vx2.m53591g(c44, "action");
        if (mo8405O()) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f6058r.mo21762r(i, c44);
                return;
            }
            throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
        }
        throw new UnsupportedOperationException("Cannot add action " + i + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    /* renamed from: L */
    public final void mo8552L(int i) {
        this.f6060x = i;
        this.f6055e = null;
    }

    /* renamed from: M */
    public final void mo8553M(NavGraph navGraph) {
        this.f6054d = navGraph;
    }

    /* renamed from: N */
    public final void mo8554N(String str) {
        T t;
        if (str == null) {
            mo8552L(0);
        } else if (!yb6.m74325B(str)) {
            String a = f6051A.mo8564a(str);
            mo8552L(a.hashCode());
            mo8557k(a);
        } else {
            throw new IllegalArgumentException("Cannot have an empty route".toString());
        }
        List<NavDeepLink> list = this.f6057k;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (vx2.m53586b(((NavDeepLink) t).mo8529k(), f6051A.mo8564a(this.f6061y))) {
                break;
            }
        }
        t07.m52022a(list).remove(t);
        this.f6061y = str;
    }

    /* renamed from: O */
    public boolean mo8405O() {
        return true;
    }

    /* renamed from: e */
    public final void mo8555e(String str, d44 d44) {
        vx2.m53591g(str, "argumentName");
        vx2.m53591g(d44, "argument");
        this.f6059s.put(str, d44);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0133 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x013a
            boolean r1 = r9 instanceof androidx.navigation.NavDestination
            if (r1 != 0) goto L_0x0009
            goto L_0x013a
        L_0x0009:
            java.util.List<androidx.navigation.NavDeepLink> r1 = r8.f6057k
            androidx.navigation.NavDestination r9 = (androidx.navigation.NavDestination) r9
            java.util.List<androidx.navigation.NavDeepLink> r2 = r9.f6057k
            java.util.Set r1 = kotlin.collections.CollectionsKt___CollectionsKt.m47334e0(r1, r2)
            int r1 = r1.size()
            java.util.List<androidx.navigation.NavDeepLink> r2 = r8.f6057k
            int r2 = r2.size()
            r3 = 1
            if (r1 != r2) goto L_0x0022
            r1 = r3
            goto L_0x0023
        L_0x0022:
            r1 = r0
        L_0x0023:
            j66<c44> r2 = r8.f6058r
            int r2 = r2.mo21766v()
            j66<c44> r4 = r9.f6058r
            int r4 = r4.mo21766v()
            if (r2 != r4) goto L_0x0081
            j66<c44> r2 = r8.f6058r
            java.util.Iterator r2 = p000.k66.m20549a(r2)
            hw5 r2 = kotlin.sequences.SequencesKt__SequencesKt.m63008c(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x003f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0055
            java.lang.Object r4 = r2.next()
            c44 r4 = (p000.c44) r4
            j66<c44> r5 = r9.f6058r
            boolean r4 = r5.mo21754g(r4)
            if (r4 != 0) goto L_0x003f
            r2 = r0
            goto L_0x0056
        L_0x0055:
            r2 = r3
        L_0x0056:
            if (r2 == 0) goto L_0x0081
            j66<c44> r2 = r9.f6058r
            java.util.Iterator r2 = p000.k66.m20549a(r2)
            hw5 r2 = kotlin.sequences.SequencesKt__SequencesKt.m63008c(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0066:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r2.next()
            c44 r4 = (p000.c44) r4
            j66<c44> r5 = r8.f6058r
            boolean r4 = r5.mo21754g(r4)
            if (r4 != 0) goto L_0x0066
            r2 = r0
            goto L_0x007d
        L_0x007c:
            r2 = r3
        L_0x007d:
            if (r2 == 0) goto L_0x0081
            r2 = r3
            goto L_0x0082
        L_0x0081:
            r2 = r0
        L_0x0082:
            java.util.Map r4 = r8.mo8561t()
            int r4 = r4.size()
            java.util.Map r5 = r9.mo8561t()
            int r5 = r5.size()
            if (r4 != r5) goto L_0x0122
            java.util.Map r4 = r8.mo8561t()
            hw5 r4 = p000.co3.m33133v(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x00a0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00d7
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Map r6 = r9.mo8561t()
            java.lang.Object r7 = r5.getKey()
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto L_0x00d2
            java.util.Map r6 = r9.mo8561t()
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r6 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = p000.vx2.m53586b(r6, r5)
            if (r5 == 0) goto L_0x00d2
            r5 = r3
            goto L_0x00d3
        L_0x00d2:
            r5 = r0
        L_0x00d3:
            if (r5 != 0) goto L_0x00a0
            r4 = r0
            goto L_0x00d8
        L_0x00d7:
            r4 = r3
        L_0x00d8:
            if (r4 == 0) goto L_0x0122
            java.util.Map r4 = r9.mo8561t()
            hw5 r4 = p000.co3.m33133v(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x00e6:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x011d
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Map r6 = r8.mo8561t()
            java.lang.Object r7 = r5.getKey()
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto L_0x0118
            java.util.Map r6 = r8.mo8561t()
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r6 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = p000.vx2.m53586b(r6, r5)
            if (r5 == 0) goto L_0x0118
            r5 = r3
            goto L_0x0119
        L_0x0118:
            r5 = r0
        L_0x0119:
            if (r5 != 0) goto L_0x00e6
            r4 = r0
            goto L_0x011e
        L_0x011d:
            r4 = r3
        L_0x011e:
            if (r4 == 0) goto L_0x0122
            r4 = r3
            goto L_0x0123
        L_0x0122:
            r4 = r0
        L_0x0123:
            int r5 = r8.f6060x
            int r6 = r9.f6060x
            if (r5 != r6) goto L_0x013a
            java.lang.String r5 = r8.f6061y
            java.lang.String r9 = r9.f6061y
            boolean r9 = p000.vx2.m53586b(r5, r9)
            if (r9 == 0) goto L_0x013a
            if (r1 == 0) goto L_0x013a
            if (r2 == 0) goto L_0x013a
            if (r4 == 0) goto L_0x013a
            r0 = r3
        L_0x013a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDestination.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        Set<String> keySet;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.f6060x * 31;
        String str = this.f6061y;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i10 = i9 + i;
        for (NavDeepLink navDeepLink : this.f6057k) {
            int i11 = i2 * 31;
            String k = navDeepLink.mo8529k();
            if (k != null) {
                i6 = k.hashCode();
            } else {
                i6 = 0;
            }
            int i12 = (i11 + i6) * 31;
            String d = navDeepLink.mo8520d();
            if (d != null) {
                i7 = d.hashCode();
            } else {
                i7 = 0;
            }
            int i13 = (i12 + i7) * 31;
            String g = navDeepLink.mo8524g();
            if (g != null) {
                i8 = g.hashCode();
            } else {
                i8 = 0;
            }
            i10 = i13 + i8;
        }
        Iterator<T> a = k66.m20549a(this.f6058r);
        while (a.hasNext()) {
            c44 c44 = (c44) a.next();
            int b = ((i2 * 31) + c44.mo11967b()) * 31;
            m44 c = c44.mo11968c();
            if (c != null) {
                i4 = c.hashCode();
            } else {
                i4 = 0;
            }
            i2 = b + i4;
            Bundle a2 = c44.mo11966a();
            if (!(a2 == null || (keySet = a2.keySet()) == null)) {
                vx2.m53590f(keySet, "keySet()");
                for (String str2 : keySet) {
                    int i14 = i2 * 31;
                    Bundle a3 = c44.mo11966a();
                    vx2.m53588d(a3);
                    Object obj = a3.get(str2);
                    if (obj != null) {
                        i5 = obj.hashCode();
                    } else {
                        i5 = 0;
                    }
                    i2 = i14 + i5;
                }
            }
        }
        for (String str3 : mo8561t().keySet()) {
            int hashCode = ((i2 * 31) + str3.hashCode()) * 31;
            d44 d44 = mo8561t().get(str3);
            if (d44 != null) {
                i3 = d44.hashCode();
            } else {
                i3 = 0;
            }
            i2 = hashCode + i3;
        }
        return i2;
    }

    /* renamed from: j */
    public final void mo8556j(NavDeepLink navDeepLink) {
        vx2.m53591g(navDeepLink, "navDeepLink");
        Map<String, d44> t = mo8561t();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, d44>> it = t.entrySet().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            d44 d44 = (d44) next.getValue();
            if (d44.mo18511c() || d44.mo18510b()) {
                z = false;
            }
            if (z) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object next2 : keySet) {
            if (!navDeepLink.mo8521e().contains((String) next2)) {
                arrayList.add(next2);
            }
        }
        if (arrayList.isEmpty()) {
            this.f6057k.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.mo8529k() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayList).toString());
    }

    /* renamed from: k */
    public final void mo8557k(String str) {
        vx2.m53591g(str, "uriPattern");
        mo8556j(new NavDeepLink.C1119a().mo8535d(str).mo8532a());
    }

    /* renamed from: n */
    public final Bundle mo8558n(Bundle bundle) {
        boolean z;
        if (bundle == null) {
            Map<String, d44> map = this.f6059s;
            if (map == null || map.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry next : this.f6059s.entrySet()) {
            ((d44) next.getValue()).mo18512d((String) next.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry next2 : this.f6059s.entrySet()) {
                String str = (String) next2.getKey();
                d44 d44 = (d44) next2.getValue();
                if (!d44.mo18513e(str, bundle2)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + str + "' in argument bundle. " + d44.mo18509a().mo24333b() + " expected.").toString());
                }
            }
        }
        return bundle2;
    }

    /* renamed from: q */
    public final int[] mo8559q(NavDestination navDestination) {
        NavGraph navGraph;
        C5808eq eqVar = new C5808eq();
        NavGraph navGraph2 = this;
        while (true) {
            vx2.m53588d(navGraph2);
            NavGraph navGraph3 = navGraph2.f6054d;
            if (navDestination != null) {
                navGraph = navDestination.f6054d;
            } else {
                navGraph = null;
            }
            if (navGraph != null) {
                NavGraph navGraph4 = navDestination.f6054d;
                vx2.m53588d(navGraph4);
                if (navGraph4.mo8573R(navGraph2.f6060x) == navGraph2) {
                    eqVar.addFirst(navGraph2);
                    break;
                }
            }
            if (navGraph3 == null || navGraph3.mo8580Z() != navGraph2.f6060x) {
                eqVar.addFirst(navGraph2);
            }
            if (vx2.m53586b(navGraph3, navDestination) || navGraph3 == null) {
                break;
            }
            navGraph2 = navGraph3;
        }
        List<NavDestination> K0 = CollectionsKt___CollectionsKt.m47311K0(eqVar);
        ArrayList arrayList = new ArrayList(dk0.m43495u(K0, 10));
        for (NavDestination navDestination2 : K0) {
            arrayList.add(Integer.valueOf(navDestination2.f6060x));
        }
        return CollectionsKt___CollectionsKt.m47310J0(arrayList);
    }

    /* renamed from: s */
    public final c44 mo8560s(int i) {
        c44 c44;
        if (this.f6058r.mo21760o()) {
            c44 = null;
        } else {
            c44 = this.f6058r.mo21756i(i);
        }
        if (c44 != null) {
            return c44;
        }
        NavGraph navGraph = this.f6054d;
        if (navGraph != null) {
            return navGraph.mo8560s(i);
        }
        return null;
    }

    /* renamed from: t */
    public final Map<String, d44> mo8561t() {
        return C6177b.m47371s(this.f6059s);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f6055e;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.f6060x));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.f6061y;
        if (str2 == null || yb6.m74325B(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            sb.append(" route=");
            sb.append(this.f6061y);
        }
        if (this.f6056g != null) {
            sb.append(" label=");
            sb.append(this.f6056g);
        }
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: u */
    public String mo8562u() {
        String str = this.f6055e;
        if (str == null) {
            return String.valueOf(this.f6060x);
        }
        return str;
    }

    /* renamed from: w */
    public final int mo8563w() {
        return this.f6060x;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NavDestination(Navigator<? extends NavDestination> navigator) {
        this(b54.f7944b.mo11361a(navigator.getClass()));
        vx2.m53591g(navigator, "navigator");
    }
}
