package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a */
    public static final byte[] f8916a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    public static final int[] f8917b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* renamed from: a */
        int mo12583a() throws IOException;

        /* renamed from: b */
        int mo12584b(byte[] bArr, int i) throws IOException;

        /* renamed from: c */
        short mo12585c() throws IOException;

        long skip(long j) throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$a */
    public static final class C1780a implements Reader {

        /* renamed from: a */
        public final ByteBuffer f8918a;

        public C1780a(ByteBuffer byteBuffer) {
            this.f8918a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo12583a() throws Reader.EndOfFileException {
            return (mo12585c() << 8) | mo12585c();
        }

        /* renamed from: b */
        public int mo12584b(byte[] bArr, int i) {
            int min = Math.min(i, this.f8918a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f8918a.get(bArr, 0, min);
            return min;
        }

        /* renamed from: c */
        public short mo12585c() throws Reader.EndOfFileException {
            if (this.f8918a.remaining() >= 1) {
                return (short) (this.f8918a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        public long skip(long j) {
            int min = (int) Math.min((long) this.f8918a.remaining(), j);
            ByteBuffer byteBuffer = this.f8918a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$b */
    public static final class C1781b {

        /* renamed from: a */
        public final ByteBuffer f8919a;

        public C1781b(byte[] bArr, int i) {
            this.f8919a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: a */
        public short mo12587a(int i) {
            if (mo12589c(i, 2)) {
                return this.f8919a.getShort(i);
            }
            return -1;
        }

        /* renamed from: b */
        public int mo12588b(int i) {
            if (mo12589c(i, 4)) {
                return this.f8919a.getInt(i);
            }
            return -1;
        }

        /* renamed from: c */
        public final boolean mo12589c(int i, int i2) {
            if (this.f8919a.remaining() - i >= i2) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public int mo12590d() {
            return this.f8919a.remaining();
        }

        /* renamed from: e */
        public void mo12591e(ByteOrder byteOrder) {
            this.f8919a.order(byteOrder);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$c */
    public static final class C1782c implements Reader {

        /* renamed from: a */
        public final InputStream f8920a;

        public C1782c(InputStream inputStream) {
            this.f8920a = inputStream;
        }

        /* renamed from: a */
        public int mo12583a() throws IOException {
            return (mo12585c() << 8) | mo12585c();
        }

        /* renamed from: b */
        public int mo12584b(byte[] bArr, int i) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f8920a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 != 0 || i3 != -1) {
                return i2;
            }
            throw new Reader.EndOfFileException();
        }

        /* renamed from: c */
        public short mo12585c() throws IOException {
            int read = this.f8920a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f8920a.skip(j2);
                if (skip <= 0) {
                    if (this.f8920a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    /* renamed from: e */
    public static int m12472e(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: h */
    public static boolean m12473h(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: k */
    public static int m12474k(C1781b bVar) {
        ByteOrder byteOrder;
        short a = bVar.mo12587a(6);
        if (a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a != 19789) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown endianness = ");
                sb.append(a);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.mo12591e(byteOrder);
        int b = bVar.mo12588b(10) + 6;
        short a2 = bVar.mo12587a(b);
        for (int i = 0; i < a2; i++) {
            int e = m12472e(b, i);
            short a3 = bVar.mo12587a(e);
            if (a3 == 274) {
                short a4 = bVar.mo12587a(e + 2);
                if (a4 >= 1 && a4 <= 12) {
                    int b2 = bVar.mo12588b(e + 4);
                    if (b2 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Got tagIndex=");
                            sb2.append(i);
                            sb2.append(" tagType=");
                            sb2.append(a3);
                            sb2.append(" formatCode=");
                            sb2.append(a4);
                            sb2.append(" componentCount=");
                            sb2.append(b2);
                        }
                        int i2 = b2 + f8917b[a4];
                        if (i2 <= 4) {
                            int i3 = e + 8;
                            if (i3 < 0 || i3 > bVar.mo12590d()) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Illegal tagValueOffset=");
                                    sb3.append(i3);
                                    sb3.append(" tagType=");
                                    sb3.append(a3);
                                }
                            } else if (i2 >= 0 && i2 + i3 <= bVar.mo12590d()) {
                                return bVar.mo12587a(i3);
                            } else {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("Illegal number of bytes for TI tag data tagType=");
                                    sb4.append(a3);
                                }
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Got byte count > 4, not orientation, continuing, formatCode=");
                            sb5.append(a4);
                        }
                    } else {
                        continue;
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Got invalid format code = ");
                    sb6.append(a4);
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public int mo12389a(InputStream inputStream, C2982oq oqVar) throws IOException {
        return mo12577f(new C1782c((InputStream) zt4.m31500d(inputStream)), (C2982oq) zt4.m31500d(oqVar));
    }

    /* renamed from: b */
    public ImageHeaderParser.ImageType mo12390b(ByteBuffer byteBuffer) throws IOException {
        return mo12578g(new C1780a((ByteBuffer) zt4.m31500d(byteBuffer)));
    }

    /* renamed from: c */
    public ImageHeaderParser.ImageType mo12391c(InputStream inputStream) throws IOException {
        return mo12578g(new C1782c((InputStream) zt4.m31500d(inputStream)));
    }

    /* renamed from: d */
    public int mo12392d(ByteBuffer byteBuffer, C2982oq oqVar) throws IOException {
        return mo12577f(new C1780a((ByteBuffer) zt4.m31500d(byteBuffer)), (C2982oq) zt4.m31500d(oqVar));
    }

    /* renamed from: f */
    public final int mo12577f(Reader reader, C2982oq oqVar) throws IOException {
        byte[] bArr;
        try {
            int a = reader.mo12583a();
            if (!m12473h(a)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parser doesn't handle magic number: ");
                    sb.append(a);
                }
                return -1;
            }
            int j = mo12580j(reader);
            if (j == -1) {
                return -1;
            }
            bArr = (byte[]) oqVar.mo24041c(j, byte[].class);
            int l = mo12581l(reader, bArr, j);
            oqVar.put(bArr);
            return l;
        } catch (Reader.EndOfFileException unused) {
            return -1;
        } catch (Throwable th) {
            oqVar.put(bArr);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bumptech.glide.load.ImageHeaderParser.ImageType mo12578g(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader r6) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r6.mo12583a()     // Catch:{ EndOfFileException -> 0x00b0 }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ EndOfFileException -> 0x00b0 }
            return r6
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r6.mo12585c()     // Catch:{ EndOfFileException -> 0x00b0 }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ EndOfFileException -> 0x00b0 }
            return r6
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r6.mo12585c()     // Catch:{ EndOfFileException -> 0x00b0 }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r6.skip(r0)     // Catch:{ EndOfFileException -> 0x00b0 }
            short r6 = r6.mo12585c()     // Catch:{ EndOfFileException -> 0x0039 }
            r0 = 3
            if (r6 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ EndOfFileException -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ EndOfFileException -> 0x0039 }
        L_0x0038:
            return r6
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ EndOfFileException -> 0x00b0 }
            return r6
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            if (r0 == r1) goto L_0x004d
            boolean r6 = r5.mo12582m(r6, r0)     // Catch:{ EndOfFileException -> 0x00b0 }
            if (r6 == 0) goto L_0x004a
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.AVIF     // Catch:{ EndOfFileException -> 0x00b0 }
            goto L_0x004c
        L_0x004a:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ EndOfFileException -> 0x00b0 }
        L_0x004c:
            return r6
        L_0x004d:
            r0 = 4
            r6.skip(r0)     // Catch:{ EndOfFileException -> 0x00b0 }
            int r2 = r6.mo12583a()     // Catch:{ EndOfFileException -> 0x00b0 }
            int r2 = r2 << 16
            int r3 = r6.mo12583a()     // Catch:{ EndOfFileException -> 0x00b0 }
            r2 = r2 | r3
            r3 = 1464156752(0x57454250, float:2.16888601E14)
            if (r2 == r3) goto L_0x0065
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ EndOfFileException -> 0x00b0 }
            return r6
        L_0x0065:
            int r2 = r6.mo12583a()     // Catch:{ EndOfFileException -> 0x00b0 }
            int r2 = r2 << 16
            int r3 = r6.mo12583a()     // Catch:{ EndOfFileException -> 0x00b0 }
            r2 = r2 | r3
            r3 = r2 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r3 == r4) goto L_0x007a
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ EndOfFileException -> 0x00b0 }
            return r6
        L_0x007a:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 88
            if (r2 != r3) goto L_0x0098
            r6.skip(r0)     // Catch:{ EndOfFileException -> 0x00b0 }
            short r6 = r6.mo12585c()     // Catch:{ EndOfFileException -> 0x00b0 }
            r0 = r6 & 2
            if (r0 == 0) goto L_0x008e
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.ANIMATED_WEBP     // Catch:{ EndOfFileException -> 0x00b0 }
            return r6
        L_0x008e:
            r6 = r6 & 16
            if (r6 == 0) goto L_0x0095
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ EndOfFileException -> 0x00b0 }
            return r6
        L_0x0095:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00b0 }
            return r6
        L_0x0098:
            r3 = 76
            if (r2 != r3) goto L_0x00ad
            r6.skip(r0)     // Catch:{ EndOfFileException -> 0x00b0 }
            short r6 = r6.mo12585c()     // Catch:{ EndOfFileException -> 0x00b0 }
            r6 = r6 & 8
            if (r6 == 0) goto L_0x00aa
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ EndOfFileException -> 0x00b0 }
            goto L_0x00ac
        L_0x00aa:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00b0 }
        L_0x00ac:
            return r6
        L_0x00ad:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00b0 }
            return r6
        L_0x00b0:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.mo12578g(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    /* renamed from: i */
    public final boolean mo12579i(byte[] bArr, int i) {
        boolean z;
        if (bArr == null || i <= f8916a.length) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f8916a;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    /* renamed from: j */
    public final int mo12580j(Reader reader) throws IOException {
        short c;
        int a;
        long j;
        long skip;
        do {
            short c2 = reader.mo12585c();
            if (c2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown segmentId=");
                    sb.append(c2);
                }
                return -1;
            }
            c = reader.mo12585c();
            if (c == 218 || c == 217) {
                return -1;
            }
            a = reader.mo12583a() - 2;
            if (c == 225) {
                return a;
            }
            j = (long) a;
            skip = reader.skip(j);
        } while (skip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to skip enough data, type: ");
            sb2.append(c);
            sb2.append(", wanted to skip: ");
            sb2.append(a);
            sb2.append(", but actually skipped: ");
            sb2.append(skip);
        }
        return -1;
    }

    /* renamed from: l */
    public final int mo12581l(Reader reader, byte[] bArr, int i) throws IOException {
        int b = reader.mo12584b(bArr, i);
        if (b != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to read exif segment data, length: ");
                sb.append(i);
                sb.append(", actually read: ");
                sb.append(b);
            }
            return -1;
        } else if (mo12579i(bArr, i)) {
            return m12474k(new C1781b(bArr, i));
        } else {
            return -1;
        }
    }

    /* renamed from: m */
    public final boolean mo12582m(Reader reader, int i) throws IOException {
        if (((reader.mo12583a() << 16) | reader.mo12583a()) != 1718909296) {
            return false;
        }
        int a = (reader.mo12583a() << 16) | reader.mo12583a();
        if (a == 1635150182 || a == 1635150195) {
            return true;
        }
        reader.skip(4);
        int i2 = i - 16;
        if (i2 % 4 != 0) {
            return false;
        }
        int i3 = 0;
        while (i3 < 5 && i2 > 0) {
            int a2 = (reader.mo12583a() << 16) | reader.mo12583a();
            if (a2 == 1635150182 || a2 == 1635150195) {
                return true;
            }
            i3++;
            i2 -= 4;
        }
        return false;
    }
}
