package p000;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/* renamed from: n73 */
/* compiled from: JsonValueObjectEncoderContext */
public final class n73 implements ze4, k87 {

    /* renamed from: a */
    public n73 f31988a = null;

    /* renamed from: b */
    public boolean f31989b = true;

    /* renamed from: c */
    public final JsonWriter f31990c;

    /* renamed from: d */
    public final Map<Class<?>, ye4<?>> f31991d;

    /* renamed from: e */
    public final Map<Class<?>, j87<?>> f31992e;

    /* renamed from: f */
    public final ye4<Object> f31993f;

    /* renamed from: g */
    public final boolean f31994g;

    public n73(Writer writer, Map<Class<?>, ye4<?>> map, Map<Class<?>, j87<?>> map2, ye4<Object> ye4, boolean z) {
        this.f31990c = new JsonWriter(writer);
        this.f31991d = map;
        this.f31992e = map2;
        this.f31993f = ye4;
        this.f31994g = z;
    }

    /* renamed from: a */
    public ze4 mo45625a(f02 f02, Object obj) throws IOException {
        return mo46013m(f02.mo42461b(), obj);
    }

    /* renamed from: d */
    public ze4 mo45628d(f02 f02, boolean z) throws IOException {
        return mo46014n(f02.mo42461b(), z);
    }

    /* renamed from: e */
    public ze4 mo45629e(f02 f02, int i) throws IOException {
        return mo46011k(f02.mo42461b(), i);
    }

    /* renamed from: f */
    public ze4 mo45630f(f02 f02, long j) throws IOException {
        return mo46012l(f02.mo42461b(), j);
    }

    /* renamed from: g */
    public n73 mo46007g(int i) throws IOException {
        mo46022v();
        this.f31990c.value((long) i);
        return this;
    }

    /* renamed from: h */
    public n73 mo46008h(long j) throws IOException {
        mo46022v();
        this.f31990c.value(j);
        return this;
    }

    /* renamed from: i */
    public n73 mo46009i(Object obj, boolean z) throws IOException {
        Class<?> cls;
        int i = 0;
        if (z && mo46017q(obj)) {
            Object[] objArr = new Object[1];
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            objArr[0] = cls;
            throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f31990c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f31990c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return mo46016p((byte[]) obj);
            }
            this.f31990c.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    this.f31990c.value((long) iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    mo46008h(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.f31990c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f31990c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number i2 : (Number[]) obj) {
                    mo46009i(i2, false);
                }
            } else {
                for (Object i3 : (Object[]) obj) {
                    mo46009i(i3, false);
                }
            }
            this.f31990c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f31990c.beginArray();
            for (Object i4 : (Collection) obj) {
                mo46009i(i4, false);
            }
            this.f31990c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f31990c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    mo46013m((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e);
                }
            }
            this.f31990c.endObject();
            return this;
        } else {
            ye4 ye4 = this.f31991d.get(obj.getClass());
            if (ye4 != null) {
                return mo46019s(ye4, obj, z);
            }
            j87 j87 = this.f31992e.get(obj.getClass());
            if (j87 != null) {
                j87.mo29899a(obj, this);
                return this;
            } else if (!(obj instanceof Enum)) {
                return mo46019s(this.f31993f, obj, z);
            } else {
                mo44700b(((Enum) obj).name());
                return this;
            }
        }
    }

    /* renamed from: j */
    public n73 mo44700b(String str) throws IOException {
        mo46022v();
        this.f31990c.value(str);
        return this;
    }

    /* renamed from: k */
    public n73 mo46011k(String str, int i) throws IOException {
        mo46022v();
        this.f31990c.name(str);
        return mo46007g(i);
    }

    /* renamed from: l */
    public n73 mo46012l(String str, long j) throws IOException {
        mo46022v();
        this.f31990c.name(str);
        return mo46008h(j);
    }

    /* renamed from: m */
    public n73 mo46013m(String str, Object obj) throws IOException {
        if (this.f31994g) {
            return mo46021u(str, obj);
        }
        return mo46020t(str, obj);
    }

    /* renamed from: n */
    public n73 mo46014n(String str, boolean z) throws IOException {
        mo46022v();
        this.f31990c.name(str);
        return mo44701c(z);
    }

    /* renamed from: o */
    public n73 mo44701c(boolean z) throws IOException {
        mo46022v();
        this.f31990c.value(z);
        return this;
    }

    /* renamed from: p */
    public n73 mo46016p(byte[] bArr) throws IOException {
        mo46022v();
        if (bArr == null) {
            this.f31990c.nullValue();
        } else {
            this.f31990c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* renamed from: q */
    public final boolean mo46017q(Object obj) {
        if (obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number)) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public void mo46018r() throws IOException {
        mo46022v();
        this.f31990c.flush();
    }

    /* renamed from: s */
    public n73 mo46019s(ye4<Object> ye4, Object obj, boolean z) throws IOException {
        if (!z) {
            this.f31990c.beginObject();
        }
        ye4.mo29899a(obj, this);
        if (!z) {
            this.f31990c.endObject();
        }
        return this;
    }

    /* renamed from: t */
    public final n73 mo46020t(String str, Object obj) throws IOException, EncodingException {
        mo46022v();
        this.f31990c.name(str);
        if (obj != null) {
            return mo46009i(obj, false);
        }
        this.f31990c.nullValue();
        return this;
    }

    /* renamed from: u */
    public final n73 mo46021u(String str, Object obj) throws IOException, EncodingException {
        if (obj == null) {
            return this;
        }
        mo46022v();
        this.f31990c.name(str);
        return mo46009i(obj, false);
    }

    /* renamed from: v */
    public final void mo46022v() throws IOException {
        if (this.f31989b) {
            n73 n73 = this.f31988a;
            if (n73 != null) {
                n73.mo46022v();
                this.f31988a.f31989b = false;
                this.f31988a = null;
                this.f31990c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
