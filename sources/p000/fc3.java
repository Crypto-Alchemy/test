package p000;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import org.koin.core.logger.Level;
import org.koin.core.scope.Scope;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010\u0018J&\u0010\t\u001a\u00020\b2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001J\u0014\u0010\n\u001a\u0004\u0018\u00010\b2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003J\u001e\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u0010R \u0010\u0019\u001a\u00020\u00138\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001f\u001a\u00020\u001a8\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u001b\u0012\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001c\u0010\u001dR \u0010&\u001a\u00020 8\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010\u0018\u001a\u0004\b#\u0010$R$\u0010,\u001a\u00020'2\u0006\u0010(\u001a\u00020'8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u001c\u0010)\u001a\u0004\b*\u0010+¨\u0006."}, mo44877d2 = {"Lfc3;", "", "", "Lorg/koin/core/scope/ScopeID;", "scopeId", "Loz4;", "qualifier", "source", "Lorg/koin/core/scope/Scope;", "b", "f", "", "Ldx3;", "modules", "", "allowOverride", "Lr37;", "h", "a", "Lmn5;", "Lmn5;", "g", "()Lmn5;", "getScopeRegistry$annotations", "()V", "scopeRegistry", "Lbw2;", "Lbw2;", "d", "()Lbw2;", "getInstanceRegistry$annotations", "instanceRegistry", "Lkx4;", "c", "Lkx4;", "getPropertyRegistry", "()Lkx4;", "getPropertyRegistry$annotations", "propertyRegistry", "Ltk3;", "<set-?>", "Ltk3;", "e", "()Ltk3;", "logger", "<init>", "koin-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: fc3 */
/* compiled from: Koin.kt */
public final class fc3 {

    /* renamed from: a */
    public final mn5 f37745a = new mn5(this);

    /* renamed from: b */
    public final bw2 f37746b = new bw2(this);

    /* renamed from: c */
    public final kx4 f37747c = new kx4(this);

    /* renamed from: d */
    public tk3 f37748d = new to1();

    /* renamed from: c */
    public static /* synthetic */ Scope m57652c(fc3 fc3, String str, oz4 oz4, Object obj, int i, Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        return fc3.mo51632b(str, oz4, obj);
    }

    /* renamed from: i */
    public static /* synthetic */ void m57653i(fc3 fc3, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        fc3.mo51637h(list, z);
    }

    /* renamed from: a */
    public final void mo51631a() {
        tk3 tk3 = this.f37748d;
        Level level = Level.DEBUG;
        if (tk3.mo66081b(level)) {
            tk3.mo66080a(level, "Eager instances ...");
        }
        kc3 kc3 = kc3.f38879a;
        long a = kc3.mo52889a();
        this.f37746b.mo50735a();
        double doubleValue = ((Number) new Pair(r37.f33317a, Double.valueOf(((double) (kc3.mo52889a() - a)) / 1000000.0d)).getSecond()).doubleValue();
        tk3 tk32 = this.f37748d;
        String str = "Eager instances created in " + doubleValue + " ms";
        if (tk32.mo66081b(level)) {
            tk32.mo66080a(level, str);
        }
    }

    /* renamed from: b */
    public final Scope mo51632b(String str, oz4 oz4, Object obj) {
        vx2.m53591g(str, "scopeId");
        vx2.m53591g(oz4, "qualifier");
        return this.f37745a.mo56282b(str, oz4, obj);
    }

    /* renamed from: d */
    public final bw2 mo51633d() {
        return this.f37746b;
    }

    /* renamed from: e */
    public final tk3 mo51634e() {
        return this.f37748d;
    }

    /* renamed from: f */
    public final Scope mo51635f(String str) {
        vx2.m53591g(str, "scopeId");
        return this.f37745a.mo56285e(str);
    }

    /* renamed from: g */
    public final mn5 mo51636g() {
        return this.f37745a;
    }

    /* renamed from: h */
    public final void mo51637h(List<dx3> list, boolean z) {
        vx2.m53591g(list, "modules");
        Set b = ox3.m70801b(list, (Set) null, 2, (Object) null);
        this.f37746b.mo50740f(b, z);
        this.f37745a.mo56287g(b);
    }
}
