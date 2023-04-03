package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.C0785d;
import com.github.mikephil.charting.utils.Utils;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: androidx.media3.common.k */
/* compiled from: MediaItem */
public final class C0798k implements C0785d {

    /* renamed from: A */
    public static final C0785d.C0786a<C0798k> f4241A = new er3();

    /* renamed from: y */
    public static final C0798k f4242y = new C0801c().mo6753a();

    /* renamed from: a */
    public final String f4243a;

    /* renamed from: d */
    public final C0809h f4244d;
    @Deprecated

    /* renamed from: e */
    public final C0810i f4245e;

    /* renamed from: g */
    public final C0807g f4246g;

    /* renamed from: k */
    public final C0816l f4247k;

    /* renamed from: r */
    public final C0802d f4248r;
    @Deprecated

    /* renamed from: s */
    public final C0804e f4249s;

    /* renamed from: x */
    public final C0811j f4250x;

    /* renamed from: androidx.media3.common.k$b */
    /* compiled from: MediaItem */
    public static final class C0800b {
    }

    /* renamed from: androidx.media3.common.k$c */
    /* compiled from: MediaItem */
    public static final class C0801c {

        /* renamed from: a */
        public String f4251a;

        /* renamed from: b */
        public Uri f4252b;

        /* renamed from: c */
        public String f4253c;

        /* renamed from: d */
        public C0802d.C0803a f4254d;

        /* renamed from: e */
        public C0805f.C0806a f4255e;

        /* renamed from: f */
        public List<StreamKey> f4256f;

        /* renamed from: g */
        public String f4257g;

        /* renamed from: h */
        public ImmutableList<C0814l> f4258h;

        /* renamed from: i */
        public Object f4259i;

        /* renamed from: j */
        public C0816l f4260j;

        /* renamed from: k */
        public C0807g.C0808a f4261k;

        /* renamed from: l */
        public C0811j f4262l;

        /* renamed from: a */
        public C0798k mo6753a() {
            boolean z;
            C0810i iVar;
            if (this.f4255e.f4288b == null || this.f4255e.f4287a != null) {
                z = true;
            } else {
                z = false;
            }
            C2725kr.m20987g(z);
            Uri uri = this.f4252b;
            C0805f fVar = null;
            if (uri != null) {
                String str = this.f4253c;
                if (this.f4255e.f4287a != null) {
                    fVar = this.f4255e.mo6775i();
                }
                iVar = new C0810i(uri, str, fVar, (C0800b) null, this.f4256f, this.f4257g, this.f4258h, this.f4259i);
            } else {
                iVar = null;
            }
            String str2 = this.f4251a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            C0804e g = this.f4254d.mo6765g();
            C0807g f = this.f4261k.mo6779f();
            C0816l lVar = this.f4260j;
            if (lVar == null) {
                lVar = C0816l.f4337t1;
            }
            return new C0798k(str3, g, iVar, f, lVar, this.f4262l);
        }

        /* renamed from: b */
        public C0801c mo6754b(String str) {
            this.f4257g = str;
            return this;
        }

        /* renamed from: c */
        public C0801c mo6755c(C0807g gVar) {
            this.f4261k = gVar.mo6776b();
            return this;
        }

        /* renamed from: d */
        public C0801c mo6756d(String str) {
            this.f4251a = (String) C2725kr.m20985e(str);
            return this;
        }

        /* renamed from: e */
        public C0801c mo6757e(List<C0814l> list) {
            this.f4258h = ImmutableList.copyOf(list);
            return this;
        }

        /* renamed from: f */
        public C0801c mo6758f(Object obj) {
            this.f4259i = obj;
            return this;
        }

        /* renamed from: g */
        public C0801c mo6759g(Uri uri) {
            this.f4252b = uri;
            return this;
        }

        /* renamed from: h */
        public C0801c mo6760h(String str) {
            Uri uri;
            if (str == null) {
                uri = null;
            } else {
                uri = Uri.parse(str);
            }
            return mo6759g(uri);
        }

        public C0801c() {
            this.f4254d = new C0802d.C0803a();
            this.f4255e = new C0805f.C0806a();
            this.f4256f = Collections.emptyList();
            this.f4258h = ImmutableList.m36627of();
            this.f4261k = new C0807g.C0808a();
            this.f4262l = C0811j.f4315g;
        }

