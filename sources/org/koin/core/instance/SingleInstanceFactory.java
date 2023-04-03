package org.koin.core.instance;

import kotlin.Metadata;
import org.koin.core.definition.BeanDefinition;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0017\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, mo44877d2 = {"Lorg/koin/core/instance/SingleInstanceFactory;", "T", "Lzv2;", "Lxv2;", "context", "", "f", "a", "(Lxv2;)Ljava/lang/Object;", "b", "e", "()Ljava/lang/Object;", "c", "Ljava/lang/Object;", "value", "Lorg/koin/core/definition/BeanDefinition;", "beanDefinition", "<init>", "(Lorg/koin/core/definition/BeanDefinition;)V", "koin-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SingleInstanceFactory.kt */
public final class SingleInstanceFactory<T> extends zv2<T> {

    /* renamed from: c */
    public T f43940c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleInstanceFactory(BeanDefinition<T> beanDefinition) {
        super(beanDefinition);
        vx2.m53591g(beanDefinition, "beanDefinition");
    }

    /* renamed from: a */
    public T mo64978a(xv2 xv2) {
        vx2.m53591g(xv2, "context");
        if (this.f43940c == null) {
            return super.mo64978a(xv2);
        }
        return mo64982e();
    }

    /* renamed from: b */
    public T mo64979b(xv2 xv2) {
        vx2.m53591g(xv2, "context");
        lc3.f40598a.mo55881e(this, new SingleInstanceFactory$get$1(this, xv2));
        return mo64982e();
    }

    /* renamed from: e */
    public final T mo64982e() {
        T t = this.f43940c;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Single instance created couldn't return value".toString());
    }

    /* renamed from: f */
    public boolean mo64983f(xv2 xv2) {
        if (this.f43940c != null) {
            return true;
        }
        return false;
    }
}
