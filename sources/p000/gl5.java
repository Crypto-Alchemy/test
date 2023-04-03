package p000;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0003\u001a\u0005\nB\t\b\u0000¢\u0006\u0004\b-\u0010.J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000f\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\fH\u0007J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0007R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010 R$\u0010$\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001d8G@BX\u000e¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010'R\"\u0010,\u001a\u00020\u001d8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b)\u0010%\"\u0004\b*\u0010+¨\u0006/"}, mo44877d2 = {"Lgl5;", "", "", "key", "Landroid/os/Bundle;", "b", "Lgl5$c;", "provider", "Lr37;", "h", "c", "j", "Ljava/lang/Class;", "Lgl5$a;", "clazz", "i", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "e", "(Landroidx/lifecycle/Lifecycle;)V", "savedState", "f", "(Landroid/os/Bundle;)V", "outBundle", "g", "Lok5;", "a", "Lok5;", "components", "", "Z", "attached", "Landroid/os/Bundle;", "restoredState", "<set-?>", "d", "isRestored", "()Z", "Landroidx/savedstate/Recreator$b;", "Landroidx/savedstate/Recreator$b;", "recreatorProvider", "isAllowingSavingState$savedstate_release", "setAllowingSavingState$savedstate_release", "(Z)V", "isAllowingSavingState", "<init>", "()V", "savedstate_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
@SuppressLint({"RestrictedApi"})
/* renamed from: gl5 */
/* compiled from: SavedStateRegistry.kt */
public final class gl5 {

    /* renamed from: g */
    public static final C2403b f12473g = new C2403b((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final ok5<String, C2404c> f12474a = new ok5<>();

    /* renamed from: b */
    public boolean f12475b;

    /* renamed from: c */
    public Bundle f12476c;

    /* renamed from: d */
    public boolean f12477d;

    /* renamed from: e */
    public Recreator.C1373b f12478e;

    /* renamed from: f */
    public boolean f12479f = true;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, mo44877d2 = {"Lgl5$a;", "", "Lil5;", "owner", "Lr37;", "a", "savedstate_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: gl5$a */
    /* compiled from: SavedStateRegistry.kt */
    public interface C2402a {
        /* renamed from: a */
        void mo6294a(il5 il5);
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lgl5$b;", "", "", "SAVED_COMPONENTS_KEY", "Ljava/lang/String;", "<init>", "()V", "savedstate_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: gl5$b */
    /* compiled from: SavedStateRegistry.kt */
    public static final class C2403b {
        public C2403b() {
        }

        public /* synthetic */ C2403b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, mo44877d2 = {"Lgl5$c;", "", "Landroid/os/Bundle;", "a", "savedstate_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: gl5$c */
    /* compiled from: SavedStateRegistry.kt */
    public interface C2404c {
        /* renamed from: a */
        Bundle mo1056a();
    }

    /* renamed from: d */
    public static final void m18196d(gl5 gl5, ug3 ug3, Lifecycle.Event event) {
        vx2.m53591g(gl5, "this$0");
        vx2.m53591g(ug3, "<anonymous parameter 0>");
        vx2.m53591g(event, "event");
        if (event == Lifecycle.Event.ON_START) {
            gl5.f12479f = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            gl5.f12479f = false;
        }
    }

    /* renamed from: b */
    public final Bundle mo20643b(String str) {
        Bundle bundle;
        vx2.m53591g(str, "key");
        if (this.f12477d) {
            Bundle bundle2 = this.f12476c;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            } else {
                bundle = null;
            }
            Bundle bundle3 = this.f12476c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f12476c;
            boolean z = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z = true;
            }
            if (!z) {
                this.f12476c = null;
            }
            return bundle;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    /* renamed from: c */
    public final C2404c mo20644c(String str) {
        vx2.m53591g(str, "key");
        Iterator<Map.Entry<String, C2404c>> it = this.f12474a.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            vx2.m53590f(next, "components");
            C2404c cVar = (C2404c) next.getValue();
            if (vx2.m53586b((String) next.getKey(), str)) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void mo20645e(Lifecycle lifecycle) {
        vx2.m53591g(lifecycle, "lifecycle");
        if (!this.f12475b) {
            lifecycle.mo6295a(new fl5(this));
            this.f12475b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    /* renamed from: f */
    public final void mo20646f(Bundle bundle) {
        Bundle bundle2;
        if (!this.f12475b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        } else if (!this.f12477d) {
            if (bundle != null) {
                bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            } else {
                bundle2 = null;
            }
            this.f12476c = bundle2;
            this.f12477d = true;
        } else {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
    }

    /* renamed from: g */
    public final void mo20647g(Bundle bundle) {
        vx2.m53591g(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f12476c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        ok5<K, V>.C6956d k = this.f12474a.mo23970k();
        vx2.m53590f(k, "this.components.iteratorWithAdditions()");
        while (k.hasNext()) {
            Map.Entry entry = (Map.Entry) k.next();
            bundle2.putBundle((String) entry.getKey(), ((C2404c) entry.getValue()).mo1056a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    /* renamed from: h */
    public final void mo20648h(String str, C2404c cVar) {
        boolean z;
        vx2.m53591g(str, "key");
        vx2.m53591g(cVar, "provider");
        if (this.f12474a.mo18386q(str, cVar) == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    /* renamed from: i */
    public final void mo20649i(Class<? extends C2402a> cls) {
        vx2.m53591g(cls, "clazz");
        if (this.f12479f) {
            Recreator.C1373b bVar = this.f12478e;
            if (bVar == null) {
                bVar = new Recreator.C1373b(this);
            }
            this.f12478e = bVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.C1373b bVar2 = this.f12478e;
                if (bVar2 != null) {
                    String name = cls.getName();
                    vx2.m53590f(name, "clazz.name");
                    bVar2.mo10170b(name);
                }
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
    }

    /* renamed from: j */
    public final void mo20650j(String str) {
        vx2.m53591g(str, "key");
        this.f12474a.mo18387r(str);
    }
}
