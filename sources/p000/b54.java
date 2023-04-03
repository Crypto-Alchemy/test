package p000;

import android.annotation.SuppressLint;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6177b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\b\u0017\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u0006\u001a\u00028\u0000\"\f\b\u0000\u0010\u0003*\u0006\u0012\u0002\b\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\u00028\u0000\"\f\b\u0000\u0010\u0003*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u00022\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0002J*\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0002H\u0017R(\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R%\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, mo44877d2 = {"Lb54;", "", "Landroidx/navigation/Navigator;", "T", "Ljava/lang/Class;", "navigatorClass", "d", "(Ljava/lang/Class;)Landroidx/navigation/Navigator;", "", "name", "e", "(Ljava/lang/String;)Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "navigator", "b", "c", "", "a", "Ljava/util/Map;", "_navigators", "", "f", "()Ljava/util/Map;", "navigators", "<init>", "()V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
@SuppressLint({"TypeParameterUnusedInFormals"})
/* renamed from: b54 */
/* compiled from: NavigatorProvider.kt */
public class b54 {

    /* renamed from: b */
    public static final C1603a f7944b = new C1603a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final Map<Class<?>, String> f7945c = new LinkedHashMap();

    /* renamed from: a */
    public final Map<String, Navigator<? extends NavDestination>> f7946a = new LinkedHashMap();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\b0\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bR&\u0010\r\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, mo44877d2 = {"Lb54$a;", "", "", "name", "", "b", "(Ljava/lang/String;)Z", "Ljava/lang/Class;", "Landroidx/navigation/Navigator;", "navigatorClass", "a", "(Ljava/lang/Class;)Ljava/lang/String;", "", "annotationNames", "Ljava/util/Map;", "<init>", "()V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: b54$a */
    /* compiled from: NavigatorProvider.kt */
    public static final class C1603a {
        public C1603a() {
        }

        public /* synthetic */ C1603a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo11361a(Class<? extends Navigator<?>> cls) {
            vx2.m53591g(cls, "navigatorClass");
            String str = (String) b54.f7945c.get(cls);
            if (str == null) {
                Navigator.C1127b bVar = (Navigator.C1127b) cls.getAnnotation(Navigator.C1127b.class);
                if (bVar != null) {
                    str = bVar.value();
                } else {
                    str = null;
                }
                if (mo11362b(str)) {
                    b54.f7945c.put(cls, str);
                } else {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + cls.getSimpleName()).toString());
                }
            }
            vx2.m53588d(str);
            return str;
        }

        /* renamed from: b */
        public final boolean mo11362b(String str) {
            boolean z;
            if (str != null) {
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: b */
    public final Navigator<? extends NavDestination> mo11356b(Navigator<? extends NavDestination> navigator) {
        vx2.m53591g(navigator, "navigator");
        return mo11357c(f7944b.mo11361a(navigator.getClass()), navigator);
    }

    /* renamed from: c */
    public Navigator<? extends NavDestination> mo11357c(String str, Navigator<? extends NavDestination> navigator) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(navigator, "navigator");
        if (f7944b.mo11362b(str)) {
            Navigator navigator2 = this.f7946a.get(str);
            if (vx2.m53586b(navigator2, navigator)) {
                return navigator;
            }
            boolean z = false;
            if (navigator2 != null && navigator2.mo8597c()) {
                z = true;
            }
            if (!(!z)) {
                throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + navigator2).toString());
            } else if (!navigator.mo8597c()) {
                return this.f7946a.put(str, navigator);
            } else {
                throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
            }
        } else {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
    }

    /* renamed from: d */
    public final <T extends Navigator<?>> T mo11358d(Class<T> cls) {
        vx2.m53591g(cls, "navigatorClass");
        return mo11359e(f7944b.mo11361a(cls));
    }

    /* renamed from: e */
    public <T extends Navigator<?>> T mo11359e(String str) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        if (f7944b.mo11362b(str)) {
            T t = (Navigator) this.f7946a.get(str);
            if (t != null) {
                return t;
            }
            throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }

    /* renamed from: f */
    public final Map<String, Navigator<? extends NavDestination>> mo11360f() {
        return C6177b.m47371s(this.f7946a);
    }
}
