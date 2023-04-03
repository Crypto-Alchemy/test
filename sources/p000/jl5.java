package p000;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\u001aK\u0010\t\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a6\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0010\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000bH\u0000\"\u001e\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u001e\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, mo44877d2 = {"Lad7;", "T", "Ljava/lang/Class;", "modelClass", "Ljava/lang/reflect/Constructor;", "constructor", "", "", "params", "d", "(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Lad7;", "", "signature", "c", "a", "Ljava/util/List;", "ANDROID_VIEWMODEL_SIGNATURE", "b", "VIEWMODEL_SIGNATURE", "lifecycle-viewmodel-savedstate_release"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: jl5 */
/* compiled from: SavedStateViewModelFactory.kt */
public final class jl5 {

    /* renamed from: a */
    public static final List<Class<?>> f13690a;

    /* renamed from: b */
    public static final List<Class<?>> f13691b;

    static {
        Class<dl5> cls = dl5.class;
        f13690a = ck0.m33065m(Application.class, cls);
        f13691b = bk0.m32598e(cls);
    }

    /* renamed from: c */
    public static final <T> Constructor<T> m20219c(Class<T> cls, List<? extends Class<?>> list) {
        vx2.m53591g(cls, "modelClass");
        vx2.m53591g(list, "signature");
        Constructor<T>[] constructors = cls.getConstructors();
        vx2.m53590f(constructors, "modelClass.constructors");
        int length = constructors.length;
        int i = 0;
        while (i < length) {
            Constructor<T> constructor = constructors[i];
            Class[] parameterTypes = constructor.getParameterTypes();
            vx2.m53590f(parameterTypes, "constructor.parameterTypes");
            List q0 = ArraysKt___ArraysKt.m47291q0(parameterTypes);
            if (vx2.m53586b(list, q0)) {
                return constructor;
            }
            if (list.size() != q0.size() || !q0.containsAll(list)) {
                i++;
            } else {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final <T extends ad7> T m20220d(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        vx2.m53591g(cls, "modelClass");
        vx2.m53591g(constructor, "constructor");
        vx2.m53591g(objArr, "params");
        try {
            return (ad7) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
