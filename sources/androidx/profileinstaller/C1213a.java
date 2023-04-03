package androidx.profileinstaller;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.C1214b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: androidx.profileinstaller.a */
/* compiled from: DeviceProfileWriter */
public class C1213a {

    /* renamed from: a */
    public final AssetManager f6288a;

    /* renamed from: b */
    public final Executor f6289b;

    /* renamed from: c */
    public final C1214b.C1217c f6290c;

    /* renamed from: d */
    public final byte[] f6291d;

    /* renamed from: e */
    public final File f6292e;

    /* renamed from: f */
    public final String f6293f;

    /* renamed from: g */
    public final String f6294g;

    /* renamed from: h */
    public final String f6295h;

    /* renamed from: i */
    public boolean f6296i = false;

    /* renamed from: j */
    public oe1[] f6297j;

    /* renamed from: k */
    public byte[] f6298k;

    public C1213a(AssetManager assetManager, Executor executor, C1214b.C1217c cVar, String str, String str2, String str3, File file) {
        this.f6288a = assetManager;
        this.f6289b = executor;
        this.f6290c = cVar;
        this.f6293f = str;
        this.f6294g = str2;
        this.f6295h = str3;
        this.f6292e = file;
        this.f6291d = m8627c();
    }

    /* renamed from: c */
    public static byte[] m8627c() {
        int i = Build.VERSION.SDK_INT;
        if (i < 24) {
            return null;
        }
        switch (i) {
            case 24:
            case 25:
                return kw4.f14342e;
            case 26:
                return kw4.f14341d;
            case 27:
                return kw4.f14340c;
            case 28:
            case 29:
            case 30:
                return kw4.f14339b;
            case 31:
                return kw4.f14338a;
            default:
                return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m8628e(int i, Object obj) {
        this.f6290c.mo8808a(i, obj);
    }

    /* renamed from: g */
    public static boolean m8629g() {
        int i = Build.VERSION.SDK_INT;
        if (i < 24) {
            return false;
        }
        if (i == 24 || i == 25 || i == 31) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo8812b() {
        if (!this.f6296i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    /* renamed from: d */
    public boolean mo8813d() {
        if (this.f6291d == null) {
            mo8815h(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        } else if (!this.f6292e.canWrite()) {
            mo8815h(4, (Object) null);
            return false;
        } else {
            this.f6296i = true;
            return true;
        }
    }

    /* renamed from: f */
    public C1213a mo8814f() {
        FileInputStream createInputStream;
        FileInputStream createInputStream2;
        mo8812b();
        if (this.f6291d == null) {
            return this;
        }
        try {
            AssetFileDescriptor openFd = this.f6288a.openFd(this.f6294g);
            try {
                createInputStream2 = openFd.createInputStream();
                this.f6297j = C1218c.m8688w(createInputStream2, C1218c.m8680o(createInputStream2, C1218c.f6301a), this.f6293f);
                if (createInputStream2 != null) {
                    createInputStream2.close();
                }
                openFd.close();
                oe1[] oe1Arr = this.f6297j;
                if (oe1Arr != null && m8629g()) {
                    try {
                        AssetFileDescriptor openFd2 = this.f6288a.openFd(this.f6295h);
                        try {
                            createInputStream = openFd2.createInputStream();
                            this.f6297j = C1218c.m8682q(createInputStream, C1218c.m8680o(createInputStream, C1218c.f6302b), this.f6291d, oe1Arr);
                            if (createInputStream != null) {
                                createInputStream.close();
                            }
                            openFd2.close();
                            return this;
                        } catch (Throwable th) {
                            if (openFd2 != null) {
                                openFd2.close();
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException e) {
                        this.f6290c.mo8808a(9, e);
                    } catch (IOException e2) {
                        this.f6290c.mo8808a(7, e2);
                    } catch (IllegalStateException e3) {
                        this.f6297j = null;
                        this.f6290c.mo8808a(8, e3);
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                return this;
            } catch (Throwable th3) {
                if (openFd != null) {
                    openFd.close();
                }
                throw th3;
            }
        } catch (FileNotFoundException e4) {
            this.f6290c.mo8808a(6, e4);
        } catch (IOException e5) {
            this.f6290c.mo8808a(7, e5);
        } catch (IllegalStateException e6) {
            this.f6290c.mo8808a(8, e6);
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
        throw th;
        throw th;
    }

    /* renamed from: h */
    public final void mo8815h(int i, Object obj) {
        this.f6289b.execute(new ke1(this, i, obj));
    }

    /* renamed from: i */
    public C1213a mo8816i() {
        ByteArrayOutputStream byteArrayOutputStream;
        oe1[] oe1Arr = this.f6297j;
        byte[] bArr = this.f6291d;
        if (!(oe1Arr == null || bArr == null)) {
            mo8812b();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                C1218c.m8655E(byteArrayOutputStream, bArr);
                if (!C1218c.m8652B(byteArrayOutputStream, bArr, oe1Arr)) {
                    this.f6290c.mo8808a(5, (Object) null);
                    this.f6297j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f6298k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f6297j = null;
            } catch (IOException e) {
                this.f6290c.mo8808a(7, e);
            } catch (IllegalStateException e2) {
                this.f6290c.mo8808a(8, e2);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return this;
        throw th;
    }

    /* renamed from: j */
    public boolean mo8817j() {
        FileOutputStream fileOutputStream;
        byte[] bArr = this.f6298k;
        if (bArr == null) {
            return false;
        }
        mo8812b();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                fileOutputStream = new FileOutputStream(this.f6292e);
                rp1.m26367l(byteArrayInputStream, fileOutputStream);
                mo8815h(1, (Object) null);
                fileOutputStream.close();
                byteArrayInputStream.close();
                this.f6298k = null;
                this.f6297j = null;
                return true;
            } catch (Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e) {
            mo8815h(6, e);
            this.f6298k = null;
            this.f6297j = null;
            return false;
        } catch (IOException e2) {
            try {
                mo8815h(7, e2);
                this.f6298k = null;
                this.f6297j = null;
                return false;
            } catch (Throwable th2) {
                this.f6298k = null;
                this.f6297j = null;
                throw th2;
            }
        } catch (Throwable th3) {
            th.addSuppressed(th3);
        }
        throw th;
    }
}
