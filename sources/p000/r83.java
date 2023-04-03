package p000;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.pcollections.C7743a;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\"2\u0010\n\u001a\u001e\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00000\u00000\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\u000b"}, mo44877d2 = {"", "T", "Ljava/lang/Class;", "jClass", "Lkotlin/reflect/jvm/internal/KClassImpl;", "a", "Lkotlin/reflect/jvm/internal/pcollections/a;", "", "kotlin.jvm.PlatformType", "Lkotlin/reflect/jvm/internal/pcollections/a;", "K_CLASS_CACHE", "kotlin-reflection"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: r83 */
/* compiled from: kClassCache.kt */
public final class r83 {

    /* renamed from: a */
    public static C7743a<String, Object> f44311a;

    static {
        C7743a<String, Object> b = C7743a.m63003b();
        vx2.m53590f(b, "empty<String, Any>()");
        f44311a = b;
    }

    /* renamed from: a */
    public static final <T> KClassImpl<T> m71481a(Class<T> cls) {
        Class<T> cls2;
        vx2.m53591g(cls, "jClass");
        String name = cls.getName();
        Object c = f44311a.mo55409c(name);
        Class<T> cls3 = null;
        if (c instanceof WeakReference) {
            KClassImpl<T> kClassImpl = (KClassImpl) ((WeakReference) c).get();
            if (kClassImpl != null) {
                cls3 = kClassImpl.mo41920k();
            }
            if (vx2.m53586b(cls3, cls)) {
                return kClassImpl;
            }
        } else if (c != null) {
            for (WeakReference weakReference : (WeakReference[]) c) {
                KClassImpl<T> kClassImpl2 = (KClassImpl) weakReference.get();
                if (kClassImpl2 != null) {
                    cls2 = kClassImpl2.mo41920k();
                } else {
                    cls2 = null;
                }
                if (vx2.m53586b(cls2, cls)) {
                    return kClassImpl2;
                }
            }
            int length = ((Object[]) c).length;
            WeakReference[] weakReferenceArr = new WeakReference[(length + 1)];
            System.arraycopy(c, 0, weakReferenceArr, 0, length);
            KClassImpl<T> kClassImpl3 = new KClassImpl<>(cls);
            weakReferenceArr[length] = new WeakReference(kClassImpl3);
            C7743a<String, Object> f = f44311a.mo55411f(name, weakReferenceArr);
            vx2.m53590f(f, "K_CLASS_CACHE.plus(name, newArray)");
            f44311a = f;
            return kClassImpl3;
        }
        KClassImpl<T> kClassImpl4 = new KClassImpl<>(cls);
        C7743a<String, Object> f2 = f44311a.mo55411f(name, new WeakReference(kClassImpl4));
        vx2.m53590f(f2, "K_CLASS_CACHE.plus(name, WeakReference(newKClass))");
        f44311a = f2;
        return kClassImpl4;
    }
}
