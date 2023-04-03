package p000;

import android.content.ComponentName;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.core.internal.C4488bi;
import com.google.android.play.core.internal.C4489bq;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import net.sqlcipher.database.SQLiteDatabase;
import okhttp3.internal.http2.Http2;

/* renamed from: ns7 */
public final class ns7 {
    /* renamed from: a */
    public static <R, P0> R m48994a(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p0) {
        try {
            return cls.cast(m49006m(obj, str, cls2).invoke(obj, new Object[]{p0}));
        } catch (Exception e) {
            throw new C4488bi(String.format("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e);
        }
    }

    /* renamed from: b */
    public static <R, P0, P1, P2> R m48995b(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p0, Class<P1> cls3, P1 p1, Class<P2> cls4, P2 p2) {
        try {
            return cls.cast(m49006m(obj, str, cls2, cls3, cls4).invoke(obj, new Object[]{p0, p1, p2}));
        } catch (Exception e) {
            throw new C4488bi(String.format("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e);
        }
    }

    /* renamed from: c */
    public static <R> R m48996c(Class<R> cls) {
        try {
            Constructor<R> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor.newInstance(new Object[0]);
        } catch (Exception e) {
            throw new C4488bi(String.format("Failed to invoke default constructor on class %s", new Object[]{cls.getName()}), e);
        }
    }

    /* renamed from: d */
    public static <T> ls7<T> m48997d(Object obj, String str, Class<T> cls) {
        return new ls7<>(obj, m49008o(obj, str), cls);
    }

    /* renamed from: e */
    public static <T> ls7 m48998e(Object obj, String str, Class<T> cls) {
        return new ls7(obj, m49008o(obj, str), cls, (byte[]) null);
    }

    /* renamed from: f */
    public static <R, P0> R m48999f(Class cls, Class<R> cls2, Class<P0> cls3, P0 p0) {
        try {
            return cls2.cast(m49007n(cls, "isDexOptNeeded", cls3).invoke((Object) null, new Object[]{p0}));
        } catch (Exception e) {
            throw new C4488bi(String.format("Failed to invoke static method %s on type %s", new Object[]{"isDexOptNeeded", cls}), e);
        }
    }

    /* renamed from: g */
    public static <R, P0, P1> R m49000g(Class cls, Class<R> cls2, Class<P0> cls3, P0 p0, Class<P1> cls4, P1 p1) {
        try {
            return cls2.cast(m49007n(cls, "optimizedPathFor", cls3, cls4).invoke((Object) null, new Object[]{p0, p1}));
        } catch (Exception e) {
            throw new C4488bi(String.format("Failed to invoke static method %s on type %s", new Object[]{"optimizedPathFor", cls}), e);
        }
    }

    /* renamed from: h */
    public static void m49001h(PackageManager packageManager, ComponentName componentName, int i) {
        ComponentInfo componentInfo;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting != 1) {
            if (componentEnabledSetting != 2) {
                String packageName = componentName.getPackageName();
                String className = componentName.getClassName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, i | RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN);
                    ComponentInfo[][] componentInfoArr = {packageInfo.activities, packageInfo.services, packageInfo.providers};
                    int i2 = 0;
                    loop0:
                    while (true) {
                        if (i2 >= 3) {
                            componentInfo = null;
                            break;
                        }
                        ComponentInfo[] componentInfoArr2 = componentInfoArr[i2];
                        if (componentInfoArr2 != null) {
                            int length = componentInfoArr2.length;
                            for (int i3 = 0; i3 < length; i3++) {
                                componentInfo = componentInfoArr2[i3];
                                if (componentInfo.name.equals(className)) {
                                    break loop0;
                                }
                            }
                            continue;
                        }
                        i2++;
                    }
                    if (componentInfo != null) {
                        if (componentInfo.isEnabled()) {
                            return;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
    }

    /* renamed from: i */
    public static <T> void m49002i(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    /* renamed from: j */
    public static <T> void m49003j(T t) {
        t.getClass();
    }

    /* renamed from: k */
    public static <T> void m49004k(T t) {
        if (t == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* renamed from: l */
    public static void m49005l(ws7 ws7, InputStream inputStream, OutputStream outputStream, long j) throws IOException {
        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        InputStream inputStream2 = inputStream;
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            String valueOf = String.valueOf(String.format("%x", new Object[]{Integer.valueOf(readInt)}));
            throw new C4489bq(valueOf.length() != 0 ? "Unexpected magic=".concat(valueOf) : new String("Unexpected magic="));
        }
        int read = dataInputStream.read();
        if (read == 4) {
            long j2 = 0;
            while (true) {
                long j3 = j - j2;
                try {
                    int read2 = dataInputStream.read();
                    if (read2 == -1) {
                        throw new IOException("Patch file overrun");
                    } else if (read2 != 0) {
                        switch (read2) {
                            case 247:
                                read2 = dataInputStream.readUnsignedShort();
                                m49009p(bArr, dataInputStream, outputStream, read2, j3);
                                break;
                            case 248:
                                read2 = dataInputStream.readInt();
                                m49009p(bArr, dataInputStream, outputStream, read2, j3);
                                break;
                            case 249:
                                long readUnsignedShort = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    m49010q(bArr, ws7, outputStream, readUnsignedShort, read2, j3);
                                    break;
                                } else {
                                    throw new IOException("Unexpected end of patch");
                                }
                            case SQLiteDatabase.MAX_SQL_CACHE_SIZE /*250*/:
                                long readUnsignedShort2 = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.readUnsignedShort();
                                m49010q(bArr, ws7, outputStream, readUnsignedShort2, read2, j3);
                                break;
                            case 251:
                                long readUnsignedShort3 = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.readInt();
                                m49010q(bArr, ws7, outputStream, readUnsignedShort3, read2, j3);
                                break;
                            case 252:
                                long readInt2 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    m49010q(bArr, ws7, outputStream, readInt2, read2, j3);
                                    break;
                                } else {
                                    throw new IOException("Unexpected end of patch");
                                }
                            case 253:
                                long readInt3 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.readUnsignedShort();
                                m49010q(bArr, ws7, outputStream, readInt3, read2, j3);
                                break;
                            case 254:
                                long readInt4 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.readInt();
                                m49010q(bArr, ws7, outputStream, readInt4, read2, j3);
                                break;
                            case 255:
                                long readLong = dataInputStream.readLong();
                                read2 = dataInputStream.readInt();
                                m49010q(bArr, ws7, outputStream, readLong, read2, j3);
                                break;
                            default:
                                m49009p(bArr, dataInputStream, outputStream, read2, j3);
                                break;
                        }
                        j2 += (long) read2;
                    } else {
                        return;
                    }
                } finally {
                    outputStream.flush();
                }
            }
        } else {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Unexpected version=");
            sb.append(read);
            throw new C4489bq(sb.toString());
        }
    }

    /* renamed from: m */
    public static Method m49006m(Object obj, String str, Class<?>... clsArr) {
        return m49007n(obj.getClass(), str, clsArr);
    }

    /* renamed from: n */
    public static Method m49007n(Class<?> cls, String str, Class<?>... clsArr) {
        Class<?> cls2 = cls;
        while (cls2 != null) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        throw new C4488bi(String.format("Could not find a method named %s with parameters %s in type %s", new Object[]{str, Arrays.asList(clsArr), cls}));
    }

    /* renamed from: o */
    public static Field m49008o(Object obj, String str) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new C4488bi(String.format("Failed to find a field named %s on an object of instance %s", new Object[]{str, obj.getClass().getName()}));
    }

    /* renamed from: p */
    public static void m49009p(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i, long j) throws IOException {
        if (i < 0) {
            throw new IOException("copyLength negative");
        } else if (((long) i) <= j) {
            while (i > 0) {
                try {
                    int min = Math.min(i, Http2.INITIAL_MAX_FRAME_SIZE);
                    dataInputStream.readFully(bArr, 0, min);
                    outputStream.write(bArr, 0, min);
                    i -= min;
                } catch (EOFException unused) {
                    throw new IOException("patch underrun");
                }
            }
        } else {
            throw new IOException("Output length overrun");
        }
    }

    /* renamed from: q */
    public static void m49010q(byte[] bArr, ws7 ws7, OutputStream outputStream, long j, int i, long j2) throws IOException {
        InputStream c;
        if (i < 0) {
            throw new IOException("copyLength negative");
        } else if (j >= 0) {
            long j3 = (long) i;
            if (j3 <= j2) {
                try {
                    c = new ys7(ws7, j, j3).mo49262c();
                    while (i > 0) {
                        int min = Math.min(i, Http2.INITIAL_MAX_FRAME_SIZE);
                        int i2 = 0;
                        while (i2 < min) {
                            int read = c.read(bArr, i2, min - i2);
                            if (read != -1) {
                                i2 += read;
                            } else {
                                throw new IOException("truncated input stream");
                            }
                        }
                        outputStream.write(bArr, 0, min);
                        i -= min;
                    }
                    c.close();
                    return;
                } catch (EOFException e) {
                    throw new IOException("patch underrun", e);
                } catch (Throwable th) {
                    mt7.m48481a(th, th);
                }
            } else {
                throw new IOException("Output length overrun");
            }
        } else {
            throw new IOException("inputOffset negative");
        }
        throw th;
    }
}
