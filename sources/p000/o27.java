package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000.s72;

/* renamed from: o27 */
/* compiled from: TypefaceCompatUtil */
public class o27 {

    /* renamed from: o27$a */
    /* compiled from: TypefaceCompatUtil */
    public static class C2936a {
        /* renamed from: a */
        public static ParcelFileDescriptor m23628a(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
            return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
        }
    }

    /* renamed from: a */
    public static void m23620a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static ByteBuffer m23621b(Context context, Resources resources, int i) {
        File e = m23624e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!m23622c(e, resources, i)) {
                return null;
            }
            ByteBuffer g = m23626g(e);
            e.delete();
            return g;
        } finally {
            e.delete();
        }
    }

    /* renamed from: c */
    public static boolean m23622c(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean d = m23623d(file, inputStream);
                m23620a(inputStream);
                return d;
            } catch (Throwable th) {
                th = th;
                m23620a(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            m23620a(inputStream);
            throw th;
        }
    }

    /* renamed from: d */
    public static boolean m23623d(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        m23620a(fileOutputStream2);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                }
            } catch (IOException e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error copying resource contents to temp file: ");
                    sb.append(e.getMessage());
                    m23620a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    m23620a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                m23620a(fileOutputStream);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error copying resource contents to temp file: ");
            sb2.append(e.getMessage());
            m23620a(fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        }
    }

    /* renamed from: e */
    public static File m23624e(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        int i = 0;
        while (i < 100) {
            File file = new File(cacheDir, str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    public static ByteBuffer m23625f(Context context, CancellationSignal cancellationSignal, Uri uri) {
        FileInputStream fileInputStream;
        try {
            ParcelFileDescriptor a = C2936a.m23628a(context.getContentResolver(), uri, "r", cancellationSignal);
            if (a == null) {
                if (a != null) {
                    a.close();
                }
                return null;
            }
            try {
                fileInputStream = new FileInputStream(a.getFileDescriptor());
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
                fileInputStream.close();
                a.close();
                return map;
            } catch (Throwable th) {
                a.close();
                throw th;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    /* renamed from: g */
    public static ByteBuffer m23626g(File file) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
            fileInputStream.close();
            return map;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: h */
    public static Map<Uri, ByteBuffer> m23627h(Context context, s72.C3250b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (s72.C3250b bVar : bVarArr) {
            if (bVar.mo25655b() == 0) {
                Uri d = bVar.mo25657d();
                if (!hashMap.containsKey(d)) {
                    hashMap.put(d, m23625f(context, cancellationSignal, d));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
