package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import p000.ta5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0017B\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R.\u0010\r\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \n*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\t0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty0Impl;", "V", "Lkotlin/reflect/jvm/internal/KProperty0Impl;", "", "value", "Lr37;", "K", "(Ljava/lang/Object;)V", "Lta5$b;", "Lkotlin/reflect/jvm/internal/KMutableProperty0Impl$a;", "kotlin.jvm.PlatformType", "L", "Lta5$b;", "_setter", "J", "()Lkotlin/reflect/jvm/internal/KMutableProperty0Impl$a;", "setter", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lfx4;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "a", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: KProperty0Impl.kt */
public final class KMutableProperty0Impl<V> extends KProperty0Impl<V> implements f93 {

    /* renamed from: L */
    public final ta5.C9336b<C7366a<V>> f38985L;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty0Impl$a;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "", "value", "Lr37;", "E", "(Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/KMutableProperty0Impl;", "x", "Lkotlin/reflect/jvm/internal/KMutableProperty0Impl;", "D", "()Lkotlin/reflect/jvm/internal/KMutableProperty0Impl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KMutableProperty0Impl;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.KMutableProperty0Impl$a */
    /* compiled from: KProperty0Impl.kt */
    public static final class C7366a<R> extends KPropertyImpl.Setter<R> implements rc2 {

        /* renamed from: x */
        public final KMutableProperty0Impl<R> f38986x;

        public C7366a(KMutableProperty0Impl<R> kMutableProperty0Impl) {
            vx2.m53591g(kMutableProperty0Impl, "property");
            this.f38986x = kMutableProperty0Impl;
        }

        /* renamed from: D */
        public KMutableProperty0Impl<R> mo43526j() {
            return this.f38986x;
        }

        /* renamed from: E */
        public void mo53051E(R r) {
            mo43526j().mo53048K(r);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53051E(obj);
            return r37.f33317a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KMutableProperty0Impl(KDeclarationContainerImpl kDeclarationContainerImpl, fx4 fx4) {
        super(kDeclarationContainerImpl, fx4);
        vx2.m53591g(kDeclarationContainerImpl, "container");
        vx2.m53591g(fx4, "descriptor");
        ta5.C9336b<C7366a<V>> b = ta5.m72212b(new KMutableProperty0Impl$_setter$1(this));
        vx2.m53590f(b, "lazy { Setter(this) }");
        this.f38985L = b;
    }

    /* renamed from: J */
    public C7366a<V> getSetter() {
        C7366a<V> invoke = this.f38985L.invoke();
        vx2.m53590f(invoke, "_setter()");
        return invoke;
    }

    /* renamed from: K */
    public void mo53048K(V v) {
        getSetter().call(v);
    }
}
