package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: com.google.android.play.core.assetpacks.m */
public final class C4481m {

    /* renamed from: c */
    public static final pq7 f24760c = new pq7("PatchSliceTaskHandler");

    /* renamed from: a */
    public final C4469b f24761a;

    /* renamed from: b */
    public final rt7<yw7> f24762b;

    public C4481m(C4469b bVar, rt7<yw7> rt7) {
        this.f24761a = bVar;
        this.f24762b = rt7;
    }

    /* renamed from: a */
    public final void mo34226a(mu7 mu7) {
        InputStream inputStream;
        File t = this.f24761a.mo34178t(mu7.f34708b, mu7.f31829c, mu7.f31830d);
        C4469b bVar = this.f24761a;
        String str = mu7.f34708b;
        int i = mu7.f31829c;
        long j = mu7.f31830d;
        File file = new File(bVar.mo34179u(str, i, j), mu7.f31834h);
        try {
            inputStream = mu7.f31836j;
            if (mu7.f31833g == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            C4471c cVar = new C4471c(t, file);
            File v = this.f24761a.mo34180v(mu7.f34708b, mu7.f31831e, mu7.f31832f, mu7.f31834h);
            if (!v.exists()) {
                v.mkdirs();
            }
            C4482n nVar = new C4482n(this.f24761a, mu7.f34708b, mu7.f31831e, mu7.f31832f, mu7.f31834h);
            ns7.m49005l(cVar, inputStream, new qs7(v, nVar), mu7.f31835i);
            nVar.mo34230d(0);
            inputStream.close();
            f24760c.mo46855d("Patching and extraction finished for slice %s of pack %s.", mu7.f31834h, mu7.f34708b);
            this.f24762b.mo47486a().mo29743c(mu7.f34707a, mu7.f34708b, mu7.f31834h, 0);
            try {
                mu7.f31836j.close();
                return;
            } catch (IOException unused) {
                f24760c.mo46856e("Could not close file for slice %s of pack %s.", mu7.f31834h, mu7.f34708b);
                return;
            }
        } catch (IOException e) {
            f24760c.mo46853b("IOException during patching %s.", e.getMessage());
            throw new C4470bj(String.format("Error patching slice %s of pack %s.", new Object[]{mu7.f31834h, mu7.f34708b}), e, mu7.f34707a);
        } catch (Throwable th) {
            mt7.m48481a(th, th);
        }
        throw th;
    }
}
