package androidx.work;

import androidx.work.C1519b;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ArrayCreatingInputMerger extends yu2 {
    /* renamed from: b */
    public C1519b mo10845b(List<C1519b> list) {
        C1519b.C1520a aVar = new C1519b.C1520a();
        HashMap hashMap = new HashMap();
        loop0:
        for (C1519b j : list) {
            Iterator<Map.Entry<String, Object>> it = j.mo10925j().entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry next = it.next();
                    String str = (String) next.getKey();
                    Object value = next.getValue();
                    Class<?> cls = value.getClass();
                    Object obj = hashMap.get(str);
                    if (obj != null) {
                        Class<?> cls2 = obj.getClass();
                        if (cls2.equals(cls)) {
                            if (cls2.isArray()) {
                                value = mo10847d(obj, value);
                            } else {
                                value = mo10848e(obj, value);
                            }
                        } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                            value = mo10846c(obj, value);
                        } else if (cls.isArray() && cls.getComponentType().equals(cls2)) {
                            value = mo10846c(value, obj);
                        }
                    } else if (!cls.isArray()) {
                        value = mo10849f(value);
                    }
                    hashMap.put(str, value);
                }
            }
            throw new IllegalArgumentException();
        }
        aVar.mo10933d(hashMap);
        return aVar.mo10930a();
    }

    /* renamed from: c */
    public final Object mo10846c(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(obj2.getClass(), length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        return newInstance;
    }

    /* renamed from: d */
    public final Object mo10847d(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
        System.arraycopy(obj, 0, newInstance, 0, length);
        System.arraycopy(obj2, 0, newInstance, length, length2);
        return newInstance;
    }

    /* renamed from: e */
    public final Object mo10848e(Object obj, Object obj2) {
        Object newInstance = Array.newInstance(obj.getClass(), 2);
        Array.set(newInstance, 0, obj);
        Array.set(newInstance, 1, obj2);
        return newInstance;
    }

    /* renamed from: f */
    public final Object mo10849f(Object obj) {
        Object newInstance = Array.newInstance(obj.getClass(), 1);
        Array.set(newInstance, 0, obj);
        return newInstance;
    }
}
