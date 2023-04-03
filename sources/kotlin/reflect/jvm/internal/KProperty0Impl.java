package kotlin.reflect.jvm.internal;

import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.j93;
import p000.ta5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001fB\u0019\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019B+\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0018\u0010\u001eJ\u000f\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\b\u0010\u0005R.\u0010\r\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u000b*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\n0\t8\bX\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0012¨\u0006 "}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KProperty0Impl;", "V", "Lj93;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "H", "()Ljava/lang/Object;", "", "getDelegate", "invoke", "Lta5$b;", "Lkotlin/reflect/jvm/internal/KProperty0Impl$a;", "kotlin.jvm.PlatformType", "Lta5$b;", "_getter", "Lef3;", "I", "Lef3;", "delegateValue", "()Lkotlin/reflect/jvm/internal/KProperty0Impl$a;", "getter", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lfx4;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: KProperty0Impl.kt */
public class KProperty0Impl<V> extends KPropertyImpl<V> implements j93<V> {

    /* renamed from: H */
    public final ta5.C9336b<C7368a<V>> f39005H;

    /* renamed from: I */
    public final ef3<Object> f39006I = C6169a.m47233b(LazyThreadSafetyMode.PUBLICATION, new KProperty0Impl$delegateValue$1(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KProperty0Impl$a;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lj93$a;", "invoke", "()Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/KProperty0Impl;", "x", "Lkotlin/reflect/jvm/internal/KProperty0Impl;", "D", "()Lkotlin/reflect/jvm/internal/KProperty0Impl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KProperty0Impl;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.KProperty0Impl$a */
    /* compiled from: KProperty0Impl.kt */
    public static final class C7368a<R> extends KPropertyImpl.Getter<R> implements j93.C6022a<R> {

        /* renamed from: x */
        public final KProperty0Impl<R> f39007x;

        public C7368a(KProperty0Impl<? extends R> kProperty0Impl) {
            vx2.m53591g(kProperty0Impl, "property");
            this.f39007x = kProperty0Impl;
        }

        /* renamed from: D */
        public KProperty0Impl<R> mo43526j() {
            return this.f39007x;
        }

        public R invoke() {
            return mo43526j().mo53070H();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(KDeclarationContainerImpl kDeclarationContainerImpl, fx4 fx4) {
        super(kDeclarationContainerImpl, fx4);
        vx2.m53591g(kDeclarationContainerImpl, "container");
        vx2.m53591g(fx4, "descriptor");
        ta5.C9336b<C7368a<V>> b = ta5.m72212b(new KProperty0Impl$_getter$1(this));
        vx2.m53590f(b, "lazy { Getter(this) }");
        this.f39005H = b;
    }

    /* renamed from: H */
    public V mo53070H() {
        return getGetter().call(new Object[0]);
    }

    /* renamed from: I */
    public C7368a<V> getGetter() {
        C7368a<V> invoke = this.f39005H.invoke();
        vx2.m53590f(invoke, "_getter()");
        return invoke;
    }

    public Object getDelegate() {
        return this.f39006I.getValue();
    }

    public V invoke() {
        return mo53070H();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        vx2.m53591g(kDeclarationContainerImpl, "container");
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(str2, "signature");
        ta5.C9336b<C7368a<V>> b = ta5.m72212b(new KProperty0Impl$_getter$1(this));
        vx2.m53590f(b, "lazy { Getter(this) }");
        this.f39005H = b;
    }
}
