package p000;

import java.io.IOException;

/* renamed from: iy1 */
/* compiled from: ExtractorInput */
public interface iy1 extends u11 {
    /* renamed from: a */
    int mo83a(int i) throws IOException;

    /* renamed from: c */
    boolean mo84c(byte[] bArr, int i, int i2, boolean z) throws IOException;

    /* renamed from: e */
    void mo85e();

    /* renamed from: f */
    boolean mo86f(byte[] bArr, int i, int i2, boolean z) throws IOException;

    long getLength();

    long getPosition();

    /* renamed from: h */
    long mo89h();

    /* renamed from: i */
    void mo90i(int i) throws IOException;

    /* renamed from: j */
    int mo91j(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: k */
    void mo92k(int i) throws IOException;

    /* renamed from: l */
    boolean mo93l(int i, boolean z) throws IOException;

    /* renamed from: n */
    void mo94n(byte[] bArr, int i, int i2) throws IOException;

    int read(byte[] bArr, int i, int i2) throws IOException;

    void readFully(byte[] bArr, int i, int i2) throws IOException;
}
