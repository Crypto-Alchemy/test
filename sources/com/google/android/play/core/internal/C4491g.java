package com.google.android.play.core.internal;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* renamed from: com.google.android.play.core.internal.g */
final class C4491g extends C4492h {

    /* renamed from: a */
    private final byte[] f24775a;

    public C4491g(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f24775a = bArr;
    }

    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.f24775a;
    }
}
