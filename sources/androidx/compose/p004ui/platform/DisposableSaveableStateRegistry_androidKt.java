package androidx.compose.p004ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.ENS;
import p000.gl5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u001a\"\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010\u0018\u00010\u000f*\u00020\u000eH\u0002\u001a \u0010\u0012\u001a\u00020\u000e*\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00100\u000fH\u0002\"\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u00140\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0017"}, mo44877d2 = {"Landroid/view/View;", "view", "Lil5;", "owner", "Lai1;", "a", "", "id", "savedStateRegistryOwner", "b", "", "value", "", "e", "Landroid/os/Bundle;", "", "", "g", "f", "", "Ljava/lang/Class;", "[Ljava/lang/Class;", "AcceptableClasses", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt */
/* compiled from: DisposableSaveableStateRegistry.android.kt */
public final class DisposableSaveableStateRegistry_androidKt {

    /* renamed from: a */
    public static final Class<? extends Object>[] f2039a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo44877d2 = {"Landroid/os/Bundle;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$a */
    /* compiled from: DisposableSaveableStateRegistry.android.kt */
    public static final class C0426a implements gl5.C2404c {

        /* renamed from: a */
        public final /* synthetic */ al5 f2040a;

        public C0426a(al5 al5) {
            this.f2040a = al5;
        }

        /* renamed from: a */
        public final Bundle mo1056a() {
            return DisposableSaveableStateRegistry_androidKt.m3082f(this.f2040a.mo310a());
        }
    }

    /* renamed from: a */
    public static final ai1 m3077a(View view, il5 il5) {
        String str;
        vx2.m53591g(view, "view");
        vx2.m53591g(il5, ENS.FUNC_OWNER);
        ViewParent parent = view.getParent();
        vx2.m53589e(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(o35.compose_view_saveable_id_tag);
        if (tag instanceof String) {
            str = (String) tag;
        } else {
            str = null;
        }
        if (str == null) {
            str = String.valueOf(view2.getId());
        }
        return m3078b(str, il5);
    }

    /* renamed from: b */
    public static final ai1 m3078b(String str, il5 il5) {
        Map<String, List<Object>> map;
        boolean z;
        vx2.m53591g(str, "id");
        vx2.m53591g(il5, "savedStateRegistryOwner");
        String str2 = al5.class.getSimpleName() + ':' + str;
        gl5 savedStateRegistry = il5.getSavedStateRegistry();
        Bundle b = savedStateRegistry.mo20643b(str2);
        if (b != null) {
            map = m3083g(b);
        } else {
            map = null;
        }
        al5 a = SaveableStateRegistryKt.m2178a(map, C0428xcceb09c3.INSTANCE);
        try {
            savedStateRegistry.mo20648h(str2, new C0426a(a));
            z = true;
        } catch (IllegalArgumentException unused) {
            z = false;
        }
        return new ai1(a, new C0427xec1ea390(z, savedStateRegistry, str2));
    }

    /* renamed from: e */
    public static final boolean m3081e(Object obj) {
        if (obj instanceof e56) {
            e56 e56 = (e56) obj;
            if (e56.mo19124a() != i56.m19414c() && e56.mo19124a() != i56.m19417f() && e56.mo19124a() != i56.m19416e()) {
                return false;
            }
            Object value = e56.getValue();
            if (value == null) {
                return true;
            }
            return m3081e(value);
        } else if ((obj instanceof nd2) && (obj instanceof Serializable)) {
            return false;
        } else {
            for (Class<? extends Object> isInstance : f2039a) {
                if (isInstance.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: f */
    public static final Bundle m3082f(Map<String, ? extends List<? extends Object>> map) {
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            List list = (List) next.getValue();
            if (list instanceof ArrayList) {
                arrayList = (ArrayList) list;
            } else {
                arrayList = new ArrayList(list);
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        return bundle;
    }

    /* renamed from: g */
    public static final Map<String, List<Object>> m3083g(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> keySet = bundle.keySet();
        vx2.m53590f(keySet, "this.keySet()");
        for (String str : keySet) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            vx2.m53589e(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            vx2.m53590f(str, "key");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
