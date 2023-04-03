package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.play.core.assetpacks.p */
public final class C4484p {

    /* renamed from: b */
    public static final pq7 f24772b = new pq7("VerifySliceTaskHandler");

    /* renamed from: a */
    public final C4469b f24773a;

    public C4484p(C4469b bVar) {
        this.f24773a = bVar;
    }

    /* renamed from: a */
    public final void mo34242a(uu7 uu7) {
        File v = this.f24773a.mo34180v(uu7.f34708b, uu7.f34727c, uu7.f34728d, uu7.f34729e);
        if (v.exists()) {
            mo34243b(uu7, v);
            File w = this.f24773a.mo34181w(uu7.f34708b, uu7.f34727c, uu7.f34728d, uu7.f34729e);
            if (!w.exists()) {
                w.mkdirs();
            }
            if (!v.renameTo(w)) {
                throw new C4470bj(String.format("Failed to move slice %s after verification.", new Object[]{uu7.f34729e}), uu7.f34707a);
            }
            return;
        }
        throw new C4470bj(String.format("Cannot find unverified files for slice %s.", new Object[]{uu7.f34729e}), uu7.f34707a);
    }

    /* renamed from: b */
    public final void mo34243b(uu7 uu7, File file) {
        try {
            File C = this.f24773a.mo34155C(uu7.f34708b, uu7.f34727c, uu7.f34728d, uu7.f34729e);
            if (C.exists()) {
                try {
                    if (cu7.m43229a(C4483o.m36469a(file, C)).equals(uu7.f34730f)) {
                        f24772b.mo46855d("Verification of slice %s of pack %s successful.", uu7.f34729e, uu7.f34708b);
                        return;
                    }
                    throw new C4470bj(String.format("Verification failed for slice %s.", new Object[]{uu7.f34729e}), uu7.f34707a);
                } catch (NoSuchAlgorithmException e) {
                    throw new C4470bj("SHA256 algorithm not supported.", e, uu7.f34707a);
                } catch (IOException e2) {
                    throw new C4470bj(String.format("Could not digest file during verification for slice %s.", new Object[]{uu7.f34729e}), e2, uu7.f34707a);
                }
            } else {
                throw new C4470bj(String.format("Cannot find metadata files for slice %s.", new Object[]{uu7.f34729e}), uu7.f34707a);
            }
        } catch (IOException e3) {
            throw new C4470bj(String.format("Could not reconstruct slice archive during verification for slice %s.", new Object[]{uu7.f34729e}), e3, uu7.f34707a);
        }
    }
}
