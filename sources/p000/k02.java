package p000;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import p000.av0;

/* renamed from: k02 */
/* compiled from: FileBackedNativeSessionFile */
public class k02 implements y34 {

    /* renamed from: a */
    public final File f30685a;

    /* renamed from: b */
    public final String f30686b;

    /* renamed from: c */
    public final String f30687c;

    public k02(String str, String str2, File file) {
        this.f30686b = str;
        this.f30687c = str2;
        this.f30685a = file;
    }

    /* renamed from: a */
    public final byte[] mo44648a() {
        GZIPOutputStream gZIPOutputStream;
        byte[] bArr = new byte[8192];
        try {
            InputStream h = mo43103h();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (h == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (h != null) {
                            h.close();
                        }
                        return null;
                    }
                    while (true) {
                        int read = h.read(bArr);
                        if (read > 0) {
                            gZIPOutputStream.write(bArr, 0, read);
                        } else {
                            gZIPOutputStream.finish();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            h.close();
                            return byteArray;
                        }
                    }
                } catch (Throwable th) {
                    byteArrayOutputStream.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                if (h != null) {
                    h.close();
                }
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }

    /* renamed from: h */
    public InputStream mo43103h() {
        if (this.f30685a.exists() && this.f30685a.isFile()) {
            try {
                return new FileInputStream(this.f30685a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    /* renamed from: i */
    public av0.C3830d.C3832b mo43104i() {
        byte[] a = mo44648a();
        if (a != null) {
            return av0.C3830d.C3832b.m32072a().mo29192b(a).mo29193c(this.f30686b).mo29191a();
        }
        return null;
    }

    /* renamed from: j */
    public String mo43105j() {
        return this.f30687c;
    }
}
