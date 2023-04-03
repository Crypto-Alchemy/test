package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C0715e;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.ENS;
import p000.gl5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0002\n\u0011B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u0012"}, mo44877d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/e;", "Lug3;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Lr37;", "f", "", "className", "a", "Lil5;", "Lil5;", "owner", "<init>", "(Lil5;)V", "d", "b", "savedstate_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: Recreator.kt */
public final class Recreator implements C0715e {

    /* renamed from: d */
    public static final C1372a f6917d = new C1372a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final il5 f6918a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, mo44877d2 = {"Landroidx/savedstate/Recreator$a;", "", "", "CLASSES_KEY", "Ljava/lang/String;", "COMPONENT_KEY", "<init>", "()V", "savedstate_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.savedstate.Recreator$a */
    /* compiled from: Recreator.kt */
    public static final class C1372a {
        public C1372a() {
        }

        public /* synthetic */ C1372a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000f"}, mo44877d2 = {"Landroidx/savedstate/Recreator$b;", "Lgl5$c;", "Landroid/os/Bundle;", "a", "", "className", "Lr37;", "b", "", "Ljava/util/Set;", "classes", "Lgl5;", "registry", "<init>", "(Lgl5;)V", "savedstate_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.savedstate.Recreator$b */
    /* compiled from: Recreator.kt */
    public static final class C1373b implements gl5.C2404c {

        /* renamed from: a */
        public final Set<String> f6919a = new LinkedHashSet();

        public C1373b(gl5 gl5) {
            vx2.m53591g(gl5, "registry");
            gl5.mo20648h("androidx.savedstate.Restarter", this);
        }

        /* renamed from: a */
        public Bundle mo1056a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f6919a));
            return bundle;
        }

        /* renamed from: b */
        public final void mo10170b(String str) {
            vx2.m53591g(str, "className");
            this.f6919a.add(str);
        }
    }

    public Recreator(il5 il5) {
        vx2.m53591g(il5, ENS.FUNC_OWNER);
        this.f6918a = il5;
    }

    /* renamed from: a */
    public final void mo10169a(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(gl5.C2402a.class);
            vx2.m53590f(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    vx2.m53590f(newInstance, "{\n                constr…wInstance()\n            }");
                    ((gl5.C2402a) newInstance).mo6294a(this.f6918a);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    /* renamed from: f */
    public void mo907f(ug3 ug3, Lifecycle.Event event) {
        vx2.m53591g(ug3, "source");
        vx2.m53591g(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            ug3.getLifecycle().mo6297c(this);
            Bundle b = this.f6918a.getSavedStateRegistry().mo20643b("androidx.savedstate.Restarter");
            if (b != null) {
                ArrayList<String> stringArrayList = b.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String a : stringArrayList) {
                        mo10169a(a);
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
