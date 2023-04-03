package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import p000.ta5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u001bB\u0019\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bRF\u0010\u0011\u001a4\u00120\u0012.\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002 \u000e*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\r0\r0\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/b;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/c;", "", "receiver1", "receiver2", "value", "Lr37;", "K", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Lta5$b;", "Lkotlin/reflect/jvm/internal/b$a;", "kotlin.jvm.PlatformType", "L", "Lta5$b;", "_setter", "J", "()Lkotlin/reflect/jvm/internal/b$a;", "setter", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lfx4;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "a", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.b */
/* compiled from: KProperty2Impl.kt */
public final class C7376b<D, E, V> extends C7378c<D, E, V> implements fd2, f93 {

    /* renamed from: L */
    public final ta5.C9336b<C7377a<D, E, V>> f39041L;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u000b¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00032\u0006\u0010\u0007\u001a\u00028\u00042\u0006\u0010\b\u001a\u00028\u0005H\u0002¢\u0006\u0004\b\u0002\u0010\nR,\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0001\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/b$a;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "", "receiver1", "receiver2", "value", "Lr37;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/b;", "x", "Lkotlin/reflect/jvm/internal/b;", "()Lkotlin/reflect/jvm/internal/b;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/b;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.b$a */
    /* compiled from: KProperty2Impl.kt */
    public static final class C7377a<D, E, V> extends KPropertyImpl.Setter<V> implements id2 {

        /* renamed from: x */
        public final C7376b<D, E, V> f39042x;

        public C7377a(C7376b<D, E, V> bVar) {
            vx2.m53591g(bVar, "property");
            this.f39042x = bVar;
        }

        /* renamed from: D */
        public C7376b<D, E, V> mo43526j() {
            return this.f39042x;
        }

        /* renamed from: E */
        public void mo53119E(D d, E e, V v) {
            mo43526j().mo53117K(d, e, v);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo53119E(obj, obj2, obj3);
            return r37.f33317a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7376b(KDeclarationContainerImpl kDeclarationContainerImpl, fx4 fx4) {
        super(kDeclarationContainerImpl, fx4);
        vx2.m53591g(kDeclarationContainerImpl, "container");
        vx2.m53591g(fx4, "descriptor");
        ta5.C9336b<C7377a<D, E, V>> b = ta5.m72212b(new KMutableProperty2Impl$_setter$1(this));
        vx2.m53590f(b, "lazy { Setter(this) }");
        this.f39041L = b;
    }

    /* renamed from: J */
    public C7377a<D, E, V> getSetter() {
        C7377a<D, E, V> invoke = this.f39041L.invoke();
        vx2.m53590f(invoke, "_setter()");
        return invoke;
    }

    /* renamed from: K */
    public void mo53117K(D d, E e, V v) {
        getSetter().call(d, e, v);
    }
}
