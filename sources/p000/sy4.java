package p000;

import java.nio.ByteBuffer;
import java.util.UUID;
import okhttp3.internal.http2.Http2Connection;

/* renamed from: sy4 */
/* compiled from: PsshAtomUtil */
public final class sy4 {

    /* renamed from: sy4$a */
    /* compiled from: PsshAtomUtil */
    public static class C3312a {

        /* renamed from: a */
        public final UUID f17835a;

        /* renamed from: b */
        public final int f17836b;

        /* renamed from: c */
        public final byte[] f17837c;

        public C3312a(UUID uuid, int i, byte[] bArr) {
            this.f17835a = uuid;
            this.f17836b = i;
            this.f17837c = bArr;
        }
    }

    /* renamed from: a */
    public static byte[] m27186a(UUID uuid, byte[] bArr) {
        return m27187b(uuid, (UUID[]) null, bArr);
    }

    /* renamed from: b */
    public static byte[] m27187b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int i;
        int i2;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        int i3 = i + 32;
        if (uuidArr != null) {
            i3 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i3);
        allocate.putInt(i3);
        allocate.putInt(1886614376);
        if (uuidArr != null) {
            i2 = Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        } else {
            i2 = 0;
        }
        allocate.putInt(i2);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (!(bArr == null || bArr.length == 0)) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    /* renamed from: c */
    public static boolean m27188c(byte[] bArr) {
        if (m27189d(bArr) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static C3312a m27189d(byte[] bArr) {
        gm4 gm4 = new gm4(bArr);
        if (gm4.mo20681f() < 32) {
            return null;
        }
        gm4.mo20674P(0);
        if (gm4.mo20689n() != gm4.mo20676a() + 4 || gm4.mo20689n() != 1886614376) {
            return null;
        }
        int c = C2420gs.m18384c(gm4.mo20689n());
        if (c > 1) {
            gk3.m18132i("PsshAtomUtil", "Unsupported pssh version: " + c);
            return null;
        }
        UUID uuid = new UUID(gm4.mo20698w(), gm4.mo20698w());
        if (c == 1) {
            gm4.mo20675Q(gm4.mo20666H() * 16);
        }
        int H = gm4.mo20666H();
        if (H != gm4.mo20676a()) {
            return null;
        }
        byte[] bArr2 = new byte[H];
        gm4.mo20685j(bArr2, 0, H);
        return new C3312a(uuid, c, bArr2);
    }

    /* renamed from: e */
    public static byte[] m27190e(byte[] bArr, UUID uuid) {
        C3312a d = m27189d(bArr);
        if (d == null) {
            return null;
        }
        if (uuid.equals(d.f17835a)) {
            return d.f17837c;
        }
        gk3.m18132i("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + d.f17835a + ".");
        return null;
    }

    /* renamed from: f */
    public static UUID m27191f(byte[] bArr) {
        C3312a d = m27189d(bArr);
        if (d == null) {
            return null;
        }
        return d.f17835a;
    }

    /* renamed from: g */
    public static int m27192g(byte[] bArr) {
        C3312a d = m27189d(bArr);
        if (d == null) {
            return -1;
        }
        return d.f17836b;
    }
}
