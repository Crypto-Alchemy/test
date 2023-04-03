package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.g93;
import p000.ta5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u001fB\u0019\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B+\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0017\u0010\u001eJ\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\b\u0010\tR:\u0010\u000f\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \f*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b0\u000b0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", "T", "V", "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "Lg93;", "receiver", "value", "Lr37;", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lta5$b;", "Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$a;", "kotlin.jvm.PlatformType", "L", "Lta5$b;", "_setter", "I", "()Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$a;", "setter", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lfx4;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: KProperty1Impl.kt */
public final class KMutableProperty1Impl<T, V> extends KProperty1Impl<T, V> implements g93<T, V> {

    /* renamed from: L */
    public final ta5.C9336b<C7367a<T, V>> f38987L;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00028\u0003H\u0002¢\u0006\u0004\b\b\u0010\tR&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$a;", "T", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "Lg93$a;", "receiver", "value", "Lr37;", "E", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", "x", "Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", "D", "()Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.KMutableProperty1Impl$a */
    /* compiled from: KProperty1Impl.kt */
    public static final class C7367a<T, V> extends KPropertyImpl.Setter<V> implements g93.C5858a<T, V> {

        /* renamed from: x */
        public final KMutableProperty1Impl<T, V> f38988x;

        public C7367a(KMutableProperty1Impl<T, V> kMutableProperty1Impl) {
            vx2.m53591g(kMutableProperty1Impl, "property");
            this.f38988x = kMutableProperty1Impl;
        }

        /* renamed from: D */
        public KMutableProperty1Impl<T, V> mo43526j() {
            return this.f38988x;
        }

        /* renamed from: E */
        public void mo53054E(T t, V v) {
            mo43526j().set(t, v);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo53054E(obj, obj2);
            return r37.f33317a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        vx2.m53591g(kDeclarationContainerImpl, "container");
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(str2, "signature");
        ta5.C9336b<C7367a<T, V>> b = ta5.m72212b(new KMutableProperty1Impl$_setter$1(this));
        vx2.m53590f(b, "lazy { Setter(this) }");
        this.f38987L = b;
    }

    /* renamed from: I */
    public C7367a<T, V> getSetter() {
        C7367a<T, V> invoke = this.f38987L.invoke();
        vx2.m53590f(invoke, "_setter()");
        return invoke;
    }

    public void set(T t, V v) {
        getSetter().call(t, v);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl(KDeclarationContainerImpl kDeclarationContainerImpl, fx4 fx4) {
        super(kDeclarationContainerImpl, fx4);
        vx2.m53591g(kDeclarationContainerImpl, "container");
        vx2.m53591g(fx4, "descriptor");
        ta5.C9336b<C7367a<T, V>> b = ta5.m72212b(new KMutableProperty1Impl$_setter$1(this));
        vx2.m53590f(b, "lazy { Setter(this) }");
        this.f38987L = b;
    }
}
