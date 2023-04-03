package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: ot7 */
public final class ot7 {

    /* renamed from: a */
    public final long f32434a;

    /* renamed from: b */
    public final Context f32435b;

    /* renamed from: c */
    public File f32436c;

    public ot7(Context context) throws PackageManager.NameNotFoundException {
        this.f32435b = context;
        this.f32434a = (long) context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    /* renamed from: o */
    public static void m49530o(File file) throws IOException {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File o : listFiles) {
                m49530o(o);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(String.format("Failed to delete '%s'", new Object[]{file.getAbsolutePath()}));
        }
    }

    /* renamed from: u */
    public static File m49531u(File file, String str) throws IOException {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    /* renamed from: v */
    public static String m49532v(String str) {
        return String.valueOf(str).concat(".apk");
    }

    /* renamed from: w */
    public static void m49533w(File file) throws IOException {
        if (!file.exists()) {
            file.mkdirs();
            if (!file.isDirectory()) {
                String valueOf = String.valueOf(file.getAbsolutePath());
                throw new IOException(valueOf.length() != 0 ? "Unable to create directory: ".concat(valueOf) : new String("Unable to create directory: "));
            }
        } else if (!file.isDirectory()) {
            throw new IllegalArgumentException("File input must be directory when it exists.");
        }
    }

    /* renamed from: a */
    public final void mo46518a() throws IOException {
        File r = mo46534r();
        String[] list = r.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.f32434a))) {
                    File file = new File(r, str);
                    String valueOf = String.valueOf(file);
                    long j = this.f32434a;
                    StringBuilder sb = new StringBuilder(valueOf.length() + 118);
                    sb.append("FileStorage: removing directory for different version code (directory = ");
                    sb.append(valueOf);
                    sb.append(", current version code = ");
                    sb.append(j);
                    sb.append(")");
                    m49530o(file);
                }
            }
        }
    }

    /* renamed from: b */
    public final File mo46519b(String str) throws IOException {
        return m49531u(mo46524g(), m49532v(str));
    }

    /* renamed from: c */
    public final File mo46520c(String str) throws IOException {
        return m49531u(mo46532p(), m49532v(str));
    }

    /* renamed from: d */
    public final File mo46521d(File file) throws IOException {
        return m49531u(mo46532p(), file.getName());
    }

    /* renamed from: e */
    public final File mo46522e(String str, String str2) throws IOException {
        return m49531u(mo46536t(str), str2);
    }

    /* renamed from: f */
    public final File mo46523f() throws IOException {
        return new File(mo46533q(), "lock.tmp");
    }

    /* renamed from: g */
    public final File mo46524g() throws IOException {
        File file = new File(mo46533q(), "unverified-splits");
        m49533w(file);
        return file;
    }

    /* renamed from: h */
    public final File mo46525h(String str) throws IOException {
        File file = new File(mo46533q(), "dex");
        m49533w(file);
        File u = m49531u(file, str);
        m49533w(u);
        return u;
    }

    /* renamed from: i */
    public final Set<qw7> mo46526i() throws IOException {
        File p = mo46532p();
        HashSet hashSet = new HashSet();
        File[] listFiles = p.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && file.getName().endsWith(".apk")) {
                    String name = file.getName();
                    hashSet.add(new qw7(file, name.substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    /* renamed from: j */
    public final List<String> mo46527j() throws IOException {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = mo46535s().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public final void mo46528k(String str) throws IOException {
        m49530o(mo46536t(str));
    }

    /* renamed from: l */
    public final void mo46529l(File file) throws IOException {
        rr7.m51234c(file.getParentFile().getParentFile().equals(mo46535s()), "File to remove is not a native library");
        m49530o(file);
    }

    /* renamed from: m */
    public final Set<File> mo46530m(String str) throws IOException {
        HashSet hashSet = new HashSet();
        File[] listFiles = mo46536t(str).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile()) {
                    hashSet.add(file);
                }
            }
        }
        return hashSet;
    }

    /* renamed from: n */
    public final void mo46531n(String str) throws IOException {
        m49530o(mo46520c(str));
    }

    /* renamed from: p */
    public final File mo46532p() throws IOException {
        File file = new File(mo46533q(), "verified-splits");
        m49533w(file);
        return file;
    }

    /* renamed from: q */
    public final File mo46533q() throws IOException {
        File file = new File(mo46534r(), Long.toString(this.f32434a));
        m49533w(file);
        return file;
    }

    /* renamed from: r */
    public final File mo46534r() throws IOException {
        if (this.f32436c == null) {
            Context context = this.f32435b;
            if (context != null) {
                this.f32436c = context.getFilesDir();
            } else {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
        }
        File file = new File(this.f32436c, "splitcompat");
        m49533w(file);
        return file;
    }

    /* renamed from: s */
    public final File mo46535s() throws IOException {
        File file = new File(mo46533q(), "native-libraries");
        m49533w(file);
        return file;
    }

    /* renamed from: t */
    public final File mo46536t(String str) throws IOException {
        File u = m49531u(mo46535s(), str);
        m49533w(u);
        return u;
    }
}
