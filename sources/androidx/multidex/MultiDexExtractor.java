package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import okhttp3.internal.http2.Http2;

public final class MultiDexExtractor implements Closeable {

    /* renamed from: a */
    public final File f5959a;

    /* renamed from: d */
    public final long f5960d;

    /* renamed from: e */
    public final File f5961e;

    /* renamed from: g */
    public final RandomAccessFile f5962g;

    /* renamed from: k */
    public final FileChannel f5963k;

    /* renamed from: r */
    public final FileLock f5964r;

    public static class ExtractedDex extends File {
        public long crc = -1;

        public ExtractedDex(File file, String str) {
            super(file, str);
        }
    }

    /* renamed from: androidx.multidex.MultiDexExtractor$a */
    public class C1105a implements FileFilter {
        public C1105a() {
        }

        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    public MultiDexExtractor(File file, File file2) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiDexExtractor(");
        sb.append(file.getPath());
        sb.append(", ");
        sb.append(file2.getPath());
        sb.append(")");
        this.f5959a = file;
        this.f5961e = file2;
        this.f5960d = m8125f(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f5962g = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f5963k = channel;
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Blocking on lock ");
                sb2.append(file3.getPath());
                this.f5964r = channel.lock();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(file3.getPath());
                sb3.append(" locked");
            } catch (IOException e) {
                e = e;
                m8121b(this.f5963k);
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                m8121b(this.f5963k);
                throw e;
            } catch (Error e3) {
                e = e3;
                m8121b(this.f5963k);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            m8121b(this.f5962g);
            throw e4;
        }
    }

