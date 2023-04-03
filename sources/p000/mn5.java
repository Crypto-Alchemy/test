package p000;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.koin.core.error.ScopeAlreadyCreatedException;
import org.koin.core.logger.Level;
import org.koin.core.scope.Scope;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u000b\u0018\u0000 \u00062\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b&\u0010'J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0001J(\u0010\n\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0001J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0019j\b\u0012\u0004\u0012\u00020\u0007`\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR$\u0010\u001f\u001a\u0012\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u00050\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR \u0010%\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b \u0010\"¨\u0006("}, mo44877d2 = {"Lmn5;", "", "", "Lorg/koin/core/scope/ScopeID;", "scopeId", "Lorg/koin/core/scope/Scope;", "e", "Loz4;", "qualifier", "source", "b", "scope", "Lr37;", "c", "(Lorg/koin/core/scope/Scope;)V", "", "Ldx3;", "modules", "g", "module", "f", "Lfc3;", "a", "Lfc3;", "_koin", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "_scopeDefinitions", "", "Ljava/util/Map;", "_scopes", "d", "Lorg/koin/core/scope/Scope;", "()Lorg/koin/core/scope/Scope;", "getRootScope$annotations", "()V", "rootScope", "<init>", "(Lfc3;)V", "koin-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: mn5 */
/* compiled from: ScopeRegistry.kt */
public final class mn5 {

    /* renamed from: e */
    public static final C7904a f40974e = new C7904a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final gb6 f40975f = pz4.m71132a("_root_");

    /* renamed from: a */
    public final fc3 f40976a;

    /* renamed from: b */
    public final HashSet<oz4> f40977b;

    /* renamed from: c */
    public final Map<String, Scope> f40978c;

    /* renamed from: d */
    public final Scope f40979d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, mo44877d2 = {"Lmn5$a;", "", "Lgb6;", "rootScopeQualifier", "Lgb6;", "a", "()Lgb6;", "getRootScopeQualifier$annotations", "()V", "", "ROOT_SCOPE_ID", "Ljava/lang/String;", "<init>", "koin-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: mn5$a */
    /* compiled from: ScopeRegistry.kt */
    public static final class C7904a {
        public C7904a() {
        }

        public /* synthetic */ C7904a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final gb6 mo56288a() {
            return mn5.f40975f;
        }
    }

    public mn5(fc3 fc3) {
        vx2.m53591g(fc3, "_koin");
        this.f40976a = fc3;
        HashSet<oz4> hashSet = new HashSet<>();
        this.f40977b = hashSet;
        Map<String, Scope> d = lc3.f40598a.mo55880d();
        this.f40978c = d;
        Scope scope = new Scope(f40975f, "_root_", true, fc3);
        this.f40979d = scope;
        hashSet.add(scope.mo64995l());
        d.put(scope.mo64992i(), scope);
    }

    /* renamed from: b */
    public final Scope mo56282b(String str, oz4 oz4, Object obj) {
        vx2.m53591g(str, "scopeId");
        vx2.m53591g(oz4, "qualifier");
        tk3 e = this.f40976a.mo51634e();
        String str2 = "|- (+) Scope - id:'" + str + "' q:" + oz4;
        Level level = Level.DEBUG;
        if (e.mo66081b(level)) {
            e.mo66080a(level, str2);
        }
        if (!this.f40977b.contains(oz4)) {
            tk3 e2 = this.f40976a.mo51634e();
            String str3 = "| Scope '" + oz4 + "' not defined. Creating it ...";
            Level level2 = Level.WARNING;
            if (e2.mo66081b(level2)) {
                e2.mo66080a(level2, str3);
            }
            this.f40977b.add(oz4);
        }
        if (!this.f40978c.containsKey(str)) {
            Scope scope = new Scope(oz4, str, false, this.f40976a, 4, (DefaultConstructorMarker) null);
            if (obj != null) {
                scope.mo65002s(obj);
            }
            scope.mo64999p(this.f40979d);
            this.f40978c.put(str, scope);
            return scope;
        }
        throw new ScopeAlreadyCreatedException("Scope with id '" + str + "' is already created");
    }

    /* renamed from: c */
    public final void mo56283c(Scope scope) {
        vx2.m53591g(scope, "scope");
        this.f40976a.mo51633d().mo50737c(scope);
        this.f40978c.remove(scope.mo64992i());
    }

    /* renamed from: d */
    public final Scope mo56284d() {
        return this.f40979d;
    }

    /* renamed from: e */
    public final Scope mo56285e(String str) {
        vx2.m53591g(str, "scopeId");
        return this.f40978c.get(str);
    }

    /* renamed from: f */
    public final void mo56286f(dx3 dx3) {
        this.f40977b.addAll(dx3.mo51299d());
    }

    /* renamed from: g */
    public final void mo56287g(Set<dx3> set) {
        vx2.m53591g(set, "modules");
        for (dx3 f : set) {
            mo56286f(f);
        }
    }
}
