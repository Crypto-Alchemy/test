package p000;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import p000.av0;

/* renamed from: pv0 */
/* compiled from: CrashlyticsReportPersistence */
public class pv0 {

    /* renamed from: g */
    public static final Charset f32832g = Charset.forName("UTF-8");

    /* renamed from: h */
    public static final int f32833h = 15;

    /* renamed from: i */
    public static final iv0 f32834i = new iv0();

    /* renamed from: j */
    public static final Comparator<? super File> f32835j = new kv0();

    /* renamed from: k */
    public static final FilenameFilter f32836k = new lv0();

    /* renamed from: a */
    public final AtomicInteger f32837a = new AtomicInteger(0);

    /* renamed from: b */
    public final File f32838b;

    /* renamed from: c */
    public final File f32839c;

    /* renamed from: d */
    public final File f32840d;

    /* renamed from: e */
    public final File f32841e;

    /* renamed from: f */
    public final az5 f32842f;

    public pv0(File file, az5 az5) {
        File file2 = new File(file, "report-persistence");
        this.f32838b = new File(file2, "sessions");
        this.f32839c = new File(file2, "priority-reports");
        this.f32840d = new File(file2, "reports");
        this.f32841e = new File(file2, "native-reports");
        this.f32842f = az5;
    }

    /* renamed from: A */
    public static /* synthetic */ boolean m50118A(String str, File file) {
        if (!file.isDirectory() || file.getName().equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    public static boolean m50122G(File file) {
        if (file.exists() || file.mkdirs()) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public static int m50123H(File file, File file2) {
        return m50144s(file.getName()).compareTo(m50144s(file2.getName()));
    }

    /* renamed from: K */
    public static File m50124K(File file) throws IOException {
        if (m50122G(file)) {
            return file;
        }
        throw new IOException("Could not create directory " + file);
    }

    /* renamed from: L */
    public static String m50125L(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f32832g);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        throw th;
    }

    /* renamed from: M */
    public static void m50126M(File file) {
        if (file != null) {
            if (file.isDirectory()) {
                for (File M : file.listFiles()) {
                    m50126M(M);
                }
            }
            file.delete();
        }
    }

    /* renamed from: N */
    public static List<File> m50127N(List<File>... listArr) {
        for (List<File> sort : listArr) {
            Collections.sort(sort, f32835j);
        }
        return m50140j(listArr);
    }

    /* renamed from: O */
    public static void m50128O(File file, File file2, av0.C3830d dVar, String str) {
        try {
            iv0 iv0 = f32834i;
            m50131S(new File(m50124K(file2), str), iv0.mo43950E(iv0.mo43949D(m50125L(file)).mo29151m(dVar)));
        } catch (IOException e) {
            rk3 f = rk3.m51112f();
            f.mo47432l("Could not synthesize final native report file for " + file, e);
        }
    }

    /* renamed from: Q */
    public static void m50129Q(File file, File file2, List<av0.C3834e.C3841d> list, long j, boolean z, String str) {
        try {
            iv0 iv0 = f32834i;
            av0 l = iv0.mo43949D(m50125L(file)).mo29152n(j, z, str).mo29150l(ms2.m48439e(list));
            av0.C3834e j2 = l.mo29148j();
            if (j2 != null) {
                m50131S(new File(m50124K(file2), j2.mo29200h()), iv0.mo43950E(l));
            }
        } catch (IOException e) {
            rk3 f = rk3.m51112f();
            f.mo47432l("Could not synthesize final report file for " + file, e);
        }
    }

    /* renamed from: R */
    public static int m50130R(File file, int i) {
        List<File> u = m50146u(file, new mv0());
        Collections.sort(u, new nv0());
        return m50139h(u, i);
    }

    /* renamed from: S */
    public static void m50131S(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f32832g);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: T */
    public static void m50132T(File file, String str, long j) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f32832g);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(m50141k(j));
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: h */
    public static int m50139h(List<File> list, int i) {
        int size = list.size();
        for (File next : list) {
            if (size <= i) {
                return size;
            }
            m50126M(next);
            size--;
        }
        return size;
    }

    /* renamed from: j */
    public static List<File> m50140j(List<File>... listArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (List<File> size : listArr) {
            i += size.size();
        }
        arrayList.ensureCapacity(i);
        for (List<File> addAll : listArr) {
            arrayList.addAll(addAll);
        }
        return arrayList;
    }

    /* renamed from: k */
    public static long m50141k(long j) {
        return j * 1000;
    }

    /* renamed from: p */
    public static String m50142p(int i, boolean z) {
        String str;
        String format = String.format(Locale.US, "%010d", new Object[]{Integer.valueOf(i)});
        if (z) {
            str = "_";
        } else {
            str = "";
        }
        return "event" + format + str;
    }

    /* renamed from: q */
    public static List<File> m50143q(File file) {
        return m50145t(file, (FileFilter) null);
    }

    /* renamed from: s */
    public static String m50144s(String str) {
        return str.substring(0, f32833h);
    }

    /* renamed from: t */
    public static List<File> m50145t(File file, FileFilter fileFilter) {
        File[] fileArr;
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        if (fileFilter == null) {
            fileArr = file.listFiles();
        } else {
            fileArr = file.listFiles(fileFilter);
        }
        if (fileArr != null) {
            return Arrays.asList(fileArr);
        }
        return Collections.emptyList();
    }

    /* renamed from: u */
    public static List<File> m50146u(File file, FilenameFilter filenameFilter) {
        File[] fileArr;
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        if (filenameFilter == null) {
            fileArr = file.listFiles();
        } else {
            fileArr = file.listFiles(filenameFilter);
        }
        if (fileArr != null) {
            return Arrays.asList(fileArr);
        }
        return Collections.emptyList();
    }

    /* renamed from: y */
    public static boolean m50147y(String str) {
        if (!str.startsWith("event") || !str.endsWith("_")) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public static boolean m50148z(File file, String str) {
        if (!str.startsWith("event") || str.endsWith("_")) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public List<String> mo46886E() {
        List<File> q = m50143q(this.f32838b);
        Collections.sort(q, f32835j);
        ArrayList arrayList = new ArrayList();
        for (File name : q) {
            arrayList.add(name.getName());
        }
        return arrayList;
    }

    /* renamed from: F */
    public List<qv0> mo46887F() {
        List<File> r = mo46897r();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(r.size());
        for (File next : mo46897r()) {
            try {
                arrayList.add(qv0.m50885a(f32834i.mo43949D(m50125L(next)), next.getName()));
            } catch (IOException e) {
                rk3 f = rk3.m51112f();
                f.mo47432l("Could not load report file " + next + "; deleting", e);
                next.delete();
            }
        }
        return arrayList;
    }

    /* renamed from: I */
    public void mo46888I(av0.C3834e.C3841d dVar, String str, boolean z) {
        int i = this.f32842f.mo29403a().mo49571b().f35717a;
        File v = mo46898v(str);
        try {
            m50131S(new File(v, m50142p(this.f32837a.getAndIncrement(), z)), f32834i.mo43952h(dVar));
        } catch (IOException e) {
            rk3 f = rk3.m51112f();
            f.mo47432l("Could not persist event for session " + str, e);
        }
        m50130R(v, i);
    }

    /* renamed from: J */
    public void mo46889J(av0 av0) {
        av0.C3834e j = av0.mo29148j();
        if (j == null) {
            rk3.m51112f().mo47423b("Could not get session for report");
            return;
        }
        String h = j.mo29200h();
        try {
            File K = m50124K(mo46898v(h));
            m50131S(new File(K, "report"), f32834i.mo43950E(av0));
            m50132T(new File(K, "start-time"), "", j.mo29203k());
        } catch (IOException e) {
            rk3 f = rk3.m51112f();
            f.mo47424c("Could not persist report for session " + h, e);
        }
    }

    /* renamed from: P */
    public final void mo46890P(File file, long j) {
        boolean z;
        File file2;
        List<File> u = m50146u(file, f32836k);
        if (u.isEmpty()) {
            rk3.m51112f().mo47429i("Session " + file.getName() + " has no events.");
            return;
        }
        Collections.sort(u);
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = u.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                File next = it.next();
                try {
                    arrayList.add(f32834i.mo43951g(m50125L(next)));
                    if (z || m50147y(next.getName())) {
                        z = true;
                    }
                } catch (IOException e) {
                    rk3.m51112f().mo47432l("Could not add event to report for " + next, e);
                }
            }
        }
        if (arrayList.isEmpty()) {
            rk3.m51112f().mo47431k("Could not parse event files for session " + file.getName());
            return;
        }
        String str = null;
        File file3 = new File(file, "user");
        if (file3.isFile()) {
            try {
                str = m50125L(file3);
            } catch (IOException e2) {
                rk3.m51112f().mo47432l("Could not read user ID file in " + file.getName(), e2);
            }
        }
        String str2 = str;
        File file4 = new File(file, "report");
        if (z) {
            file2 = this.f32839c;
        } else {
            file2 = this.f32840d;
        }
        m50129Q(file4, file2, arrayList, j, z, str2);
    }

    /* renamed from: g */
    public final List<File> mo46891g(String str) {
        List<File> t = m50145t(this.f32838b, new jv0(str));
        Collections.sort(t, f32835j);
        if (t.size() <= 8) {
            return t;
        }
        for (File M : t.subList(8, t.size())) {
            m50126M(M);
        }
        return t.subList(0, 8);
    }

    /* renamed from: i */
    public final void mo46892i() {
        int i = this.f32842f.mo29403a().mo49571b().f35718b;
        List<File> r = mo46897r();
        int size = r.size();
        if (size > i) {
            for (File delete : r.subList(i, size)) {
                delete.delete();
            }
        }
    }

    /* renamed from: l */
    public void mo46893l() {
        for (File delete : mo46897r()) {
            delete.delete();
        }
    }

    /* renamed from: m */
    public void mo46894m(String str) {
        ov0 ov0 = new ov0(str);
        for (File delete : m50140j(m50146u(this.f32839c, ov0), m50146u(this.f32841e, ov0), m50146u(this.f32840d, ov0))) {
            delete.delete();
        }
    }

    /* renamed from: n */
    public void mo46895n(String str, long j) {
        for (File next : mo46891g(str)) {
            rk3 f = rk3.m51112f();
            f.mo47429i("Finalizing report for session " + next.getName());
            mo46890P(next, j);
            m50126M(next);
        }
        mo46892i();
    }

    /* renamed from: o */
    public void mo46896o(String str, av0.C3830d dVar) {
        m50128O(new File(mo46898v(str), "report"), this.f32841e, dVar, str);
    }

    /* renamed from: r */
    public final List<File> mo46897r() {
        return m50127N(m50140j(m50143q(this.f32839c), m50143q(this.f32841e)), m50143q(this.f32840d));
    }

    /* renamed from: v */
    public final File mo46898v(String str) {
        return new File(this.f32838b, str);
    }

    /* renamed from: w */
    public long mo46899w(String str) {
        return new File(mo46898v(str), "start-time").lastModified();
    }

    /* renamed from: x */
    public boolean mo46900x() {
        return !mo46897r().isEmpty();
    }
}
