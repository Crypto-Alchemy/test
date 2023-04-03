package p000;

import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.internal.firebase_messaging.zzy;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import p000.f02;

/* renamed from: m58 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class m58 implements ze4 {

    /* renamed from: f */
    public static final Charset f31512f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final f02 f31513g;

    /* renamed from: h */
    public static final f02 f31514h;

    /* renamed from: i */
    public static final ye4<Map.Entry<Object, Object>> f31515i = g58.f29094a;

    /* renamed from: a */
    public OutputStream f31516a;

    /* renamed from: b */
    public final Map<Class<?>, ye4<?>> f31517b;

    /* renamed from: c */
    public final Map<Class<?>, j87<?>> f31518c;

    /* renamed from: d */
    public final ye4<Object> f31519d;

    /* renamed from: e */
    public final r68 f31520e = new r68(this);

    static {
        f02.C5823b a = f02.m44116a("key");
        hj9 hj9 = new hj9();
        hj9.mo43305a(1);
        f31513g = a.mo42467b(hj9.mo43306b()).mo42466a();
        f02.C5823b a2 = f02.m44116a("value");
        hj9 hj92 = new hj9();
        hj92.mo43305a(2);
        f31514h = a2.mo42467b(hj92.mo43306b()).mo42466a();
    }

    public m58(OutputStream outputStream, Map<Class<?>, ye4<?>> map, Map<Class<?>, j87<?>> map2, ye4<Object> ye4) {
        this.f31516a = outputStream;
        this.f31517b = map;
        this.f31518c = map2;
        this.f31519d = ye4;
    }

    /* renamed from: k */
    public static final /* synthetic */ void m48078k(Map.Entry entry, ze4 ze4) throws IOException {
        ze4.mo45625a(f31513g, entry.getKey());
        ze4.mo45625a(f31514h, entry.getValue());
    }

    /* renamed from: o */
    public static ByteBuffer m48079o(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: p */
    public static int m48080p(f02 f02) {
        ok9 ok9 = (ok9) f02.mo42462c(ok9.class);
        if (ok9 != null) {
            return ok9.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: q */
    public static ok9 m48081q(f02 f02) {
        ok9 ok9 = (ok9) f02.mo42462c(ok9.class);
        if (ok9 != null) {
            return ok9;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: a */
    public final ze4 mo45625a(f02 f02, Object obj) throws IOException {
        mo45626b(f02, obj, true);
        return this;
    }

    /* renamed from: b */
    public final ze4 mo45626b(f02 f02, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            mo45638r((m48080p(f02) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f31512f);
            mo45638r(bytes.length);
            this.f31516a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object b : (Collection) obj) {
                mo45626b(f02, b, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry l : ((Map) obj).entrySet()) {
                mo45635l(f31515i, f02, l, false);
            }
            return this;
        } else if (obj instanceof Double) {
            mo45627c(f02, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            mo45631g(f02, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            mo45633i(f02, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            mo45632h(f02, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            mo45638r((m48080p(f02) << 3) | 2);
            mo45638r(bArr.length);
            this.f31516a.write(bArr);
            return this;
        } else {
            ye4 ye4 = this.f31517b.get(obj.getClass());
            if (ye4 != null) {
                mo45635l(ye4, f02, obj, z);
                return this;
            }
            j87 j87 = this.f31518c.get(obj.getClass());
            if (j87 != null) {
                mo45637n(j87, f02, obj, z);
                return this;
            } else if (obj instanceof yj9) {
                mo45632h(f02, ((yj9) obj).getNumber(), true);
                return this;
            } else if (obj instanceof Enum) {
                mo45632h(f02, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                mo45635l(this.f31519d, f02, obj, z);
                return this;
            }
        }
    }

    /* renamed from: c */
    public final ze4 mo45627c(f02 f02, double d, boolean z) throws IOException {
        if (z && d == Utils.DOUBLE_EPSILON) {
            return this;
        }
        mo45638r((m48080p(f02) << 3) | 1);
        this.f31516a.write(m48079o(8).putDouble(d).array());
        return this;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ ze4 mo45628d(f02 f02, boolean z) throws IOException {
        mo45632h(f02, z ? 1 : 0, true);
        return this;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ ze4 mo45629e(f02 f02, int i) throws IOException {
        mo45632h(f02, i, true);
        return this;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ ze4 mo45630f(f02 f02, long j) throws IOException {
        mo45633i(f02, j, true);
        return this;
    }

    /* renamed from: g */
    public final ze4 mo45631g(f02 f02, float f, boolean z) throws IOException {
        if (z && f == Utils.FLOAT_EPSILON) {
            return this;
        }
        mo45638r((m48080p(f02) << 3) | 5);
        this.f31516a.write(m48079o(4).putFloat(f).array());
        return this;
    }

    /* renamed from: h */
    public final m58 mo45632h(f02 f02, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        ok9 q = m48081q(f02);
        zzy zzy = zzy.DEFAULT;
        int ordinal = q.zzb().ordinal();
        if (ordinal == 0) {
            mo45638r(q.zza() << 3);
            mo45638r(i);
        } else if (ordinal == 1) {
            mo45638r(q.zza() << 3);
            mo45638r((i + i) ^ (i >> 31));
        } else if (ordinal == 2) {
            mo45638r((q.zza() << 3) | 5);
            this.f31516a.write(m48079o(4).putInt(i).array());
        }
        return this;
    }

    /* renamed from: i */
    public final m58 mo45633i(f02 f02, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        ok9 q = m48081q(f02);
        zzy zzy = zzy.DEFAULT;
        int ordinal = q.zzb().ordinal();
        if (ordinal == 0) {
            mo45638r(q.zza() << 3);
            mo45639s(j);
        } else if (ordinal == 1) {
            mo45638r(q.zza() << 3);
            mo45639s((j >> 63) ^ (j + j));
        } else if (ordinal == 2) {
            mo45638r((q.zza() << 3) | 1);
            this.f31516a.write(m48079o(8).putLong(j).array());
        }
        return this;
    }

    /* renamed from: j */
    public final m58 mo45634j(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        ye4 ye4 = this.f31517b.get(obj.getClass());
        if (ye4 != null) {
            ye4.mo29899a(obj, this);
            return this;
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb = new StringBuilder(valueOf.length() + 15);
        sb.append("No encoder for ");
        sb.append(valueOf);
        throw new EncodingException(sb.toString());
    }

    /* renamed from: l */
    public final <T> m58 mo45635l(ye4<T> ye4, f02 f02, T t, boolean z) throws IOException {
        long m = mo45636m(ye4, t);
        if (z && m == 0) {
            return this;
        }
        mo45638r((m48080p(f02) << 3) | 2);
        mo45639s(m);
        ye4.mo29899a(t, this);
        return this;
    }

    /* renamed from: m */
    public final <T> long mo45636m(ye4<T> ye4, T t) throws IOException {
        OutputStream outputStream;
        pj9 pj9 = new pj9();
        try {
            outputStream = this.f31516a;
            this.f31516a = pj9;
            ye4.mo29899a(t, this);
            this.f31516a = outputStream;
            long a = pj9.mo46762a();
            pj9.close();
            return a;
        } catch (Throwable th) {
            try {
                pj9.close();
            } catch (Throwable th2) {
                qi9.m50610a(th, th2);
            }
            throw th;
        }
    }

    /* renamed from: n */
    public final <T> m58 mo45637n(j87<T> j87, f02 f02, T t, boolean z) throws IOException {
        this.f31520e.mo47341a(f02, z);
        j87.mo29899a(t, this.f31520e);
        return this;
    }

    /* renamed from: r */
    public final void mo45638r(int i) throws IOException {
        while (((long) (i & -128)) != 0) {
            this.f31516a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f31516a.write(i & 127);
    }

    /* renamed from: s */
    public final void mo45639s(long j) throws IOException {
        while ((-128 & j) != 0) {
            this.f31516a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f31516a.write(((int) j) & 127);
    }
}
