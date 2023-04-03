package org.koin.core.instance;

import java.util.HashMap;
import kotlin.Metadata;
import org.koin.core.scope.Scope;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0017\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\fR:\u0010\u0014\u001a&\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\u0004\u0012\u00028\u00000\u000ej\u0012\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\u0004\u0012\u00028\u0000`\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, mo44877d2 = {"Lorg/koin/core/instance/ScopedInstanceFactory;", "T", "Lzv2;", "Lxv2;", "context", "", "f", "Lorg/koin/core/scope/Scope;", "scope", "Lr37;", "e", "a", "(Lxv2;)Ljava/lang/Object;", "b", "Ljava/util/HashMap;", "", "Lorg/koin/core/scope/ScopeID;", "Lkotlin/collections/HashMap;", "c", "Ljava/util/HashMap;", "values", "koin-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ScopedInstanceFactory.kt */
public final class ScopedInstanceFactory<T> extends zv2<T> {

    /* renamed from: c */
    public HashMap<String, T> f43939c;

    /* renamed from: a */
    public T mo64978a(xv2 xv2) {
        vx2.m53591g(xv2, "context");
        if (this.f43939c.get(xv2.mo66944c().mo64992i()) == null) {
            return super.mo64978a(xv2);
        }
        T t = this.f43939c.get(xv2.mo66944c().mo64992i());
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(("Scoped instance not found for " + xv2.mo66944c().mo64992i() + " in " + mo67401c()).toString());
    }

    /* renamed from: b */
    public T mo64979b(xv2 xv2) {
        vx2.m53591g(xv2, "context");
        if (vx2.m53586b(xv2.mo66944c().mo64995l(), mo67401c().mo64971e())) {
            lc3.f40598a.mo55881e(this, new ScopedInstanceFactory$get$1(this, xv2));
            T t = this.f43939c.get(xv2.mo66944c().mo64992i());
            if (t != null) {
                return t;
            }
            throw new IllegalStateException(("Scoped instance not found for " + xv2.mo66944c().mo64992i() + " in " + mo67401c()).toString());
        }
        throw new IllegalStateException(("Wrong Scope: trying to open instance for " + xv2.mo66944c().mo64992i() + " in " + mo67401c()).toString());
    }

    /* renamed from: e */
    public void mo64980e(Scope scope) {
        if (scope != null) {
            rc2 a = mo67401c().mo64967a().mo65835a();
            if (a != null) {
                a.invoke(this.f43939c.get(scope.mo64992i()));
            }
            this.f43939c.remove(scope.mo64992i());
        }
    }

    /* renamed from: f */
    public boolean mo64981f(xv2 xv2) {
        String str;
        Scope c;
        HashMap<String, T> hashMap = this.f43939c;
        if (xv2 == null || (c = xv2.mo66944c()) == null) {
            str = null;
        } else {
            str = c.mo64992i();
        }
        if (hashMap.get(str) != null) {
            return true;
        }
        return false;
    }
}
