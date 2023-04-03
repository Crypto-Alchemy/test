package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AbstractTypeChecker.kt */
public class TypeCheckerState {

    /* renamed from: a */
    public final boolean f40272a;

    /* renamed from: b */
    public final boolean f40273b;

    /* renamed from: c */
    public final boolean f40274c;

    /* renamed from: d */
    public final s17 f40275d;

    /* renamed from: e */
    public final C7339k7 f40276e;

    /* renamed from: f */
    public final C7823l7 f40277f;

    /* renamed from: g */
    public int f40278g;

    /* renamed from: h */
    public boolean f40279h;

    /* renamed from: i */
    public ArrayDeque<f36> f40280i;

    /* renamed from: j */
    public Set<f36> f40281j;

    /* compiled from: AbstractTypeChecker.kt */
    public enum LowerCapturedTypePolicy {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a */
    /* compiled from: AbstractTypeChecker.kt */
    public interface C7718a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a$a */
        /* compiled from: AbstractTypeChecker.kt */
        public static final class C7719a implements C7718a {

            /* renamed from: a */
            public boolean f40283a;

            /* renamed from: a */
            public void mo55332a(pc2<Boolean> pc2) {
                vx2.m53591g(pc2, "block");
                if (!this.f40283a) {
                    this.f40283a = pc2.invoke().booleanValue();
                }
            }

            /* renamed from: b */
            public final boolean mo55333b() {
                return this.f40283a;
            }
        }

        /* renamed from: a */
        void mo55332a(pc2<Boolean> pc2);
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b */
    /* compiled from: AbstractTypeChecker.kt */
    public static abstract class C7720b {

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$a */
        /* compiled from: AbstractTypeChecker.kt */
        public static abstract class C7721a extends C7720b {
            public C7721a() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$b */
        /* compiled from: AbstractTypeChecker.kt */
        public static final class C7722b extends C7720b {

            /* renamed from: a */
            public static final C7722b f40284a = new C7722b();

            public C7722b() {
                super((DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public f36 mo50575a(TypeCheckerState typeCheckerState, ad3 ad3) {
                vx2.m53591g(typeCheckerState, "state");
                vx2.m53591g(ad3, "type");
                return typeCheckerState.mo55324j().mo51078f0(ad3);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$c */
        /* compiled from: AbstractTypeChecker.kt */
        public static final class C7723c extends C7720b {

            /* renamed from: a */
            public static final C7723c f40285a = new C7723c();

            public C7723c() {
                super((DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ f36 mo50575a(TypeCheckerState typeCheckerState, ad3 ad3) {
                return (f36) mo55334b(typeCheckerState, ad3);
            }

            /* renamed from: b */
            public Void mo55334b(TypeCheckerState typeCheckerState, ad3 ad3) {
                vx2.m53591g(typeCheckerState, "state");
                vx2.m53591g(ad3, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$d */
        /* compiled from: AbstractTypeChecker.kt */
        public static final class C7724d extends C7720b {

            /* renamed from: a */
            public static final C7724d f40286a = new C7724d();

            public C7724d() {
                super((DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public f36 mo50575a(TypeCheckerState typeCheckerState, ad3 ad3) {
                vx2.m53591g(typeCheckerState, "state");
                vx2.m53591g(ad3, "type");
                return typeCheckerState.mo55324j().mo51049E(ad3);
            }
        }

        public C7720b() {
        }

        public /* synthetic */ C7720b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public abstract f36 mo50575a(TypeCheckerState typeCheckerState, ad3 ad3);
    }

    public TypeCheckerState(boolean z, boolean z2, boolean z3, s17 s17, C7339k7 k7Var, C7823l7 l7Var) {
        vx2.m53591g(s17, "typeSystemContext");
        vx2.m53591g(k7Var, "kotlinTypePreparator");
        vx2.m53591g(l7Var, "kotlinTypeRefiner");
        this.f40272a = z;
        this.f40273b = z2;
        this.f40274c = z3;
        this.f40275d = s17;
        this.f40276e = k7Var;
        this.f40277f = l7Var;
    }

    /* renamed from: d */
    public static /* synthetic */ Boolean m62872d(TypeCheckerState typeCheckerState, ad3 ad3, ad3 ad32, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = false;
            }
            return typeCheckerState.mo55319c(ad3, ad32, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
    }

    /* renamed from: c */
    public Boolean mo55319c(ad3 ad3, ad3 ad32, boolean z) {
        vx2.m53591g(ad3, "subType");
        vx2.m53591g(ad32, "superType");
        return null;
    }

    /* renamed from: e */
    public final void mo55320e() {
        ArrayDeque<f36> arrayDeque = this.f40280i;
        vx2.m53588d(arrayDeque);
        arrayDeque.clear();
        Set<f36> set = this.f40281j;
        vx2.m53588d(set);
        set.clear();
        this.f40279h = false;
    }

    /* renamed from: f */
    public boolean mo52960f(ad3 ad3, ad3 ad32) {
        vx2.m53591g(ad3, "subType");
        vx2.m53591g(ad32, "superType");
        return true;
    }

    /* renamed from: g */
    public LowerCapturedTypePolicy mo55321g(f36 f36, nb0 nb0) {
        vx2.m53591g(f36, "subType");
        vx2.m53591g(nb0, "superType");
        return LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER;
    }

    /* renamed from: h */
    public final ArrayDeque<f36> mo55322h() {
        return this.f40280i;
    }

    /* renamed from: i */
    public final Set<f36> mo55323i() {
        return this.f40281j;
    }

    /* renamed from: j */
    public final s17 mo55324j() {
        return this.f40275d;
    }

    /* renamed from: k */
    public final void mo55325k() {
        this.f40279h = true;
        if (this.f40280i == null) {
            this.f40280i = new ArrayDeque<>(4);
        }
        if (this.f40281j == null) {
            this.f40281j = w46.f45438e.mo66631a();
        }
    }

    /* renamed from: l */
    public final boolean mo55326l(ad3 ad3) {
        vx2.m53591g(ad3, "type");
        if (!this.f40274c || !this.f40275d.mo51053G(ad3)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final boolean mo55327m() {
        return this.f40272a;
    }

    /* renamed from: n */
    public final boolean mo55328n() {
        return this.f40273b;
    }

    /* renamed from: o */
    public final ad3 mo55329o(ad3 ad3) {
        vx2.m53591g(ad3, "type");
        return this.f40276e.mo52872a(ad3);
    }

    /* renamed from: p */
    public final ad3 mo55330p(ad3 ad3) {
        vx2.m53591g(ad3, "type");
        return this.f40277f.mo50563a(ad3);
    }

    /* renamed from: q */
    public boolean mo55331q(rc2<? super C7718a, r37> rc2) {
        vx2.m53591g(rc2, "block");
        C7718a.C7719a aVar = new C7718a.C7719a();
        rc2.invoke(aVar);
        return aVar.mo55333b();
    }
}
