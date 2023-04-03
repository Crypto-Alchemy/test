package com.facebook.imagepipeline.memory;

import java.io.IOException;

public class MemoryPooledByteBufferOutputStream extends ss4 {

    /* renamed from: a */
    public final C1947b f9628a;

    /* renamed from: d */
    public nh0<bt3> f9629d;

    /* renamed from: e */
    public int f9630e;

    public static class InvalidStreamException extends RuntimeException {
        public InvalidStreamException() {
            super("OutputStream no longer valid");
        }
    }

    public MemoryPooledByteBufferOutputStream(C1947b bVar) {
        this(bVar, bVar.mo13370C());
    }

    /* renamed from: b */
    public final void mo13355b() {
        if (!nh0.m23180p(this.f9629d)) {
            throw new InvalidStreamException();
        }
    }

    /* renamed from: c */
    public void mo13356c(int i) {
        mo13355b();
        au4.m10792g(this.f9629d);
        if (i > this.f9629d.mo23684j().getSize()) {
            bt3 bt3 = (bt3) this.f9628a.get(i);
            au4.m10792g(this.f9629d);
            this.f9629d.mo23684j().mo11800G(0, bt3, 0, this.f9630e);
            this.f9629d.close();
            this.f9629d = nh0.m23183y(bt3, this.f9628a);
        }
    }

    public void close() {
        nh0.m23178h(this.f9629d);
        this.f9629d = null;
        this.f9630e = -1;
        super.close();
    }

    /* renamed from: d */
    public dt3 mo13354a() {
        mo13355b();
        return new dt3((nh0) au4.m10792g(this.f9629d), this.f9630e);
    }

    public int size() {
        return this.f9630e;
    }

    public void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    public MemoryPooledByteBufferOutputStream(C1947b bVar, int i) {
        au4.m10787b(Boolean.valueOf(i > 0));
        C1947b bVar2 = (C1947b) au4.m10792g(bVar);
        this.f9628a = bVar2;
        this.f9630e = 0;
        this.f9629d = nh0.m23183y(bVar2.get(i), bVar2);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
        }
        mo13355b();
        mo13356c(this.f9630e + i2);
        ((bt3) ((nh0) au4.m10792g(this.f9629d)).mo23684j()).mo11799C(this.f9630e, bArr, i, i2);
        this.f9630e += i2;
    }
}
