package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.logger.Level;
import org.koin.core.scope.Scope;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00103\u001a\u00020/¢\u0006\u0004\b8\u00109J%\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0005H\u0007J3\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f2\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"J/\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#\"\u0004\b\u0000\u0010\u001a2\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b$\u0010%J\u0006\u0010'\u001a\u00020&J\u0018\u0010)\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J(\u0010.\u001a\u00020\u00072\u001e\u0010-\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030+0*j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030+`,H\u0002R\u0017\u00103\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u00102R(\u00106\u001a\u0016\u0012\b\u0012\u00060\fj\u0002`\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f048\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u00105R,\u0010-\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030+0*j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030+`,8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u00107¨\u0006:"}, mo44877d2 = {"Lbw2;", "", "", "Ldx3;", "modules", "", "allowOverride", "Lr37;", "f", "(Ljava/util/Set;Z)V", "a", "()V", "", "Lorg/koin/core/definition/IndexKey;", "mapping", "Lzv2;", "factory", "logWarning", "i", "Lq83;", "clazz", "Loz4;", "qualifier", "scopeQualifier", "g", "(Lq83;Loz4;Loz4;)Lzv2;", "T", "Lxv2;", "instanceContext", "h", "(Loz4;Lq83;Loz4;Lxv2;)Ljava/lang/Object;", "Lorg/koin/core/scope/Scope;", "scope", "c", "(Lorg/koin/core/scope/Scope;)V", "", "d", "(Lq83;Lxv2;)Ljava/util/List;", "", "k", "module", "e", "Ljava/util/HashSet;", "Lorg/koin/core/instance/SingleInstanceFactory;", "Lkotlin/collections/HashSet;", "eagerInstances", "b", "Lfc3;", "Lfc3;", "get_koin", "()Lfc3;", "_koin", "", "Ljava/util/Map;", "_instances", "Ljava/util/HashSet;", "<init>", "(Lfc3;)V", "koin-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: bw2 */
/* compiled from: InstanceRegistry.kt */
public final class bw2 {

    /* renamed from: a */
    public final fc3 f36961a;

    /* renamed from: b */
    public final Map<String, zv2<?>> f36962b = lc3.f40598a.mo55880d();

    /* renamed from: c */
    public final HashSet<SingleInstanceFactory<?>> f36963c = new HashSet<>();

    public bw2(fc3 fc3) {
        vx2.m53591g(fc3, "_koin");
        this.f36961a = fc3;
    }

    /* renamed from: j */
    public static /* synthetic */ void m56172j(bw2 bw2, boolean z, String str, zv2 zv2, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        bw2.mo50743i(z, str, zv2, z2);
    }

    /* renamed from: a */
    public final void mo50735a() {
        mo50736b(this.f36963c);
        this.f36963c.clear();
    }

    /* renamed from: b */
    public final void mo50736b(HashSet<SingleInstanceFactory<?>> hashSet) {
        if (!hashSet.isEmpty()) {
            fc3 fc3 = this.f36961a;
            xv2 xv2 = new xv2(fc3, fc3.mo51636g().mo56284d(), (ul4) null, 4, (DefaultConstructorMarker) null);
            for (SingleInstanceFactory b : hashSet) {
                b.mo64979b(xv2);
            }
        }
    }

    /* renamed from: c */
    public final void mo50737c(Scope scope) {
        vx2.m53591g(scope, "scope");
        Collection<zv2<?>> values = this.f36962b.values();
        ArrayList<ScopedInstanceFactory> arrayList = new ArrayList<>();
        for (T next : values) {
            if (next instanceof ScopedInstanceFactory) {
                arrayList.add(next);
            }
        }
        for (ScopedInstanceFactory e : arrayList) {
            e.mo64980e(scope);
        }
    }

    /* renamed from: d */
    public final <T> List<T> mo50738d(q83<?> q83, xv2 xv2) {
        boolean z;
        vx2.m53591g(q83, "clazz");
        vx2.m53591g(xv2, "instanceContext");
        Collection<zv2<?>> values = this.f36962b.values();
        ArrayList arrayList = new ArrayList();
        for (T next : values) {
            if (vx2.m53586b(((zv2) next).mo67401c().mo64971e(), xv2.mo66944c().mo64995l())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            zv2 zv2 = (zv2) next2;
            if (vx2.m53586b(zv2.mo67401c().mo64969c(), q83) || zv2.mo67401c().mo64973f().contains(q83)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList2.add(next2);
            }
        }
        List<zv2> S = CollectionsKt___CollectionsKt.m47322S(arrayList2);
        ArrayList arrayList3 = new ArrayList(dk0.m43495u(S, 10));
        for (zv2 b : S) {
            arrayList3.add(b.mo64979b(xv2));
        }
        return arrayList3;
    }

    /* renamed from: e */
    public final void mo50739e(dx3 dx3, boolean z) {
        for (Map.Entry next : dx3.mo51298c().entrySet()) {
            m56172j(this, z, (String) next.getKey(), (zv2) next.getValue(), false, 8, (Object) null);
        }
    }

    /* renamed from: f */
    public final void mo50740f(Set<dx3> set, boolean z) {
        vx2.m53591g(set, "modules");
        for (dx3 dx3 : set) {
            mo50739e(dx3, z);
            this.f36963c.addAll(dx3.mo51296a());
        }
    }

    /* renamed from: g */
    public final zv2<?> mo50741g(q83<?> q83, oz4 oz4, oz4 oz42) {
        vx2.m53591g(q83, "clazz");
        vx2.m53591g(oz42, "scopeQualifier");
        return this.f36962b.get(m00.m64036a(q83, oz4, oz42));
    }

    /* renamed from: h */
    public final <T> T mo50742h(oz4 oz4, q83<?> q83, oz4 oz42, xv2 xv2) {
        T t;
        vx2.m53591g(q83, "clazz");
        vx2.m53591g(oz42, "scopeQualifier");
        vx2.m53591g(xv2, "instanceContext");
        zv2<?> g = mo50741g(q83, oz4, oz42);
        if (g != null) {
            t = g.mo64979b(xv2);
        } else {
            t = null;
        }
        if (t == null) {
            return null;
        }
        return t;
    }

    /* renamed from: i */
    public final void mo50743i(boolean z, String str, zv2<?> zv2, boolean z2) {
        vx2.m53591g(str, "mapping");
        vx2.m53591g(zv2, "factory");
        if (this.f36962b.containsKey(str)) {
            if (!z) {
                ox3.m70802c(zv2, str);
            } else if (z2) {
                tk3 e = this.f36961a.mo51634e();
                String str2 = "(+) override index '" + str + "' -> '" + zv2.mo67401c() + '\'';
                Level level = Level.WARNING;
                if (e.mo66081b(level)) {
                    e.mo66080a(level, str2);
                }
            }
        }
        tk3 e2 = this.f36961a.mo51634e();
        String str3 = "(+) index '" + str + "' -> '" + zv2.mo67401c() + '\'';
        Level level2 = Level.DEBUG;
        if (e2.mo66081b(level2)) {
            e2.mo66080a(level2, str3);
        }
        this.f36962b.put(str, zv2);
    }

    /* renamed from: k */
    public final int mo50744k() {
        return this.f36962b.size();
    }
}
