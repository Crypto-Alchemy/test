package p000;

import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.List;

/* renamed from: iy6 */
/* compiled from: TsPayloadReader */
public interface iy6 {

    /* renamed from: iy6$a */
    /* compiled from: TsPayloadReader */
    public static final class C2576a {

        /* renamed from: a */
        public final String f13444a;

        /* renamed from: b */
        public final int f13445b;

        /* renamed from: c */
        public final byte[] f13446c;

        public C2576a(String str, int i, byte[] bArr) {
            this.f13444a = str;
            this.f13445b = i;
            this.f13446c = bArr;
        }
    }

    /* renamed from: iy6$b */
    /* compiled from: TsPayloadReader */
    public static final class C2577b {

        /* renamed from: a */
        public final int f13447a;

        /* renamed from: b */
        public final String f13448b;

        /* renamed from: c */
        public final List<C2576a> f13449c;

        /* renamed from: d */
        public final byte[] f13450d;

        public C2577b(int i, String str, List<C2576a> list, byte[] bArr) {
            List<C2576a> list2;
            this.f13447a = i;
            this.f13448b = str;
            if (list == null) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(list);
            }
            this.f13449c = list2;
            this.f13450d = bArr;
        }
    }

    /* renamed from: iy6$c */
    /* compiled from: TsPayloadReader */
    public interface C2578c {
        /* renamed from: a */
        SparseArray<iy6> mo21668a();

        /* renamed from: b */
        iy6 mo21669b(int i, C2577b bVar);
    }

    /* renamed from: iy6$d */
    /* compiled from: TsPayloadReader */
    public static final class C2579d {

        /* renamed from: a */
        public final String f13451a;

        /* renamed from: b */
        public final int f13452b;

        /* renamed from: c */
        public final int f13453c;

        /* renamed from: d */
        public int f13454d;

        /* renamed from: e */
        public String f13455e;

        public C2579d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        /* renamed from: a */
        public void mo21670a() {
            int i;
            int i2 = this.f13454d;
            if (i2 == Integer.MIN_VALUE) {
                i = this.f13452b;
            } else {
                i = i2 + this.f13453c;
            }
            this.f13454d = i;
            this.f13455e = this.f13451a + this.f13454d;
        }

        /* renamed from: b */
        public String mo21671b() {
            mo21673d();
            return this.f13455e;
        }

        /* renamed from: c */
        public int mo21672c() {
            mo21673d();
            return this.f13454d;
        }

        /* renamed from: d */
        public final void mo21673d() {
            if (this.f13454d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public C2579d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.f13451a = str;
            this.f13452b = i2;
            this.f13453c = i3;
            this.f13454d = Integer.MIN_VALUE;
            this.f13455e = "";
        }
    }

    /* renamed from: a */
    void mo21665a(gm4 gm4, int i) throws ParserException;

    /* renamed from: b */
    void mo21666b(sq6 sq6, jy1 jy1, C2579d dVar);

    /* renamed from: c */
    void mo21667c();
}
