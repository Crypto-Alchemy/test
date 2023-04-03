package p000;

import java.io.IOException;
import java.io.InputStream;
import okhttp3.internal.http2.Http2;

/* renamed from: rw4 */
/* compiled from: ProgressiveJpegParser */
public class rw4 {

    /* renamed from: a */
    public int f17380a = 0;

    /* renamed from: b */
    public int f17381b = 0;

    /* renamed from: c */
    public int f17382c = 0;

    /* renamed from: d */
    public int f17383d = 0;

    /* renamed from: e */
    public int f17384e = 0;

    /* renamed from: f */
    public int f17385f = 0;

    /* renamed from: g */
    public boolean f17386g;

    /* renamed from: h */
    public final j60 f17387h;

    public rw4(j60 j60) {
        this.f17387h = (j60) au4.m10792g(j60);
    }

    /* renamed from: b */
    public static boolean m26446b(int i) {
        if (i == 1) {
            return false;
        }
        if (i < 208 || i > 215) {
            return (i == 217 || i == 216) ? false : true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo25553a(InputStream inputStream) {
        int read;
        int i = this.f17384e;
        while (this.f17380a != 6 && (read = inputStream.read()) != -1) {
            try {
                int i2 = this.f17382c + 1;
                this.f17382c = i2;
                if (this.f17386g) {
                    this.f17380a = 6;
                    this.f17386g = false;
                    return false;
                }
                int i3 = this.f17380a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    this.f17380a = 5;
                                } else if (i3 != 5) {
                                    au4.m10794i(false);
                                } else {
                                    int i4 = ((this.f17381b << 8) + read) - 2;
                                    ta6.m27664a(inputStream, (long) i4);
                                    this.f17382c += i4;
                                    this.f17380a = 2;
                                }
                            } else if (read == 255) {
                                this.f17380a = 3;
                            } else if (read == 0) {
                                this.f17380a = 2;
                            } else if (read == 217) {
                                this.f17386g = true;
                                mo25557f(i2 - 2);
                                this.f17380a = 2;
                            } else {
                                if (read == 218) {
                                    mo25557f(i2 - 2);
                                }
                                if (m26446b(read)) {
                                    this.f17380a = 4;
                                } else {
                                    this.f17380a = 2;
                                }
                            }
                        } else if (read == 255) {
                            this.f17380a = 3;
                        }
                    } else if (read == 216) {
                        this.f17380a = 2;
                    } else {
                        this.f17380a = 6;
                    }
                } else if (read == 255) {
                    this.f17380a = 1;
                } else {
                    this.f17380a = 6;
                }
                this.f17381b = read;
            } catch (IOException e) {
                pp6.m25127a(e);
            }
        }
        if (this.f17380a == 6 || this.f17384e == i) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public int mo25554c() {
        return this.f17385f;
    }

    /* renamed from: d */
    public int mo25555d() {
        return this.f17384e;
    }

    /* renamed from: e */
    public boolean mo25556e() {
        return this.f17386g;
    }

    /* renamed from: f */
    public final void mo25557f(int i) {
        int i2 = this.f17383d;
        if (i2 > 0) {
            this.f17385f = i;
        }
        this.f17383d = i2 + 1;
        this.f17384e = i2;
    }

    /* renamed from: g */
    public boolean mo25558g(gp1 gp1) {
        if (this.f17380a == 6 || gp1.mo20756q() <= this.f17382c) {
            return false;
        }
        ps4 ps4 = new ps4(gp1.mo20753m(), (byte[]) this.f17387h.get(Http2.INITIAL_MAX_FRAME_SIZE), this.f17387h);
        try {
            ta6.m27664a(ps4, (long) this.f17382c);
            return mo25553a(ps4);
        } catch (IOException e) {
            pp6.m25127a(e);
            return false;
        } finally {
            rh0.m26191b(ps4);
        }
    }
}