        public C0801c(C0798k kVar) {
            this();
            C0805f.C0806a aVar;
            this.f4254d = kVar.f4248r.mo6761b();
            this.f4251a = kVar.f4243a;
            this.f4260j = kVar.f4247k;
            this.f4261k = kVar.f4246g.mo6776b();
            this.f4262l = kVar.f4250x;
            C0809h hVar = kVar.f4244d;
            if (hVar != null) {
                this.f4257g = hVar.f4311e;
                this.f4253c = hVar.f4308b;
                this.f4252b = hVar.f4307a;
                this.f4256f = hVar.f4310d;
                this.f4258h = hVar.f4312f;
                this.f4259i = hVar.f4314h;
                C0805f fVar = hVar.f4309c;
                if (fVar != null) {
                    aVar = fVar.mo6771b();
                } else {
                    aVar = new C0805f.C0806a();
                }
                this.f4255e = aVar;
            }
        }
    }

    /* renamed from: androidx.media3.common.k$d */
    /* compiled from: MediaItem */
    public static class C0802d implements C0785d {

        /* renamed from: r */
        public static final C0802d f4263r = new C0803a().mo6764f();

        /* renamed from: s */
        public static final C0785d.C0786a<C0804e> f4264s = new fr3();

        /* renamed from: a */
        public final long f4265a;

        /* renamed from: d */
        public final long f4266d;

        /* renamed from: e */
        public final boolean f4267e;

        /* renamed from: g */
        public final boolean f4268g;

        /* renamed from: k */
        public final boolean f4269k;

        /* renamed from: androidx.media3.common.k$d$a */
        /* compiled from: MediaItem */
        public static final class C0803a {

            /* renamed from: a */
            public long f4270a;

            /* renamed from: b */
            public long f4271b;

            /* renamed from: c */
            public boolean f4272c;

            /* renamed from: d */
            public boolean f4273d;

            /* renamed from: e */
            public boolean f4274e;

            /* renamed from: f */
            public C0802d mo6764f() {
                return mo6765g();
            }

            @Deprecated
            /* renamed from: g */
            public C0804e mo6765g() {
                return new C0804e(this);
            }

