package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.play.core.assetpacks.d */
public final class C4472d {

    /* renamed from: a */
    public final rt7<yw7> f24717a;

    public C4472d(rt7<yw7> rt7) {
        this.f24717a = rt7;
    }

    /* renamed from: a */
    public final InputStream mo34189a(int i, String str, String str2, int i2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) im6.m45800b(this.f24717a.mo47486a().mo29746f(i, str, str2, i2));
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new C4470bj(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), i);
        } catch (ExecutionException e) {
            throw new C4470bj(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), e, i);
        } catch (InterruptedException e2) {
            throw new C4470bj("Extractor was interrupted while waiting for chunk file.", e2, i);
        }
    }
}
