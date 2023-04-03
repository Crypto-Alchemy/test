package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C0729l;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.ENS;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b#\u0010$B%\b\u0017\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b#\u0010'J/\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0003H\u0017R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006("}, mo44877d2 = {"Landroidx/lifecycle/j;", "Landroidx/lifecycle/l$d;", "Landroidx/lifecycle/l$b;", "Lad7;", "T", "Ljava/lang/Class;", "modelClass", "Lzv0;", "extras", "b", "(Ljava/lang/Class;Lzv0;)Lad7;", "", "key", "d", "(Ljava/lang/String;Ljava/lang/Class;)Lad7;", "a", "(Ljava/lang/Class;)Lad7;", "viewModel", "Lr37;", "c", "Landroid/app/Application;", "Landroid/app/Application;", "application", "Landroidx/lifecycle/l$b;", "factory", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lgl5;", "e", "Lgl5;", "savedStateRegistry", "<init>", "()V", "Lil5;", "owner", "(Landroid/app/Application;Lil5;Landroid/os/Bundle;)V", "lifecycle-viewmodel-savedstate_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: androidx.lifecycle.j */
/* compiled from: SavedStateViewModelFactory.kt */
public final class C0726j extends C0729l.C0737d implements C0729l.C0733b {

    /* renamed from: a */
    public Application f3977a;

    /* renamed from: b */
    public final C0729l.C0733b f3978b;

    /* renamed from: c */
    public Bundle f3979c;

    /* renamed from: d */
    public Lifecycle f3980d;

    /* renamed from: e */
    public gl5 f3981e;

    public C0726j() {
        this.f3978b = new C0729l.C0730a();
    }

    /* renamed from: a */
    public <T extends ad7> T mo6370a(Class<T> cls) {
        vx2.m53591g(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo6413d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public <T extends ad7> T mo6371b(Class<T> cls, zv0 zv0) {
        Constructor<T> constructor;
        vx2.m53591g(cls, "modelClass");
        vx2.m53591g(zv0, "extras");
        String str = (String) zv0.mo21703a(C0729l.C0734c.f3998c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (zv0.mo21703a(SavedStateHandleSupport.f3932a) != null && zv0.mo21703a(SavedStateHandleSupport.f3933b) != null) {
            Application application = (Application) zv0.mo21703a(C0729l.C0730a.f3993g);
            boolean isAssignableFrom = C3552wj.class.isAssignableFrom(cls);
            if (!isAssignableFrom || application == null) {
                constructor = jl5.m20219c(cls, jl5.f13691b);
            } else {
                constructor = jl5.m20219c(cls, jl5.f13690a);
            }
            if (constructor == null) {
                return this.f3978b.mo6371b(cls, zv0);
            }
            if (!isAssignableFrom || application == null) {
                return jl5.m20220d(cls, constructor, SavedStateHandleSupport.m5073a(zv0));
            }
            return jl5.m20220d(cls, constructor, application, SavedStateHandleSupport.m5073a(zv0));
        } else if (this.f3980d != null) {
            return mo6413d(str, cls);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    /* renamed from: c */
    public void mo6372c(ad7 ad7) {
        vx2.m53591g(ad7, "viewModel");
        Lifecycle lifecycle = this.f3980d;
        if (lifecycle != null) {
            LegacySavedStateHandleController.m5025a(ad7, this.f3981e, lifecycle);
        }
    }

    /* renamed from: d */
    public final <T extends ad7> T mo6413d(String str, Class<T> cls) {
        Constructor<T> constructor;
        T t;
        Application application;
        vx2.m53591g(str, "key");
        vx2.m53591g(cls, "modelClass");
        if (this.f3980d != null) {
            boolean isAssignableFrom = C3552wj.class.isAssignableFrom(cls);
            if (!isAssignableFrom || this.f3977a == null) {
                constructor = jl5.m20219c(cls, jl5.f13691b);
            } else {
                constructor = jl5.m20219c(cls, jl5.f13690a);
            }
            if (constructor != null) {
                SavedStateHandleController b = LegacySavedStateHandleController.m5026b(this.f3981e, this.f3980d, str, this.f3979c);
                if (!isAssignableFrom || (application = this.f3977a) == null) {
                    dl5 b2 = b.mo6364b();
                    vx2.m53590f(b2, "controller.handle");
                    t = jl5.m20220d(cls, constructor, b2);
                } else {
                    vx2.m53588d(application);
                    dl5 b3 = b.mo6364b();
                    vx2.m53590f(b3, "controller.handle");
                    t = jl5.m20220d(cls, constructor, application, b3);
                }
                t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", b);
                return t;
            } else if (this.f3977a != null) {
                return this.f3978b.mo6370a(cls);
            } else {
                return C0729l.C0734c.f3996a.mo6426a().mo6370a(cls);
            }
        } else {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    @SuppressLint({"LambdaLast"})
    public C0726j(Application application, il5 il5, Bundle bundle) {
        C0729l.C0730a aVar;
        vx2.m53591g(il5, ENS.FUNC_OWNER);
        this.f3981e = il5.getSavedStateRegistry();
        this.f3980d = il5.getLifecycle();
        this.f3979c = bundle;
        this.f3977a = application;
        if (application != null) {
            aVar = C0729l.C0730a.f3991e.mo6425b(application);
        } else {
            aVar = new C0729l.C0730a();
        }
        this.f3978b = aVar;
    }
}
