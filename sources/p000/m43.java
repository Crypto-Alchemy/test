package p000;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: m43 */
/* compiled from: JsonDataEncoderBuilder */
public final class m43 implements op1<m43> {

    /* renamed from: e */
    public static final ye4<Object> f31500e = new j43();

    /* renamed from: f */
    public static final j87<String> f31501f = new k43();

    /* renamed from: g */
    public static final j87<Boolean> f31502g = new l43();

    /* renamed from: h */
    public static final C6233b f31503h = new C6233b((C6232a) null);

    /* renamed from: a */
    public final Map<Class<?>, ye4<?>> f31504a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, j87<?>> f31505b = new HashMap();

    /* renamed from: c */
    public ye4<Object> f31506c = f31500e;

    /* renamed from: d */
    public boolean f31507d = false;

    /* renamed from: m43$a */
    /* compiled from: JsonDataEncoderBuilder */
    public class C6232a implements p11 {
        public C6232a() {
        }

        /* renamed from: a */
        public String mo45621a(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                mo45622b(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }

        /* renamed from: b */
        public void mo45622b(Object obj, Writer writer) throws IOException {
            n73 n73 = new n73(writer, m43.this.f31504a, m43.this.f31505b, m43.this.f31506c, m43.this.f31507d);
            n73.mo46009i(obj, false);
            n73.mo46018r();
        }
    }

    /* renamed from: m43$b */
    /* compiled from: JsonDataEncoderBuilder */
    public static final class C6233b implements j87<Date> {

        /* renamed from: a */
        public static final DateFormat f31509a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(BlipsFormatHelper.BLIPS_DATE_FORMAT, Locale.US);
            f31509a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public C6233b() {
        }

        public /* synthetic */ C6233b(C6232a aVar) {
            this();
        }

        /* renamed from: b */
        public void mo29899a(Date date, k87 k87) throws IOException {
            k87.mo44700b(f31509a.format(date));
        }
    }

    public m43() {
        mo45620p(String.class, f31501f);
        mo45620p(Boolean.class, f31502g);
        mo45620p(Date.class, f31503h);
    }

    /* renamed from: l */
    public static /* synthetic */ void m48063l(Object obj, ze4 ze4) throws IOException {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* renamed from: i */
    public p11 mo45616i() {
        return new C6232a();
    }

    /* renamed from: j */
    public m43 mo45617j(to0 to0) {
        to0.mo30128a(this);
        return this;
    }

    /* renamed from: k */
    public m43 mo45618k(boolean z) {
        this.f31507d = z;
        return this;
    }

    /* renamed from: o */
    public <T> m43 mo29879a(Class<T> cls, ye4<? super T> ye4) {
        this.f31504a.put(cls, ye4);
        this.f31505b.remove(cls);
        return this;
    }

    /* renamed from: p */
    public <T> m43 mo45620p(Class<T> cls, j87<? super T> j87) {
        this.f31505b.put(cls, j87);
        this.f31504a.remove(cls);
        return this;
    }
}
