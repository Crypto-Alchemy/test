package p000;

import android.os.SystemClock;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* renamed from: q56 */
/* compiled from: SntpClient */
public final class q56 {

    /* renamed from: a */
    public static final Object f16804a = new Object();

    /* renamed from: b */
    public static final Object f16805b = new Object();

    /* renamed from: c */
    public static boolean f16806c = false;

    /* renamed from: d */
    public static long f16807d = 0;

    /* renamed from: e */
    public static String f16808e = "time.android.com";

    /* renamed from: q56$b */
    /* compiled from: SntpClient */
    public interface C3125b {
        /* renamed from: a */
        void mo7212a(IOException iOException);

        /* renamed from: b */
        void mo7213b();
    }

    /* renamed from: q56$c */
    /* compiled from: SntpClient */
    public static final class C3126c implements Loader.C1012b<Loader.C1015e> {

        /* renamed from: a */
        public final C3125b f16809a;

        public C3126c(C3125b bVar) {
            this.f16809a = bVar;
        }

        /* renamed from: k */
        public Loader.C1013c mo7222k(Loader.C1015e eVar, long j, long j2, IOException iOException, int i) {
            C3125b bVar = this.f16809a;
            if (bVar != null) {
                bVar.mo7212a(iOException);
            }
            return Loader.f5449f;
        }

        /* renamed from: s */
        public void mo7223s(Loader.C1015e eVar, long j, long j2) {
            if (this.f16809a == null) {
                return;
            }
            if (!q56.m25434k()) {
                this.f16809a.mo7212a(new IOException(new ConcurrentModificationException()));
            } else {
                this.f16809a.mo7213b();
            }
        }

        /* renamed from: u */
        public void mo7224u(Loader.C1015e eVar, long j, long j2, boolean z) {
        }
    }

    /* renamed from: q56$d */
    /* compiled from: SntpClient */
    public static final class C3127d implements Loader.C1015e {
        public C3127d() {
        }

        /* renamed from: a */
        public void mo7723a() throws IOException {
            synchronized (q56.f16804a) {
                synchronized (q56.f16805b) {
                    if (!q56.f16806c) {
                        long e = q56.m25435l();
                        synchronized (q56.f16805b) {
                            long unused = q56.f16807d = e;
                            boolean unused2 = q56.f16806c = true;
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        public void mo7724c() {
        }
    }

    /* renamed from: g */
    public static void m25430g(byte b, byte b2, int i, long j) throws IOException {
        if (b == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        } else if (b2 != 4 && b2 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + b2);
        } else if (i == 0 || i > 15) {
            throw new IOException("SNTP: Untrusted stratum: " + i);
        } else if (j == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    /* renamed from: h */
    public static long m25431h() {
        long j;
        synchronized (f16805b) {
            if (f16806c) {
                j = f16807d;
            } else {
                j = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
            }
        }
        return j;
    }

    /* renamed from: i */
    public static String m25432i() {
        String str;
        synchronized (f16805b) {
            str = f16808e;
        }
        return str;
    }

    /* renamed from: j */
    public static void m25433j(Loader loader, C3125b bVar) {
        if (!m25434k()) {
            if (loader == null) {
                loader = new Loader("SntpClient");
            }
            loader.mo7813n(new C3127d(), new C3126c(bVar), 1);
        } else if (bVar != null) {
            bVar.mo7213b();
        }
    }

    /* renamed from: k */
    public static boolean m25434k() {
        boolean z;
        synchronized (f16805b) {
            z = f16806c;
        }
        return z;
    }

    /* renamed from: l */
    public static long m25435l() throws IOException {
        InetAddress byName = InetAddress.getByName(m25432i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            m25438o(bArr, 40, currentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
            byte b = bArr[0];
            long n = m25437n(bArr, 24);
            long n2 = m25437n(bArr, 32);
            long n3 = m25437n(bArr, 40);
            m25430g((byte) ((b >> 6) & 3), (byte) (b & 7), bArr[1] & 255, n3);
            long j2 = (j + (((n2 - n) + (n3 - j)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j2;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: m */
    public static long m25436m(byte[] bArr, int i) {
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        byte b5 = b & true;
        int i2 = b;
        if (b5 == true) {
            i2 = (b & Byte.MAX_VALUE) + 128;
        }
        byte b6 = b2 & true;
        int i3 = b2;
        if (b6 == true) {
            i3 = (b2 & Byte.MAX_VALUE) + 128;
        }
        byte b7 = b3 & true;
        int i4 = b3;
        if (b7 == true) {
            i4 = (b3 & Byte.MAX_VALUE) + 128;
        }
        byte b8 = b4 & true;
        int i5 = b4;
        if (b8 == true) {
            i5 = (b4 & Byte.MAX_VALUE) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    /* renamed from: n */
    public static long m25437n(byte[] bArr, int i) {
        long m = m25436m(bArr, i);
        long m2 = m25436m(bArr, i + 4);
        if (m == 0 && m2 == 0) {
            return 0;
        }
        return ((m - 2208988800L) * 1000) + ((m2 * 1000) / 4294967296L);
    }

    /* renamed from: o */
    public static void m25438o(byte[] bArr, int i, long j) {
        if (j == 0) {
            Arrays.fill(bArr, i, i + 8, (byte) 0);
            return;
        }
        long j2 = j / 1000;
        long j3 = j2 + 2208988800L;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) (j3 >> 24));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) (j3 >> 16));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) (j3 >> 8));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) (j3 >> 0));
        long j4 = ((j - (j2 * 1000)) * 4294967296L) / 1000;
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) (j4 >> 24));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) (j4 >> 16));
        bArr[i7] = (byte) ((int) (j4 >> 8));
        bArr[i7 + 1] = (byte) ((int) (Math.random() * 255.0d));
    }
}
