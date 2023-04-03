package p000;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import java.io.IOException;
import java.net.URLDecoder;

/* renamed from: v11 */
/* compiled from: DataSchemeDataSource */
public final class v11 extends C3009oy {

    /* renamed from: e */
    public d21 f18638e;

    /* renamed from: f */
    public byte[] f18639f;

    /* renamed from: g */
    public int f18640g;

    /* renamed from: h */
    public int f18641h;

    public v11() {
        super(false);
    }

    /* renamed from: b */
    public long mo6964b(d21 d21) throws IOException {
        mo24281q(d21);
        this.f18638e = d21;
        Uri uri = d21.f10437a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        C2725kr.m20982b(equals, "Unsupported scheme: " + scheme);
        String[] L0 = w67.m29317L0(uri.getSchemeSpecificPart(), ",");
        if (L0.length == 2) {
            String str = L0[1];
            if (L0[0].contains(";base64")) {
                try {
                    this.f18639f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw ParserException.createForMalformedDataOfUnknownType("Error while parsing Base64 encoded string: " + str, e);
                }
            } else {
                this.f18639f = w67.m29361j0(URLDecoder.decode(str, be0.f21261a.name()));
            }
            long j = d21.f10443g;
            byte[] bArr = this.f18639f;
            if (j <= ((long) bArr.length)) {
                int i = (int) j;
                this.f18640g = i;
                int length = bArr.length - i;
                this.f18641h = length;
                long j2 = d21.f10444h;
                if (j2 != -1) {
                    this.f18641h = (int) Math.min((long) length, j2);
                }
                mo24282r(d21);
                long j3 = d21.f10444h;
                if (j3 != -1) {
                    return j3;
                }
                return (long) this.f18641h;
            }
            this.f18639f = null;
            throw new DataSourceException(2008);
        }
        throw ParserException.createForMalformedDataOfUnknownType("Unexpected URI format: " + uri, (Throwable) null);
    }

    public void close() {
        if (this.f18639f != null) {
            this.f18639f = null;
            mo24280p();
        }
        this.f18638e = null;
    }

    /* renamed from: m */
    public Uri mo6966m() {
        d21 d21 = this.f18638e;
        if (d21 != null) {
            return d21.f10437a;
        }
        return null;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f18641h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(w67.m29360j(this.f18639f), this.f18640g, bArr, i, min);
        this.f18640g += min;
        this.f18641h -= min;
        mo24279o(min);
        return min;
    }
}
