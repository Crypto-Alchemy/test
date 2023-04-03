package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* compiled from: ScopesHolderForClass.kt */
public final class ScopesHolderForClass<T extends MemberScope> {

    /* renamed from: e */
    public static final C7416a f39254e = new C7416a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final /* synthetic */ i93<Object>[] f39255f = {ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(ScopesHolderForClass.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: a */
    public final if0 f39256a;

    /* renamed from: b */
    public final rc2<bd3, T> f39257b;

    /* renamed from: c */
    public final bd3 f39258c;

    /* renamed from: d */
    public final q84 f39259d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass$a */
    /* compiled from: ScopesHolderForClass.kt */
    public static final class C7416a {
        public C7416a() {
        }

        public /* synthetic */ C7416a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <T extends MemberScope> ScopesHolderForClass<T> mo53257a(if0 if0, da6 da6, bd3 bd3, rc2<? super bd3, ? extends T> rc2) {
            vx2.m53591g(if0, "classDescriptor");
            vx2.m53591g(da6, "storageManager");
            vx2.m53591g(bd3, "kotlinTypeRefinerForOwnerModule");
            vx2.m53591g(rc2, "scopeFactory");
            return new ScopesHolderForClass(if0, da6, rc2, bd3, (DefaultConstructorMarker) null);
        }
    }

    public ScopesHolderForClass(if0 if0, da6 da6, rc2<? super bd3, ? extends T> rc2, bd3 bd3) {
        this.f39256a = if0;
        this.f39257b = rc2;
        this.f39258c = bd3;
        this.f39259d = da6.mo51164i(new ScopesHolderForClass$scopeForOwnerModule$2(this));
    }

    public /* synthetic */ ScopesHolderForClass(if0 if0, da6 da6, rc2 rc2, bd3 bd3, DefaultConstructorMarker defaultConstructorMarker) {
        this(if0, da6, rc2, bd3);
    }

    /* renamed from: c */
    public final T mo53255c(bd3 bd3) {
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        if (!bd3.mo50558d(DescriptorUtilsKt.m62451l(this.f39256a))) {
            return mo53256d();
        }
        yz6 g = this.f39256a.mo50046g();
        vx2.m53590f(g, "classDescriptor.typeConstructor");
        if (!bd3.mo50559e(g)) {
            return mo53256d();
        }
        return bd3.mo50557c(this.f39256a, new ScopesHolderForClass$getScope$1(this, bd3));
    }

    /* renamed from: d */
    public final T mo53256d() {
        return (MemberScope) ca6.m56364a(this.f39259d, this, f39255f[0]);
    }
}
