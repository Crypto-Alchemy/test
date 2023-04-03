package p000;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* renamed from: cv1 */
/* compiled from: ExifInterface */
public class cv1 {

    /* renamed from: A */
    public static final int[] f10297A = {4};

    /* renamed from: B */
    public static final int[] f10298B = {8};

    /* renamed from: C */
    public static final byte[] f10299C = {-1, -40, -1};

    /* renamed from: D */
    public static final byte[] f10300D = {102, 116, 121, 112};

    /* renamed from: E */
    public static final byte[] f10301E = {109, 105, 102, 49};

    /* renamed from: F */
    public static final byte[] f10302F = {104, 101, 105, 99};

    /* renamed from: G */
    public static final byte[] f10303G = {79, 76, 89, 77, 80, 0};

    /* renamed from: H */
    public static final byte[] f10304H = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: I */
    public static final byte[] f10305I = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: J */
    public static final byte[] f10306J = {101, 88, 73, 102};

    /* renamed from: K */
    public static final byte[] f10307K = {73, 72, 68, 82};

    /* renamed from: L */
    public static final byte[] f10308L = {73, 69, 78, 68};

    /* renamed from: M */
    public static final byte[] f10309M = {82, 73, 70, 70};

    /* renamed from: N */
    public static final byte[] f10310N = {87, 69, 66, 80};

    /* renamed from: O */
    public static final byte[] f10311O = {69, 88, 73, 70};

    /* renamed from: P */
    public static final byte[] f10312P = {-99, 1, 42};

    /* renamed from: Q */
    public static final byte[] f10313Q = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: R */
    public static final byte[] f10314R = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: S */
    public static final byte[] f10315S = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: T */
    public static final byte[] f10316T = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: U */
    public static final byte[] f10317U = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: V */
    public static final byte[] f10318V = "XMP ".getBytes(Charset.defaultCharset());

    /* renamed from: W */
    public static SimpleDateFormat f10319W;

    /* renamed from: X */
    public static final String[] f10320X = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: Y */
    public static final int[] f10321Y = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: Z */
    public static final byte[] f10322Z = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: a0 */
    public static final C2123d[] f10323a0;

    /* renamed from: b0 */
    public static final C2123d[] f10324b0;

    /* renamed from: c0 */
    public static final C2123d[] f10325c0;

    /* renamed from: d0 */
    public static final C2123d[] f10326d0;

    /* renamed from: e0 */
    public static final C2123d[] f10327e0;

    /* renamed from: f0 */
    public static final C2123d f10328f0 = new C2123d("StripOffsets", 273, 3);

    /* renamed from: g0 */
    public static final C2123d[] f10329g0;

    /* renamed from: h0 */
    public static final C2123d[] f10330h0;

    /* renamed from: i0 */
    public static final C2123d[] f10331i0;

    /* renamed from: j0 */
    public static final C2123d[] f10332j0;

    /* renamed from: k0 */
    public static final C2123d[][] f10333k0;

    /* renamed from: l0 */
    public static final C2123d[] f10334l0 = {new C2123d("SubIFDPointer", 330, 4), new C2123d("ExifIFDPointer", 34665, 4), new C2123d("GPSInfoIFDPointer", 34853, 4), new C2123d("InteroperabilityIFDPointer", 40965, 4), new C2123d("CameraSettingsIFDPointer", 8224, 1), new C2123d("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: m0 */
    public static final C2123d f10335m0 = new C2123d("JPEGInterchangeFormat", 513, 4);

    /* renamed from: n0 */
    public static final C2123d f10336n0 = new C2123d("JPEGInterchangeFormatLength", 514, 4);

    /* renamed from: o0 */
    public static final HashMap<Integer, C2123d>[] f10337o0;

    /* renamed from: p0 */
    public static final HashMap<String, C2123d>[] f10338p0;

    /* renamed from: q0 */
    public static final HashSet<String> f10339q0 = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));

    /* renamed from: r0 */
    public static final HashMap<Integer, Integer> f10340r0 = new HashMap<>();

    /* renamed from: s0 */
    public static final Charset f10341s0;

    /* renamed from: t0 */
    public static final byte[] f10342t0;

    /* renamed from: u0 */
    public static final byte[] f10343u0;

    /* renamed from: v0 */
    public static final Pattern f10344v0 = Pattern.compile(".*[1-9].*");

    /* renamed from: w */
    public static final boolean f10345w = Log.isLoggable("ExifInterface", 3);

    /* renamed from: w0 */
    public static final Pattern f10346w0 = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");

    /* renamed from: x */
    public static final List<Integer> f10347x = Arrays.asList(new Integer[]{1, 6, 3, 8});

    /* renamed from: y */
    public static final List<Integer> f10348y = Arrays.asList(new Integer[]{2, 7, 4, 5});

    /* renamed from: z */
    public static final int[] f10349z = {8, 8, 8};

    /* renamed from: a */
    public String f10350a;

    /* renamed from: b */
    public FileDescriptor f10351b;

    /* renamed from: c */
    public AssetManager.AssetInputStream f10352c;

    /* renamed from: d */
    public int f10353d;

    /* renamed from: e */
    public boolean f10354e;

    /* renamed from: f */
    public final HashMap<String, C2122c>[] f10355f;

    /* renamed from: g */
    public Set<Integer> f10356g;

    /* renamed from: h */
    public ByteOrder f10357h;

    /* renamed from: i */
    public boolean f10358i;

    /* renamed from: j */
    public boolean f10359j;

    /* renamed from: k */
    public boolean f10360k;

    /* renamed from: l */
    public int f10361l;

    /* renamed from: m */
    public int f10362m;

    /* renamed from: n */
    public byte[] f10363n;

    /* renamed from: o */
    public int f10364o;

    /* renamed from: p */
    public int f10365p;

    /* renamed from: q */
    public int f10366q;

    /* renamed from: r */
    public int f10367r;

    /* renamed from: s */
    public int f10368s;

    /* renamed from: t */
    public int f10369t;

    /* renamed from: u */
    public boolean f10370u;

    /* renamed from: v */
    public boolean f10371v;

    /* renamed from: cv1$a */
    /* compiled from: ExifInterface */
    public class C2120a extends MediaDataSource {

        /* renamed from: a */
        public long f10372a;

        /* renamed from: d */
        public final /* synthetic */ C2121b f10373d;

        public C2120a(C2121b bVar) {
            this.f10373d = bVar;
        }

        public void close() throws IOException {
        }

        public long getSize() throws IOException {
            return -1;
        }

