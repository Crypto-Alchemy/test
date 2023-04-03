package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzb extends Fragment implements qg3 {

    /* renamed from: g */
    public static final WeakHashMap f22237g = new WeakHashMap();

    /* renamed from: a */
    public final Map f22238a = Collections.synchronizedMap(new C2781lq());

    /* renamed from: d */
    public int f22239d = 0;

    /* renamed from: e */
    public Bundle f22240e;

    /* renamed from: e */
    public static zzb m33685e(Activity activity) {
        zzb zzb;
        WeakHashMap weakHashMap = f22237g;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (zzb = (zzb) weakReference.get()) != null) {
            return zzb;
        }
        try {
            zzb zzb2 = (zzb) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (zzb2 == null || zzb2.isRemoving()) {
                zzb2 = new zzb();
                activity.getFragmentManager().beginTransaction().add(zzb2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(zzb2));
            return zzb2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    /* renamed from: b */
    public final void mo30607b(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f22238a.containsKey(str)) {
            this.f22238a.put(str, lifecycleCallback);
            if (this.f22239d > 0) {
                new iy8(Looper.getMainLooper()).post(new y48(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    /* renamed from: d */
    public final <T extends LifecycleCallback> T mo30608d(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f22238a.get(str));
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f22238a.values()) {
            a.mo30588a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: g */
    public final Activity mo30610g() {
        return getActivity();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback e : this.f22238a.values()) {
            e.mo30590e(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f22239d = 1;
        this.f22240e = bundle;
        for (Map.Entry entry : this.f22238a.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo30591f(bundle2);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f22239d = 5;
        for (LifecycleCallback g : this.f22238a.values()) {
            g.mo30592g();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f22239d = 3;
        for (LifecycleCallback h : this.f22238a.values()) {
            h.mo30593h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f22238a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo30594i(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f22239d = 2;
        for (LifecycleCallback j : this.f22238a.values()) {
            j.mo30595j();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f22239d = 4;
        for (LifecycleCallback k : this.f22238a.values()) {
            k.mo30596k();
        }
    }
}
