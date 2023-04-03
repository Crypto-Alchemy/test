package p000;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: j17 */
/* compiled from: TypeReference */
public abstract class j17<T> implements Comparable<j17<T>> {
    public final Type _type;

    public j17() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            this._type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
            return;
        }
        throw new IllegalArgumentException("Internal error: TypeReference constructed without actual type information");
    }

    public int compareTo(j17<T> j17) {
        return 0;
    }

    public Type getType() {
        return this._type;
    }
}
