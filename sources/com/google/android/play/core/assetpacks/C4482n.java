package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

/* renamed from: com.google.android.play.core.assetpacks.n */
public final class C4482n {

    /* renamed from: h */
    public static final pq7 f24763h = new pq7("SliceMetadataManager");

    /* renamed from: a */
    public final byte[] f24764a = new byte[8192];

    /* renamed from: b */
    public final C4469b f24765b;

    /* renamed from: c */
    public final String f24766c;

    /* renamed from: d */
    public final int f24767d;

    /* renamed from: e */
    public final long f24768e;

    /* renamed from: f */
    public final String f24769f;

    /* renamed from: g */
    public int f24770g;

    public C4482n(C4469b bVar, String str, int i, long j, String str2) {
        this.f24765b = bVar;
        this.f24766c = str;
        this.f24767d = i;
        this.f24768e = j;
        this.f24769f = str2;
        this.f24770g = -1;
    }

    /* renamed from: a */
    public final void mo34227a(String str, long j, long j2, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f24770g));
        FileOutputStream fileOutputStream = new FileOutputStream(mo34241o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            mt7.m48481a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final void mo34228b(byte[] bArr, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f24770g));
        FileOutputStream fileOutputStream = new FileOutputStream(mo34241o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File B = this.f24765b.mo34154B(this.f24766c, this.f24767d, this.f24768e, this.f24769f);
            if (B.exists()) {
                B.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(B);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
                return;
            } catch (Throwable th) {
                mt7.m48481a(th, th);
            }
            throw th;
            throw th;
        } catch (Throwable th2) {
            mt7.m48481a(th, th2);
        }
    }

    /* renamed from: c */
    public final void mo34229c(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(mo34236j().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f24770g));
        FileOutputStream fileOutputStream = new FileOutputStream(mo34241o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            mt7.m48481a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    public final void mo34230d(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f24770g));
        FileOutputStream fileOutputStream = new FileOutputStream(mo34241o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            mt7.m48481a(th, th);
        }
        throw th;
    }

    /* renamed from: e */
    public final nu7 mo34231e() throws IOException {
        File A = this.f24765b.mo34153A(this.f24766c, this.f24767d, this.f24768e, this.f24769f);
        if (A.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(A);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new C4470bj("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.f24770g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new nu7(parseInt, property, parseLong, parseLong2, parseInt2);
                } catch (NumberFormatException e) {
                    throw new C4470bj("Slice checkpoint file corrupt.", (Exception) e);
                }
            } catch (Throwable th) {
                mt7.m48481a(th, th);
            }
        } else {
            throw new C4470bj("Slice checkpoint file does not exist.");
        }
        throw th;
    }

    /* renamed from: f */
    public final void mo34232f(InputStream inputStream, long j) throws IOException {
        int read;
        RandomAccessFile randomAccessFile = new RandomAccessFile(mo34236j(), "rw");
        try {
            randomAccessFile.seek(j);
            do {
                read = inputStream.read(this.f24764a);
                if (read > 0) {
                    randomAccessFile.write(this.f24764a, 0, read);
                }
            } while (read == 8192);
            randomAccessFile.close();
            return;
        } catch (Throwable th) {
            mt7.m48481a(th, th);
        }
        throw th;
    }

    /* renamed from: g */
    public final void mo34233g(byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream;
        this.f24770g++;
        try {
            fileOutputStream = new FileOutputStream(new File(mo34240n(), String.format("%s-LFH.dat", new Object[]{Integer.valueOf(this.f24770g)})));
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return;
        } catch (IOException e) {
            throw new C4470bj("Could not write metadata file.", (Exception) e);
        } catch (Throwable th) {
            mt7.m48481a(th, th);
        }
        throw th;
    }

    /* renamed from: h */
    public final void mo34234h(byte[] bArr, InputStream inputStream) throws IOException {
        this.f24770g++;
        FileOutputStream fileOutputStream = new FileOutputStream(mo34236j());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f24764a);
            while (read > 0) {
                fileOutputStream.write(this.f24764a, 0, read);
                read = inputStream.read(this.f24764a);
            }
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            mt7.m48481a(th, th);
        }
        throw th;
    }

    /* renamed from: i */
    public final void mo34235i(long j, byte[] bArr, int i, int i2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(mo34236j(), "rw");
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
            return;
        } catch (Throwable th) {
            mt7.m48481a(th, th);
        }
        throw th;
    }

    /* renamed from: j */
    public final File mo34236j() {
        return new File(mo34240n(), String.format("%s-NAM.dat", new Object[]{Integer.valueOf(this.f24770g)}));
    }

    /* renamed from: k */
    public final int mo34237k() throws IOException {
        File A = this.f24765b.mo34153A(this.f24766c, this.f24767d, this.f24768e, this.f24769f);
        if (!A.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(A);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new C4470bj("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            mt7.m48481a(th, th);
        }
        throw th;
    }

    /* renamed from: l */
    public final boolean mo34238l() {
        FileInputStream fileInputStream;
        File A = this.f24765b.mo34153A(this.f24766c, this.f24767d, this.f24768e, this.f24769f);
        if (!A.exists()) {
            return false;
        }
        try {
            fileInputStream = new FileInputStream(A);
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") != null) {
                return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
            }
            f24763h.mo46853b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
            return false;
        } catch (IOException e) {
            f24763h.mo46853b("Could not read checkpoint while checking if extraction finished. %s", e);
            return false;
        } catch (Throwable th) {
            mt7.m48481a(th, th);
        }
        throw th;
    }

    /* renamed from: m */
    public final void mo34239m(byte[] bArr, int i) throws IOException {
        this.f24770g++;
        FileOutputStream fileOutputStream = new FileOutputStream(mo34236j());
        try {
            fileOutputStream.write(bArr, 0, i);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            mt7.m48481a(th, th);
        }
        throw th;
    }

    /* renamed from: n */
    public final File mo34240n() {
        File C = this.f24765b.mo34155C(this.f24766c, this.f24767d, this.f24768e, this.f24769f);
        if (!C.exists()) {
            C.mkdirs();
        }
        return C;
    }

    /* renamed from: o */
    public final File mo34241o() throws IOException {
        File A = this.f24765b.mo34153A(this.f24766c, this.f24767d, this.f24768e, this.f24769f);
        A.getParentFile().mkdirs();
        A.createNewFile();
        return A;
    }
}
