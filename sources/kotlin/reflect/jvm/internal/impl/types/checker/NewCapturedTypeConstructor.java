package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: NewCapturedType.kt */
public final class NewCapturedTypeConstructor implements kb0 {

    /* renamed from: a */
    public final f17 f40293a;

    /* renamed from: b */
    public pc2<? extends List<? extends w47>> f40294b;

    /* renamed from: c */
    public final NewCapturedTypeConstructor f40295c;

    /* renamed from: d */
    public final a17 f40296d;

    /* renamed from: e */
    public final ef3 f40297e;

    public NewCapturedTypeConstructor(f17 f17, pc2<? extends List<? extends w47>> pc2, NewCapturedTypeConstructor newCapturedTypeConstructor, a17 a17) {
        vx2.m53591g(f17, "projection");
        this.f40293a = f17;
        this.f40294b = pc2;
        this.f40295c = newCapturedTypeConstructor;
        this.f40296d = a17;
        this.f40297e = C6169a.m47233b(LazyThreadSafetyMode.PUBLICATION, new NewCapturedTypeConstructor$_supertypes$2(this));
    }

    /* renamed from: c */
    public f17 mo52887c() {
        return this.f40293a;
    }

    /* renamed from: d */
    public eg0 mo51180d() {
        return null;
    }

    /* renamed from: e */
    public boolean mo51809e() {
        return false;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<NewCapturedTypeConstructor> cls2 = NewCapturedTypeConstructor.class;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!vx2.m53586b(cls2, cls)) {
            return false;
        }
        vx2.m53589e(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        NewCapturedTypeConstructor newCapturedTypeConstructor = (NewCapturedTypeConstructor) obj;
        NewCapturedTypeConstructor newCapturedTypeConstructor2 = this.f40295c;
        if (newCapturedTypeConstructor2 == null) {
            newCapturedTypeConstructor2 = this;
        }
        NewCapturedTypeConstructor newCapturedTypeConstructor3 = newCapturedTypeConstructor.f40295c;
        if (newCapturedTypeConstructor3 != null) {
            newCapturedTypeConstructor = newCapturedTypeConstructor3;
        }
        if (newCapturedTypeConstructor2 == newCapturedTypeConstructor) {
            return true;
        }
        return false;
    }

    public List<a17> getParameters() {
        return ck0.m33062j();
    }

    /* renamed from: h */
    public List<w47> mo51811g() {
        List<w47> i = mo55355i();
        if (i == null) {
            return ck0.m33062j();
        }
        return i;
    }

    public int hashCode() {
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.f40295c;
        if (newCapturedTypeConstructor != null) {
            return newCapturedTypeConstructor.hashCode();
        }
        return super.hashCode();
    }

    /* renamed from: i */
    public final List<w47> mo55355i() {
        return (List) this.f40297e.getValue();
    }

    /* renamed from: j */
    public final void mo55356j(List<? extends w47> list) {
        vx2.m53591g(list, "supertypes");
        this.f40294b = new NewCapturedTypeConstructor$initializeSupertypes$2(list);
    }

    /* renamed from: k */
    public C7389b mo51813k() {
        xc3 type = mo52887c().getType();
        vx2.m53590f(type, "projection.type");
        return TypeUtilsKt.m62952h(type);
    }

    /* renamed from: l */
    public NewCapturedTypeConstructor mo51808a(bd3 bd3) {
        NewCapturedTypeConstructor$refine$1$1 newCapturedTypeConstructor$refine$1$1;
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        f17 a = mo52887c().mo51407a(bd3);
        vx2.m53590f(a, "projection.refine(kotlinTypeRefiner)");
        if (this.f40294b != null) {
            newCapturedTypeConstructor$refine$1$1 = new NewCapturedTypeConstructor$refine$1$1(this, bd3);
        } else {
            newCapturedTypeConstructor$refine$1$1 = null;
        }
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.f40295c;
        if (newCapturedTypeConstructor == null) {
            newCapturedTypeConstructor = this;
        }
        return new NewCapturedTypeConstructor(a, newCapturedTypeConstructor$refine$1$1, newCapturedTypeConstructor, this.f40296d);
    }

    public String toString() {
        return "CapturedType(" + mo52887c() + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewCapturedTypeConstructor(f17 f17, pc2 pc2, NewCapturedTypeConstructor newCapturedTypeConstructor, a17 a17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f17, (i & 2) != 0 ? null : pc2, (i & 4) != 0 ? null : newCapturedTypeConstructor, (i & 8) != 0 ? null : a17);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewCapturedTypeConstructor(f17 f17, List list, NewCapturedTypeConstructor newCapturedTypeConstructor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f17, list, (i & 4) != 0 ? null : newCapturedTypeConstructor);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor(f17 f17, final List<? extends w47> list, NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this(f17, new pc2<List<? extends w47>>() {
            public final List<w47> invoke() {
                return list;
            }
        }, newCapturedTypeConstructor, (a17) null, 8, (DefaultConstructorMarker) null);
        vx2.m53591g(f17, "projection");
        vx2.m53591g(list, "supertypes");
    }
}
