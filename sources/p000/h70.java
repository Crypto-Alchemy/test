package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import p000.av0;

/* renamed from: h70 */
/* compiled from: BytesBackedNativeSessionFile */
public class h70 implements y34 {

    /* renamed from: a */
    public final byte[] f29460a;

    /* renamed from: b */
    public final String f29461b;

    /* renamed from: c */
    public final String f29462c;

    public h70(String str, String str2, byte[] bArr) {
        this.f29461b = str;
        this.f29462c = str2;
        this.f29460a = bArr;
    }

    /* renamed from: a */
    public final byte[] mo43101a() {
        GZIPOutputStream gZIPOutputStream;
        if (mo43102b()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(this.f29460a);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    /* renamed from: b */
    public final boolean mo43102b() {
        byte[] bArr = this.f29460a;
        if (bArr == null || bArr.length == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public InputStream mo43103h() {
        if (mo43102b()) {
            return null;
        }
        return new ByteArrayInputStream(this.f29460a);
    }

    /* renamed from: i */
    public av0.C3830d.C3832b mo43104i() {
        byte[] a = mo43101a();
        if (a == null) {
            return null;
        }
        return av0.C3830d.C3832b.m32072a().mo29192b(a).mo29193c(this.f29461b).mo29191a();
    }

    /* renamed from: j */
    public String mo43105j() {
        return this.f29462c;
    }
}
