package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C6177b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.gl5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0002\u0013\u0016B\u001f\b\u0016\u0012\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010!¢\u0006\u0004\b#\u0010$B\t\b\u0016¢\u0006\u0004\b#\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J(\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R$\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R(\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001b0\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0014\u0010 \u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006&"}, mo44877d2 = {"Ldl5;", "", "Lgl5$c;", "h", "T", "", "key", "Lk04;", "f", "value", "Lr37;", "j", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "hasInitialValue", "initialValue", "g", "(Ljava/lang/String;ZLjava/lang/Object;)Lk04;", "", "a", "Ljava/util/Map;", "regular", "b", "savedStateProviders", "Ldl5$b;", "c", "liveDatas", "Lu04;", "d", "flows", "e", "Lgl5$c;", "savedStateProvider", "", "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "lifecycle-viewmodel-savedstate_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: dl5 */
/* compiled from: SavedStateHandle.kt */
public final class dl5 {

    /* renamed from: f */
    public static final C2180a f10774f = new C2180a((DefaultConstructorMarker) null);

    /* renamed from: g */
    public static final Class<? extends Object>[] f10775g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a */
    public final Map<String, Object> f10776a;

    /* renamed from: b */
    public final Map<String, gl5.C2404c> f10777b;

    /* renamed from: c */
    public final Map<String, C2181b<?>> f10778c;

    /* renamed from: d */
    public final Map<String, u04<Object>> f10779d;

    /* renamed from: e */
    public final gl5.C2404c f10780e;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0007R$\u0010\f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u000b0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, mo44877d2 = {"Ldl5$a;", "", "Landroid/os/Bundle;", "restoredState", "defaultState", "Ldl5;", "a", "value", "", "b", "", "Ljava/lang/Class;", "ACCEPTABLE_CLASSES", "[Ljava/lang/Class;", "", "KEYS", "Ljava/lang/String;", "VALUES", "<init>", "()V", "lifecycle-viewmodel-savedstate_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: dl5$a */
    /* compiled from: SavedStateHandle.kt */
    public static final class C2180a {
        public C2180a() {
        }

        public /* synthetic */ C2180a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final dl5 mo18834a(Bundle bundle, Bundle bundle2) {
            boolean z;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
                int i = 0;
                if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size = parcelableArrayList.size();
                    while (i < size) {
                        Object obj = parcelableArrayList.get(i);
                        if (obj != null) {
                            linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
                            i++;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                    return new dl5(linkedHashMap);
                }
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            } else if (bundle2 == null) {
                return new dl5();
            } else {
                HashMap hashMap = new HashMap();
                for (String next : bundle2.keySet()) {
                    vx2.m53590f(next, "key");
                    hashMap.put(next, bundle2.get(next));
                }
                return new dl5(hashMap);
            }
        }

        /* renamed from: b */
        public final boolean mo18835b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : dl5.f10775g) {
                vx2.m53588d(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public dl5(Map<String, ? extends Object> map) {
        vx2.m53591g(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f10776a = linkedHashMap;
        this.f10777b = new LinkedHashMap();
        this.f10778c = new LinkedHashMap();
        this.f10779d = new LinkedHashMap();
        this.f10780e = new cl5(this);
        linkedHashMap.putAll(map);
    }

    /* renamed from: e */
    public static final dl5 m15195e(Bundle bundle, Bundle bundle2) {
        return f10774f.mo18834a(bundle, bundle2);
    }

    /* renamed from: i */
    public static final Bundle m15196i(dl5 dl5) {
        vx2.m53591g(dl5, "this$0");
        for (Map.Entry next : C6177b.m47371s(dl5.f10777b).entrySet()) {
            dl5.mo18833j((String) next.getKey(), ((gl5.C2404c) next.getValue()).mo1056a());
        }
        Set<String> keySet = dl5.f10776a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String next2 : keySet) {
            arrayList.add(next2);
            arrayList2.add(dl5.f10776a.get(next2));
        }
        return x50.m29897a(wy6.m54142a("keys", arrayList), wy6.m54142a("values", arrayList2));
    }

    /* renamed from: f */
    public final <T> k04<T> mo18830f(String str) {
        vx2.m53591g(str, "key");
        return mo18831g(str, false, (Object) null);
    }

    /* renamed from: g */
    public final <T> k04<T> mo18831g(String str, boolean z, T t) {
        k04<T> k04;
        C2181b bVar;
        C2181b<?> bVar2 = this.f10778c.get(str);
        if (bVar2 instanceof k04) {
            k04 = bVar2;
        } else {
            k04 = null;
        }
        if (k04 != null) {
            return k04;
        }
        if (this.f10776a.containsKey(str)) {
            bVar = new C2181b(this, str, this.f10776a.get(str));
        } else if (z) {
            this.f10776a.put(str, t);
            bVar = new C2181b(this, str, t);
        } else {
            bVar = new C2181b(this, str);
        }
        this.f10778c.put(str, bVar);
        return bVar;
    }

    /* renamed from: h */
    public final gl5.C2404c mo18832h() {
        return this.f10780e;
    }

    /* renamed from: j */
    public final <T> void mo18833j(String str, T t) {
        k04 k04;
        vx2.m53591g(str, "key");
        if (f10774f.mo18835b(t)) {
            C2181b<?> bVar = this.f10778c.get(str);
            if (bVar instanceof k04) {
                k04 = bVar;
            } else {
                k04 = null;
            }
            if (k04 != null) {
                k04.setValue(t);
            } else {
                this.f10776a.put(str, t);
            }
            u04 u04 = this.f10779d.get(str);
            if (u04 != null) {
                u04.setValue(t);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't put value with type ");
        vx2.m53588d(t);
        sb.append(t.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString());
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010B\u001b\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, mo44877d2 = {"Ldl5$b;", "T", "Lk04;", "value", "Lr37;", "setValue", "(Ljava/lang/Object;)V", "", "a", "Ljava/lang/String;", "key", "Ldl5;", "b", "Ldl5;", "handle", "<init>", "(Ldl5;Ljava/lang/String;Ljava/lang/Object;)V", "(Ldl5;Ljava/lang/String;)V", "lifecycle-viewmodel-savedstate_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: dl5$b */
    /* compiled from: SavedStateHandle.kt */
    public static final class C2181b<T> extends k04<T> {

        /* renamed from: a */
        public String f10781a;

        /* renamed from: b */
        public dl5 f10782b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2181b(dl5 dl5, String str, T t) {
            super(t);
            vx2.m53591g(str, "key");
            this.f10781a = str;
            this.f10782b = dl5;
        }

        public void setValue(T t) {
            dl5 dl5 = this.f10782b;
            if (dl5 != null) {
                dl5.f10776a.put(this.f10781a, t);
                u04 u04 = (u04) dl5.f10779d.get(this.f10781a);
                if (u04 != null) {
                    u04.setValue(t);
                }
            }
            super.setValue(t);
        }

        public C2181b(dl5 dl5, String str) {
            vx2.m53591g(str, "key");
            this.f10781a = str;
            this.f10782b = dl5;
        }
    }

    public dl5() {
        this.f10776a = new LinkedHashMap();
        this.f10777b = new LinkedHashMap();
        this.f10778c = new LinkedHashMap();
        this.f10779d = new LinkedHashMap();
        this.f10780e = new cl5(this);
    }
}
