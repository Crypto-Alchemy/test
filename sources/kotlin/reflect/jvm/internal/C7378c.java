package kotlin.reflect.jvm.internal;

import java.lang.reflect.Member;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import p000.ta5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u001dB\u0019\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\b\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\n\u0010\tRF\u0010\u000f\u001a4\u00120\u0012.\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002 \r*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\f0\f0\u000b8\bX\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u001e"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/c;", "D", "E", "V", "", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "receiver1", "receiver2", "H", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "invoke", "Lta5$b;", "Lkotlin/reflect/jvm/internal/c$a;", "kotlin.jvm.PlatformType", "Lta5$b;", "_getter", "Lef3;", "Ljava/lang/reflect/Member;", "I", "Lef3;", "delegateSource", "()Lkotlin/reflect/jvm/internal/c$a;", "getter", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lfx4;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "a", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.c */
/* compiled from: KProperty2Impl.kt */
public class C7378c<D, E, V> extends KPropertyImpl<V> implements fd2 {

    /* renamed from: H */
    public final ta5.C9336b<C7379a<D, E, V>> f39043H;

    /* renamed from: I */
    public final ef3<Member> f39044I = C6169a.m47233b(LazyThreadSafetyMode.PUBLICATION, new KProperty2Impl$delegateSource$1(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\n¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\b\u001a\u00028\u00052\u0006\u0010\u0006\u001a\u00028\u00032\u0006\u0010\u0007\u001a\u00028\u0004H\u0002¢\u0006\u0004\b\b\u0010\tR,\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0001\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/c$a;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "", "receiver1", "receiver2", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/c;", "x", "Lkotlin/reflect/jvm/internal/c;", "()Lkotlin/reflect/jvm/internal/c;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/c;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.c$a */
    /* compiled from: KProperty2Impl.kt */
    public static final class C7379a<D, E, V> extends KPropertyImpl.Getter<V> implements fd2 {

        /* renamed from: x */
        public final C7378c<D, E, V> f39045x;

        public C7379a(C7378c<D, E, ? extends V> cVar) {
            vx2.m53591g(cVar, "property");
            this.f39045x = cVar;
        }

        /* renamed from: D */
        public C7378c<D, E, V> mo43526j() {
            return this.f39045x;
        }

        public V invoke(D d, E e) {
            return mo43526j().mo53120H(d, e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7378c(KDeclarationContainerImpl kDeclarationContainerImpl, fx4 fx4) {
        super(kDeclarationContainerImpl, fx4);
        vx2.m53591g(kDeclarationContainerImpl, "container");
        vx2.m53591g(fx4, "descriptor");
        ta5.C9336b<C7379a<D, E, V>> b = ta5.m72212b(new KProperty2Impl$_getter$1(this));
        vx2.m53590f(b, "lazy { Getter(this) }");
        this.f39043H = b;
    }

    /* renamed from: H */
    public V mo53120H(D d, E e) {
        return getGetter().call(d, e);
    }

    /* renamed from: I */
    public C7379a<D, E, V> getGetter() {
        C7379a<D, E, V> invoke = this.f39043H.invoke();
        vx2.m53590f(invoke, "_getter()");
        return invoke;
    }

    public V invoke(D d, E e) {
        return mo53120H(d, e);
    }
}
