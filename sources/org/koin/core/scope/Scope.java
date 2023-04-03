package org.koin.core.scope;

import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.error.NoBeanDefFoundException;
import org.koin.core.logger.Level;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B-\u0012\u0006\u0010.\u001a\u00020\u0004\u0012\n\u00104\u001a\u00060$j\u0002`/\u0012\b\b\u0002\u00106\u001a\u00020\u0019\u0012\u0006\u0010>\u001a\u000208¢\u0006\u0004\bY\u0010ZJA\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\u0004\u0018\u0001`\nH\u0002¢\u0006\u0004\b\f\u0010\rJN\u0010\u0010\u001a\u0004\b\u00028\u0000\"\u0004\b\u0000\u0010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\u0004\u0018\u0001`\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JC\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\u0004\u0018\u0001`\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0016\u001a\u00020\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u0006\u0010\u001a\u001a\u00020\u0019J!\u0010\u001d\u001a\u00020\u00172\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u001b\"\u00020\u0000¢\u0006\u0004\b\u001d\u0010\u001eJE\u0010\u001f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\u0004\u0018\u0001`\n¢\u0006\u0004\b\u001f\u0010\u0014JC\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\u0004\u0018\u0001`\n¢\u0006\u0004\b \u0010\u0014J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!\"\u0004\b\u0000\u0010\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006J\u0006\u0010#\u001a\u00020\u0017J\b\u0010%\u001a\u00020$H\u0016J\t\u0010'\u001a\u00020&HÖ\u0001J\u0013\u0010)\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010.\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00104\u001a\u00060$j\u0002`/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u00106\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u0018\u00105\u001a\u0004\b6\u00107R \u0010>\u001a\u0002088\u0000X\u0004¢\u0006\u0012\n\u0004\b#\u00109\u0012\u0004\b<\u0010=\u001a\u0004\b:\u0010;R$\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\u00000?j\b\u0012\u0004\u0012\u00020\u0000`@8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010AR*\u0010I\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b \u0010C\u0012\u0004\bH\u0010=\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010K\u001a\u0012\u0012\u0004\u0012\u00020J0?j\b\u0012\u0004\u0012\u00020J`@8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010AR&\u0010R\u001a\b\u0012\u0004\u0012\u00020\t0L8\u0006X\u0004¢\u0006\u0012\n\u0004\bM\u0010N\u0012\u0004\bQ\u0010=\u001a\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00105R\u0011\u0010T\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bM\u00107R\u0011\u0010X\u001a\u00020U8F¢\u0006\u0006\u001a\u0004\bV\u0010W\u0002\u0004\n\u0002\b9¨\u0006["}, mo44877d2 = {"Lorg/koin/core/scope/Scope;", "", "Lorg/koin/mp/Lockable;", "T", "Loz4;", "qualifier", "Lq83;", "clazz", "Lkotlin/Function0;", "Lul4;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameterDef", "q", "(Loz4;Lq83;Lpc2;)Ljava/lang/Object;", "Lxv2;", "instanceContext", "r", "(Loz4;Lq83;Lxv2;Lpc2;)Ljava/lang/Object;", "parameters", "e", "(Lq83;Loz4;Lpc2;)Ljava/lang/Object;", "", "t", "Lr37;", "c", "", "o", "", "scopes", "p", "([Lorg/koin/core/scope/Scope;)V", "k", "f", "", "g", "d", "", "toString", "", "hashCode", "other", "equals", "a", "Loz4;", "l", "()Loz4;", "scopeQualifier", "Lorg/koin/core/scope/ScopeID;", "b", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "id", "Z", "isRoot", "()Z", "Lfc3;", "Lfc3;", "m", "()Lfc3;", "get_koin$annotations", "()V", "_koin", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "linkedScopes", "Ljava/lang/Object;", "get_source", "()Ljava/lang/Object;", "s", "(Ljava/lang/Object;)V", "get_source$annotations", "_source", "Lin5;", "_callbacks", "Leq;", "h", "Leq;", "n", "()Leq;", "get_parameterStack$annotations", "_parameterStack", "_closed", "closed", "Ltk3;", "j", "()Ltk3;", "logger", "<init>", "(Loz4;Ljava/lang/String;ZLfc3;)V", "koin-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: Scope.kt */
public final class Scope {

    /* renamed from: a */
    public final oz4 f43942a;

    /* renamed from: b */
    public final String f43943b;

    /* renamed from: c */
    public final boolean f43944c;

    /* renamed from: d */
    public final fc3 f43945d;

    /* renamed from: e */
    public final ArrayList<Scope> f43946e;

    /* renamed from: f */
    public Object f43947f;

    /* renamed from: g */
    public final ArrayList<in5> f43948g;

    /* renamed from: h */
    public final C5808eq<ul4> f43949h;

    /* renamed from: i */
    public boolean f43950i;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Scope(oz4 oz4, String str, boolean z, fc3 fc3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(oz4, str, (i & 4) != 0 ? false : z, fc3);
    }

    /* renamed from: c */
    public final void mo64984c() {
        this.f43947f = null;
        tk3 e = this.f43945d.mo51634e();
        String str = "|- (-) Scope - id:'" + this.f43943b + '\'';
        Level level = Level.DEBUG;
        if (e.mo66081b(level)) {
            e.mo66080a(level, str);
        }
        for (in5 a : this.f43948g) {
            a.mo52514a(this);
        }
        this.f43948g.clear();
    }

    /* renamed from: d */
    public final void mo64985d() {
        lc3.f40598a.mo55881e(this, new Scope$close$1(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0007 A[LOOP:0: B:1:0x0007->B:4:0x0017, LOOP_START, PHI: r1 
      PHI: (r1v1 T) = (r1v0 T), (r1v5 T) binds: [B:0:0x0000, B:4:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo64986e(p000.q83<?> r4, p000.oz4 r5, p000.pc2<? extends p000.ul4> r6) {
        /*
            r3 = this;
            java.util.ArrayList<org.koin.core.scope.Scope> r0 = r3.f43946e
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x0007:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0019
            java.lang.Object r1 = r0.next()
            org.koin.core.scope.Scope r1 = (org.koin.core.scope.Scope) r1
            java.lang.Object r1 = r1.mo64994k(r4, r5, r6)
            if (r1 == 0) goto L_0x0007
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.core.scope.Scope.mo64986e(q83, oz4, pc2):java.lang.Object");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        Scope scope = (Scope) obj;
        return vx2.m53586b(this.f43942a, scope.f43942a) && vx2.m53586b(this.f43943b, scope.f43943b) && this.f43944c == scope.f43944c && vx2.m53586b(this.f43945d, scope.f43945d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002b, code lost:
        if (r2 == null) goto L_0x002d;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo64988f(p000.q83<?> r9, p000.oz4 r10, p000.pc2<? extends p000.ul4> r11) {
        /*
            r8 = this;
            java.lang.String r0 = "clazz"
            p000.vx2.m53591g(r9, r0)
            fc3 r0 = r8.f43945d
            tk3 r0 = r0.mo51634e()
            org.koin.core.logger.Level r1 = org.koin.core.logger.Level.DEBUG
            boolean r0 = r0.mo66081b(r1)
            if (r0 == 0) goto L_0x0098
            r0 = 39
            if (r10 == 0) goto L_0x002d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " with qualifier '"
            r2.append(r3)
            r2.append(r10)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L_0x002f
        L_0x002d:
            java.lang.String r2 = ""
        L_0x002f:
            fc3 r3 = r8.f43945d
            tk3 r3 = r3.mo51634e()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "|- '"
            r4.append(r5)
            java.lang.String r6 = p000.s83.m71896a(r9)
            r4.append(r6)
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = " ..."
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.mo66080a(r1, r0)
            kc3 r0 = p000.kc3.f38879a
            long r2 = r0.mo52889a()
            java.lang.Object r10 = r8.mo65000q(r10, r9, r11)
            long r6 = r0.mo52889a()
            long r6 = r6 - r2
            double r2 = (double) r6
            r6 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r2 = r2 / r6
            fc3 r11 = r8.f43945d
            tk3 r11 = r11.mo51634e()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r9 = p000.s83.m71896a(r9)
            r0.append(r9)
            java.lang.String r9 = "' in "
            r0.append(r9)
            r0.append(r2)
            java.lang.String r9 = " ms"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r11.mo66080a(r1, r9)
            goto L_0x009c
        L_0x0098:
            java.lang.Object r10 = r8.mo65000q(r10, r9, r11)
        L_0x009c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.core.scope.Scope.mo64988f(q83, oz4, pc2):java.lang.Object");
    }

    /* renamed from: g */
    public final <T> List<T> mo64989g(q83<?> q83) {
        vx2.m53591g(q83, "clazz");
        List<?> d = this.f43945d.mo51633d().mo50738d(q83, new xv2(this.f43945d, this, (ul4) null, 4, (DefaultConstructorMarker) null));
        ArrayList<Scope> arrayList = this.f43946e;
        ArrayList arrayList2 = new ArrayList();
        for (Scope g : arrayList) {
            hk0.m45275z(arrayList2, g.mo64989g(q83));
        }
        return CollectionsKt___CollectionsKt.m47350u0(d, arrayList2);
    }

    /* renamed from: h */
    public final boolean mo64990h() {
        return this.f43950i;
    }

    public int hashCode() {
        int hashCode = ((this.f43942a.hashCode() * 31) + this.f43943b.hashCode()) * 31;
        boolean z = this.f43944c;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this.f43945d.hashCode();
    }

    /* renamed from: i */
    public final String mo64992i() {
        return this.f43943b;
    }

    /* renamed from: j */
    public final tk3 mo64993j() {
        return this.f43945d.mo51634e();
    }

    /* renamed from: k */
    public final <T> T mo64994k(q83<?> q83, oz4 oz4, pc2<? extends ul4> pc2) {
        vx2.m53591g(q83, "clazz");
        try {
            return mo64988f(q83, oz4, pc2);
        } catch (ClosedScopeException unused) {
            tk3 e = this.f43945d.mo51634e();
            String str = "* Scope closed - no instance found for " + s83.m71896a(q83) + " on scope " + this;
            Level level = Level.ERROR;
            if (!e.mo66081b(level)) {
                return null;
            }
            e.mo66080a(level, str);
            return null;
        } catch (NoBeanDefFoundException unused2) {
            tk3 e2 = this.f43945d.mo51634e();
            String str2 = "* No instance found for " + s83.m71896a(q83) + " on scope " + this;
            Level level2 = Level.ERROR;
            if (!e2.mo66081b(level2)) {
                return null;
            }
            e2.mo66080a(level2, str2);
            return null;
        }
    }

    /* renamed from: l */
    public final oz4 mo64995l() {
        return this.f43942a;
    }

    /* renamed from: m */
    public final fc3 mo64996m() {
        return this.f43945d;
    }

    /* renamed from: n */
    public final C5808eq<ul4> mo64997n() {
        return this.f43949h;
    }

    /* renamed from: o */
    public final boolean mo64998o() {
        return !mo64990h();
    }

    /* renamed from: p */
    public final void mo64999p(Scope... scopeArr) {
        vx2.m53591g(scopeArr, "scopes");
        if (!this.f43944c) {
            hk0.m45266A(this.f43946e, scopeArr);
            return;
        }
        throw new IllegalStateException("Can't add scope link to a root scope".toString());
    }

    /* renamed from: q */
    public final <T> T mo65000q(oz4 oz4, q83<?> q83, pc2<? extends ul4> pc2) {
        ul4 ul4;
        if (!this.f43950i) {
            if (pc2 != null) {
                ul4 = (ul4) pc2.invoke();
            } else {
                ul4 = null;
            }
            if (ul4 != null) {
                tk3 e = this.f43945d.mo51634e();
                Level level = Level.DEBUG;
                if (e.mo66081b(level)) {
                    e.mo66080a(level, "| >> parameters " + ul4 + ' ');
                }
                lc3.f40598a.mo55881e(this, new Scope$resolveInstance$2(this, ul4));
            }
            T r = mo65001r(oz4, q83, new xv2(this.f43945d, this, ul4), pc2);
            if (ul4 != null) {
                tk3 e2 = this.f43945d.mo51634e();
                Level level2 = Level.DEBUG;
                if (e2.mo66081b(level2)) {
                    e2.mo66080a(level2, "| << parameters");
                }
                lc3.f40598a.mo55881e(this, new Scope$resolveInstance$3(this));
            }
            return r;
        }
        throw new ClosedScopeException("Scope '" + this.f43943b + "' is closed");
    }

    /* renamed from: r */
    public final <T> T mo65001r(oz4 oz4, q83<?> q83, xv2 xv2, pc2<? extends ul4> pc2) {
        T t;
        T h = this.f43945d.mo51633d().mo50742h(oz4, q83, this.f43942a, xv2);
        if (h == null) {
            tk3 e = this.f43945d.mo51634e();
            String str = "|- ? t:'" + s83.m71896a(q83) + "' - q:'" + oz4 + "' look in injected parameters";
            Level level = Level.DEBUG;
            if (e.mo66081b(level)) {
                e.mo66080a(level, str);
            }
            ul4 q = this.f43949h.mo42363q();
            T t2 = null;
            if (q != null) {
                h = q.mo66334a(q83);
            } else {
                h = null;
            }
            if (h == null) {
                tk3 e2 = this.f43945d.mo51634e();
                String str2 = "|- ? t:'" + s83.m71896a(q83) + "' - q:'" + oz4 + "' look at scope source";
                if (e2.mo66081b(level)) {
                    e2.mo66080a(level, str2);
                }
                Object obj = this.f43947f;
                if (!(obj == null || !q83.mo46999h(obj) || (t = this.f43947f) == null)) {
                    t2 = t;
                }
                h = t2;
                if (h == null) {
                    tk3 e3 = this.f43945d.mo51634e();
                    String str3 = "|- ? t:'" + s83.m71896a(q83) + "' - q:'" + oz4 + "' look in other scopes";
                    if (e3.mo66081b(level)) {
                        e3.mo66080a(level, str3);
                    }
                    h = mo64986e(q83, oz4, pc2);
                    if (h == null) {
                        lc3.f40598a.mo55881e(this, new Scope$resolveValue$4$1(this));
                        tk3 e4 = this.f43945d.mo51634e();
                        if (e4.mo66081b(level)) {
                            e4.mo66080a(level, "|- << parameters");
                        }
                        mo65003t(oz4, q83);
                        throw new KotlinNothingValueException();
                    }
                }
            }
        }
        return h;
    }

    /* renamed from: s */
    public final void mo65002s(Object obj) {
        this.f43947f = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0018, code lost:
        if (r4 == null) goto L_0x001a;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Void mo65003t(p000.oz4 r4, p000.q83<?> r5) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x001a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " & qualifier:'"
            r0.append(r1)
            r0.append(r4)
            r4 = 39
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            if (r4 != 0) goto L_0x001c
        L_0x001a:
            java.lang.String r4 = ""
        L_0x001c:
            org.koin.core.error.NoBeanDefFoundException r0 = new org.koin.core.error.NoBeanDefFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No definition found for class:'"
            r1.append(r2)
            java.lang.String r5 = p000.s83.m71896a(r5)
            r1.append(r5)
            java.lang.String r5 = "' q:'"
            r1.append(r5)
            r1.append(r4)
            java.lang.String r4 = "'. Check your definitions!"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.core.scope.Scope.mo65003t(oz4, q83):java.lang.Void");
    }

    public String toString() {
        return "['" + this.f43943b + "']";
    }

    public Scope(oz4 oz4, String str, boolean z, fc3 fc3) {
        vx2.m53591g(oz4, "scopeQualifier");
        vx2.m53591g(str, "id");
        vx2.m53591g(fc3, "_koin");
        this.f43942a = oz4;
        this.f43943b = str;
        this.f43944c = z;
        this.f43945d = fc3;
        this.f43946e = new ArrayList<>();
        this.f43948g = new ArrayList<>();
        this.f43949h = new C5808eq<>();
    }
}
