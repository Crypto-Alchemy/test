package com.facebook.soloader;

import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.soloader.a */
/* compiled from: DirectorySoSource */
public class C1968a extends s56 {

    /* renamed from: a */
    public final File f9783a;

    /* renamed from: b */
    public final int f9784b;

    public C1968a(File file, int i) {
        this.f9783a = file;
        this.f9784b = i;
    }

    /* renamed from: c */
    public static String[] m13744c(File file) throws IOException {
        boolean z = SoLoader.f9765a;
        if (z) {
            Api18TraceUtils.m13707a("SoLoader.getElfDependencies[", file.getName(), "]");
        }
        try {
            String[] a = MinElf.m13709a(file);
            if (z) {
                Api18TraceUtils.m13708b();
            }
            return a;
        } catch (Throwable th) {
            if (SoLoader.f9765a) {
                Api18TraceUtils.m13708b();
            }
            throw th;
        }
    }

    /* renamed from: d */
    public static void m13745d(File file, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        String[] c = m13744c(file);
        StringBuilder sb = new StringBuilder();
        sb.append("Loading lib dependencies: ");
        sb.append(Arrays.toString(c));
        for (String str : c) {
            if (!str.startsWith("/")) {
                SoLoader.m13726j(str, i | 1, threadPolicy);
            }
        }
    }

    /* renamed from: a */
    public int mo13505a(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        return mo13506e(str, i, this.f9783a, threadPolicy);
    }

    /* renamed from: e */
    public int mo13506e(String str, int i, File file, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" not found on ");
            sb.append(file.getCanonicalPath());
            return 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" found on ");
        sb2.append(file.getCanonicalPath());
        if ((i & 1) == 0 || (this.f9784b & 2) == 0) {
            if ((this.f9784b & 1) != 0) {
                m13745d(file2, i, threadPolicy);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Not resolving dependencies for ");
                sb3.append(str);
            }
            try {
                SoLoader.f9766b.mo13503a(file2.getAbsolutePath(), i);
                return 1;
            } catch (UnsatisfiedLinkError e) {
                if (e.getMessage().contains("bad ELF magic")) {
                    return 3;
                }
                throw e;
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(" loaded implicitly");
            return 2;
        }
    }

    public String toString() {
        String str;
        try {
            str = String.valueOf(this.f9783a.getCanonicalPath());
        } catch (IOException unused) {
            str = this.f9783a.getName();
        }
        return getClass().getName() + "[root = " + str + " flags = " + this.f9784b + ']';
    }
}
