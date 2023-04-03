package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.NavDestination;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.sequences.SequencesKt___SequencesKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\b#B\u0007¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017J\u000f\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ*\u0010\u0011\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J7\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00028\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u001aH\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0015H\u0016R\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010 R$\u0010'\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a8\u0006@BX\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048DX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010(¨\u0006+"}, mo44877d2 = {"Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "D", "", "Lc54;", "state", "Lr37;", "f", "a", "()Landroidx/navigation/NavDestination;", "", "Landroidx/navigation/NavBackStackEntry;", "entries", "Lm44;", "navOptions", "Landroidx/navigation/Navigator$a;", "navigatorExtras", "e", "backStackEntry", "g", "destination", "Landroid/os/Bundle;", "args", "d", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;Lm44;Landroidx/navigation/Navigator$a;)Landroidx/navigation/NavDestination;", "popUpTo", "", "savedState", "j", "k", "i", "h", "Lc54;", "_state", "<set-?>", "b", "Z", "c", "()Z", "isAttached", "()Lc54;", "<init>", "()V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: Navigator.kt */
public abstract class Navigator<D extends NavDestination> {

    /* renamed from: a */
    public c54 f6076a;

    /* renamed from: b */
    public boolean f6077b;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo44877d2 = {"Landroidx/navigation/Navigator$a;", "", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.navigation.Navigator$a */
    /* compiled from: Navigator.kt */
    public interface C1126a {
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo44877d2 = {"Landroidx/navigation/Navigator$b;", "", "", "value", "()Ljava/lang/String;", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.navigation.Navigator$b */
    /* compiled from: Navigator.kt */
    public @interface C1127b {
        String value();
    }

    /* renamed from: a */
    public abstract D mo8399a();

    /* renamed from: b */
    public final c54 mo8596b() {
        c54 c54 = this.f6076a;
        if (c54 != null) {
            return c54;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    /* renamed from: c */
    public final boolean mo8597c() {
        return this.f6077b;
    }

    /* renamed from: d */
    public NavDestination mo8400d(D d, Bundle bundle, m44 m44, C1126a aVar) {
        vx2.m53591g(d, "destination");
        return d;
    }

    /* renamed from: e */
    public void mo8598e(List<NavBackStackEntry> list, m44 m44, C1126a aVar) {
        vx2.m53591g(list, "entries");
        for (R h : SequencesKt___SequencesKt.m63027q(SequencesKt___SequencesKt.m63034x(CollectionsKt___CollectionsKt.m47318Q(list), new Navigator$navigate$1(this, m44, aVar)))) {
            mo8596b().mo8505h(h);
        }
    }

    /* renamed from: f */
    public void mo8599f(c54 c54) {
        vx2.m53591g(c54, "state");
        this.f6076a = c54;
        this.f6077b = true;
    }

    /* renamed from: g */
    public void mo8600g(NavBackStackEntry navBackStackEntry) {
        vx2.m53591g(navBackStackEntry, "backStackEntry");
        NavDestination f = navBackStackEntry.mo8424f();
        if (!(f instanceof NavDestination)) {
            f = null;
        }
        if (f != null) {
            mo8400d(f, (Bundle) null, o44.m23660a(Navigator$onLaunchSingleTop$1.INSTANCE), (C1126a) null);
            mo8596b().mo11975f(navBackStackEntry);
        }
    }

    /* renamed from: h */
    public void mo8601h(Bundle bundle) {
        vx2.m53591g(bundle, "savedState");
    }

    /* renamed from: i */
    public Bundle mo8602i() {
        return null;
    }

    /* renamed from: j */
    public void mo8603j(NavBackStackEntry navBackStackEntry, boolean z) {
        vx2.m53591g(navBackStackEntry, "popUpTo");
        List value = mo8596b().mo11972b().getValue();
        if (value.contains(navBackStackEntry)) {
            ListIterator listIterator = value.listIterator(value.size());
            NavBackStackEntry navBackStackEntry2 = null;
            while (mo8401k()) {
                navBackStackEntry2 = (NavBackStackEntry) listIterator.previous();
                if (vx2.m53586b(navBackStackEntry2, navBackStackEntry)) {
                    break;
                }
            }
            if (navBackStackEntry2 != null) {
                mo8596b().mo8504g(navBackStackEntry2, z);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + navBackStackEntry + " which does not exist in back stack " + value).toString());
    }

    /* renamed from: k */
    public boolean mo8401k() {
        return true;
    }
}
