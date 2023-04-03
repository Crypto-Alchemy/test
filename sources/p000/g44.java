package p000;

import androidx.lifecycle.C0729l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f¨\u0006\u0011"}, mo44877d2 = {"Lg44;", "Lad7;", "Lr44;", "", "backStackEntryId", "Lr37;", "c", "onCleared", "Lgd7;", "a", "toString", "", "Ljava/util/Map;", "viewModelStores", "<init>", "()V", "b", "navigation-runtime_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: g44 */
/* compiled from: NavControllerViewModel.kt */
public final class g44 extends ad7 implements r44 {

    /* renamed from: b */
    public static final C2343b f12174b = new C2343b((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final C0729l.C0733b f12175c = new C2342a();

    /* renamed from: a */
    public final Map<String, gd7> f12176a = new LinkedHashMap();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo44877d2 = {"g44$a", "Landroidx/lifecycle/l$b;", "Lad7;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Lad7;", "navigation-runtime_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: g44$a */
    /* compiled from: NavControllerViewModel.kt */
    public static final class C2342a implements C0729l.C0733b {
        /* renamed from: a */
        public <T extends ad7> T mo6370a(Class<T> cls) {
            vx2.m53591g(cls, "modelClass");
            return new g44();
        }

        /* renamed from: b */
        public /* synthetic */ ad7 mo6371b(Class cls, zv0 zv0) {
            return ed7.m16079b(this, cls, zv0);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo44877d2 = {"Lg44$b;", "", "Lgd7;", "viewModelStore", "Lg44;", "a", "Landroidx/lifecycle/l$b;", "FACTORY", "Landroidx/lifecycle/l$b;", "<init>", "()V", "navigation-runtime_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: g44$b */
    /* compiled from: NavControllerViewModel.kt */
    public static final class C2343b {
        public C2343b() {
        }

        public /* synthetic */ C2343b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final g44 mo20349a(gd7 gd7) {
            vx2.m53591g(gd7, "viewModelStore");
            return (g44) new C0729l(gd7, g44.f12175c, (zv0) null, 4, (DefaultConstructorMarker) null).mo6421a(g44.class);
        }
    }

    /* renamed from: a */
    public gd7 mo20346a(String str) {
        vx2.m53591g(str, "backStackEntryId");
        gd7 gd7 = this.f12176a.get(str);
        if (gd7 != null) {
            return gd7;
        }
        gd7 gd72 = new gd7();
        this.f12176a.put(str, gd72);
        return gd72;
    }

    /* renamed from: c */
    public final void mo20347c(String str) {
        vx2.m53591g(str, "backStackEntryId");
        gd7 remove = this.f12176a.remove(str);
        if (remove != null) {
            remove.mo20539a();
        }
    }

    public void onCleared() {
        for (gd7 a : this.f12176a.values()) {
            a.mo20539a();
        }
        this.f12176a.clear();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<String> it = this.f12176a.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "sb.toString()");
        return sb2;
    }
}
