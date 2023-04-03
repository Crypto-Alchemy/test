package kotlin.reflect.jvm.internal;

import java.lang.reflect.Member;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.k93;
import p000.ta5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001#B\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dB+\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001c\u0010\"J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u0018\u0010\n\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u0007R:\u0010\u0010\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \r*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f0\f0\u000b8\bX\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0016¨\u0006$"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KProperty1Impl;", "T", "V", "Lk93;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "receiver", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "getDelegate", "invoke", "Lta5$b;", "Lkotlin/reflect/jvm/internal/KProperty1Impl$a;", "kotlin.jvm.PlatformType", "H", "Lta5$b;", "_getter", "Lef3;", "Ljava/lang/reflect/Member;", "I", "Lef3;", "delegateSource", "()Lkotlin/reflect/jvm/internal/KProperty1Impl$a;", "getter", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lfx4;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: KProperty1Impl.kt */
public class KProperty1Impl<T, V> extends KPropertyImpl<V> implements k93<T, V> {

    /* renamed from: H */
    public final ta5.C9336b<C7369a<T, V>> f39008H;

    /* renamed from: I */
    public final ef3<Member> f39009I = C6169a.m47233b(LazyThreadSafetyMode.PUBLICATION, new KProperty1Impl$delegateSource$1(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0006\b\u0003\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0006\u001a\u00028\u00032\u0006\u0010\u0005\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KProperty1Impl$a;", "T", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lk93$a;", "receiver", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "x", "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "D", "()Lkotlin/reflect/jvm/internal/KProperty1Impl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KProperty1Impl;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.KProperty1Impl$a */
    /* compiled from: KProperty1Impl.kt */
    public static final class C7369a<T, V> extends KPropertyImpl.Getter<V> implements k93.C6138a<T, V> {

        /* renamed from: x */
        public final KProperty1Impl<T, V> f39010x;

        public C7369a(KProperty1Impl<T, ? extends V> kProperty1Impl) {
            vx2.m53591g(kProperty1Impl, "property");
            this.f39010x = kProperty1Impl;
        }

        /* renamed from: D */
        public KProperty1Impl<T, V> mo43526j() {
            return this.f39010x;
        }

        public V invoke(T t) {
            return mo43526j().get(t);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KProperty1Impl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        vx2.m53591g(kDeclarationContainerImpl, "container");
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(str2, "signature");
        ta5.C9336b<C7369a<T, V>> b = ta5.m72212b(new KProperty1Impl$_getter$1(this));
        vx2.m53590f(b, "lazy { Getter(this) }");
        this.f39008H = b;
    }

    /* renamed from: H */
    public C7369a<T, V> getGetter() {
        C7369a<T, V> invoke = this.f39008H.invoke();
        vx2.m53590f(invoke, "_getter()");
        return invoke;
    }

    public V get(T t) {
        return getGetter().call(t);
    }

    public Object getDelegate(T t) {
        return mo53077C(this.f39009I.getValue(), t, (Object) null);
    }

    public V invoke(T t) {
        return get(t);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KProperty1Impl(KDeclarationContainerImpl kDeclarationContainerImpl, fx4 fx4) {
        super(kDeclarationContainerImpl, fx4);
        vx2.m53591g(kDeclarationContainerImpl, "container");
        vx2.m53591g(fx4, "descriptor");
        ta5.C9336b<C7369a<T, V>> b = ta5.m72212b(new KProperty1Impl$_getter$1(this));
        vx2.m53590f(b, "lazy { Getter(this) }");
        this.f39008H = b;
    }
}
