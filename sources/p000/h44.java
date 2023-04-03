package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 B\u0011\b\u0010\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b\u001f\u0010#J\u001e\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u001e\u0010\u0007\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\n\u001a\u00020\tJ\u0014\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0002R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001d¨\u0006$"}, mo44877d2 = {"Lh44;", "", "", "destId", "Landroid/os/Bundle;", "args", "f", "a", "e", "Lhm6;", "b", "Landroidx/navigation/NavDestination;", "d", "Lr37;", "h", "c", "Landroid/content/Context;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "Landroid/content/Intent;", "intent", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavGraph;", "graph", "", "Lh44$a;", "Ljava/util/List;", "destinations", "Landroid/os/Bundle;", "globalArgs", "<init>", "(Landroid/content/Context;)V", "Landroidx/navigation/NavController;", "navController", "(Landroidx/navigation/NavController;)V", "navigation-runtime_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: h44 */
/* compiled from: NavDeepLinkBuilder.kt */
public final class h44 {

    /* renamed from: a */
    public final Context f12732a;

    /* renamed from: b */
    public final Intent f12733b;

    /* renamed from: c */
    public NavGraph f12734c;

    /* renamed from: d */
    public final List<C2443a> f12735d;

    /* renamed from: e */
    public Bundle f12736e;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Lh44$a;", "", "", "a", "I", "b", "()I", "destinationId", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "arguments", "<init>", "(ILandroid/os/Bundle;)V", "navigation-runtime_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: h44$a */
    /* compiled from: NavDeepLinkBuilder.kt */
    public static final class C2443a {

        /* renamed from: a */
        public final int f12737a;

        /* renamed from: b */
        public final Bundle f12738b;

        public C2443a(int i, Bundle bundle) {
            this.f12737a = i;
            this.f12738b = bundle;
        }

        /* renamed from: a */
        public final Bundle mo20950a() {
            return this.f12738b;
        }

        /* renamed from: b */
        public final int mo20951b() {
            return this.f12737a;
        }
    }

    public h44(Context context) {
        Intent intent;
        vx2.m53591g(context, "context");
        this.f12732a = context;
        if (context instanceof Activity) {
            intent = new Intent(context, context.getClass());
        } else {
            intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (intent == null) {
                intent = new Intent();
            }
        }
        intent.addFlags(268468224);
        this.f12733b = intent;
        this.f12735d = new ArrayList();
    }

    /* renamed from: g */
    public static /* synthetic */ h44 m18571g(h44 h44, int i, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        return h44.mo20948f(i, bundle);
    }

    /* renamed from: a */
    public final h44 mo20943a(int i, Bundle bundle) {
        this.f12735d.add(new C2443a(i, bundle));
        if (this.f12734c != null) {
            mo20949h();
        }
        return this;
    }

    /* renamed from: b */
    public final hm6 mo20944b() {
        if (this.f12734c == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
        } else if (!this.f12735d.isEmpty()) {
            mo20945c();
            hm6 j = hm6.m19090o(this.f12732a).mo21302j(new Intent(this.f12733b));
            vx2.m53590f(j, "create(context)\n        …rentStack(Intent(intent))");
            int r = j.mo21306r();
            for (int i = 0; i < r; i++) {
                Intent q = j.mo21305q(i);
                if (q != null) {
                    q.putExtra("android-support-nav:controller:deepLinkIntent", this.f12733b);
                }
            }
            return j;
        } else {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
        }
    }

    /* renamed from: c */
    public final void mo20945c() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        NavDestination navDestination = null;
        for (C2443a next : this.f12735d) {
            int b = next.mo20951b();
            Bundle a = next.mo20950a();
            NavDestination d = mo20946d(b);
            if (d != null) {
                for (int valueOf : d.mo8559q(navDestination)) {
                    arrayList.add(Integer.valueOf(valueOf));
                    arrayList2.add(a);
                }
                navDestination = d;
            } else {
                throw new IllegalArgumentException("Navigation destination " + NavDestination.f6051A.mo8565b(this.f12732a, b) + " cannot be found in the navigation graph " + this.f12734c);
            }
        }
        this.f12733b.putExtra("android-support-nav:controller:deepLinkIds", CollectionsKt___CollectionsKt.m47310J0(arrayList));
        this.f12733b.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList2);
    }

    /* renamed from: d */
    public final NavDestination mo20946d(int i) {
        C5808eq eqVar = new C5808eq();
        NavGraph navGraph = this.f12734c;
        vx2.m53588d(navGraph);
        eqVar.add(navGraph);
        while (!eqVar.isEmpty()) {
            NavDestination navDestination = (NavDestination) eqVar.removeFirst();
            if (navDestination.mo8563w() == i) {
                return navDestination;
            }
            if (navDestination instanceof NavGraph) {
                Iterator<NavDestination> it = ((NavGraph) navDestination).iterator();
                while (it.hasNext()) {
                    eqVar.add(it.next());
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    public final h44 mo20947e(Bundle bundle) {
        this.f12736e = bundle;
        this.f12733b.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
        return this;
    }

    /* renamed from: f */
    public final h44 mo20948f(int i, Bundle bundle) {
        this.f12735d.clear();
        this.f12735d.add(new C2443a(i, bundle));
        if (this.f12734c != null) {
            mo20949h();
        }
        return this;
    }

    /* renamed from: h */
    public final void mo20949h() {
        for (C2443a b : this.f12735d) {
            int b2 = b.mo20951b();
            if (mo20946d(b2) == null) {
                String b3 = NavDestination.f6051A.mo8565b(this.f12732a, b2);
                throw new IllegalArgumentException("Navigation destination " + b3 + " cannot be found in the navigation graph " + this.f12734c);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h44(NavController navController) {
        this(navController.mo8501z());
        vx2.m53591g(navController, "navController");
        this.f12734c = navController.mo8448D();
    }
}
