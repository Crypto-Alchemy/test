package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.instance.SingleInstanceFactory;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b:\u0010;J!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0002\"\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\t\u001a\u00020\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0007J\u0014\u0010\u000b\u001a\u00020\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\nH\u0007J \u0010\u0010\u001a\u00020\u00042\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016R \u0010\u001c\u001a\u00020\u00128\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010!\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 RZ\u0010*\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\"j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n`#2\u001e\u0010$\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\"j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n`#8\u0006@@X\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b\u0016\u0010'\"\u0004\b(\u0010)RL\u00101\u001a.\u0012\b\u0012\u00060\fj\u0002`\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070+j\u0016\u0012\b\u0012\u00060\fj\u0002`\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007`,8\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b0\u0010\u001b\u001a\u0004\b%\u0010/R0\u00104\u001a\u0012\u0012\u0004\u0012\u0002020\"j\b\u0012\u0004\u0012\u000202`#8\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010&\u0012\u0004\b3\u0010\u001b\u001a\u0004\b-\u0010'R&\u00109\u001a\b\u0012\u0004\u0012\u00020\u0000058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u00106\u0012\u0004\b8\u0010\u001b\u001a\u0004\b\u001d\u00107¨\u0006<"}, mo44877d2 = {"Ldx3;", "", "", "module", "Lr37;", "f", "([Ldx3;)V", "Lzv2;", "instanceFactory", "g", "Lorg/koin/core/instance/SingleInstanceFactory;", "h", "", "Lorg/koin/core/definition/IndexKey;", "mapping", "factory", "i", "other", "", "equals", "", "hashCode", "a", "Z", "e", "()Z", "get_createdAtStart$annotations", "()V", "_createdAtStart", "b", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "<set-?>", "c", "Ljava/util/HashSet;", "()Ljava/util/HashSet;", "setEagerInstances$koin_core", "(Ljava/util/HashSet;)V", "eagerInstances", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "d", "Ljava/util/HashMap;", "()Ljava/util/HashMap;", "getMappings$annotations", "mappings", "Loz4;", "getScopes$annotations", "scopes", "", "Ljava/util/List;", "()Ljava/util/List;", "getIncludedModules$annotations", "includedModules", "<init>", "(Z)V", "koin-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: dx3 */
/* compiled from: Module.kt */
public final class dx3 {

    /* renamed from: a */
    public final boolean f37412a;

    /* renamed from: b */
    public final String f37413b;

    /* renamed from: c */
    public HashSet<SingleInstanceFactory<?>> f37414c;

    /* renamed from: d */
    public final HashMap<String, zv2<?>> f37415d;

    /* renamed from: e */
    public final HashSet<oz4> f37416e;

    /* renamed from: f */
    public final List<dx3> f37417f;

    public dx3() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    public dx3(boolean z) {
        this.f37412a = z;
        this.f37413b = lc3.f40598a.mo55877a();
        this.f37414c = new HashSet<>();
        this.f37415d = new HashMap<>();
        this.f37416e = new HashSet<>();
        this.f37417f = new ArrayList();
    }

    /* renamed from: a */
    public final HashSet<SingleInstanceFactory<?>> mo51296a() {
        return this.f37414c;
    }

    /* renamed from: b */
    public final List<dx3> mo51297b() {
        return this.f37417f;
    }

    /* renamed from: c */
    public final HashMap<String, zv2<?>> mo51298c() {
        return this.f37415d;
    }

    /* renamed from: d */
    public final HashSet<oz4> mo51299d() {
        return this.f37416e;
    }

    /* renamed from: e */
    public final boolean mo51300e() {
        return this.f37412a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !vx2.m53586b(ua5.m52727b(dx3.class), ua5.m52727b(obj.getClass())) || !vx2.m53586b(this.f37413b, ((dx3) obj).f37413b)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo51302f(dx3... dx3Arr) {
        vx2.m53591g(dx3Arr, "module");
        hk0.m45266A(this.f37417f, dx3Arr);
    }

    /* renamed from: g */
    public final void mo51303g(zv2<?> zv2) {
        vx2.m53591g(zv2, "instanceFactory");
        BeanDefinition<?> c = zv2.mo67401c();
        mo51306i(m00.m64036a(c.mo64969c(), c.mo64970d(), c.mo64971e()), zv2);
    }

    /* renamed from: h */
    public final void mo51304h(SingleInstanceFactory<?> singleInstanceFactory) {
        vx2.m53591g(singleInstanceFactory, "instanceFactory");
        this.f37414c.add(singleInstanceFactory);
    }

    public int hashCode() {
        return this.f37413b.hashCode();
    }

    /* renamed from: i */
    public final void mo51306i(String str, zv2<?> zv2) {
        vx2.m53591g(str, "mapping");
        vx2.m53591g(zv2, "factory");
        this.f37415d.put(str, zv2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dx3(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
