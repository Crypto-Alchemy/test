package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C0729l;

/* renamed from: androidx.lifecycle.a */
/* compiled from: AbstractSavedStateViewModelFactory */
public abstract class C0709a extends C0729l.C0737d implements C0729l.C0733b {

    /* renamed from: a */
    public gl5 f3944a;

    /* renamed from: b */
    public Lifecycle f3945b;

    /* renamed from: c */
    public Bundle f3946c;

    @SuppressLint({"LambdaLast"})
    public C0709a(il5 il5, Bundle bundle) {
        this.f3944a = il5.getSavedStateRegistry();
        this.f3945b = il5.getLifecycle();
        this.f3946c = bundle;
    }

    /* renamed from: a */
    public final <T extends ad7> T mo6370a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        } else if (this.f3945b != null) {
            return mo6373d(canonicalName, cls);
        } else {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    /* renamed from: b */
    public final <T extends ad7> T mo6371b(Class<T> cls, zv0 zv0) {
        String str = (String) zv0.mo21703a(C0729l.C0734c.f3998c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (this.f3944a != null) {
            return mo6373d(str, cls);
        } else {
            return mo6374e(str, cls, SavedStateHandleSupport.m5073a(zv0));
        }
    }

    /* renamed from: c */
    public void mo6372c(ad7 ad7) {
        gl5 gl5 = this.f3944a;
        if (gl5 != null) {
            LegacySavedStateHandleController.m5025a(ad7, gl5, this.f3945b);
        }
    }

    /* renamed from: d */
    public final <T extends ad7> T mo6373d(String str, Class<T> cls) {
        SavedStateHandleController b = LegacySavedStateHandleController.m5026b(this.f3944a, this.f3945b, str, this.f3946c);
        T e = mo6374e(str, cls, b.mo6364b());
        e.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", b);
        return e;
    }

    /* renamed from: e */
    public abstract <T extends ad7> T mo6374e(String str, Class<T> cls, dl5 dl5);
}
