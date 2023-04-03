package p000;

import kotlin.Metadata;
import org.koin.core.definition.BeanDefinition;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo44877d2 = {"Lty1;", "T", "Lzv2;", "Lxv2;", "context", "b", "(Lxv2;)Ljava/lang/Object;", "Lorg/koin/core/definition/BeanDefinition;", "beanDefinition", "<init>", "(Lorg/koin/core/definition/BeanDefinition;)V", "koin-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ty1 */
/* compiled from: FactoryInstanceFactory.kt */
public final class ty1<T> extends zv2<T> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ty1(BeanDefinition<T> beanDefinition) {
        super(beanDefinition);
        vx2.m53591g(beanDefinition, "beanDefinition");
    }

    /* renamed from: b */
    public T mo64979b(xv2 xv2) {
        vx2.m53591g(xv2, "context");
        return mo64978a(xv2);
    }
}