    /* renamed from: b */
    public static void m8121b(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: c */
    public static void m8122c(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        ZipOutputStream zipOutputStream;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        StringBuilder sb = new StringBuilder();
        sb.append("Extracting ");
        sb.append(createTempFile.getPath());
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Renaming to ");
                sb2.append(file.getPath());
                if (createTempFile.renameTo(file)) {
                    m8121b(inputStream);
                    createTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
        } catch (Throwable th) {
            m8121b(inputStream);
            createTempFile.delete();
            throw th;
        }
    }

    /* renamed from: d */
    public static SharedPreferences m8123d(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    /* renamed from: e */
    public static long m8124e(File file) {
        long lastModified = file.lastModified();
        if (lastModified == -1) {
            return lastModified - 1;
        }
        return lastModified;
    }

    /* renamed from: f */
    public static long m8125f(File file) throws IOException {
        long c = qp7.m25829c(file);
        if (c == -1) {
            return c - 1;
        }
        return c;
    }

    /* renamed from: g */
    public static boolean m8126g(Context context, File file, long j, String str) {
        SharedPreferences d = m8123d(context);
        if (d.getLong(str + "timestamp", -1) == m8124e(file)) {
            if (d.getLong(str + "crc", -1) != j) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static void m8127k(Context context, String str, long j, long j2, List<ExtractedDex> list) {
        SharedPreferences.Editor edit = m8123d(context).edit();
        edit.putLong(str + "timestamp", j);
        edit.putLong(str + "crc", j2);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i = 2;
        for (ExtractedDex next : list) {
            edit.putLong(str + "dex.crc." + i, next.crc);
            edit.putLong(str + "dex.time." + i, next.lastModified());
            i++;
        }
        edit.commit();
    }

    /* renamed from: a */
    public final void mo8393a() {
        File[] listFiles = this.f5961e.listFiles(new C1105a());
        if (listFiles == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to list secondary dex dir content (");
            sb.append(this.f5961e.getPath());
            sb.append(").");
            return;
        }
        for (File file : listFiles) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Trying to delete old file ");
            sb2.append(file.getPath());
            sb2.append(" of size ");
            sb2.append(file.length());
            if (!file.delete()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Failed to delete old file ");
                sb3.append(file.getPath());
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Deleted old file ");
                sb4.append(file.getPath());
            }
        }
    }

    public void close() throws IOException {
        this.f5964r.release();
        this.f5963k.close();
        this.f5962g.close();
    }

    /* renamed from: h */
    public List<? extends File> mo8395h(Context context, String str, boolean z) throws IOException {
        List<ExtractedDex> list;
        List<ExtractedDex> list2;
        StringBuilder sb = new StringBuilder();
        sb.append("MultiDexExtractor.load(");
        sb.append(this.f5959a.getPath());
        sb.append(", ");
        sb.append(z);
        sb.append(", ");
        sb.append(str);
        sb.append(")");
        if (this.f5964r.isValid()) {
            if (z || m8126g(context, this.f5959a, this.f5960d, str)) {
                list2 = mo8397j();
                m8127k(context, str, m8124e(this.f5959a), this.f5960d, list2);
            } else {
                try {
                    list = mo8396i(context, str);
                } catch (IOException unused) {
                    list2 = mo8397j();
                    m8127k(context, str, m8124e(this.f5959a), this.f5960d, list2);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("load found ");
                sb2.append(list.size());
                sb2.append(" secondary dex files");
                return list;
            }
            list = list2;
            StringBuilder sb22 = new StringBuilder();
            sb22.append("load found ");
            sb22.append(list.size());
            sb22.append(" secondary dex files");
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    /* renamed from: i */
    public final List<ExtractedDex> mo8396i(Context context, String str) throws IOException {
        String str2 = str;
        String str3 = this.f5959a.getName() + ".classes";
        SharedPreferences d = m8123d(context);
        int i = d.getInt(str2 + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i + -1);
        int i2 = 2;
        while (i2 <= i) {
            ExtractedDex extractedDex = new ExtractedDex(this.f5961e, str3 + i2 + ".zip");
            if (extractedDex.isFile()) {
                extractedDex.crc = m8125f(extractedDex);
                long j = d.getLong(str2 + "dex.crc." + i2, -1);
                long j2 = d.getLong(str2 + "dex.time." + i2, -1);
                long lastModified = extractedDex.lastModified();
                if (j2 == lastModified) {
                    String str4 = str3;
                    SharedPreferences sharedPreferences = d;
                    if (j == extractedDex.crc) {
                        arrayList.add(extractedDex);
                        i2++;
                        d = sharedPreferences;
                        str3 = str4;
                    }
                }
                throw new IOException("Invalid extracted dex: " + extractedDex + " (key \"" + str2 + "\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + extractedDex.crc);
            }
            throw new IOException("Missing extracted secondary dex file '" + extractedDex.getPath() + "'");
        }
        return arrayList;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r10 = new java.lang.StringBuilder();
        r10.append("Failed to read crc from ");
        r10.append(r8.getAbsolutePath());
        r10 = false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0083 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<androidx.multidex.MultiDexExtractor.ExtractedDex> mo8397j() throws java.io.IOException {
        /*
            r14 = this;
            java.lang.String r0 = ".dex"
            java.lang.String r1 = "classes"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r3 = r14.f5959a
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = ".classes"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r14.mo8393a()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile
            java.io.File r5 = r14.f5959a
            r4.<init>(r5)
            r5 = 2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r6.<init>()     // Catch:{ all -> 0x0135 }
            r6.append(r1)     // Catch:{ all -> 0x0135 }
            r6.append(r5)     // Catch:{ all -> 0x0135 }
            r6.append(r0)     // Catch:{ all -> 0x0135 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0135 }
            java.util.zip.ZipEntry r6 = r4.getEntry(r6)     // Catch:{ all -> 0x0135 }
        L_0x0041:
            if (r6 == 0) goto L_0x0131
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r7.<init>()     // Catch:{ all -> 0x0135 }
            r7.append(r2)     // Catch:{ all -> 0x0135 }
            r7.append(r5)     // Catch:{ all -> 0x0135 }
            java.lang.String r8 = ".zip"
            r7.append(r8)     // Catch:{ all -> 0x0135 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0135 }
            androidx.multidex.MultiDexExtractor$ExtractedDex r8 = new androidx.multidex.MultiDexExtractor$ExtractedDex     // Catch:{ all -> 0x0135 }
            java.io.File r9 = r14.f5961e     // Catch:{ all -> 0x0135 }
            r8.<init>(r9, r7)     // Catch:{ all -> 0x0135 }
            r3.add(r8)     // Catch:{ all -> 0x0135 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r7.<init>()     // Catch:{ all -> 0x0135 }
            java.lang.String r9 = "Extraction is needed for file "
            r7.append(r9)     // Catch:{ all -> 0x0135 }
            r7.append(r8)     // Catch:{ all -> 0x0135 }
            r7 = 0
            r9 = r7
            r10 = r9
        L_0x0071:
            r11 = 3
            if (r9 >= r11) goto L_0x00ed
            if (r10 != 0) goto L_0x00ed
            int r9 = r9 + 1
            m8122c(r4, r6, r8, r2)     // Catch:{ all -> 0x0135 }
            long r10 = m8125f(r8)     // Catch:{ IOException -> 0x0083 }
            r8.crc = r10     // Catch:{ IOException -> 0x0083 }
            r10 = 1
            goto L_0x0095
        L_0x0083:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r10.<init>()     // Catch:{ all -> 0x0135 }
            java.lang.String r11 = "Failed to read crc from "
            r10.append(r11)     // Catch:{ all -> 0x0135 }
            java.lang.String r11 = r8.getAbsolutePath()     // Catch:{ all -> 0x0135 }
            r10.append(r11)     // Catch:{ all -> 0x0135 }
            r10 = r7
        L_0x0095:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r11.<init>()     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = "Extraction "
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            if (r10 == 0) goto L_0x00a4
            java.lang.String r12 = "succeeded"
            goto L_0x00a6
        L_0x00a4:
            java.lang.String r12 = "failed"
        L_0x00a6:
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = " '"
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = r8.getAbsolutePath()     // Catch:{ all -> 0x0135 }
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = "': length "
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            long r12 = r8.length()     // Catch:{ all -> 0x0135 }
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = " - crc: "
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            long r12 = r8.crc     // Catch:{ all -> 0x0135 }
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            if (r10 != 0) goto L_0x0071
            r8.delete()     // Catch:{ all -> 0x0135 }
            boolean r11 = r8.exists()     // Catch:{ all -> 0x0135 }
            if (r11 == 0) goto L_0x0071
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r11.<init>()     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = "Failed to delete corrupted secondary dex '"
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = r8.getPath()     // Catch:{ all -> 0x0135 }
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = "'"
            r11.append(r12)     // Catch:{ all -> 0x0135 }
            goto L_0x0071
        L_0x00ed:
            if (r10 == 0) goto L_0x0109
            int r5 = r5 + 1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r6.<init>()     // Catch:{ all -> 0x0135 }
            r6.append(r1)     // Catch:{ all -> 0x0135 }
            r6.append(r5)     // Catch:{ all -> 0x0135 }
            r6.append(r0)     // Catch:{ all -> 0x0135 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0135 }
            java.util.zip.ZipEntry r6 = r4.getEntry(r6)     // Catch:{ all -> 0x0135 }
            goto L_0x0041
        L_0x0109:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0135 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r1.<init>()     // Catch:{ all -> 0x0135 }
            java.lang.String r2 = "Could not create zip file "
            r1.append(r2)     // Catch:{ all -> 0x0135 }
            java.lang.String r2 = r8.getAbsolutePath()     // Catch:{ all -> 0x0135 }
            r1.append(r2)     // Catch:{ all -> 0x0135 }
            java.lang.String r2 = " for secondary dex ("
            r1.append(r2)     // Catch:{ all -> 0x0135 }
            r1.append(r5)     // Catch:{ all -> 0x0135 }
            java.lang.String r2 = ")"
            r1.append(r2)     // Catch:{ all -> 0x0135 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0135 }
            r0.<init>(r1)     // Catch:{ all -> 0x0135 }
            throw r0     // Catch:{ all -> 0x0135 }
        L_0x0131:
            r4.close()     // Catch:{ IOException -> 0x0134 }
        L_0x0134:
            return r3
        L_0x0135:
            r0 = move-exception
            r4.close()     // Catch:{ IOException -> 0x0139 }
        L_0x0139:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.multidex.MultiDexExtractor.mo8397j():java.util.List");
    }
}
