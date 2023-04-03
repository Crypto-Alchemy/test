package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C0709a;
import androidx.lifecycle.C0714d;
import androidx.lifecycle.C0716f;
import androidx.lifecycle.C0726j;
import androidx.lifecycle.C0729l;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleSupport;
import java.util.Set;
import java.util.UUID;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.ENS;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 ]2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003\u001c^_BS\b\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010&\u001a\u00020\u001f\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010.\u001a\u00020+\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010/\u0012\b\b\u0002\u00106\u001a\u000202\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bY\u0010ZB\u001d\b\u0017\u0012\u0006\u0010[\u001a\u00020\u0000\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bY\u0010\\J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007J\b\u0010\u000b\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0007X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0019\u0010*\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b \u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u0004\u0018\u00010/8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u00100R\u0017\u00106\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b,\u00105R\u0016\u00108\u001a\u0004\u0018\u00010\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u0010(R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010C\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020D8BX\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b'\u0010GR\u001b\u0010M\u001a\u00020I8FX\u0002¢\u0006\f\n\u0004\bJ\u0010F\u001a\u0004\bK\u0010LR*\u0010T\u001a\u00020+2\u0006\u0010N\u001a\u00020+8G@GX\u000e¢\u0006\u0012\n\u0004\bO\u0010-\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8VX\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006`"}, mo44877d2 = {"Landroidx/navigation/NavBackStackEntry;", "Lug3;", "Lhd7;", "Landroidx/lifecycle/d;", "Lil5;", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Lr37;", "j", "n", "Lgd7;", "getViewModelStore", "Landroidx/lifecycle/l$b;", "getDefaultViewModelProviderFactory", "Lzv0;", "getDefaultViewModelCreationExtras", "Landroid/os/Bundle;", "outBundle", "k", "", "other", "", "equals", "", "hashCode", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "Landroidx/navigation/NavDestination;", "d", "Landroidx/navigation/NavDestination;", "f", "()Landroidx/navigation/NavDestination;", "l", "(Landroidx/navigation/NavDestination;)V", "destination", "e", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "arguments", "Landroidx/lifecycle/Lifecycle$State;", "g", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Lr44;", "Lr44;", "viewModelStoreProvider", "", "r", "Ljava/lang/String;", "()Ljava/lang/String;", "id", "s", "savedState", "Landroidx/lifecycle/f;", "x", "Landroidx/lifecycle/f;", "lifecycle", "Lhl5;", "y", "Lhl5;", "savedStateRegistryController", "A", "Z", "savedStateRegistryAttached", "Landroidx/lifecycle/j;", "B", "Lef3;", "()Landroidx/lifecycle/j;", "defaultFactory", "Ldl5;", "C", "i", "()Ldl5;", "savedStateHandle", "maxState", "H", "h", "()Landroidx/lifecycle/Lifecycle$State;", "m", "(Landroidx/lifecycle/Lifecycle$State;)V", "maxLifecycle", "Lgl5;", "getSavedStateRegistry", "()Lgl5;", "savedStateRegistry", "<init>", "(Landroid/content/Context;Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/lifecycle/Lifecycle$State;Lr44;Ljava/lang/String;Landroid/os/Bundle;)V", "entry", "(Landroidx/navigation/NavBackStackEntry;Landroid/os/Bundle;)V", "I", "b", "c", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: NavBackStackEntry.kt */
public final class NavBackStackEntry implements ug3, hd7, C0714d, il5 {

    /* renamed from: I */
    public static final C1109a f5972I = new C1109a((DefaultConstructorMarker) null);

    /* renamed from: A */
    public boolean f5973A;

    /* renamed from: B */
    public final ef3 f5974B;

    /* renamed from: C */
    public final ef3 f5975C;

    /* renamed from: H */
    public Lifecycle.State f5976H;

    /* renamed from: a */
    public final Context f5977a;

    /* renamed from: d */
    public NavDestination f5978d;

    /* renamed from: e */
    public final Bundle f5979e;

    /* renamed from: g */
    public Lifecycle.State f5980g;

    /* renamed from: k */
    public final r44 f5981k;

    /* renamed from: r */
    public final String f5982r;

    /* renamed from: s */
    public final Bundle f5983s;

    /* renamed from: x */
    public C0716f f5984x;

    /* renamed from: y */
    public final hl5 f5985y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012JR\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0013"}, mo44877d2 = {"Landroidx/navigation/NavBackStackEntry$a;", "", "Landroid/content/Context;", "context", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "arguments", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Lr44;", "viewModelStoreProvider", "", "id", "savedState", "Landroidx/navigation/NavBackStackEntry;", "a", "<init>", "()V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.navigation.NavBackStackEntry$a */
    /* compiled from: NavBackStackEntry.kt */
    public static final class C1109a {
        public C1109a() {
        }

        public /* synthetic */ C1109a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ NavBackStackEntry m8164b(C1109a aVar, Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, r44 r44, String str, Bundle bundle2, int i, Object obj) {
            Bundle bundle3;
            Lifecycle.State state2;
            r44 r442;
            String str2;
            Bundle bundle4;
            if ((i & 4) != 0) {
                bundle3 = null;
            } else {
                bundle3 = bundle;
            }
            if ((i & 8) != 0) {
                state2 = Lifecycle.State.CREATED;
            } else {
                state2 = state;
            }
            if ((i & 16) != 0) {
                r442 = null;
            } else {
                r442 = r44;
            }
            if ((i & 32) != 0) {
                String uuid = UUID.randomUUID().toString();
                vx2.m53590f(uuid, "randomUUID().toString()");
                str2 = uuid;
            } else {
                str2 = str;
            }
            if ((i & 64) != 0) {
                bundle4 = null;
            } else {
                bundle4 = bundle2;
            }
            return aVar.mo8434a(context, navDestination, bundle3, state2, r442, str2, bundle4);
        }

        /* renamed from: a */
        public final NavBackStackEntry mo8434a(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, r44 r44, String str, Bundle bundle2) {
            vx2.m53591g(navDestination, "destination");
            vx2.m53591g(state, "hostLifecycleState");
            String str2 = str;
            vx2.m53591g(str2, "id");
            return new NavBackStackEntry(context, navDestination, bundle, state, r44, str2, bundle2, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010"}, mo44877d2 = {"Landroidx/navigation/NavBackStackEntry$b;", "Landroidx/lifecycle/a;", "Lad7;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "Ldl5;", "handle", "e", "(Ljava/lang/String;Ljava/lang/Class;Ldl5;)Lad7;", "Lil5;", "owner", "<init>", "(Lil5;)V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.navigation.NavBackStackEntry$b */
    /* compiled from: NavBackStackEntry.kt */
    public static final class C1110b extends C0709a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1110b(il5 il5) {
            super(il5, (Bundle) null);
            vx2.m53591g(il5, ENS.FUNC_OWNER);
        }

        /* renamed from: e */
        public <T extends ad7> T mo6374e(String str, Class<T> cls, dl5 dl5) {
            vx2.m53591g(str, "key");
            vx2.m53591g(cls, "modelClass");
            vx2.m53591g(dl5, "handle");
            return new C1111c(dl5);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, mo44877d2 = {"Landroidx/navigation/NavBackStackEntry$c;", "Lad7;", "Ldl5;", "a", "Ldl5;", "b", "()Ldl5;", "handle", "<init>", "(Ldl5;)V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.navigation.NavBackStackEntry$c */
    /* compiled from: NavBackStackEntry.kt */
    public static final class C1111c extends ad7 {

        /* renamed from: a */
        public final dl5 f5986a;

        public C1111c(dl5 dl5) {
            vx2.m53591g(dl5, "handle");
            this.f5986a = dl5;
        }

        /* renamed from: b */
        public final dl5 mo8435b() {
            return this.f5986a;
        }
    }

    public NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, r44 r44, String str, Bundle bundle2) {
        this.f5977a = context;
        this.f5978d = navDestination;
        this.f5979e = bundle;
        this.f5980g = state;
        this.f5981k = r44;
        this.f5982r = str;
        this.f5983s = bundle2;
        this.f5984x = new C0716f(this);
        this.f5985y = hl5.f12923d.mo21225a(this);
        this.f5974B = C6169a.m47232a(new NavBackStackEntry$defaultFactory$2(this));
        this.f5975C = C6169a.m47232a(new NavBackStackEntry$savedStateHandle$2(this));
        this.f5976H = Lifecycle.State.INITIALIZED;
    }

    public /* synthetic */ NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, r44 r44, String str, Bundle bundle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, navDestination, bundle, state, r44, str, bundle2);
    }

    /* renamed from: d */
    public final Bundle mo8421d() {
        return this.f5979e;
    }

    /* renamed from: e */
    public final C0726j mo8422e() {
        return (C0726j) this.f5974B.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L_0x0083
            boolean r1 = r7 instanceof androidx.navigation.NavBackStackEntry
            if (r1 != 0) goto L_0x0009
            goto L_0x0083
        L_0x0009:
            java.lang.String r1 = r6.f5982r
            androidx.navigation.NavBackStackEntry r7 = (androidx.navigation.NavBackStackEntry) r7
            java.lang.String r2 = r7.f5982r
            boolean r1 = p000.vx2.m53586b(r1, r2)
            r2 = 1
            if (r1 == 0) goto L_0x0083
            androidx.navigation.NavDestination r1 = r6.f5978d
            androidx.navigation.NavDestination r3 = r7.f5978d
            boolean r1 = p000.vx2.m53586b(r1, r3)
            if (r1 == 0) goto L_0x0083
            androidx.lifecycle.f r1 = r6.f5984x
            androidx.lifecycle.f r3 = r7.f5984x
            boolean r1 = p000.vx2.m53586b(r1, r3)
            if (r1 == 0) goto L_0x0083
            gl5 r1 = r6.getSavedStateRegistry()
            gl5 r3 = r7.getSavedStateRegistry()
            boolean r1 = p000.vx2.m53586b(r1, r3)
            if (r1 == 0) goto L_0x0083
            android.os.Bundle r1 = r6.f5979e
            android.os.Bundle r3 = r7.f5979e
            boolean r1 = p000.vx2.m53586b(r1, r3)
            if (r1 != 0) goto L_0x0082
            android.os.Bundle r1 = r6.f5979e
            if (r1 == 0) goto L_0x007f
            java.util.Set r1 = r1.keySet()
            if (r1 == 0) goto L_0x007f
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x0054
        L_0x0052:
            r7 = r2
            goto L_0x007b
        L_0x0054:
            java.util.Iterator r1 = r1.iterator()
        L_0x0058:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0052
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            android.os.Bundle r4 = r6.f5979e
            java.lang.Object r4 = r4.get(r3)
            android.os.Bundle r5 = r7.f5979e
            if (r5 == 0) goto L_0x0073
            java.lang.Object r3 = r5.get(r3)
            goto L_0x0074
        L_0x0073:
            r3 = 0
        L_0x0074:
            boolean r3 = p000.vx2.m53586b(r4, r3)
            if (r3 != 0) goto L_0x0058
            r7 = r0
        L_0x007b:
            if (r7 != r2) goto L_0x007f
            r7 = r2
            goto L_0x0080
        L_0x007f:
            r7 = r0
        L_0x0080:
            if (r7 == 0) goto L_0x0083
        L_0x0082:
            r0 = r2
        L_0x0083:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavBackStackEntry.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final NavDestination mo8424f() {
        return this.f5978d;
    }

    /* renamed from: g */
    public final String mo8425g() {
        return this.f5982r;
    }

    public zv0 getDefaultViewModelCreationExtras() {
        Context context;
        Application application = null;
        j04 j04 = new j04((zv0) null, 1, (DefaultConstructorMarker) null);
        Context context2 = this.f5977a;
        if (context2 != null) {
            context = context2.getApplicationContext();
        } else {
            context = null;
        }
        if (context instanceof Application) {
            application = (Application) context;
        }
        if (application != null) {
            j04.mo21704c(C0729l.C0730a.f3993g, application);
        }
        j04.mo21704c(SavedStateHandleSupport.f3932a, this);
        j04.mo21704c(SavedStateHandleSupport.f3933b, this);
        Bundle bundle = this.f5979e;
        if (bundle != null) {
            j04.mo21704c(SavedStateHandleSupport.f3934c, bundle);
        }
        return j04;
    }

    public C0729l.C0733b getDefaultViewModelProviderFactory() {
        return mo8422e();
    }

    public Lifecycle getLifecycle() {
        return this.f5984x;
    }

    public gl5 getSavedStateRegistry() {
        return this.f5985y.mo21221b();
    }

    public gd7 getViewModelStore() {
        boolean z;
        if (this.f5973A) {
            if (this.f5984x.mo6296b() != Lifecycle.State.DESTROYED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                r44 r44 = this.f5981k;
                if (r44 != null) {
                    return r44.mo20346a(this.f5982r);
                }
                throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
    }

    /* renamed from: h */
    public final Lifecycle.State mo8426h() {
        return this.f5976H;
    }

    public int hashCode() {
        Set<String> keySet;
        int i;
        int hashCode = (this.f5982r.hashCode() * 31) + this.f5978d.hashCode();
        Bundle bundle = this.f5979e;
        if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
            for (String str : keySet) {
                int i2 = hashCode * 31;
                Object obj = this.f5979e.get(str);
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                hashCode = i2 + i;
            }
        }
        return (((hashCode * 31) + this.f5984x.hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    /* renamed from: i */
    public final dl5 mo8428i() {
        return (dl5) this.f5975C.getValue();
    }

    /* renamed from: j */
    public final void mo8429j(Lifecycle.Event event) {
        vx2.m53591g(event, "event");
        Lifecycle.State targetState = event.getTargetState();
        vx2.m53590f(targetState, "event.targetState");
        this.f5980g = targetState;
        mo8433n();
    }

    /* renamed from: k */
    public final void mo8430k(Bundle bundle) {
        vx2.m53591g(bundle, "outBundle");
        this.f5985y.mo21224e(bundle);
    }

    /* renamed from: l */
    public final void mo8431l(NavDestination navDestination) {
        vx2.m53591g(navDestination, "<set-?>");
        this.f5978d = navDestination;
    }

    /* renamed from: m */
    public final void mo8432m(Lifecycle.State state) {
        vx2.m53591g(state, "maxState");
        this.f5976H = state;
        mo8433n();
    }

    /* renamed from: n */
    public final void mo8433n() {
        if (!this.f5973A) {
            this.f5985y.mo21222c();
            this.f5973A = true;
            if (this.f5981k != null) {
                SavedStateHandleSupport.m5075c(this);
            }
            this.f5985y.mo21223d(this.f5983s);
        }
        if (this.f5980g.ordinal() < this.f5976H.ordinal()) {
            this.f5984x.mo6395o(this.f5980g);
        } else {
            this.f5984x.mo6395o(this.f5976H);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NavBackStackEntry(NavBackStackEntry navBackStackEntry, Bundle bundle) {
        this(navBackStackEntry.f5977a, navBackStackEntry.f5978d, bundle, navBackStackEntry.f5980g, navBackStackEntry.f5981k, navBackStackEntry.f5982r, navBackStackEntry.f5983s);
        vx2.m53591g(navBackStackEntry, "entry");
        this.f5980g = navBackStackEntry.f5980g;
        mo8432m(navBackStackEntry.f5976H);
    }
}
