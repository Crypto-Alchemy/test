package p000;

import android.os.Process;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: o70 */
/* compiled from: CLSUUID */
public class o70 {

    /* renamed from: a */
    public static final AtomicLong f32284a = new AtomicLong(0);

    /* renamed from: b */
    public static String f32285b;

    public o70(zp2 zp2) {
        byte[] bArr = new byte[10];
        mo46319e(bArr);
        mo46318d(bArr);
        mo46317c(bArr);
        String A = CommonUtils.m38396A(zp2.mo48534a());
        String v = CommonUtils.m38419v(bArr);
        Locale locale = Locale.US;
        f32285b = String.format(locale, "%s%s%s%s", new Object[]{v.substring(0, 12), v.substring(12, 16), v.subSequence(16, 20), A.substring(0, 12)}).toUpperCase(locale);
    }

    /* renamed from: a */
    public static byte[] m49169a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: b */
    public static byte[] m49170b(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: c */
    public final void mo46317c(byte[] bArr) {
        byte[] b = m49170b((long) Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b[0];
        bArr[9] = b[1];
    }

    /* renamed from: d */
    public final void mo46318d(byte[] bArr) {
        byte[] b = m49170b(f32284a.incrementAndGet());
        bArr[6] = b[0];
        bArr[7] = b[1];
    }

    /* renamed from: e */
    public final void mo46319e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] a = m49169a(time / 1000);
        bArr[0] = a[0];
        bArr[1] = a[1];
        bArr[2] = a[2];
        bArr[3] = a[3];
        byte[] b = m49170b(time % 1000);
        bArr[4] = b[0];
        bArr[5] = b[1];
    }

    public String toString() {
        return f32285b;
    }
}
