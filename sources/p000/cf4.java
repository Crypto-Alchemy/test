package p000;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.p009io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;

/* renamed from: cf4 */
/* compiled from: ObjectIdWriter */
public final class cf4 {

    /* renamed from: a */
    public final JavaType f8429a;

    /* renamed from: b */
    public final qw5 f8430b;

    /* renamed from: c */
    public final ObjectIdGenerator<?> f8431c;

    /* renamed from: d */
    public final y63<Object> f8432d;

    /* renamed from: e */
    public final boolean f8433e;

    public cf4(JavaType javaType, qw5 qw5, ObjectIdGenerator<?> objectIdGenerator, y63<?> y63, boolean z) {
        this.f8429a = javaType;
        this.f8430b = qw5;
        this.f8431c = objectIdGenerator;
        this.f8432d = y63;
        this.f8433e = z;
    }

    /* renamed from: a */
    public static cf4 m11853a(JavaType javaType, PropertyName propertyName, ObjectIdGenerator<?> objectIdGenerator, boolean z) {
        String str;
        SerializedString serializedString = null;
        if (propertyName == null) {
            str = null;
        } else {
            str = propertyName.getSimpleName();
        }
        if (str != null) {
            serializedString = new SerializedString(str);
        }
        return new cf4(javaType, serializedString, objectIdGenerator, (y63<?>) null, z);
    }

    /* renamed from: b */
    public cf4 mo12049b(boolean z) {
        if (z == this.f8433e) {
            return this;
        }
        return new cf4(this.f8429a, this.f8430b, this.f8431c, this.f8432d, z);
    }

    /* renamed from: c */
    public cf4 mo12050c(y63<?> y63) {
        return new cf4(this.f8429a, this.f8430b, this.f8431c, y63, this.f8433e);
    }
}
