package p000;

import android.os.Bundle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00160\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001a0\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\"\u0010\"\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b \u0010!R#\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00160#8\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b\u0017\u0010%R#\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001a0#8\u0006¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b\u001b\u0010%¨\u0006*"}, mo44877d2 = {"Lc54;", "", "Landroidx/navigation/NavBackStackEntry;", "backStackEntry", "Lr37;", "h", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "arguments", "a", "popUpTo", "", "saveState", "g", "f", "entry", "e", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "backStackLock", "Lu04;", "", "b", "Lu04;", "_backStack", "", "c", "_transitionsInProgress", "d", "Z", "()Z", "i", "(Z)V", "isNavigating", "Lt86;", "Lt86;", "()Lt86;", "backStack", "transitionsInProgress", "<init>", "()V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: c54 */
/* compiled from: NavigatorState.kt */
public abstract class c54 {

    /* renamed from: a */
    public final ReentrantLock f8332a = new ReentrantLock(true);

    /* renamed from: b */
    public final u04<List<NavBackStackEntry>> f8333b;

    /* renamed from: c */
    public final u04<Set<NavBackStackEntry>> f8334c;

    /* renamed from: d */
    public boolean f8335d;

    /* renamed from: e */
    public final t86<List<NavBackStackEntry>> f8336e;

    /* renamed from: f */
    public final t86<Set<NavBackStackEntry>> f8337f;

    public c54() {
        u04<List<NavBackStackEntry>> a = u86.m72658a(ck0.m33062j());
        this.f8333b = a;
        u04<Set<NavBackStackEntry>> a2 = u86.m72658a(ny5.m49095e());
        this.f8334c = a2;
        this.f8336e = e52.m57210b(a);
        this.f8337f = e52.m57210b(a2);
    }

    /* renamed from: a */
    public abstract NavBackStackEntry mo8502a(NavDestination navDestination, Bundle bundle);

    /* renamed from: b */
    public final t86<List<NavBackStackEntry>> mo11972b() {
        return this.f8336e;
    }

    /* renamed from: c */
    public final t86<Set<NavBackStackEntry>> mo11973c() {
        return this.f8337f;
    }

    /* renamed from: d */
    public final boolean mo11974d() {
        return this.f8335d;
    }

    /* renamed from: e */
    public void mo8503e(NavBackStackEntry navBackStackEntry) {
        vx2.m53591g(navBackStackEntry, "entry");
        u04<Set<NavBackStackEntry>> u04 = this.f8334c;
        u04.setValue(oy5.m49610j(u04.getValue(), navBackStackEntry));
    }

    /* renamed from: f */
    public void mo11975f(NavBackStackEntry navBackStackEntry) {
        vx2.m53591g(navBackStackEntry, "backStackEntry");
        u04<List<NavBackStackEntry>> u04 = this.f8333b;
        u04.setValue(CollectionsKt___CollectionsKt.m47351v0(CollectionsKt___CollectionsKt.m47347r0(u04.getValue(), CollectionsKt___CollectionsKt.m47340k0(this.f8333b.getValue())), navBackStackEntry));
    }

    /* renamed from: g */
    public void mo8504g(NavBackStackEntry navBackStackEntry, boolean z) {
        vx2.m53591g(navBackStackEntry, "popUpTo");
        ReentrantLock reentrantLock = this.f8332a;
        reentrantLock.lock();
        try {
            u04<List<NavBackStackEntry>> u04 = this.f8333b;
            ArrayList arrayList = new ArrayList();
            Iterator it = u04.getValue().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (!(!vx2.m53586b((NavBackStackEntry) next, navBackStackEntry))) {
                    break;
                }
                arrayList.add(next);
            }
            u04.setValue(arrayList);
            r37 r37 = r37.f33317a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: h */
    public void mo8505h(NavBackStackEntry navBackStackEntry) {
        vx2.m53591g(navBackStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f8332a;
        reentrantLock.lock();
        try {
            u04<List<NavBackStackEntry>> u04 = this.f8333b;
            u04.setValue(CollectionsKt___CollectionsKt.m47351v0(u04.getValue(), navBackStackEntry));
            r37 r37 = r37.f33317a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: i */
    public final void mo11976i(boolean z) {
        this.f8335d = z;
    }
}