            /* renamed from: h */
            public C0803a mo6766h(long j) {
                boolean z;
                if (j == Long.MIN_VALUE || j >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                C2725kr.m20981a(z);
                this.f4271b = j;
                return this;
            }

            /* renamed from: i */
            public C0803a mo6767i(boolean z) {
                this.f4273d = z;
                return this;
            }

            /* renamed from: j */
            public C0803a mo6768j(boolean z) {
                this.f4272c = z;
                return this;
            }

            /* renamed from: k */
            public C0803a mo6769k(long j) {
                boolean z;
                if (j >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                C2725kr.m20981a(z);
                this.f4270a = j;
                return this;
            }

            /* renamed from: l */
            public C0803a mo6770l(boolean z) {
                this.f4274e = z;
                return this;
            }

            public C0803a() {
                this.f4271b = Long.MIN_VALUE;
            }

            public C0803a(C0802d dVar) {
                this.f4270a = dVar.f4265a;
                this.f4271b = dVar.f4266d;
                this.f4272c = dVar.f4267e;
                this.f4273d = dVar.f4268g;
                this.f4274e = dVar.f4269k;
            }
        }

        /* renamed from: c */
        public static String m5518c(int i) {
            return Integer.toString(i, 36);
        }

        /* renamed from: b */
        public C0803a mo6761b() {
            return new C0803a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0802d)) {
                return false;
            }
            C0802d dVar = (C0802d) obj;
            if (this.f4265a == dVar.f4265a && this.f4266d == dVar.f4266d && this.f4267e == dVar.f4267e && this.f4268g == dVar.f4268g && this.f4269k == dVar.f4269k) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j = this.f4265a;
            long j2 = this.f4266d;
            return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.f4267e ? 1 : 0)) * 31) + (this.f4268g ? 1 : 0)) * 31) + (this.f4269k ? 1 : 0);
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(m5518c(0), this.f4265a);
            bundle.putLong(m5518c(1), this.f4266d);
            bundle.putBoolean(m5518c(2), this.f4267e);
            bundle.putBoolean(m5518c(3), this.f4268g);
            bundle.putBoolean(m5518c(4), this.f4269k);
            return bundle;
        }

        public C0802d(C0803a aVar) {
            this.f4265a = aVar.f4270a;
            this.f4266d = aVar.f4271b;
            this.f4267e = aVar.f4272c;
            this.f4268g = aVar.f4273d;
            this.f4269k = aVar.f4274e;
        }
    }

    @Deprecated
    /* renamed from: androidx.media3.common.k$e */
    /* compiled from: MediaItem */
    public static final class C0804e extends C0802d {

        /* renamed from: x */
        public static final C0804e f4275x = new C0802d.C0803a().mo6765g();

        public C0804e(C0802d.C0803a aVar) {
            super(aVar);
        }
    }

    /* renamed from: androidx.media3.common.k$f */
    /* compiled from: MediaItem */
    public static final class C0805f {

        /* renamed from: a */
        public final UUID f4276a;
        @Deprecated

        /* renamed from: b */
        public final UUID f4277b;

        /* renamed from: c */
        public final Uri f4278c;
        @Deprecated

        /* renamed from: d */
        public final ImmutableMap<String, String> f4279d;

        /* renamed from: e */
        public final ImmutableMap<String, String> f4280e;

        /* renamed from: f */
        public final boolean f4281f;

        /* renamed from: g */
        public final boolean f4282g;

        /* renamed from: h */
        public final boolean f4283h;
        @Deprecated

        /* renamed from: i */
        public final ImmutableList<Integer> f4284i;

        /* renamed from: j */
        public final ImmutableList<Integer> f4285j;

        /* renamed from: k */
        public final byte[] f4286k;

        /* renamed from: b */
        public C0806a mo6771b() {
            return new C0806a();
        }

        /* renamed from: c */
        public byte[] mo6772c() {
            byte[] bArr = this.f4286k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0805f)) {
                return false;
            }
            C0805f fVar = (C0805f) obj;
            if (!this.f4276a.equals(fVar.f4276a) || !w67.m29346c(this.f4278c, fVar.f4278c) || !w67.m29346c(this.f4280e, fVar.f4280e) || this.f4281f != fVar.f4281f || this.f4283h != fVar.f4283h || this.f4282g != fVar.f4282g || !this.f4285j.equals(fVar.f4285j) || !Arrays.equals(this.f4286k, fVar.f4286k)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int hashCode = this.f4276a.hashCode() * 31;
            Uri uri = this.f4278c;
            if (uri != null) {
                i = uri.hashCode();
            } else {
                i = 0;
            }
            return ((((((((((((hashCode + i) * 31) + this.f4280e.hashCode()) * 31) + (this.f4281f ? 1 : 0)) * 31) + (this.f4283h ? 1 : 0)) * 31) + (this.f4282g ? 1 : 0)) * 31) + this.f4285j.hashCode()) * 31) + Arrays.hashCode(this.f4286k);
        }

        /* renamed from: androidx.media3.common.k$f$a */
        /* compiled from: MediaItem */
        public static final class C0806a {

            /* renamed from: a */
            public UUID f4287a;

            /* renamed from: b */
            public Uri f4288b;

            /* renamed from: c */
            public ImmutableMap<String, String> f4289c;

            /* renamed from: d */
            public boolean f4290d;

            /* renamed from: e */
            public boolean f4291e;

            /* renamed from: f */
            public boolean f4292f;

            /* renamed from: g */
            public ImmutableList<Integer> f4293g;

            /* renamed from: h */
            public byte[] f4294h;

            /* renamed from: i */
            public C0805f mo6775i() {
                return new C0805f(this);
            }

            @Deprecated
            public C0806a() {
                this.f4289c = ImmutableMap.m36661of();
                this.f4293g = ImmutableList.m36627of();
            }

            public C0806a(C0805f fVar) {
                this.f4287a = fVar.f4276a;
                this.f4288b = fVar.f4278c;
                this.f4289c = fVar.f4280e;
                this.f4290d = fVar.f4281f;
                this.f4291e = fVar.f4282g;
                this.f4292f = fVar.f4283h;
                this.f4293g = fVar.f4285j;
                this.f4294h = fVar.f4286k;
            }
        }

        public C0805f(C0806a aVar) {
            C2725kr.m20987g(!aVar.f4292f || aVar.f4288b != null);
            UUID uuid = (UUID) C2725kr.m20985e(aVar.f4287a);
            this.f4276a = uuid;
            this.f4277b = uuid;
            this.f4278c = aVar.f4288b;
            this.f4279d = aVar.f4289c;
            this.f4280e = aVar.f4289c;
            this.f4281f = aVar.f4290d;
            this.f4283h = aVar.f4292f;
            this.f4282g = aVar.f4291e;
            this.f4284i = aVar.f4293g;
            this.f4285j = aVar.f4293g;
            this.f4286k = aVar.f4294h != null ? Arrays.copyOf(aVar.f4294h, aVar.f4294h.length) : null;
        }
    }

    /* renamed from: androidx.media3.common.k$g */
    /* compiled from: MediaItem */
    public static final class C0807g implements C0785d {

        /* renamed from: r */
        public static final C0807g f4295r = new C0808a().mo6779f();

        /* renamed from: s */
        public static final C0785d.C0786a<C0807g> f4296s = new gr3();

        /* renamed from: a */
        public final long f4297a;

        /* renamed from: d */
        public final long f4298d;

        /* renamed from: e */
        public final long f4299e;

        /* renamed from: g */
        public final float f4300g;

        /* renamed from: k */
        public final float f4301k;

        /* renamed from: androidx.media3.common.k$g$a */
        /* compiled from: MediaItem */
        public static final class C0808a {

            /* renamed from: a */
            public long f4302a;

            /* renamed from: b */
            public long f4303b;

            /* renamed from: c */
            public long f4304c;

            /* renamed from: d */
            public float f4305d;

            /* renamed from: e */
            public float f4306e;

            /* renamed from: f */
            public C0807g mo6779f() {
                return new C0807g(this);
            }

            /* renamed from: g */
            public C0808a mo6780g(long j) {
                this.f4304c = j;
                return this;
            }

            /* renamed from: h */
            public C0808a mo6781h(float f) {
                this.f4306e = f;
                return this;
            }

            /* renamed from: i */
            public C0808a mo6782i(long j) {
                this.f4303b = j;
                return this;
            }

            /* renamed from: j */
            public C0808a mo6783j(float f) {
                this.f4305d = f;
                return this;
            }

            /* renamed from: k */
            public C0808a mo6784k(long j) {
                this.f4302a = j;
                return this;
            }

            public C0808a() {
                this.f4302a = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
                this.f4303b = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
                this.f4304c = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
                this.f4305d = -3.4028235E38f;
                this.f4306e = -3.4028235E38f;
            }

            public C0808a(C0807g gVar) {
                this.f4302a = gVar.f4297a;
                this.f4303b = gVar.f4298d;
                this.f4304c = gVar.f4299e;
                this.f4305d = gVar.f4300g;
                this.f4306e = gVar.f4301k;
            }
        }

        /* renamed from: c */
        public static String m5546c(int i) {
            return Integer.toString(i, 36);
        }

        /* renamed from: d */
        public static /* synthetic */ C0807g m5547d(Bundle bundle) {
            return new C0807g(bundle.getLong(m5546c(0), CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED), bundle.getLong(m5546c(1), CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED), bundle.getLong(m5546c(2), CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED), bundle.getFloat(m5546c(3), -3.4028235E38f), bundle.getFloat(m5546c(4), -3.4028235E38f));
        }

        /* renamed from: b */
        public C0808a mo6776b() {
            return new C0808a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0807g)) {
                return false;
            }
            C0807g gVar = (C0807g) obj;
            if (this.f4297a == gVar.f4297a && this.f4298d == gVar.f4298d && this.f4299e == gVar.f4299e && this.f4300g == gVar.f4300g && this.f4301k == gVar.f4301k) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            long j = this.f4297a;
            long j2 = this.f4298d;
            long j3 = this.f4299e;
            int i2 = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.f4300g;
            int i3 = 0;
            if (f != Utils.FLOAT_EPSILON) {
                i = Float.floatToIntBits(f);
            } else {
                i = 0;
            }
            int i4 = (i2 + i) * 31;
            float f2 = this.f4301k;
            if (f2 != Utils.FLOAT_EPSILON) {
                i3 = Float.floatToIntBits(f2);
            }
            return i4 + i3;
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(m5546c(0), this.f4297a);
            bundle.putLong(m5546c(1), this.f4298d);
            bundle.putLong(m5546c(2), this.f4299e);
            bundle.putFloat(m5546c(3), this.f4300g);
            bundle.putFloat(m5546c(4), this.f4301k);
            return bundle;
        }

        public C0807g(C0808a aVar) {
            this(aVar.f4302a, aVar.f4303b, aVar.f4304c, aVar.f4305d, aVar.f4306e);
        }

        @Deprecated
        public C0807g(long j, long j2, long j3, float f, float f2) {
            this.f4297a = j;
            this.f4298d = j2;
            this.f4299e = j3;
            this.f4300g = f;
            this.f4301k = f2;
        }
    }

    /* renamed from: androidx.media3.common.k$h */
    /* compiled from: MediaItem */
    public static class C0809h {

        /* renamed from: a */
        public final Uri f4307a;

        /* renamed from: b */
        public final String f4308b;

        /* renamed from: c */
        public final C0805f f4309c;

        /* renamed from: d */
        public final List<StreamKey> f4310d;

        /* renamed from: e */
        public final String f4311e;

        /* renamed from: f */
        public final ImmutableList<C0814l> f4312f;
        @Deprecated

        /* renamed from: g */
        public final List<C0813k> f4313g;

        /* renamed from: h */
        public final Object f4314h;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0809h)) {
                return false;
            }
            C0809h hVar = (C0809h) obj;
            if (!this.f4307a.equals(hVar.f4307a) || !w67.m29346c(this.f4308b, hVar.f4308b) || !w67.m29346c(this.f4309c, hVar.f4309c) || !w67.m29346c((Object) null, (Object) null) || !this.f4310d.equals(hVar.f4310d) || !w67.m29346c(this.f4311e, hVar.f4311e) || !this.f4312f.equals(hVar.f4312f) || !w67.m29346c(this.f4314h, hVar.f4314h)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int hashCode = this.f4307a.hashCode() * 31;
            String str = this.f4308b;
            int i4 = 0;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            int i5 = (hashCode + i) * 31;
            C0805f fVar = this.f4309c;
            if (fVar == null) {
                i2 = 0;
            } else {
                i2 = fVar.hashCode();
            }
            int hashCode2 = (((((i5 + i2) * 31) + 0) * 31) + this.f4310d.hashCode()) * 31;
            String str2 = this.f4311e;
            if (str2 == null) {
                i3 = 0;
            } else {
                i3 = str2.hashCode();
            }
            int hashCode3 = (((hashCode2 + i3) * 31) + this.f4312f.hashCode()) * 31;
            Object obj = this.f4314h;
            if (obj != null) {
                i4 = obj.hashCode();
            }
            return hashCode3 + i4;
        }

        public C0809h(Uri uri, String str, C0805f fVar, C0800b bVar, List<StreamKey> list, String str2, ImmutableList<C0814l> immutableList, Object obj) {
            this.f4307a = uri;
            this.f4308b = str;
            this.f4309c = fVar;
            this.f4310d = list;
            this.f4311e = str2;
            this.f4312f = immutableList;
            ImmutableList.C4534a builder = ImmutableList.builder();
            for (int i = 0; i < immutableList.size(); i++) {
                builder.mo34667a(immutableList.get(i).mo6793a().mo6796i());
            }
            this.f4313g = builder.mo34692l();
            this.f4314h = obj;
        }
    }

    @Deprecated
    /* renamed from: androidx.media3.common.k$i */
    /* compiled from: MediaItem */
    public static final class C0810i extends C0809h {
        public C0810i(Uri uri, String str, C0805f fVar, C0800b bVar, List<StreamKey> list, String str2, ImmutableList<C0814l> immutableList, Object obj) {
            super(uri, str, fVar, bVar, list, str2, immutableList, obj);
        }
    }

    /* renamed from: androidx.media3.common.k$j */
    /* compiled from: MediaItem */
    public static final class C0811j implements C0785d {

        /* renamed from: g */
        public static final C0811j f4315g = new C0812a().mo6789d();

        /* renamed from: k */
        public static final C0785d.C0786a<C0811j> f4316k = new hr3();

        /* renamed from: a */
        public final Uri f4317a;

        /* renamed from: d */
        public final String f4318d;

        /* renamed from: e */
        public final Bundle f4319e;

        /* renamed from: androidx.media3.common.k$j$a */
        /* compiled from: MediaItem */
        public static final class C0812a {

            /* renamed from: a */
            public Uri f4320a;

            /* renamed from: b */
            public String f4321b;

            /* renamed from: c */
            public Bundle f4322c;

            /* renamed from: d */
            public C0811j mo6789d() {
                return new C0811j(this);
            }

            /* renamed from: e */
            public C0812a mo6790e(Bundle bundle) {
                this.f4322c = bundle;
                return this;
            }

            /* renamed from: f */
            public C0812a mo6791f(Uri uri) {
                this.f4320a = uri;
                return this;
            }

            /* renamed from: g */
            public C0812a mo6792g(String str) {
                this.f4321b = str;
                return this;
            }
        }

        /* renamed from: b */
        public static String m5561b(int i) {
            return Integer.toString(i, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0811j)) {
                return false;
            }
            C0811j jVar = (C0811j) obj;
            if (!w67.m29346c(this.f4317a, jVar.f4317a) || !w67.m29346c(this.f4318d, jVar.f4318d)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            Uri uri = this.f4317a;
            int i2 = 0;
            if (uri == null) {
                i = 0;
            } else {
                i = uri.hashCode();
            }
            int i3 = i * 31;
            String str = this.f4318d;
            if (str != null) {
                i2 = str.hashCode();
            }
            return i3 + i2;
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            if (this.f4317a != null) {
                bundle.putParcelable(m5561b(0), this.f4317a);
            }
            if (this.f4318d != null) {
                bundle.putString(m5561b(1), this.f4318d);
            }
            if (this.f4319e != null) {
                bundle.putBundle(m5561b(2), this.f4319e);
            }
            return bundle;
        }

        public C0811j(C0812a aVar) {
            this.f4317a = aVar.f4320a;
            this.f4318d = aVar.f4321b;
            this.f4319e = aVar.f4322c;
        }
    }

    @Deprecated
    /* renamed from: androidx.media3.common.k$k */
    /* compiled from: MediaItem */
    public static final class C0813k extends C0814l {
        public C0813k(C0814l.C0815a aVar) {
            super(aVar);
        }
    }

    /* renamed from: androidx.media3.common.k$l */
    /* compiled from: MediaItem */
    public static class C0814l {

        /* renamed from: a */
        public final Uri f4323a;

        /* renamed from: b */
        public final String f4324b;

        /* renamed from: c */
        public final String f4325c;

        /* renamed from: d */
        public final int f4326d;

        /* renamed from: e */
        public final int f4327e;

        /* renamed from: f */
        public final String f4328f;

        /* renamed from: g */
        public final String f4329g;

        /* renamed from: androidx.media3.common.k$l$a */
        /* compiled from: MediaItem */
        public static final class C0815a {

            /* renamed from: a */
            public Uri f4330a;

            /* renamed from: b */
            public String f4331b;

            /* renamed from: c */
            public String f4332c;

            /* renamed from: d */
            public int f4333d;

            /* renamed from: e */
            public int f4334e;

            /* renamed from: f */
            public String f4335f;

            /* renamed from: g */
            public String f4336g;

            /* renamed from: i */
            public final C0813k mo6796i() {
                return new C0813k(this);
            }

            public C0815a(C0814l lVar) {
                this.f4330a = lVar.f4323a;
                this.f4331b = lVar.f4324b;
                this.f4332c = lVar.f4325c;
                this.f4333d = lVar.f4326d;
                this.f4334e = lVar.f4327e;
                this.f4335f = lVar.f4328f;
                this.f4336g = lVar.f4329g;
            }
        }

        /* renamed from: a */
        public C0815a mo6793a() {
            return new C0815a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0814l)) {
                return false;
            }
            C0814l lVar = (C0814l) obj;
            if (!this.f4323a.equals(lVar.f4323a) || !w67.m29346c(this.f4324b, lVar.f4324b) || !w67.m29346c(this.f4325c, lVar.f4325c) || this.f4326d != lVar.f4326d || this.f4327e != lVar.f4327e || !w67.m29346c(this.f4328f, lVar.f4328f) || !w67.m29346c(this.f4329g, lVar.f4329g)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int hashCode = this.f4323a.hashCode() * 31;
            String str = this.f4324b;
            int i4 = 0;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            int i5 = (hashCode + i) * 31;
            String str2 = this.f4325c;
            if (str2 == null) {
                i2 = 0;
            } else {
                i2 = str2.hashCode();
            }
            int i6 = (((((i5 + i2) * 31) + this.f4326d) * 31) + this.f4327e) * 31;
            String str3 = this.f4328f;
            if (str3 == null) {
                i3 = 0;
            } else {
                i3 = str3.hashCode();
            }
            int i7 = (i6 + i3) * 31;
            String str4 = this.f4329g;
            if (str4 != null) {
                i4 = str4.hashCode();
            }
            return i7 + i4;
        }

        public C0814l(C0815a aVar) {
            this.f4323a = aVar.f4330a;
            this.f4324b = aVar.f4331b;
            this.f4325c = aVar.f4332c;
            this.f4326d = aVar.f4333d;
            this.f4327e = aVar.f4334e;
            this.f4328f = aVar.f4335f;
            this.f4329g = aVar.f4336g;
        }
    }

    /* renamed from: c */
    public static C0798k m5504c(Bundle bundle) {
        C0807g gVar;
        C0816l lVar;
        C0804e eVar;
        C0811j jVar;
        String str = (String) C2725kr.m20985e(bundle.getString(m5507f(0), ""));
        Bundle bundle2 = bundle.getBundle(m5507f(1));
        if (bundle2 == null) {
            gVar = C0807g.f4295r;
        } else {
            gVar = C0807g.f4296s.mo104a(bundle2);
        }
        C0807g gVar2 = gVar;
        Bundle bundle3 = bundle.getBundle(m5507f(2));
        if (bundle3 == null) {
            lVar = C0816l.f4337t1;
        } else {
            lVar = C0816l.f4338u1.mo104a(bundle3);
        }
        C0816l lVar2 = lVar;
        Bundle bundle4 = bundle.getBundle(m5507f(3));
        if (bundle4 == null) {
            eVar = C0804e.f4275x;
        } else {
            eVar = C0802d.f4264s.mo104a(bundle4);
        }
        C0804e eVar2 = eVar;
        Bundle bundle5 = bundle.getBundle(m5507f(4));
        if (bundle5 == null) {
            jVar = C0811j.f4315g;
        } else {
            jVar = C0811j.f4316k.mo104a(bundle5);
        }
        return new C0798k(str, eVar2, (C0810i) null, gVar2, lVar2, jVar);
    }

    /* renamed from: d */
    public static C0798k m5505d(Uri uri) {
        return new C0801c().mo6759g(uri).mo6753a();
    }

    /* renamed from: e */
    public static C0798k m5506e(String str) {
        return new C0801c().mo6760h(str).mo6753a();
    }

    /* renamed from: f */
    public static String m5507f(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: b */
    public C0801c mo6750b() {
        return new C0801c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0798k)) {
            return false;
        }
        C0798k kVar = (C0798k) obj;
        if (!w67.m29346c(this.f4243a, kVar.f4243a) || !this.f4248r.equals(kVar.f4248r) || !w67.m29346c(this.f4244d, kVar.f4244d) || !w67.m29346c(this.f4246g, kVar.f4246g) || !w67.m29346c(this.f4247k, kVar.f4247k) || !w67.m29346c(this.f4250x, kVar.f4250x)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f4243a.hashCode() * 31;
        C0809h hVar = this.f4244d;
        if (hVar != null) {
            i = hVar.hashCode();
        } else {
            i = 0;
        }
        return ((((((((hashCode + i) * 31) + this.f4246g.hashCode()) * 31) + this.f4248r.hashCode()) * 31) + this.f4247k.hashCode()) * 31) + this.f4250x.hashCode();
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(m5507f(0), this.f4243a);
        bundle.putBundle(m5507f(1), this.f4246g.toBundle());
        bundle.putBundle(m5507f(2), this.f4247k.toBundle());
        bundle.putBundle(m5507f(3), this.f4248r.toBundle());
        bundle.putBundle(m5507f(4), this.f4250x.toBundle());
        return bundle;
    }

    public C0798k(String str, C0804e eVar, C0810i iVar, C0807g gVar, C0816l lVar, C0811j jVar) {
        this.f4243a = str;
        this.f4244d = iVar;
        this.f4245e = iVar;
        this.f4246g = gVar;
        this.f4247k = lVar;
        this.f4248r = eVar;
        this.f4249s = eVar;
        this.f4250x = jVar;
    }
}
