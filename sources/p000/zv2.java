package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.error.InstanceCreationException;
import org.koin.core.logger.Level;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u0006*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0001\bB\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lzv2;", "T", "", "Lorg/koin/mp/Lockable;", "Lxv2;", "context", "b", "(Lxv2;)Ljava/lang/Object;", "a", "Lorg/koin/core/definition/BeanDefinition;", "Lorg/koin/core/definition/BeanDefinition;", "c", "()Lorg/koin/core/definition/BeanDefinition;", "beanDefinition", "<init>", "(Lorg/koin/core/definition/BeanDefinition;)V", "koin-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: zv2 */
/* compiled from: InstanceFactory.kt */
public abstract class zv2<T> {

    /* renamed from: b */
    public static final C9715a f46500b = new C9715a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final BeanDefinition<T> f46501a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lzv2$a;", "", "", "ERROR_SEPARATOR", "Ljava/lang/String;", "<init>", "()V", "koin-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: zv2$a */
    /* compiled from: InstanceFactory.kt */
    public static final class C9715a {
        public C9715a() {
        }

        public /* synthetic */ C9715a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public zv2(BeanDefinition<T> beanDefinition) {
        vx2.m53591g(beanDefinition, "beanDefinition");
        this.f46501a = beanDefinition;
    }

    /* renamed from: a */
    public T mo64978a(xv2 xv2) {
        vx2.m53591g(xv2, "context");
        fc3 a = xv2.mo66942a();
        tk3 e = a.mo51634e();
        String str = "| (+) '" + this.f46501a + '\'';
        Level level = Level.DEBUG;
        if (e.mo66081b(level)) {
            e.mo66080a(level, str);
        }
        try {
            ul4 b = xv2.mo66943b();
            if (b == null) {
                b = vl4.m73289a();
            }
            return this.f46501a.mo64968b().invoke(xv2.mo66944c(), b);
        } catch (Exception e2) {
            String c = lc3.f40598a.mo55879c(e2);
            tk3 e3 = a.mo51634e();
            String str2 = "* Instance creation error : could not create instance for '" + this.f46501a + "': " + c;
            Level level2 = Level.ERROR;
            if (e3.mo66081b(level2)) {
                e3.mo66080a(level2, str2);
            }
            throw new InstanceCreationException("Could not create instance for '" + this.f46501a + '\'', e2);
        }
    }

    /* renamed from: b */
    public abstract T mo64979b(xv2 xv2);

    /* renamed from: c */
    public final BeanDefinition<T> mo67401c() {
        return this.f46501a;
    }
}