        public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f10372a;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + ((long) this.f10373d.available())) {
                        return -1;
                    }
                    this.f10373d.mo18335d(j);
                    this.f10372a = j;
                }
                if (i2 > this.f10373d.available()) {
                    i2 = this.f10373d.available();
                }
                int read = this.f10373d.read(bArr, i, i2);
                if (read >= 0) {
                    this.f10372a += (long) read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f10372a = -1;
            return -1;
        }
    }

    /* renamed from: cv1$b */
    /* compiled from: ExifInterface */
    public static class C2121b extends InputStream implements DataInput {

        /* renamed from: k */
        public static final ByteOrder f10375k = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: r */
        public static final ByteOrder f10376r = ByteOrder.BIG_ENDIAN;

        /* renamed from: a */
        public DataInputStream f10377a;

        /* renamed from: d */
        public ByteOrder f10378d;

        /* renamed from: e */
        public final int f10379e;

        /* renamed from: g */
        public int f10380g;

        public C2121b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo18331a() {
            return this.f10379e;
        }

        public int available() throws IOException {
            return this.f10377a.available();
        }

        /* renamed from: b */
        public int mo18333b() {
            return this.f10380g;
        }

        /* renamed from: c */
        public long mo18334c() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        /* renamed from: d */
        public void mo18335d(long j) throws IOException {
            int i = this.f10380g;
            if (((long) i) > j) {
                this.f10380g = 0;
                this.f10377a.reset();
                this.f10377a.mark(this.f10379e);
            } else {
                j -= (long) i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        /* renamed from: e */
        public void mo18336e(ByteOrder byteOrder) {
            this.f10378d = byteOrder;
        }

        public int read() throws IOException {
            this.f10380g++;
            return this.f10377a.read();
        }

        public boolean readBoolean() throws IOException {
            this.f10380g++;
            return this.f10377a.readBoolean();
        }

        public byte readByte() throws IOException {
            int i = this.f10380g + 1;
            this.f10380g = i;
            if (i <= this.f10379e) {
                int read = this.f10377a.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public char readChar() throws IOException {
            this.f10380g += 2;
            return this.f10377a.readChar();
        }

        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f10380g + i2;
            this.f10380g = i3;
            if (i3 > this.f10379e) {
                throw new EOFException();
            } else if (this.f10377a.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public int readInt() throws IOException {
            int i = this.f10380g + 4;
            this.f10380g = i;
            if (i <= this.f10379e) {
                int read = this.f10377a.read();
                int read2 = this.f10377a.read();
                int read3 = this.f10377a.read();
                int read4 = this.f10377a.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f10378d;
                    if (byteOrder == f10375k) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f10376r) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f10378d);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readLine() throws IOException {
            return null;
        }

        public long readLong() throws IOException {
            int i = this.f10380g + 8;
            this.f10380g = i;
            if (i <= this.f10379e) {
                int read = this.f10377a.read();
                int read2 = this.f10377a.read();
                int read3 = this.f10377a.read();
                int read4 = this.f10377a.read();
                int read5 = this.f10377a.read();
                int read6 = this.f10377a.read();
                int read7 = this.f10377a.read();
                int read8 = this.f10377a.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f10378d;
                    if (byteOrder == f10375k) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    int i2 = read2;
                    if (byteOrder == f10376r) {
                        return (((long) read) << 56) + (((long) i2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    throw new IOException("Invalid byte order: " + this.f10378d);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public short readShort() throws IOException {
            int i = this.f10380g + 2;
            this.f10380g = i;
            if (i <= this.f10379e) {
                int read = this.f10377a.read();
                int read2 = this.f10377a.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f10378d;
                    if (byteOrder == f10375k) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f10376r) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.f10378d);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readUTF() throws IOException {
            this.f10380g += 2;
            return this.f10377a.readUTF();
        }

        public int readUnsignedByte() throws IOException {
            this.f10380g++;
            return this.f10377a.readUnsignedByte();
        }

        public int readUnsignedShort() throws IOException {
            int i = this.f10380g + 2;
            this.f10380g = i;
            if (i <= this.f10379e) {
                int read = this.f10377a.read();
                int read2 = this.f10377a.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f10378d;
                    if (byteOrder == f10375k) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f10376r) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f10378d);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public int skipBytes(int i) throws IOException {
            int min = Math.min(i, this.f10379e - this.f10380g);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.f10377a.skipBytes(min - i2);
            }
            this.f10380g += i2;
            return i2;
        }

        public C2121b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f10378d = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f10377a = dataInputStream;
            int available = dataInputStream.available();
            this.f10379e = available;
            this.f10380g = 0;
            this.f10377a.mark(available);
            this.f10378d = byteOrder;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.f10377a.read(bArr, i, i2);
            this.f10380g += read;
            return read;
        }

        public void readFully(byte[] bArr) throws IOException {
            int length = this.f10380g + bArr.length;
            this.f10380g = length;
            if (length > this.f10379e) {
                throw new EOFException();
            } else if (this.f10377a.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public C2121b(byte[] bArr) throws IOException {
            this((InputStream) new ByteArrayInputStream(bArr));
        }
    }

    /* renamed from: cv1$c */
    /* compiled from: ExifInterface */
    public static class C2122c {

        /* renamed from: a */
        public final int f10381a;

        /* renamed from: b */
        public final int f10382b;

        /* renamed from: c */
        public final long f10383c;

        /* renamed from: d */
        public final byte[] f10384d;

        public C2122c(int i, int i2, byte[] bArr) {
            this(i, i2, -1, bArr);
        }

        /* renamed from: a */
        public static C2122c m14572a(String str) {
            byte[] bytes = (str + 0).getBytes(cv1.f10341s0);
            return new C2122c(2, bytes.length, bytes);
        }

        /* renamed from: b */
        public static C2122c m14573b(long j, ByteOrder byteOrder) {
            return m14574c(new long[]{j}, byteOrder);
        }

        /* renamed from: c */
        public static C2122c m14574c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(cv1.f10321Y[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new C2122c(4, jArr.length, wrap.array());
        }

        /* renamed from: d */
        public static C2122c m14575d(C2124e eVar, ByteOrder byteOrder) {
            return m14576e(new C2124e[]{eVar}, byteOrder);
        }

        /* renamed from: e */
        public static C2122c m14576e(C2124e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(cv1.f10321Y[5] * eVarArr.length)]);
            wrap.order(byteOrder);
            for (C2124e eVar : eVarArr) {
                wrap.putInt((int) eVar.f10389a);
                wrap.putInt((int) eVar.f10390b);
            }
            return new C2122c(5, eVarArr.length, wrap.array());
        }

        /* renamed from: f */
        public static C2122c m14577f(int i, ByteOrder byteOrder) {
            return m14578g(new int[]{i}, byteOrder);
        }

        /* renamed from: g */
        public static C2122c m14578g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(cv1.f10321Y[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new C2122c(3, iArr.length, wrap.array());
        }

        /* renamed from: h */
        public double mo18354h(ByteOrder byteOrder) {
            Object k = mo18357k(byteOrder);
            if (k == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (k instanceof String) {
                return Double.parseDouble((String) k);
            } else {
                if (k instanceof long[]) {
                    long[] jArr = (long[]) k;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof int[]) {
                    int[] iArr = (int[]) k;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof double[]) {
                    double[] dArr = (double[]) k;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof C2124e[]) {
                    C2124e[] eVarArr = (C2124e[]) k;
                    if (eVarArr.length == 1) {
                        return eVarArr[0].mo18360a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        /* renamed from: i */
        public int mo18355i(ByteOrder byteOrder) {
            Object k = mo18357k(byteOrder);
            if (k == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (k instanceof String) {
                return Integer.parseInt((String) k);
            } else {
                if (k instanceof long[]) {
                    long[] jArr = (long[]) k;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (k instanceof int[]) {
                    int[] iArr = (int[]) k;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        /* renamed from: j */
        public String mo18356j(ByteOrder byteOrder) {
            Object k = mo18357k(byteOrder);
            if (k == null) {
                return null;
            }
            if (k instanceof String) {
                return (String) k;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (k instanceof long[]) {
                long[] jArr = (long[]) k;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k instanceof int[]) {
                int[] iArr = (int[]) k;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (k instanceof double[]) {
                double[] dArr = (double[]) k;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(k instanceof C2124e[])) {
                return null;
            } else {
                C2124e[] eVarArr = (C2124e[]) k;
                while (i < eVarArr.length) {
                    sb.append(eVarArr[i].f10389a);
                    sb.append('/');
                    sb.append(eVarArr[i].f10390b);
                    i++;
                    if (i != eVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:139:0x0147 A[SYNTHETIC, Splitter:B:139:0x0147] */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x014e A[SYNTHETIC, Splitter:B:147:0x014e] */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo18357k(java.nio.ByteOrder r9) {
            /*
                r8 = this;
                r0 = 0
                cv1$b r1 = new cv1$b     // Catch:{ IOException -> 0x014b, all -> 0x0144 }
                byte[] r2 = r8.f10384d     // Catch:{ IOException -> 0x014b, all -> 0x0144 }
                r1.<init>((byte[]) r2)     // Catch:{ IOException -> 0x014b, all -> 0x0144 }
                r1.mo18336e(r9)     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r9 = r8.f10381a     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r2 = 0
                r3 = 1
                switch(r9) {
                    case 1: goto L_0x0117;
                    case 2: goto L_0x00d1;
                    case 3: goto L_0x00bc;
                    case 4: goto L_0x00a7;
                    case 5: goto L_0x0089;
                    case 6: goto L_0x0117;
                    case 7: goto L_0x00d1;
                    case 8: goto L_0x0074;
                    case 9: goto L_0x005f;
                    case 10: goto L_0x003f;
                    case 11: goto L_0x0029;
                    case 12: goto L_0x0014;
                    default: goto L_0x0012;
                }     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x0012:
                goto L_0x013d
            L_0x0014:
                int r9 = r8.f10382b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                double[] r9 = new double[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x0018:
                int r3 = r8.f10382b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x0025
                double r3 = r1.readDouble()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9[r2] = r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r2 = r2 + 1
                goto L_0x0018
            L_0x0025:
                r1.close()     // Catch:{ IOException -> 0x0028 }
            L_0x0028:
                return r9
            L_0x0029:
                int r9 = r8.f10382b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                double[] r9 = new double[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x002d:
                int r3 = r8.f10382b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x003b
                float r3 = r1.readFloat()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                double r3 = (double) r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9[r2] = r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r2 = r2 + 1
                goto L_0x002d
            L_0x003b:
                r1.close()     // Catch:{ IOException -> 0x003e }
            L_0x003e:
                return r9
            L_0x003f:
                int r9 = r8.f10382b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                cv1$e[] r9 = new p000.cv1.C2124e[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x0043:
                int r3 = r8.f10382b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x005b
                int r3 = r1.readInt()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                long r3 = (long) r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r5 = r1.readInt()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                long r5 = (long) r5     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                cv1$e r7 = new cv1$e     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r7.<init>(r3, r5)     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9[r2] = r7     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r2 = r2 + 1
                goto L_0x0043
            L_0x005b:
                r1.close()     // Catch:{ IOException -> 0x005e }
            L_0x005e:
                return r9
            L_0x005f:
                int r9 = r8.f10382b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int[] r9 = new int[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x0063:
                int r3 = r8.f10382b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x0070
                int r3 = r1.readInt()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9[r2] = r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r2 = r2 + 1
                goto L_0x0063
            L_0x0070:
                r1.close()     // Catch:{ IOException -> 0x0073 }
            L_0x0073:
                return r9
            L_0x0074:
                int r9 = r8.f10382b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int[] r9 = new int[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x0078:
                int r3 = r8.f10382b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x0085
                short r3 = r1.readShort()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9[r2] = r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r2 = r2 + 1
                goto L_0x0078
            L_0x0085:
                r1.close()     // Catch:{ IOException -> 0x0088 }
            L_0x0088:
                return r9
            L_0x0089:
                int r9 = r8.f10382b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                cv1$e[] r9 = new p000.cv1.C2124e[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x008d:
                int r3 = r8.f10382b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x00a3
                long r3 = r1.mo18334c()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                long r5 = r1.mo18334c()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                cv1$e r7 = new cv1$e     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r7.<init>(r3, r5)     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9[r2] = r7     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r2 = r2 + 1
                goto L_0x008d
            L_0x00a3:
                r1.close()     // Catch:{ IOException -> 0x00a6 }
            L_0x00a6:
                return r9
            L_0x00a7:
                int r9 = r8.f10382b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                long[] r9 = new long[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x00ab:
                int r3 = r8.f10382b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x00b8
                long r3 = r1.mo18334c()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9[r2] = r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r2 = r2 + 1
                goto L_0x00ab
            L_0x00b8:
                r1.close()     // Catch:{ IOException -> 0x00bb }
            L_0x00bb:
                return r9
            L_0x00bc:
                int r9 = r8.f10382b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int[] r9 = new int[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x00c0:
                int r3 = r8.f10382b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x00cd
                int r3 = r1.readUnsignedShort()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9[r2] = r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r2 = r2 + 1
                goto L_0x00c0
            L_0x00cd:
                r1.close()     // Catch:{ IOException -> 0x00d0 }
            L_0x00d0:
                return r9
            L_0x00d1:
                int r9 = r8.f10382b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                byte[] r4 = p000.cv1.f10322Z     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r4 = r4.length     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r9 < r4) goto L_0x00ee
                r9 = r2
            L_0x00d9:
                byte[] r4 = p000.cv1.f10322Z     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r5 = r4.length     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r9 >= r5) goto L_0x00eb
                byte[] r5 = r8.f10384d     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                byte r5 = r5[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                byte r6 = r4[r9]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r5 == r6) goto L_0x00e8
                r3 = r2
                goto L_0x00eb
            L_0x00e8:
                int r9 = r9 + 1
                goto L_0x00d9
            L_0x00eb:
                if (r3 == 0) goto L_0x00ee
                int r2 = r4.length     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x00ee:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9.<init>()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x00f3:
                int r3 = r8.f10382b     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r2 >= r3) goto L_0x010f
                byte[] r3 = r8.f10384d     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                byte r3 = r3[r2]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r3 != 0) goto L_0x00fe
                goto L_0x010f
            L_0x00fe:
                r4 = 32
                if (r3 < r4) goto L_0x0107
                char r3 = (char) r3     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9.append(r3)     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                goto L_0x010c
            L_0x0107:
                r3 = 63
                r9.append(r3)     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
            L_0x010c:
                int r2 = r2 + 1
                goto L_0x00f3
            L_0x010f:
                java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r1.close()     // Catch:{ IOException -> 0x0116 }
            L_0x0116:
                return r9
            L_0x0117:
                byte[] r9 = r8.f10384d     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r4 = r9.length     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r4 != r3) goto L_0x0132
                byte r4 = r9[r2]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                if (r4 < 0) goto L_0x0132
                if (r4 > r3) goto L_0x0132
                java.lang.String r9 = new java.lang.String     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                char[] r3 = new char[r3]     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                int r4 = r4 + 48
                char r4 = (char) r4     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r3[r2] = r4     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r9.<init>(r3)     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r1.close()     // Catch:{ IOException -> 0x0131 }
            L_0x0131:
                return r9
            L_0x0132:
                java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                java.nio.charset.Charset r3 = p000.cv1.f10341s0     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r2.<init>(r9, r3)     // Catch:{ IOException -> 0x014c, all -> 0x0141 }
                r1.close()     // Catch:{ IOException -> 0x013c }
            L_0x013c:
                return r2
            L_0x013d:
                r1.close()     // Catch:{ IOException -> 0x0140 }
            L_0x0140:
                return r0
            L_0x0141:
                r9 = move-exception
                r0 = r1
                goto L_0x0145
            L_0x0144:
                r9 = move-exception
            L_0x0145:
                if (r0 == 0) goto L_0x014a
                r0.close()     // Catch:{ IOException -> 0x014a }
            L_0x014a:
                throw r9
            L_0x014b:
                r1 = r0
            L_0x014c:
                if (r1 == 0) goto L_0x0151
                r1.close()     // Catch:{ IOException -> 0x0151 }
            L_0x0151:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.cv1.C2122c.mo18357k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + cv1.f10320X[this.f10381a] + ", data length:" + this.f10384d.length + ")";
        }

        public C2122c(int i, int i2, long j, byte[] bArr) {
            this.f10381a = i;
            this.f10382b = i2;
            this.f10383c = j;
            this.f10384d = bArr;
        }
    }

    /* renamed from: cv1$e */
    /* compiled from: ExifInterface */
    public static class C2124e {

        /* renamed from: a */
        public final long f10389a;

        /* renamed from: b */
        public final long f10390b;

        public C2124e(long j, long j2) {
            if (j2 == 0) {
                this.f10389a = 0;
                this.f10390b = 1;
                return;
            }
            this.f10389a = j;
            this.f10390b = j2;
        }

        /* renamed from: a */
        public double mo18360a() {
            return ((double) this.f10389a) / ((double) this.f10390b);
        }

        public String toString() {
            return this.f10389a + "/" + this.f10390b;
        }
    }

    static {
        C2123d[] dVarArr = {new C2123d("NewSubfileType", 254, 4), new C2123d("SubfileType", 255, 4), new C2123d("ImageWidth", 256, 3, 4), new C2123d("ImageLength", 257, 3, 4), new C2123d("BitsPerSample", 258, 3), new C2123d("Compression", 259, 3), new C2123d("PhotometricInterpretation", 262, 3), new C2123d("ImageDescription", 270, 2), new C2123d("Make", 271, 2), new C2123d("Model", 272, 2), new C2123d("StripOffsets", 273, 3, 4), new C2123d("Orientation", 274, 3), new C2123d("SamplesPerPixel", 277, 3), new C2123d("RowsPerStrip", 278, 3, 4), new C2123d("StripByteCounts", 279, 3, 4), new C2123d("XResolution", 282, 5), new C2123d("YResolution", 283, 5), new C2123d("PlanarConfiguration", 284, 3), new C2123d("ResolutionUnit", 296, 3), new C2123d("TransferFunction", 301, 3), new C2123d("Software", 305, 2), new C2123d("DateTime", 306, 2), new C2123d("Artist", 315, 2), new C2123d("WhitePoint", 318, 5), new C2123d("PrimaryChromaticities", 319, 5), new C2123d("SubIFDPointer", 330, 4), new C2123d("JPEGInterchangeFormat", 513, 4), new C2123d("JPEGInterchangeFormatLength", 514, 4), new C2123d("YCbCrCoefficients", 529, 5), new C2123d("YCbCrSubSampling", 530, 3), new C2123d("YCbCrPositioning", 531, 3), new C2123d("ReferenceBlackWhite", 532, 5), new C2123d("Copyright", 33432, 2), new C2123d("ExifIFDPointer", 34665, 4), new C2123d("GPSInfoIFDPointer", 34853, 4), new C2123d("SensorTopBorder", 4, 4), new C2123d("SensorLeftBorder", 5, 4), new C2123d("SensorBottomBorder", 6, 4), new C2123d("SensorRightBorder", 7, 4), new C2123d("ISO", 23, 3), new C2123d("JpgFromRaw", 46, 7), new C2123d("Xmp", 700, 1)};
        f10323a0 = dVarArr;
        C2123d[] dVarArr2 = {new C2123d("ExposureTime", 33434, 5), new C2123d("FNumber", 33437, 5), new C2123d("ExposureProgram", 34850, 3), new C2123d("SpectralSensitivity", 34852, 2), new C2123d("PhotographicSensitivity", 34855, 3), new C2123d("OECF", 34856, 7), new C2123d("SensitivityType", 34864, 3), new C2123d("StandardOutputSensitivity", 34865, 4), new C2123d("RecommendedExposureIndex", 34866, 4), new C2123d("ISOSpeed", 34867, 4), new C2123d("ISOSpeedLatitudeyyy", 34868, 4), new C2123d("ISOSpeedLatitudezzz", 34869, 4), new C2123d("ExifVersion", 36864, 2), new C2123d("DateTimeOriginal", 36867, 2), new C2123d("DateTimeDigitized", 36868, 2), new C2123d("OffsetTime", 36880, 2), new C2123d("OffsetTimeOriginal", 36881, 2), new C2123d("OffsetTimeDigitized", 36882, 2), new C2123d("ComponentsConfiguration", 37121, 7), new C2123d("CompressedBitsPerPixel", 37122, 5), new C2123d("ShutterSpeedValue", 37377, 10), new C2123d("ApertureValue", 37378, 5), new C2123d("BrightnessValue", 37379, 10), new C2123d("ExposureBiasValue", 37380, 10), new C2123d("MaxApertureValue", 37381, 5), new C2123d("SubjectDistance", 37382, 5), new C2123d("MeteringMode", 37383, 3), new C2123d("LightSource", 37384, 3), new C2123d("Flash", 37385, 3), new C2123d("FocalLength", 37386, 5), new C2123d("SubjectArea", 37396, 3), new C2123d("MakerNote", 37500, 7), new C2123d("UserComment", 37510, 7), new C2123d("SubSecTime", 37520, 2), new C2123d("SubSecTimeOriginal", 37521, 2), new C2123d("SubSecTimeDigitized", 37522, 2), new C2123d("FlashpixVersion", 40960, 7), new C2123d("ColorSpace", 40961, 3), new C2123d("PixelXDimension", 40962, 3, 4), new C2123d("PixelYDimension", 40963, 3, 4), new C2123d("RelatedSoundFile", 40964, 2), new C2123d("InteroperabilityIFDPointer", 40965, 4), new C2123d("FlashEnergy", 41483, 5), new C2123d("SpatialFrequencyResponse", 41484, 7), new C2123d("FocalPlaneXResolution", 41486, 5), new C2123d("FocalPlaneYResolution", 41487, 5), new C2123d("FocalPlaneResolutionUnit", 41488, 3), new C2123d("SubjectLocation", 41492, 3), new C2123d("ExposureIndex", 41493, 5), new C2123d("SensingMethod", 41495, 3), new C2123d("FileSource", 41728, 7), new C2123d("SceneType", 41729, 7), new C2123d("CFAPattern", 41730, 7), new C2123d("CustomRendered", 41985, 3), new C2123d("ExposureMode", 41986, 3), new C2123d("WhiteBalance", 41987, 3), new C2123d("DigitalZoomRatio", 41988, 5), new C2123d("FocalLengthIn35mmFilm", 41989, 3), new C2123d("SceneCaptureType", 41990, 3), new C2123d("GainControl", 41991, 3), new C2123d("Contrast", 41992, 3), new C2123d("Saturation", 41993, 3), new C2123d("Sharpness", 41994, 3), new C2123d("DeviceSettingDescription", 41995, 7), new C2123d("SubjectDistanceRange", 41996, 3), new C2123d("ImageUniqueID", 42016, 2), new C2123d("CameraOwnerName", 42032, 2), new C2123d("BodySerialNumber", 42033, 2), new C2123d("LensSpecification", 42034, 5), new C2123d("LensMake", 42035, 2), new C2123d("LensModel", 42036, 2), new C2123d("Gamma", 42240, 5), new C2123d("DNGVersion", 50706, 1), new C2123d("DefaultCropSize", 50720, 3, 4)};
        f10324b0 = dVarArr2;
        C2123d[] dVarArr3 = {new C2123d("GPSVersionID", 0, 1), new C2123d("GPSLatitudeRef", 1, 2), new C2123d("GPSLatitude", 2, 5), new C2123d("GPSLongitudeRef", 3, 2), new C2123d("GPSLongitude", 4, 5), new C2123d("GPSAltitudeRef", 5, 1), new C2123d("GPSAltitude", 6, 5), new C2123d("GPSTimeStamp", 7, 5), new C2123d("GPSSatellites", 8, 2), new C2123d("GPSStatus", 9, 2), new C2123d("GPSMeasureMode", 10, 2), new C2123d("GPSDOP", 11, 5), new C2123d("GPSSpeedRef", 12, 2), new C2123d("GPSSpeed", 13, 5), new C2123d("GPSTrackRef", 14, 2), new C2123d("GPSTrack", 15, 5), new C2123d("GPSImgDirectionRef", 16, 2), new C2123d("GPSImgDirection", 17, 5), new C2123d("GPSMapDatum", 18, 2), new C2123d("GPSDestLatitudeRef", 19, 2), new C2123d("GPSDestLatitude", 20, 5), new C2123d("GPSDestLongitudeRef", 21, 2), new C2123d("GPSDestLongitude", 22, 5), new C2123d("GPSDestBearingRef", 23, 2), new C2123d("GPSDestBearing", 24, 5), new C2123d("GPSDestDistanceRef", 25, 2), new C2123d("GPSDestDistance", 26, 5), new C2123d("GPSProcessingMethod", 27, 7), new C2123d("GPSAreaInformation", 28, 7), new C2123d("GPSDateStamp", 29, 2), new C2123d("GPSDifferential", 30, 3), new C2123d("GPSHPositioningError", 31, 5)};
        f10325c0 = dVarArr3;
        C2123d[] dVarArr4 = {new C2123d("InteroperabilityIndex", 1, 2)};
        f10326d0 = dVarArr4;
        C2123d[] dVarArr5 = {new C2123d("NewSubfileType", 254, 4), new C2123d("SubfileType", 255, 4), new C2123d("ThumbnailImageWidth", 256, 3, 4), new C2123d("ThumbnailImageLength", 257, 3, 4), new C2123d("BitsPerSample", 258, 3), new C2123d("Compression", 259, 3), new C2123d("PhotometricInterpretation", 262, 3), new C2123d("ImageDescription", 270, 2), new C2123d("Make", 271, 2), new C2123d("Model", 272, 2), new C2123d("StripOffsets", 273, 3, 4), new C2123d("ThumbnailOrientation", 274, 3), new C2123d("SamplesPerPixel", 277, 3), new C2123d("RowsPerStrip", 278, 3, 4), new C2123d("StripByteCounts", 279, 3, 4), new C2123d("XResolution", 282, 5), new C2123d("YResolution", 283, 5), new C2123d("PlanarConfiguration", 284, 3), new C2123d("ResolutionUnit", 296, 3), new C2123d("TransferFunction", 301, 3), new C2123d("Software", 305, 2), new C2123d("DateTime", 306, 2), new C2123d("Artist", 315, 2), new C2123d("WhitePoint", 318, 5), new C2123d("PrimaryChromaticities", 319, 5), new C2123d("SubIFDPointer", 330, 4), new C2123d("JPEGInterchangeFormat", 513, 4), new C2123d("JPEGInterchangeFormatLength", 514, 4), new C2123d("YCbCrCoefficients", 529, 5), new C2123d("YCbCrSubSampling", 530, 3), new C2123d("YCbCrPositioning", 531, 3), new C2123d("ReferenceBlackWhite", 532, 5), new C2123d("Copyright", 33432, 2), new C2123d("ExifIFDPointer", 34665, 4), new C2123d("GPSInfoIFDPointer", 34853, 4), new C2123d("DNGVersion", 50706, 1), new C2123d("DefaultCropSize", 50720, 3, 4)};
        f10327e0 = dVarArr5;
        C2123d[] dVarArr6 = {new C2123d("ThumbnailImage", 256, 7), new C2123d("CameraSettingsIFDPointer", 8224, 4), new C2123d("ImageProcessingIFDPointer", 8256, 4)};
        f10329g0 = dVarArr6;
        C2123d[] dVarArr7 = {new C2123d("PreviewImageStart", 257, 4), new C2123d("PreviewImageLength", 258, 4)};
        f10330h0 = dVarArr7;
        C2123d[] dVarArr8 = {new C2123d("AspectFrame", 4371, 3)};
        f10331i0 = dVarArr8;
        C2123d[] dVarArr9 = {new C2123d("ColorSpace", 55, 3)};
        f10332j0 = dVarArr9;
        C2123d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        f10333k0 = dVarArr10;
        f10337o0 = new HashMap[dVarArr10.length];
        f10338p0 = new HashMap[dVarArr10.length];
        Charset forName = Charset.forName("US-ASCII");
        f10341s0 = forName;
        f10342t0 = "Exif\u0000\u0000".getBytes(forName);
        f10343u0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        f10319W = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C2123d[][] dVarArr11 = f10333k0;
            if (i < dVarArr11.length) {
                f10337o0[i] = new HashMap<>();
                f10338p0[i] = new HashMap<>();
                for (C2123d dVar : dVarArr11[i]) {
                    f10337o0[i].put(Integer.valueOf(dVar.f10385a), dVar);
                    f10338p0[i].put(dVar.f10386b, dVar);
                }
                i++;
            } else {
                HashMap<Integer, Integer> hashMap = f10340r0;
                C2123d[] dVarArr12 = f10334l0;
                hashMap.put(Integer.valueOf(dVarArr12[0].f10385a), 5);
                hashMap.put(Integer.valueOf(dVarArr12[1].f10385a), 1);
                hashMap.put(Integer.valueOf(dVarArr12[2].f10385a), 2);
                hashMap.put(Integer.valueOf(dVarArr12[3].f10385a), 3);
                hashMap.put(Integer.valueOf(dVarArr12[4].f10385a), 7);
                hashMap.put(Integer.valueOf(dVarArr12[5].f10385a), 8);
                return;
            }
        }
    }

    public cv1(String str) throws IOException {
        C2123d[][] dVarArr = f10333k0;
        this.f10355f = new HashMap[dVarArr.length];
        this.f10356g = new HashSet(dVarArr.length);
        this.f10357h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            mo18323t(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    /* renamed from: B */
    public static boolean m14524B(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: N */
    public static boolean m14525N(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static String m14526b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static void m14527c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static long[] m14528d(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    /* renamed from: u */
    public static boolean m14529u(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f10342t0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr3 = f10342t0;
            if (i >= bArr3.length) {
                return true;
            }
            if (bArr2[i] != bArr3[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: w */
    public static boolean m14530w(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f10299C;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002b  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo18292A(byte[] r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            cv1$b r2 = new cv1$b     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            java.nio.ByteOrder r4 = r3.mo18299I(r2)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r3.f10357h = r4     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r2.mo18336e(r4)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r1 = 85
            if (r4 != r1) goto L_0x0019
            r0 = 1
        L_0x0019:
            r2.close()
            return r0
        L_0x001d:
            r4 = move-exception
            r1 = r2
            goto L_0x0023
        L_0x0020:
            r1 = r2
            goto L_0x0029
        L_0x0022:
            r4 = move-exception
        L_0x0023:
            if (r1 == 0) goto L_0x0028
            r1.close()
        L_0x0028:
            throw r4
        L_0x0029:
            if (r1 == 0) goto L_0x002e
            r1.close()
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cv1.mo18292A(byte[]):boolean");
    }

    /* renamed from: C */
    public final boolean mo18293C(HashMap hashMap) throws IOException {
        C2122c cVar;
        C2122c cVar2 = (C2122c) hashMap.get("BitsPerSample");
        if (cVar2 == null) {
            return false;
        }
        int[] iArr = (int[]) cVar2.mo18357k(this.f10357h);
        int[] iArr2 = f10349z;
        if (Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.f10353d != 3 || (cVar = (C2122c) hashMap.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int i = cVar.mo18355i(this.f10357h);
        if ((i != 1 || !Arrays.equals(iArr, f10298B)) && (i != 6 || !Arrays.equals(iArr, iArr2))) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public final boolean mo18294D(HashMap hashMap) throws IOException {
        C2122c cVar = (C2122c) hashMap.get("ImageLength");
        C2122c cVar2 = (C2122c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        int i = cVar.mo18355i(this.f10357h);
        int i2 = cVar2.mo18355i(this.f10357h);
        if (i > 512 || i2 > 512) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public final boolean mo18295E(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f10309M;
            if (i >= bArr2.length) {
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = f10310N;
                    if (i2 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f10309M.length + i2 + 4] != bArr3[i2]) {
                        return false;
                    }
                    i2++;
                }
            } else if (bArr[i] != bArr2[i]) {
                return false;
            } else {
                i++;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r4.f10370u = false;
        r5 = f10345w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006d, code lost:
        mo18307a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0070, code lost:
        if (r5 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0076, code lost:
        mo18307a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007b, code lost:
        if (f10345w != false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007d, code lost:
        mo18298H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0080, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18296F(java.io.InputStream r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0081
            r0 = 0
            r1 = r0
        L_0x0004:
            cv1$d[][] r2 = f10333k0     // Catch:{ IOException -> 0x0069 }
            int r2 = r2.length     // Catch:{ IOException -> 0x0069 }
            if (r1 >= r2) goto L_0x0015
            java.util.HashMap<java.lang.String, cv1$c>[] r2 = r4.f10355f     // Catch:{ IOException -> 0x0069 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ IOException -> 0x0069 }
            r3.<init>()     // Catch:{ IOException -> 0x0069 }
            r2[r1] = r3     // Catch:{ IOException -> 0x0069 }
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0015:
            boolean r1 = r4.f10354e     // Catch:{ IOException -> 0x0069 }
            if (r1 != 0) goto L_0x0027
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0069 }
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch:{ IOException -> 0x0069 }
            int r5 = r4.mo18313j(r1)     // Catch:{ IOException -> 0x0069 }
            r4.f10353d = r5     // Catch:{ IOException -> 0x0069 }
            r5 = r1
        L_0x0027:
            cv1$b r1 = new cv1$b     // Catch:{ IOException -> 0x0069 }
            r1.<init>((java.io.InputStream) r5)     // Catch:{ IOException -> 0x0069 }
            boolean r5 = r4.f10354e     // Catch:{ IOException -> 0x0069 }
            if (r5 != 0) goto L_0x0056
            int r5 = r4.f10353d     // Catch:{ IOException -> 0x0069 }
            switch(r5) {
                case 0: goto L_0x0052;
                case 1: goto L_0x0052;
                case 2: goto L_0x0052;
                case 3: goto L_0x0052;
                case 4: goto L_0x004e;
                case 5: goto L_0x0052;
                case 6: goto L_0x0052;
                case 7: goto L_0x004a;
                case 8: goto L_0x0052;
                case 9: goto L_0x0046;
                case 10: goto L_0x0042;
                case 11: goto L_0x0052;
                case 12: goto L_0x003e;
                case 13: goto L_0x003a;
                case 14: goto L_0x0036;
                default: goto L_0x0035;
            }     // Catch:{ IOException -> 0x0069 }
        L_0x0035:
            goto L_0x0059
        L_0x0036:
            r4.mo18320q(r1)     // Catch:{ IOException -> 0x0069 }
            goto L_0x0059
        L_0x003a:
            r4.mo18315l(r1)     // Catch:{ IOException -> 0x0069 }
            goto L_0x0059
        L_0x003e:
            r4.mo18311h(r1)     // Catch:{ IOException -> 0x0069 }
            goto L_0x0059
        L_0x0042:
            r4.mo18318o(r1)     // Catch:{ IOException -> 0x0069 }
            goto L_0x0059
        L_0x0046:
            r4.mo18316m(r1)     // Catch:{ IOException -> 0x0069 }
            goto L_0x0059
        L_0x004a:
            r4.mo18314k(r1)     // Catch:{ IOException -> 0x0069 }
            goto L_0x0059
        L_0x004e:
            r4.mo18312i(r1, r0, r0)     // Catch:{ IOException -> 0x0069 }
            goto L_0x0059
        L_0x0052:
            r4.mo18317n(r1)     // Catch:{ IOException -> 0x0069 }
            goto L_0x0059
        L_0x0056:
            r4.mo18319p(r1)     // Catch:{ IOException -> 0x0069 }
        L_0x0059:
            r4.mo18303M(r1)     // Catch:{ IOException -> 0x0069 }
            r5 = 1
            r4.f10370u = r5     // Catch:{ IOException -> 0x0069 }
            r4.mo18307a()
            boolean r5 = f10345w
            if (r5 == 0) goto L_0x0075
            goto L_0x0072
        L_0x0067:
            r5 = move-exception
            goto L_0x0076
        L_0x0069:
            r4.f10370u = r0     // Catch:{ all -> 0x0067 }
            boolean r5 = f10345w     // Catch:{ all -> 0x0067 }
            r4.mo18307a()
            if (r5 == 0) goto L_0x0075
        L_0x0072:
            r4.mo18298H()
        L_0x0075:
            return
        L_0x0076:
            r4.mo18307a()
            boolean r0 = f10345w
            if (r0 == 0) goto L_0x0080
            r4.mo18298H()
        L_0x0080:
            throw r5
        L_0x0081:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "inputstream shouldn't be null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cv1.mo18296F(java.io.InputStream):void");
    }

    /* renamed from: G */
    public final void mo18297G(C2121b bVar, int i) throws IOException {
        ByteOrder I = mo18299I(bVar);
        this.f10357h = I;
        bVar.mo18336e(I);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i2 = this.f10353d;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt < 8 || readInt >= i) {
                throw new IOException("Invalid first Ifd offset: " + readInt);
            }
            int i3 = readInt - 8;
            if (i3 > 0 && bVar.skipBytes(i3) != i3) {
                throw new IOException("Couldn't jump to first Ifd: " + i3);
            }
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    /* renamed from: H */
    public final void mo18298H() {
        for (int i = 0; i < this.f10355f.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("The size of tag group[");
            sb.append(i);
            sb.append("]: ");
            sb.append(this.f10355f[i].size());
            for (Map.Entry next : this.f10355f[i].entrySet()) {
                C2122c cVar = (C2122c) next.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("tagName: ");
                sb2.append((String) next.getKey());
                sb2.append(", tagType: ");
                sb2.append(cVar.toString());
                sb2.append(", tagValue: '");
                sb2.append(cVar.mo18356j(this.f10357h));
                sb2.append("'");
            }
        }
    }

    /* renamed from: I */
    public final ByteOrder mo18299I(C2121b bVar) throws IOException {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    /* renamed from: J */
    public final void mo18300J(byte[] bArr, int i) throws IOException {
        C2121b bVar = new C2121b(bArr);
        mo18297G(bVar, bArr.length);
        mo18301K(bVar, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0242  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18301K(p000.cv1.C2121b r30, int r31) throws java.io.IOException {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            java.util.Set<java.lang.Integer> r3 = r0.f10356g
            int r4 = r1.f10380g
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.f10380g
            r4 = 2
            int r3 = r3 + r4
            int r5 = r1.f10379e
            if (r3 <= r5) goto L_0x001a
            return
        L_0x001a:
            short r3 = r30.readShort()
            boolean r5 = f10345w
            if (r5 == 0) goto L_0x002f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "numberOfDirectoryEntry: "
            r5.append(r6)
            r5.append(r3)
        L_0x002f:
            int r5 = r1.f10380g
            int r6 = r3 * 12
            int r5 = r5 + r6
            int r6 = r1.f10379e
            if (r5 > r6) goto L_0x03a4
            if (r3 > 0) goto L_0x003c
            goto L_0x03a4
        L_0x003c:
            r5 = 0
            r6 = r5
        L_0x003e:
            r7 = 5
            r10 = 1
            if (r6 >= r3) goto L_0x032d
            int r12 = r30.readUnsignedShort()
            int r13 = r30.readUnsignedShort()
            int r15 = r30.readInt()
            int r14 = r30.mo18333b()
            long r8 = (long) r14
            r18 = 4
            long r8 = r8 + r18
            java.util.HashMap<java.lang.Integer, cv1$d>[] r14 = f10337o0
            r14 = r14[r2]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            java.lang.Object r11 = r14.get(r11)
            cv1$d r11 = (p000.cv1.C2123d) r11
            boolean r14 = f10345w
            r4 = 3
            if (r14 == 0) goto L_0x0095
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r22 = java.lang.Integer.valueOf(r31)
            r7[r5] = r22
            java.lang.Integer r22 = java.lang.Integer.valueOf(r12)
            r7[r10] = r22
            if (r11 == 0) goto L_0x007d
            java.lang.String r10 = r11.f10386b
            goto L_0x007e
        L_0x007d:
            r10 = 0
        L_0x007e:
            r21 = 2
            r7[r21] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            r7[r4] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            r20 = 4
            r7[r20] = r10
            java.lang.String r10 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String.format(r10, r7)
        L_0x0095:
            r7 = 7
            if (r11 != 0) goto L_0x00ab
            if (r14 == 0) goto L_0x00a7
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r5 = "Skip the tag entry since tag number is not defined: "
            r10.append(r5)
            r10.append(r12)
        L_0x00a7:
            r23 = r8
            goto L_0x0114
        L_0x00ab:
            if (r13 <= 0) goto L_0x0103
            int[] r5 = f10321Y
            int r10 = r5.length
            if (r13 < r10) goto L_0x00b3
            goto L_0x0103
        L_0x00b3:
            boolean r10 = r11.mo18359a(r13)
            if (r10 != 0) goto L_0x00d7
            if (r14 == 0) goto L_0x00a7
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r10 = "Skip the tag entry since data format ("
            r5.append(r10)
            java.lang.String[] r10 = f10320X
            r10 = r10[r13]
            r5.append(r10)
            java.lang.String r10 = ") is unexpected for tag: "
            r5.append(r10)
            java.lang.String r10 = r11.f10386b
            r5.append(r10)
            goto L_0x00a7
        L_0x00d7:
            if (r13 != r7) goto L_0x00db
            int r13 = r11.f10387c
        L_0x00db:
            r23 = r8
            long r7 = (long) r15
            r5 = r5[r13]
            long r9 = (long) r5
            long r7 = r7 * r9
            r9 = 0
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 < 0) goto L_0x00f2
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x00f0
            goto L_0x00f2
        L_0x00f0:
            r5 = 1
            goto L_0x0117
        L_0x00f2:
            if (r14 == 0) goto L_0x0101
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "Skip the tag entry since the number of components is invalid: "
            r5.append(r9)
            r5.append(r15)
        L_0x0101:
            r5 = 0
            goto L_0x0117
        L_0x0103:
            r23 = r8
            if (r14 == 0) goto L_0x0114
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Skip the tag entry since data format is invalid: "
            r5.append(r7)
            r5.append(r13)
        L_0x0114:
            r5 = 0
            r7 = 0
        L_0x0117:
            if (r5 != 0) goto L_0x0125
            r9 = r23
            r1.mo18335d(r9)
            r24 = r3
            r26 = r6
        L_0x0122:
            r12 = 2
            goto L_0x0324
        L_0x0125:
            r9 = r23
            int r5 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            java.lang.String r4 = "Compression"
            if (r5 <= 0) goto L_0x01e4
            int r5 = r30.readInt()
            r24 = r3
            if (r14 == 0) goto L_0x0145
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r26 = r6
            java.lang.String r6 = "seek to data offset: "
            r3.append(r6)
            r3.append(r5)
            goto L_0x0147
        L_0x0145:
            r26 = r6
        L_0x0147:
            int r3 = r0.f10353d
            r6 = 7
            if (r3 != r6) goto L_0x01ab
            java.lang.String r3 = r11.f10386b
            java.lang.String r6 = "MakerNote"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0159
            r0.f10366q = r5
            goto L_0x01a4
        L_0x0159:
            r3 = 6
            if (r2 != r3) goto L_0x01a4
            java.lang.String r6 = r11.f10386b
            java.lang.String r3 = "ThumbnailImage"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x01a4
            r0.f10367r = r5
            r0.f10368s = r15
            java.nio.ByteOrder r3 = r0.f10357h
            r6 = 6
            cv1$c r3 = p000.cv1.C2122c.m14577f(r6, r3)
            int r6 = r0.f10367r
            r18 = r12
            r19 = r13
            long r12 = (long) r6
            java.nio.ByteOrder r6 = r0.f10357h
            cv1$c r6 = p000.cv1.C2122c.m14573b(r12, r6)
            int r12 = r0.f10368s
            long r12 = (long) r12
            r25 = r15
            java.nio.ByteOrder r15 = r0.f10357h
            cv1$c r12 = p000.cv1.C2122c.m14573b(r12, r15)
            java.util.HashMap<java.lang.String, cv1$c>[] r13 = r0.f10355f
            r15 = 4
            r13 = r13[r15]
            r13.put(r4, r3)
            java.util.HashMap<java.lang.String, cv1$c>[] r3 = r0.f10355f
            r3 = r3[r15]
            java.lang.String r13 = "JPEGInterchangeFormat"
            r3.put(r13, r6)
            java.util.HashMap<java.lang.String, cv1$c>[] r3 = r0.f10355f
            r3 = r3[r15]
            java.lang.String r6 = "JPEGInterchangeFormatLength"
            r3.put(r6, r12)
            goto L_0x01c1
        L_0x01a4:
            r18 = r12
            r19 = r13
            r25 = r15
            goto L_0x01c1
        L_0x01ab:
            r18 = r12
            r19 = r13
            r25 = r15
            r6 = 10
            if (r3 != r6) goto L_0x01c1
            java.lang.String r3 = r11.f10386b
            java.lang.String r6 = "JpgFromRaw"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x01c1
            r0.f10369t = r5
        L_0x01c1:
            long r12 = (long) r5
            long r27 = r12 + r7
            int r3 = r1.f10379e
            r6 = r4
            long r3 = (long) r3
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x01d0
            r1.mo18335d(r12)
            goto L_0x01ef
        L_0x01d0:
            if (r14 == 0) goto L_0x01df
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip the tag entry since data offset is invalid: "
            r3.append(r4)
            r3.append(r5)
        L_0x01df:
            r1.mo18335d(r9)
            goto L_0x0122
        L_0x01e4:
            r24 = r3
            r26 = r6
            r18 = r12
            r19 = r13
            r25 = r15
            r6 = r4
        L_0x01ef:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r3 = f10340r0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r18)
            java.lang.Object r3 = r3.get(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r14 == 0) goto L_0x0212
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "nextIfdType: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = " byteCount: "
            r4.append(r5)
            r4.append(r7)
        L_0x0212:
            r4 = 8
            if (r3 == 0) goto L_0x02ab
            r5 = -1
            r13 = r19
            r7 = 3
            if (r13 == r7) goto L_0x023a
            r7 = 4
            if (r13 == r7) goto L_0x0235
            if (r13 == r4) goto L_0x0230
            r4 = 9
            if (r13 == r4) goto L_0x022b
            r4 = 13
            if (r13 == r4) goto L_0x022b
            goto L_0x023f
        L_0x022b:
            int r4 = r30.readInt()
            goto L_0x023e
        L_0x0230:
            short r4 = r30.readShort()
            goto L_0x023e
        L_0x0235:
            long r5 = r30.mo18334c()
            goto L_0x023f
        L_0x023a:
            int r4 = r30.readUnsignedShort()
        L_0x023e:
            long r5 = (long) r4
        L_0x023f:
            r12 = 2
            if (r14 == 0) goto L_0x0255
            java.lang.Object[] r4 = new java.lang.Object[r12]
            java.lang.Long r7 = java.lang.Long.valueOf(r5)
            r8 = 0
            r4[r8] = r7
            java.lang.String r7 = r11.f10386b
            r8 = 1
            r4[r8] = r7
            java.lang.String r7 = "Offset: %d, tagName: %s"
            java.lang.String.format(r7, r4)
        L_0x0255:
            r7 = 0
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x0297
            int r4 = r1.f10379e
            long r7 = (long) r4
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0297
            java.util.Set<java.lang.Integer> r4 = r0.f10356g
            int r7 = (int) r5
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r4 = r4.contains(r7)
            if (r4 != 0) goto L_0x027a
            r1.mo18335d(r5)
            int r3 = r3.intValue()
            r0.mo18301K(r1, r3)
            goto L_0x02a6
        L_0x027a:
            if (r14 == 0) goto L_0x02a6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "Skip jump into the IFD since it has already been read: IfdType "
            r4.append(r7)
            r4.append(r3)
            java.lang.String r3 = " (at "
            r4.append(r3)
            r4.append(r5)
            java.lang.String r3 = ")"
            r4.append(r3)
            goto L_0x02a6
        L_0x0297:
            if (r14 == 0) goto L_0x02a6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip jump into the IFD since its offset is invalid: "
            r3.append(r4)
            r3.append(r5)
        L_0x02a6:
            r1.mo18335d(r9)
            goto L_0x0324
        L_0x02ab:
            r13 = r19
            r12 = 2
            int r3 = r30.mo18333b()
            int r5 = r0.f10365p
            int r3 = r3 + r5
            int r5 = (int) r7
            byte[] r5 = new byte[r5]
            r1.readFully(r5)
            cv1$c r7 = new cv1$c
            long r14 = (long) r3
            r17 = r14
            r14 = r7
            r3 = r25
            r15 = r13
            r16 = r3
            r19 = r5
            r14.<init>(r15, r16, r17, r19)
            java.util.HashMap<java.lang.String, cv1$c>[] r3 = r0.f10355f
            r3 = r3[r2]
            java.lang.String r5 = r11.f10386b
            r3.put(r5, r7)
            java.lang.String r3 = r11.f10386b
            java.lang.String r5 = "DNGVersion"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x02e1
            r3 = 3
            r0.f10353d = r3
        L_0x02e1:
            java.lang.String r3 = r11.f10386b
            java.lang.String r5 = "Make"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x02f5
            java.lang.String r3 = r11.f10386b
            java.lang.String r5 = "Model"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0303
        L_0x02f5:
            java.nio.ByteOrder r3 = r0.f10357h
            java.lang.String r3 = r7.mo18356j(r3)
            java.lang.String r5 = "PENTAX"
            boolean r3 = r3.contains(r5)
            if (r3 != 0) goto L_0x0316
        L_0x0303:
            java.lang.String r3 = r11.f10386b
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0318
            java.nio.ByteOrder r3 = r0.f10357h
            int r3 = r7.mo18355i(r3)
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r3 != r5) goto L_0x0318
        L_0x0316:
            r0.f10353d = r4
        L_0x0318:
            int r3 = r30.mo18333b()
            long r3 = (long) r3
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x0324
            r1.mo18335d(r9)
        L_0x0324:
            int r6 = r26 + 1
            short r6 = (short) r6
            r4 = r12
            r3 = r24
            r5 = 0
            goto L_0x003e
        L_0x032d:
            int r2 = r30.mo18333b()
            r3 = 4
            int r2 = r2 + r3
            int r3 = r1.f10379e
            if (r2 > r3) goto L_0x03a4
            int r2 = r30.readInt()
            boolean r3 = f10345w
            if (r3 == 0) goto L_0x034e
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "nextIfdOffset: %d"
            java.lang.String.format(r5, r4)
        L_0x034e:
            long r4 = (long) r2
            r8 = 0
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0395
            int r6 = r1.f10379e
            if (r2 >= r6) goto L_0x0395
            java.util.Set<java.lang.Integer> r6 = r0.f10356g
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            boolean r6 = r6.contains(r8)
            if (r6 != 0) goto L_0x0385
            r1.mo18335d(r4)
            java.util.HashMap<java.lang.String, cv1$c>[] r2 = r0.f10355f
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0377
            r0.mo18301K(r1, r3)
            goto L_0x03a4
        L_0x0377:
            java.util.HashMap<java.lang.String, cv1$c>[] r2 = r0.f10355f
            r2 = r2[r7]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x03a4
            r0.mo18301K(r1, r7)
            goto L_0x03a4
        L_0x0385:
            if (r3 == 0) goto L_0x03a4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            goto L_0x03a4
        L_0x0395:
            if (r3 == 0) goto L_0x03a4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
        L_0x03a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cv1.mo18301K(cv1$b, int):void");
    }

    /* renamed from: L */
    public final void mo18302L(C2121b bVar, int i) throws IOException {
        C2122c cVar;
        C2122c cVar2 = this.f10355f[i].get("ImageLength");
        C2122c cVar3 = this.f10355f[i].get("ImageWidth");
        if ((cVar2 == null || cVar3 == null) && (cVar = this.f10355f[i].get("JPEGInterchangeFormat")) != null) {
            mo18312i(bVar, cVar.mo18355i(this.f10357h), i);
        }
    }

    /* renamed from: M */
    public final void mo18303M(C2121b bVar) throws IOException {
        HashMap<String, C2122c> hashMap = this.f10355f[4];
        C2122c cVar = hashMap.get("Compression");
        if (cVar != null) {
            int i = cVar.mo18355i(this.f10357h);
            this.f10364o = i;
            if (i != 1) {
                if (i == 6) {
                    mo18321r(bVar, hashMap);
                    return;
                } else if (i != 7) {
                    return;
                }
            }
            if (mo18293C(hashMap)) {
                mo18322s(bVar, hashMap);
                return;
            }
            return;
        }
        this.f10364o = 6;
        mo18321r(bVar, hashMap);
    }

    /* renamed from: O */
    public final void mo18304O(int i, int i2) throws IOException {
        if (!this.f10355f[i].isEmpty() && !this.f10355f[i2].isEmpty()) {
            C2122c cVar = this.f10355f[i].get("ImageLength");
            C2122c cVar2 = this.f10355f[i].get("ImageWidth");
            C2122c cVar3 = this.f10355f[i2].get("ImageLength");
            C2122c cVar4 = this.f10355f[i2].get("ImageWidth");
            if (cVar != null && cVar2 != null && cVar3 != null && cVar4 != null) {
                int i3 = cVar.mo18355i(this.f10357h);
                int i4 = cVar2.mo18355i(this.f10357h);
                int i5 = cVar3.mo18355i(this.f10357h);
                int i6 = cVar4.mo18355i(this.f10357h);
                if (i3 < i5 && i4 < i6) {
                    HashMap<String, C2122c>[] hashMapArr = this.f10355f;
                    HashMap<String, C2122c> hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            }
        }
    }

    /* renamed from: P */
    public final void mo18305P(C2121b bVar, int i) throws IOException {
        C2122c cVar;
        C2122c cVar2;
        C2122c cVar3 = this.f10355f[i].get("DefaultCropSize");
        C2122c cVar4 = this.f10355f[i].get("SensorTopBorder");
        C2122c cVar5 = this.f10355f[i].get("SensorLeftBorder");
        C2122c cVar6 = this.f10355f[i].get("SensorBottomBorder");
        C2122c cVar7 = this.f10355f[i].get("SensorRightBorder");
        if (cVar3 != null) {
            if (cVar3.f10381a == 5) {
                C2124e[] eVarArr = (C2124e[]) cVar3.mo18357k(this.f10357h);
                if (eVarArr == null || eVarArr.length != 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid crop size values. cropSize=");
                    sb.append(Arrays.toString(eVarArr));
                    return;
                }
                cVar2 = C2122c.m14575d(eVarArr[0], this.f10357h);
                cVar = C2122c.m14575d(eVarArr[1], this.f10357h);
            } else {
                int[] iArr = (int[]) cVar3.mo18357k(this.f10357h);
                if (iArr == null || iArr.length != 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid crop size values. cropSize=");
                    sb2.append(Arrays.toString(iArr));
                    return;
                }
                cVar2 = C2122c.m14577f(iArr[0], this.f10357h);
                cVar = C2122c.m14577f(iArr[1], this.f10357h);
            }
            this.f10355f[i].put("ImageWidth", cVar2);
            this.f10355f[i].put("ImageLength", cVar);
        } else if (cVar4 == null || cVar5 == null || cVar6 == null || cVar7 == null) {
            mo18302L(bVar, i);
        } else {
            int i2 = cVar4.mo18355i(this.f10357h);
            int i3 = cVar6.mo18355i(this.f10357h);
            int i4 = cVar7.mo18355i(this.f10357h);
            int i5 = cVar5.mo18355i(this.f10357h);
            if (i3 > i2 && i4 > i5) {
                C2122c f = C2122c.m14577f(i3 - i2, this.f10357h);
                C2122c f2 = C2122c.m14577f(i4 - i5, this.f10357h);
                this.f10355f[i].put("ImageLength", f);
                this.f10355f[i].put("ImageWidth", f2);
            }
        }
    }

    /* renamed from: Q */
    public final void mo18306Q() throws IOException {
        mo18304O(0, 5);
        mo18304O(0, 4);
        mo18304O(5, 4);
        C2122c cVar = this.f10355f[1].get("PixelXDimension");
        C2122c cVar2 = this.f10355f[1].get("PixelYDimension");
        if (!(cVar == null || cVar2 == null)) {
            this.f10355f[0].put("ImageWidth", cVar);
            this.f10355f[0].put("ImageLength", cVar2);
        }
        if (this.f10355f[4].isEmpty() && mo18294D(this.f10355f[5])) {
            HashMap<String, C2122c>[] hashMapArr = this.f10355f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        mo18294D(this.f10355f[4]);
    }

    /* renamed from: a */
    public final void mo18307a() {
        String e = mo18308e("DateTimeOriginal");
        if (e != null && mo18308e("DateTime") == null) {
            this.f10355f[0].put("DateTime", C2122c.m14572a(e));
        }
        if (mo18308e("ImageWidth") == null) {
            this.f10355f[0].put("ImageWidth", C2122c.m14573b(0, this.f10357h));
        }
        if (mo18308e("ImageLength") == null) {
            this.f10355f[0].put("ImageLength", C2122c.m14573b(0, this.f10357h));
        }
        if (mo18308e("Orientation") == null) {
            this.f10355f[0].put("Orientation", C2122c.m14573b(0, this.f10357h));
        }
        if (mo18308e("LightSource") == null) {
            this.f10355f[1].put("LightSource", C2122c.m14573b(0, this.f10357h));
        }
    }

    /* renamed from: e */
    public String mo18308e(String str) {
        if (str != null) {
            C2122c g = mo18310g(str);
            if (g != null) {
                if (!f10339q0.contains(str)) {
                    return g.mo18356j(this.f10357h);
                }
                if (str.equals("GPSTimeStamp")) {
                    int i = g.f10381a;
                    if (i == 5 || i == 10) {
                        C2124e[] eVarArr = (C2124e[]) g.mo18357k(this.f10357h);
                        if (eVarArr == null || eVarArr.length != 3) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid GPS Timestamp array. array=");
                            sb.append(Arrays.toString(eVarArr));
                            return null;
                        }
                        C2124e eVar = eVarArr[0];
                        C2124e eVar2 = eVarArr[1];
                        C2124e eVar3 = eVarArr[2];
                        return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) eVar.f10389a) / ((float) eVar.f10390b))), Integer.valueOf((int) (((float) eVar2.f10389a) / ((float) eVar2.f10390b))), Integer.valueOf((int) (((float) eVar3.f10389a) / ((float) eVar3.f10390b)))});
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("GPS Timestamp format is not rational. format=");
                    sb2.append(g.f10381a);
                    return null;
                }
                try {
                    return Double.toString(g.mo18354h(this.f10357h));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* renamed from: f */
    public int mo18309f(String str, int i) {
        if (str != null) {
            C2122c g = mo18310g(str);
            if (g == null) {
                return i;
            }
            try {
                return g.mo18355i(this.f10357h);
            } catch (NumberFormatException unused) {
                return i;
            }
        } else {
            throw new NullPointerException("tag shouldn't be null");
        }
    }

    /* renamed from: g */
    public final C2122c mo18310g(String str) {
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                str = "PhotographicSensitivity";
            }
            for (int i = 0; i < f10333k0.length; i++) {
                C2122c cVar = this.f10355f[i].get(str);
                if (cVar != null) {
                    return cVar;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* renamed from: h */
    public final void mo18311h(C2121b bVar) throws IOException {
        String str;
        String str2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(new C2120a(bVar));
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            String str3 = null;
            if ("yes".equals(extractMetadata3)) {
                str3 = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str3 = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str2 = null;
                str = null;
            }
            if (str3 != null) {
                this.f10355f[0].put("ImageWidth", C2122c.m14577f(Integer.parseInt(str3), this.f10357h));
            }
            if (str2 != null) {
                this.f10355f[0].put("ImageLength", C2122c.m14577f(Integer.parseInt(str2), this.f10357h));
            }
            if (str != null) {
                int i = 1;
                int parseInt = Integer.parseInt(str);
                if (parseInt == 90) {
                    i = 6;
                } else if (parseInt == 180) {
                    i = 3;
                } else if (parseInt == 270) {
                    i = 8;
                }
                this.f10355f[0].put("Orientation", C2122c.m14577f(i, this.f10357h));
            }
            if (!(extractMetadata == null || extractMetadata2 == null)) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    bVar.mo18335d((long) parseInt2);
                    byte[] bArr = new byte[6];
                    if (bVar.read(bArr) == 6) {
                        int i2 = parseInt2 + 6;
                        int i3 = parseInt3 - 6;
                        if (Arrays.equals(bArr, f10342t0)) {
                            byte[] bArr2 = new byte[i3];
                            if (bVar.read(bArr2) == i3) {
                                this.f10365p = i2;
                                mo18300J(bArr2, 0);
                            } else {
                                throw new IOException("Can't read exif");
                            }
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Can't read identifier");
                    }
                } else {
                    throw new IOException("Invalid exif length");
                }
            }
            if (f10345w) {
                StringBuilder sb = new StringBuilder();
                sb.append("Heif meta: ");
                sb.append(str3);
                sb.append("x");
                sb.append(str2);
                sb.append(", rotation ");
                sb.append(str);
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0173 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00dc A[SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18312i(p000.cv1.C2121b r19, int r20, int r21) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = f10345w
            if (r4 == 0) goto L_0x0019
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "getJpegAttributes starting with: "
            r4.append(r5)
            r4.append(r1)
        L_0x0019:
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            r1.mo18336e(r4)
            long r4 = (long) r2
            r1.mo18335d(r4)
            byte r4 = r19.readByte()
            java.lang.String r5 = "Invalid marker: "
            r6 = -1
            if (r4 != r6) goto L_0x01bd
            r7 = 1
            int r2 = r2 + r7
            byte r8 = r19.readByte()
            r9 = -40
            if (r8 != r9) goto L_0x01a2
            int r2 = r2 + r7
        L_0x0036:
            byte r4 = r19.readByte()
            if (r4 != r6) goto L_0x0185
            int r2 = r2 + r7
            byte r4 = r19.readByte()
            boolean r5 = f10345w
            if (r5 == 0) goto L_0x0058
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Found JPEG segment indicator: "
            r8.append(r9)
            r9 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r8.append(r9)
        L_0x0058:
            int r2 = r2 + r7
            r8 = -39
            if (r4 == r8) goto L_0x017f
            r8 = -38
            if (r4 != r8) goto L_0x0063
            goto L_0x017f
        L_0x0063:
            int r8 = r19.readUnsignedShort()
            int r8 = r8 + -2
            int r2 = r2 + 2
            if (r5 == 0) goto L_0x008f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "JPEG segment: "
            r5.append(r9)
            r9 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r5.append(r9)
            java.lang.String r9 = " (length: "
            r5.append(r9)
            int r9 = r8 + 2
            r5.append(r9)
            java.lang.String r9 = ")"
            r5.append(r9)
        L_0x008f:
            java.lang.String r5 = "Invalid length"
            if (r8 < 0) goto L_0x0179
            r9 = -31
            r10 = 0
            if (r4 == r9) goto L_0x0111
            r9 = -2
            if (r4 == r9) goto L_0x00e4
            switch(r4) {
                case -64: goto L_0x00ab;
                case -63: goto L_0x00ab;
                case -62: goto L_0x00ab;
                case -61: goto L_0x00ab;
                default: goto L_0x009e;
            }
        L_0x009e:
            switch(r4) {
                case -59: goto L_0x00ab;
                case -58: goto L_0x00ab;
                case -57: goto L_0x00ab;
                default: goto L_0x00a1;
            }
        L_0x00a1:
            switch(r4) {
                case -55: goto L_0x00ab;
                case -54: goto L_0x00ab;
                case -53: goto L_0x00ab;
                default: goto L_0x00a4;
            }
        L_0x00a4:
            switch(r4) {
                case -51: goto L_0x00ab;
                case -50: goto L_0x00ab;
                case -49: goto L_0x00ab;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            r9 = r2
            r2 = r7
            goto L_0x015c
        L_0x00ab:
            int r4 = r1.skipBytes(r7)
            if (r4 != r7) goto L_0x00dc
            java.util.HashMap<java.lang.String, cv1$c>[] r4 = r0.f10355f
            r4 = r4[r3]
            int r9 = r19.readUnsignedShort()
            long r9 = (long) r9
            java.nio.ByteOrder r11 = r0.f10357h
            cv1$c r9 = p000.cv1.C2122c.m14573b(r9, r11)
            java.lang.String r10 = "ImageLength"
            r4.put(r10, r9)
            java.util.HashMap<java.lang.String, cv1$c>[] r4 = r0.f10355f
            r4 = r4[r3]
            int r9 = r19.readUnsignedShort()
            long r9 = (long) r9
            java.nio.ByteOrder r11 = r0.f10357h
            cv1$c r9 = p000.cv1.C2122c.m14573b(r9, r11)
            java.lang.String r10 = "ImageWidth"
            r4.put(r10, r9)
            int r8 = r8 + -5
            goto L_0x00a7
        L_0x00dc:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid SOFx"
            r1.<init>(r2)
            throw r1
        L_0x00e4:
            byte[] r4 = new byte[r8]
            int r9 = r1.read(r4)
            if (r9 != r8) goto L_0x0109
            java.lang.String r8 = "UserComment"
            java.lang.String r9 = r0.mo18308e(r8)
            if (r9 != 0) goto L_0x0106
            java.util.HashMap<java.lang.String, cv1$c>[] r9 = r0.f10355f
            r9 = r9[r7]
            java.lang.String r11 = new java.lang.String
            java.nio.charset.Charset r12 = f10341s0
            r11.<init>(r4, r12)
            cv1$c r4 = p000.cv1.C2122c.m14572a(r11)
            r9.put(r8, r4)
        L_0x0106:
            r9 = r2
        L_0x0107:
            r2 = r7
            goto L_0x015b
        L_0x0109:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid exif"
            r1.<init>(r2)
            throw r1
        L_0x0111:
            byte[] r4 = new byte[r8]
            r1.readFully(r4)
            int r9 = r2 + r8
            byte[] r11 = f10342t0
            boolean r12 = m14525N(r4, r11)
            if (r12 == 0) goto L_0x012d
            int r12 = r11.length
            int r2 = r2 + r12
            int r11 = r11.length
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r11, r8)
            r0.f10365p = r2
            r0.mo18300J(r4, r3)
            goto L_0x0107
        L_0x012d:
            byte[] r11 = f10343u0
            boolean r12 = m14525N(r4, r11)
            if (r12 == 0) goto L_0x0107
            int r12 = r11.length
            int r2 = r2 + r12
            int r11 = r11.length
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r11, r8)
            java.lang.String r8 = "Xmp"
            java.lang.String r11 = r0.mo18308e(r8)
            if (r11 != 0) goto L_0x0107
            java.util.HashMap<java.lang.String, cv1$c>[] r11 = r0.f10355f
            r11 = r11[r10]
            cv1$c r15 = new cv1$c
            r13 = 1
            int r14 = r4.length
            long r6 = (long) r2
            r12 = r15
            r2 = r15
            r15 = r6
            r17 = r4
            r12.<init>(r13, r14, r15, r17)
            r11.put(r8, r2)
            r2 = 1
            r0.f10371v = r2
        L_0x015b:
            r8 = r10
        L_0x015c:
            if (r8 < 0) goto L_0x0173
            int r4 = r1.skipBytes(r8)
            if (r4 != r8) goto L_0x016b
            int r4 = r9 + r8
            r7 = r2
            r2 = r4
            r6 = -1
            goto L_0x0036
        L_0x016b:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid JPEG segment"
            r1.<init>(r2)
            throw r1
        L_0x0173:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r5)
            throw r1
        L_0x0179:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r5)
            throw r1
        L_0x017f:
            java.nio.ByteOrder r2 = r0.f10357h
            r1.mo18336e(r2)
            return
        L_0x0185:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid marker:"
            r2.append(r3)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01a2:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01bd:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cv1.mo18312i(cv1$b, int, int):void");
    }

    /* renamed from: j */
    public final int mo18313j(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m14530w(bArr)) {
            return 4;
        }
        if (mo18327z(bArr)) {
            return 9;
        }
        if (mo18324v(bArr)) {
            return 12;
        }
        if (mo18325x(bArr)) {
            return 7;
        }
        if (mo18292A(bArr)) {
            return 10;
        }
        if (mo18326y(bArr)) {
            return 13;
        }
        if (mo18295E(bArr)) {
            return 14;
        }
        return 0;
    }

    /* renamed from: k */
    public final void mo18314k(C2121b bVar) throws IOException {
        int i;
        int i2;
        mo18317n(bVar);
        C2122c cVar = this.f10355f[1].get("MakerNote");
        if (cVar != null) {
            C2121b bVar2 = new C2121b(cVar.f10384d);
            bVar2.mo18336e(this.f10357h);
            byte[] bArr = f10303G;
            byte[] bArr2 = new byte[bArr.length];
            bVar2.readFully(bArr2);
            bVar2.mo18335d(0);
            byte[] bArr3 = f10304H;
            byte[] bArr4 = new byte[bArr3.length];
            bVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                bVar2.mo18335d(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                bVar2.mo18335d(12);
            }
            mo18301K(bVar2, 6);
            C2122c cVar2 = this.f10355f[7].get("PreviewImageStart");
            C2122c cVar3 = this.f10355f[7].get("PreviewImageLength");
            if (!(cVar2 == null || cVar3 == null)) {
                this.f10355f[5].put("JPEGInterchangeFormat", cVar2);
                this.f10355f[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            C2122c cVar4 = this.f10355f[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.mo18357k(this.f10357h);
                if (iArr == null || iArr.length != 4) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid aspect frame values. frame=");
                    sb.append(Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 > i4 && (i = iArr[3]) > (i2 = iArr[1])) {
                    int i5 = (i3 - i4) + 1;
                    int i6 = (i - i2) + 1;
                    if (i5 < i6) {
                        int i7 = i5 + i6;
                        i6 = i7 - i6;
                        i5 = i7 - i6;
                    }
                    C2122c f = C2122c.m14577f(i5, this.f10357h);
                    C2122c f2 = C2122c.m14577f(i6, this.f10357h);
                    this.f10355f[0].put("ImageWidth", f);
                    this.f10355f[0].put("ImageLength", f2);
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo18315l(C2121b bVar) throws IOException {
        if (f10345w) {
            StringBuilder sb = new StringBuilder();
            sb.append("getPngAttributes starting with: ");
            sb.append(bVar);
        }
        bVar.mo18336e(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f10305I;
        bVar.skipBytes(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i2 = i + 4;
                    if (i2 == 16) {
                        if (!Arrays.equals(bArr2, f10307K)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, f10308L)) {
                        if (Arrays.equals(bArr2, f10306J)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f10365p = i2;
                                    mo18300J(bArr3, 0);
                                    mo18306Q();
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + m14526b(bArr2));
                        }
                        int i3 = readInt + 4;
                        bVar.skipBytes(i3);
                        length = i2 + i3;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: m */
    public final void mo18316m(C2121b bVar) throws IOException {
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        bVar.read(bArr);
        bVar.skipBytes(4);
        bVar.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        mo18312i(bVar, i, 5);
        bVar.mo18335d((long) i2);
        bVar.mo18336e(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (f10345w) {
            StringBuilder sb = new StringBuilder();
            sb.append("numberOfDirectoryEntry: ");
            sb.append(readInt);
        }
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f10328f0.f10385a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                C2122c f = C2122c.m14577f(readShort, this.f10357h);
                C2122c f2 = C2122c.m14577f(readShort2, this.f10357h);
                this.f10355f[0].put("ImageLength", f);
                this.f10355f[0].put("ImageWidth", f2);
                if (f10345w) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Updated to length: ");
                    sb2.append(readShort);
                    sb2.append(", width: ");
                    sb2.append(readShort2);
                    return;
                }
                return;
            }
            bVar.skipBytes(readUnsignedShort2);
        }
    }

    /* renamed from: n */
    public final void mo18317n(C2121b bVar) throws IOException {
        C2122c cVar;
        mo18297G(bVar, bVar.available());
        mo18301K(bVar, 0);
        mo18305P(bVar, 0);
        mo18305P(bVar, 5);
        mo18305P(bVar, 4);
        mo18306Q();
        if (this.f10353d == 8 && (cVar = this.f10355f[1].get("MakerNote")) != null) {
            C2121b bVar2 = new C2121b(cVar.f10384d);
            bVar2.mo18336e(this.f10357h);
            bVar2.mo18335d(6);
            mo18301K(bVar2, 9);
            C2122c cVar2 = this.f10355f[9].get("ColorSpace");
            if (cVar2 != null) {
                this.f10355f[1].put("ColorSpace", cVar2);
            }
        }
    }

    /* renamed from: o */
    public final void mo18318o(C2121b bVar) throws IOException {
        mo18317n(bVar);
        if (this.f10355f[0].get("JpgFromRaw") != null) {
            mo18312i(bVar, this.f10369t, 5);
        }
        C2122c cVar = this.f10355f[0].get("ISO");
        C2122c cVar2 = this.f10355f[1].get("PhotographicSensitivity");
        if (cVar != null && cVar2 == null) {
            this.f10355f[1].put("PhotographicSensitivity", cVar);
        }
    }

    /* renamed from: p */
    public final void mo18319p(C2121b bVar) throws IOException {
        byte[] bArr = f10342t0;
        bVar.skipBytes(bArr.length);
        byte[] bArr2 = new byte[bVar.available()];
        bVar.readFully(bArr2);
        this.f10365p = bArr.length;
        mo18300J(bArr2, 0);
    }

    /* renamed from: q */
    public final void mo18320q(C2121b bVar) throws IOException {
        if (f10345w) {
            StringBuilder sb = new StringBuilder();
            sb.append("getWebpAttributes starting with: ");
            sb.append(bVar);
        }
        bVar.mo18336e(ByteOrder.LITTLE_ENDIAN);
        bVar.skipBytes(f10309M.length);
        int readInt = bVar.readInt() + 8;
        int skipBytes = bVar.skipBytes(f10310N.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) == 4) {
                    int readInt2 = bVar.readInt();
                    int i = skipBytes + 4 + 4;
                    if (Arrays.equals(f10311O, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (bVar.read(bArr2) == readInt2) {
                            this.f10365p = i;
                            mo18300J(bArr2, 0);
                            this.f10365p = i;
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + m14526b(bArr));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i2 = i + readInt2;
                    if (i2 != readInt) {
                        if (i2 <= readInt) {
                            int skipBytes2 = bVar.skipBytes(readInt2);
                            if (skipBytes2 == readInt2) {
                                skipBytes = i + skipBytes2;
                            } else {
                                throw new IOException("Encountered WebP file with invalid chunk size");
                            }
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: r */
    public final void mo18321r(C2121b bVar, HashMap hashMap) throws IOException {
        C2122c cVar = (C2122c) hashMap.get("JPEGInterchangeFormat");
        C2122c cVar2 = (C2122c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int i = cVar.mo18355i(this.f10357h);
            int i2 = cVar2.mo18355i(this.f10357h);
            if (this.f10353d == 7) {
                i += this.f10366q;
            }
            int min = Math.min(i2, bVar.mo18331a() - i);
            if (i > 0 && min > 0) {
                this.f10358i = true;
                int i3 = this.f10365p + i;
                this.f10361l = i3;
                this.f10362m = min;
                if (this.f10350a == null && this.f10352c == null && this.f10351b == null) {
                    byte[] bArr = new byte[min];
                    bVar.mo18335d((long) i3);
                    bVar.readFully(bArr);
                    this.f10363n = bArr;
                }
            }
            if (f10345w) {
                StringBuilder sb = new StringBuilder();
                sb.append("Setting thumbnail attributes with offset: ");
                sb.append(i);
                sb.append(", length: ");
                sb.append(min);
            }
        }
    }

    /* renamed from: s */
    public final void mo18322s(C2121b bVar, HashMap hashMap) throws IOException {
        C2121b bVar2 = bVar;
        HashMap hashMap2 = hashMap;
        C2122c cVar = (C2122c) hashMap2.get("StripOffsets");
        C2122c cVar2 = (C2122c) hashMap2.get("StripByteCounts");
        if (cVar != null && cVar2 != null) {
            long[] d = m14528d(cVar.mo18357k(this.f10357h));
            long[] d2 = m14528d(cVar2.mo18357k(this.f10357h));
            if (d != null && d.length != 0 && d2 != null && d2.length != 0 && d.length == d2.length) {
                long j = 0;
                for (long j2 : d2) {
                    j += j2;
                }
                int i = (int) j;
                byte[] bArr = new byte[i];
                this.f10360k = true;
                this.f10359j = true;
                this.f10358i = true;
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < d.length; i4++) {
                    int i5 = (int) d[i4];
                    int i6 = (int) d2[i4];
                    if (i4 < d.length - 1 && ((long) (i5 + i6)) != d[i4 + 1]) {
                        this.f10360k = false;
                    }
                    int i7 = i5 - i2;
                    bVar2.mo18335d((long) i7);
                    int i8 = i2 + i7;
                    byte[] bArr2 = new byte[i6];
                    bVar2.read(bArr2);
                    i2 = i8 + i6;
                    System.arraycopy(bArr2, 0, bArr, i3, i6);
                    i3 += i6;
                }
                this.f10363n = bArr;
                if (this.f10360k) {
                    this.f10361l = ((int) d[0]) + this.f10365p;
                    this.f10362m = i;
                }
            }
        }
    }

    /* renamed from: t */
    public final void mo18323t(String str) throws IOException {
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.f10352c = null;
            this.f10350a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    if (m14524B(fileInputStream2.getFD())) {
                        this.f10351b = fileInputStream2.getFD();
                    } else {
                        this.f10351b = null;
                    }
                    mo18296F(fileInputStream2);
                    m14527c(fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    m14527c(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                m14527c(fileInputStream);
                throw th;
            }
        } else {
            throw new NullPointerException("filename cannot be null");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0090, code lost:
        r1.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x008c */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0096  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo18324v(byte[] r15) throws java.io.IOException {
        /*
            r14 = this;
            r0 = 0
            r1 = 0
            cv1$b r2 = new cv1$b     // Catch:{ Exception -> 0x008c }
            r2.<init>((byte[]) r15)     // Catch:{ Exception -> 0x008c }
            int r1 = r2.readInt()     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r3 = (long) r1     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r1 = 4
            byte[] r5 = new byte[r1]     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r2.read(r5)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            byte[] r6 = f10300D     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r5 = java.util.Arrays.equals(r5, r6)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r5 != 0) goto L_0x001e
            r2.close()
            return r0
        L_0x001e:
            r5 = 1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r8 = 16
            r10 = 8
            if (r7 != 0) goto L_0x0034
            long r3 = r2.readLong()     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x0035
            r2.close()
            return r0
        L_0x0034:
            r8 = r10
        L_0x0035:
            int r7 = r15.length     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r12 = (long) r7     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x003d
            int r15 = r15.length     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            long r3 = (long) r15
        L_0x003d:
            long r3 = r3 - r8
            int r15 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r15 >= 0) goto L_0x0046
            r2.close()
            return r0
        L_0x0046:
            byte[] r15 = new byte[r1]     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r7 = 0
            r9 = r0
            r10 = r9
        L_0x004c:
            r11 = 4
            long r11 = r3 / r11
            int r11 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0081
            int r11 = r2.read(r15)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r11 == r1) goto L_0x005e
            r2.close()
            return r0
        L_0x005e:
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x0063
            goto L_0x007f
        L_0x0063:
            byte[] r11 = f10301E     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            r12 = 1
            if (r11 == 0) goto L_0x006e
            r9 = r12
            goto L_0x0077
        L_0x006e:
            byte[] r11 = f10302F     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x0088, all -> 0x0085 }
            if (r11 == 0) goto L_0x0077
            r10 = r12
        L_0x0077:
            if (r9 == 0) goto L_0x007f
            if (r10 == 0) goto L_0x007f
            r2.close()
            return r12
        L_0x007f:
            long r7 = r7 + r5
            goto L_0x004c
        L_0x0081:
            r2.close()
            goto L_0x0093
        L_0x0085:
            r15 = move-exception
            r1 = r2
            goto L_0x0094
        L_0x0088:
            r1 = r2
            goto L_0x008c
        L_0x008a:
            r15 = move-exception
            goto L_0x0094
        L_0x008c:
            boolean r15 = f10345w     // Catch:{ all -> 0x008a }
            if (r1 == 0) goto L_0x0093
            r1.close()
        L_0x0093:
            return r0
        L_0x0094:
            if (r1 == 0) goto L_0x0099
            r1.close()
        L_0x0099:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cv1.mo18324v(byte[]):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002f  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo18325x(byte[] r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            cv1$b r2 = new cv1$b     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            java.nio.ByteOrder r4 = r3.mo18299I(r2)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r3.f10357h = r4     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r2.mo18336e(r4)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r1 = 20306(0x4f52, float:2.8455E-41)
            if (r4 == r1) goto L_0x001c
            r1 = 21330(0x5352, float:2.989E-41)
            if (r4 != r1) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            r2.close()
            return r0
        L_0x0021:
            r4 = move-exception
            r1 = r2
            goto L_0x0027
        L_0x0024:
            r1 = r2
            goto L_0x002d
        L_0x0026:
            r4 = move-exception
        L_0x0027:
            if (r1 == 0) goto L_0x002c
            r1.close()
        L_0x002c:
            throw r4
        L_0x002d:
            if (r1 == 0) goto L_0x0032
            r1.close()
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cv1.mo18325x(byte[]):boolean");
    }

    /* renamed from: y */
    public final boolean mo18326y(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f10305I;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: z */
    public final boolean mo18327z(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: cv1$d */
    /* compiled from: ExifInterface */
    public static class C2123d {

        /* renamed from: a */
        public final int f10385a;

        /* renamed from: b */
        public final String f10386b;

        /* renamed from: c */
        public final int f10387c;

        /* renamed from: d */
        public final int f10388d;

        public C2123d(String str, int i, int i2) {
            this.f10386b = str;
            this.f10385a = i;
            this.f10387c = i2;
            this.f10388d = -1;
        }

        /* renamed from: a */
        public boolean mo18359a(int i) {
            int i2;
            int i3 = this.f10387c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.f10388d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            if ((i3 == 12 || i2 == 12) && i == 11) {
                return true;
            }
            return false;
        }

        public C2123d(String str, int i, int i2, int i3) {
            this.f10386b = str;
            this.f10385a = i;
            this.f10387c = i2;
            this.f10388d = i3;
        }
    }

    public cv1(InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    public cv1(InputStream inputStream, boolean z) throws IOException {
        C2123d[][] dVarArr = f10333k0;
        this.f10355f = new HashMap[dVarArr.length];
        this.f10356g = new HashSet(dVarArr.length);
        this.f10357h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f10350a = null;
            if (z) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
                if (m14529u(bufferedInputStream)) {
                    this.f10354e = true;
                    this.f10352c = null;
                    this.f10351b = null;
                    inputStream = bufferedInputStream;
                } else {
                    return;
                }
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f10352c = (AssetManager.AssetInputStream) inputStream;
                this.f10351b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (m14524B(fileInputStream.getFD())) {
                        this.f10352c = null;
                        this.f10351b = fileInputStream.getFD();
                    }
                }
                this.f10352c = null;
                this.f10351b = null;
            }
            mo18296F(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
