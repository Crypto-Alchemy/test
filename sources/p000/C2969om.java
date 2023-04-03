package p000;

import android.content.Context;
import android.os.Parcel;
import com.facebook.soloader.SysUtil;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;
import p000.gy1;
import p000.i47;

/* renamed from: om */
/* compiled from: ApkSoSource */
public class C2969om extends gy1 {

    /* renamed from: i */
    public final int f15947i;

    /* renamed from: om$a */
    /* compiled from: ApkSoSource */
    public class C2970a extends gy1.C2430c {

        /* renamed from: k */
        public File f15948k;

        /* renamed from: r */
        public final int f15949r;

        public C2970a(gy1 gy1) throws IOException {
            super(gy1);
            this.f15948k = new File(C2969om.this.f13153c.getApplicationInfo().nativeLibraryDir);
            this.f15949r = C2969om.this.f15947i;
        }

        /* renamed from: f */
        public boolean mo20864f(ZipEntry zipEntry, String str) {
            String name = zipEntry.getName();
            if (str.equals(C2969om.this.f13154d)) {
                C2969om.this.f13154d = null;
                String.format("allowing consideration of corrupted lib %s", new Object[]{str});
            } else if ((this.f15949r & 1) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("allowing consideration of ");
                sb.append(name);
                sb.append(": self-extraction preferred");
            } else {
                File file = new File(this.f15948k, str);
                if (!file.isFile()) {
                    String.format("allowing considering of %s: %s not in system lib dir", new Object[]{name, str});
                } else {
                    long length = file.length();
                    long size = zipEntry.getSize();
                    if (length != size) {
                        String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", new Object[]{file, Long.valueOf(length), Long.valueOf(size)});
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("not allowing consideration of ");
                        sb2.append(name);
                        sb2.append(": deferring to libdir");
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public C2969om(Context context, File file, String str, int i) {
        super(context, str, file, "^lib/([^/]+)/([^/]+\\.so)$");
        this.f15947i = i;
    }

    /* renamed from: j */
    public byte[] mo21457j() throws IOException {
        File canonicalFile = this.f12620g.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(SysUtil.m13740g(this.f13153c));
            if ((this.f15947i & 1) == 0) {
                obtain.writeByte((byte) 0);
                return obtain.marshall();
            }
            String str = this.f13153c.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                obtain.writeByte((byte) 1);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                return marshall;
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                obtain.writeByte((byte) 1);
                byte[] marshall2 = obtain.marshall();
                obtain.recycle();
                return marshall2;
            }
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile2.getPath());
            obtain.writeLong(canonicalFile2.lastModified());
            byte[] marshall3 = obtain.marshall();
            obtain.recycle();
            return marshall3;
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: m */
    public i47.C2528f mo11923m() throws IOException {
        return new C2970a(this);
    }
}
