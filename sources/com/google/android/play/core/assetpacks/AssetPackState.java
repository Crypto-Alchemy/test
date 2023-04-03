package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.internal.C4485a;

public abstract class AssetPackState {
    /* renamed from: b */
    public static AssetPackState m36338b(String str, int i, int i2, long j, long j2, double d, int i3) {
        return new ur7(str, i, i2, j, j2, (int) Math.rint(100.0d * d), i3);
    }

    /* renamed from: d */
    public static AssetPackState m36339d(Bundle bundle, String str, rs7 rs7, ir7 ir7) {
        int a = ir7.mo43902a(bundle.getInt(C4485a.m36484e("status", str)), str);
        int i = bundle.getInt(C4485a.m36484e("error_code", str));
        long j = bundle.getLong(C4485a.m36484e("bytes_downloaded", str));
        long j2 = bundle.getLong(C4485a.m36484e("total_bytes_to_download", str));
        double b = rs7.mo47476b(str);
        long j3 = bundle.getLong(C4485a.m36484e("pack_version", str));
        long j4 = bundle.getLong(C4485a.m36484e("pack_base_version", str));
        int i2 = 1;
        if (!(a != 4 || j4 == 0 || j4 == j3)) {
            i2 = 2;
        }
        return m36338b(str, a, i, j, j2, b, i2);
    }

    /* renamed from: a */
    public abstract int mo34139a();

    /* renamed from: c */
    public abstract long mo34140c();

    /* renamed from: e */
    public abstract int mo34141e();

    /* renamed from: f */
    public abstract String mo34142f();

    /* renamed from: g */
    public abstract int mo34143g();

    /* renamed from: h */
    public abstract long mo34144h();

    /* renamed from: i */
    public abstract int mo34145i();
}
