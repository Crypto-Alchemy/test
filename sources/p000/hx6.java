package p000;

import android.util.Base64;
import com.google.android.datatransport.Priority;
import com.google.auto.value.AutoValue;
import p000.C6204kv;

@AutoValue
/* renamed from: hx6 */
/* compiled from: TransportContext */
public abstract class hx6 {

    @AutoValue.Builder
    /* renamed from: hx6$a */
    /* compiled from: TransportContext */
    public static abstract class C5942a {
        /* renamed from: a */
        public abstract hx6 mo43421a();

        /* renamed from: b */
        public abstract C5942a mo43422b(String str);

        /* renamed from: c */
        public abstract C5942a mo43423c(byte[] bArr);

        /* renamed from: d */
        public abstract C5942a mo43424d(Priority priority);
    }

    /* renamed from: a */
    public static C5942a m45404a() {
        return new C6204kv.C6206b().mo43424d(Priority.DEFAULT);
    }

    /* renamed from: b */
    public abstract String mo43416b();

    /* renamed from: c */
    public abstract byte[] mo43417c();

    /* renamed from: d */
    public abstract Priority mo43418d();

    /* renamed from: e */
    public hx6 mo43419e(Priority priority) {
        return m45404a().mo43422b(mo43416b()).mo43424d(priority).mo43423c(mo43417c()).mo43421a();
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[3];
        objArr[0] = mo43416b();
        objArr[1] = mo43418d();
        if (mo43417c() == null) {
            str = "";
        } else {
            str = Base64.encodeToString(mo43417c(), 2);
        }
        objArr[2] = str;
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
