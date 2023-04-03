package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.play.core.assetpacks.k */
public final class C4479k {

    /* renamed from: b */
    public static final pq7 f24752b = new pq7("MergeSliceTaskHandler");

    /* renamed from: a */
    public final C4469b f24753a;

    public C4479k(C4469b bVar) {
        this.f24753a = bVar;
    }

    /* renamed from: b */
    public static void m36449b(File file, File file2) {
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                m36449b(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(valueOf.length() + 28);
                sb.append("Unable to delete directory: ");
                sb.append(valueOf);
                throw new C4470bj(sb.toString());
            }
        } else if (file2.exists()) {
            String valueOf2 = String.valueOf(file2);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 51);
            sb2.append("File clashing with existing file from other slice: ");
            sb2.append(valueOf2);
            throw new C4470bj(sb2.toString());
        } else if (!file.renameTo(file2)) {
            String valueOf3 = String.valueOf(file);
            StringBuilder sb3 = new StringBuilder(valueOf3.length() + 21);
            sb3.append("Unable to move file: ");
            sb3.append(valueOf3);
            throw new C4470bj(sb3.toString());
        }
    }

    /* renamed from: a */
    public final void mo34223a(fu7 fu7) {
        File w = this.f24753a.mo34181w(fu7.f34708b, fu7.f28989c, fu7.f28990d, fu7.f28991e);
        if (w.exists()) {
            File x = this.f24753a.mo34182x(fu7.f34708b, fu7.f28989c, fu7.f28990d);
            if (!x.exists()) {
                x.mkdirs();
            }
            m36449b(w, x);
            try {
                this.f24753a.mo34184z(fu7.f34708b, fu7.f28989c, fu7.f28990d, this.f24753a.mo34183y(fu7.f34708b, fu7.f28989c, fu7.f28990d) + 1);
            } catch (IOException e) {
                f24752b.mo46853b("Writing merge checkpoint failed with %s.", e.getMessage());
                throw new C4470bj("Writing merge checkpoint failed.", e, fu7.f34707a);
            }
        } else {
            throw new C4470bj(String.format("Cannot find verified files for slice %s.", new Object[]{fu7.f28991e}), fu7.f34707a);
        }
    }
}
