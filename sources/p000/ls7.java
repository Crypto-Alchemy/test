package p000;

import com.google.android.play.core.internal.C4488bi;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;

/* renamed from: ls7 */
public final class ls7<T> {

    /* renamed from: a */
    public final Object f31391a;

    /* renamed from: b */
    public final Field f31392b;

    /* renamed from: c */
    public final Class<T> f31393c;

    public ls7(Object obj, Field field, Class<T> cls) {
        this.f31391a = obj;
        this.f31392b = field;
        this.f31393c = cls;
    }

    public ls7(Object obj, Field field, Class cls, byte[] bArr) {
        this(obj, field, Array.newInstance(cls, 0).getClass());
    }

    /* renamed from: a */
    public final T mo45513a() {
        try {
            return this.f31393c.cast(this.f31392b.get(this.f31391a));
        } catch (Exception e) {
            throw new C4488bi(String.format("Failed to get value of field %s of type %s on object of type %s", new Object[]{this.f31392b.getName(), this.f31391a.getClass().getName(), this.f31393c.getName()}), e);
        }
    }

    /* renamed from: b */
    public final void mo45514b(T t) {
        try {
            this.f31392b.set(this.f31391a, t);
        } catch (Exception e) {
            throw new C4488bi(String.format("Failed to set value of field %s of type %s on object of type %s", new Object[]{this.f31392b.getName(), this.f31391a.getClass().getName(), this.f31393c.getName()}), e);
        }
    }

    /* renamed from: c */
    public final Field mo45515c() {
        return this.f31392b;
    }

    /* renamed from: d */
    public void mo45516d(Collection collection) {
        Object[] objArr = (Object[]) mo45513a();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance(mo45518f(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        for (Object obj : collection) {
            objArr2[length] = obj;
            length++;
        }
        mo45514b(objArr2);
    }

    /* renamed from: e */
    public void mo45517e(Collection collection) {
        Object[] objArr = (Object[]) mo45513a();
        int i = 0;
        Object[] objArr2 = (Object[]) Array.newInstance(mo45518f(), (objArr == null ? 0 : objArr.length) + collection.size());
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        for (Object obj : collection) {
            objArr2[i] = obj;
            i++;
        }
        mo45514b(objArr2);
    }

    /* renamed from: f */
    public final Class mo45518f() {
        return mo45515c().getType().getComponentType();
    }
}
