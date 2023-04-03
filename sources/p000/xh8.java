package p000;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: xh8 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class xh8 extends Fragment implements qg3 {

    /* renamed from: g */
    public static final WeakHashMap f35635g = new WeakHashMap();

    /* renamed from: a */
    public final Map f35636a = Collections.synchronizedMap(new C2781lq());

    /* renamed from: d */
    public int f35637d = 0;

    /* renamed from: e */
    public Bundle f35638e;

    /* renamed from: j */
    public static xh8 m54398j(FragmentActivity fragmentActivity) {
        xh8 xh8;
        WeakHashMap weakHashMap = f35635g;
        WeakReference weakReference = (WeakReference) weakHashMap.get(fragmentActivity);
        if (weakReference != null && (xh8 = (xh8) weakReference.get()) != null) {
            return xh8;
        }
        try {
            xh8 xh82 = (xh8) fragmentActivity.getSupportFragmentManager().mo5984l0("SupportLifecycleFragmentImpl");
            if (xh82 == null || xh82.isRemoving()) {
                xh82 = new xh8();
                fragmentActivity.getSupportFragmentManager().mo5996q().mo6264e(xh82, "SupportLifecycleFragmentImpl").mo6140k();
            }
            weakHashMap.put(fragmentActivity, new WeakReference(xh82));
            return xh82;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    /* renamed from: b */
    public final void mo30607b(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f35636a.containsKey(str)) {
            this.f35636a.put(str, lifecycleCallback);
            if (this.f35637d > 0) {
                new iy8(Looper.getMainLooper()).post(new pe8(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    /* renamed from: d */
    public final <T extends LifecycleCallback> T mo30608d(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f35636a.get(str));
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f35636a.values()) {
            a.mo30588a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: g */
    public final /* synthetic */ Activity mo30610g() {
        return getActivity();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback e : this.f35636a.values()) {
            e.mo30590e(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f35637d = 1;
        this.f35638e = bundle;
        for (Map.Entry entry : this.f35636a.entrySet()) {
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
        this.f35637d = 5;
        for (LifecycleCallback g : this.f35636a.values()) {
            g.mo30592g();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f35637d = 3;
        for (LifecycleCallback h : this.f35636a.values()) {
            h.mo30593h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f35636a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo30594i(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f35637d = 2;
        for (LifecycleCallback j : this.f35636a.values()) {
            j.mo30595j();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f35637d = 4;
        for (LifecycleCallback k : this.f35636a.values()) {
            k.mo30596k();
        }
    }
}
