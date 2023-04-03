package p000;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u000e"}, mo44877d2 = {"Lpx3;", "", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "continuation", "", "b", "Lpx3$a;", "a", "Lpx3$a;", "notOnJava9", "c", "cache", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: px3 */
/* compiled from: DebugMetadata.kt */
public final class px3 {

    /* renamed from: a */
    public static final px3 f32871a = new px3();

    /* renamed from: b */
    public static final C6380a f32872b = new C6380a((Method) null, (Method) null, (Method) null);

    /* renamed from: c */
    public static C6380a f32873c;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\f"}, mo44877d2 = {"Lpx3$a;", "", "Ljava/lang/reflect/Method;", "a", "Ljava/lang/reflect/Method;", "getModuleMethod", "b", "getDescriptorMethod", "c", "nameMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: px3$a */
    /* compiled from: DebugMetadata.kt */
    public static final class C6380a {

        /* renamed from: a */
        public final Method f32874a;

        /* renamed from: b */
        public final Method f32875b;

        /* renamed from: c */
        public final Method f32876c;

        public C6380a(Method method, Method method2, Method method3) {
            this.f32874a = method;
            this.f32875b = method2;
            this.f32876c = method3;
        }
    }

    /* renamed from: a */
    public final C6380a mo46918a(BaseContinuationImpl baseContinuationImpl) {
        try {
            C6380a aVar = new C6380a(Class.class.getDeclaredMethod("getModule", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(PublicResolver.FUNC_NAME, new Class[0]));
            f32873c = aVar;
            return aVar;
        } catch (Exception unused) {
            C6380a aVar2 = f32872b;
            f32873c = aVar2;
            return aVar2;
        }
    }

    /* renamed from: b */
    public final String mo46919b(BaseContinuationImpl baseContinuationImpl) {
        Object obj;
        Object obj2;
        Object obj3;
        vx2.m53591g(baseContinuationImpl, "continuation");
        C6380a aVar = f32873c;
        if (aVar == null) {
            aVar = mo46918a(baseContinuationImpl);
        }
        if (aVar == f32872b) {
            return null;
        }
        Method method = aVar.f32874a;
        if (method != null) {
            obj = method.invoke(baseContinuationImpl.getClass(), new Object[0]);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        Method method2 = aVar.f32875b;
        if (method2 != null) {
            obj2 = method2.invoke(obj, new Object[0]);
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        Method method3 = aVar.f32876c;
        if (method3 != null) {
            obj3 = method3.invoke(obj2, new Object[0]);
        } else {
            obj3 = null;
        }
        if (obj3 instanceof String) {
            return (String) obj3;
        }
        return null;
    }
}
