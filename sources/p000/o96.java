package p000;

import java.io.PrintWriter;

/* renamed from: o96 */
/* compiled from: StatsSnapshot */
public class o96 {

    /* renamed from: a */
    public final int f32324a;

    /* renamed from: b */
    public final int f32325b;

    /* renamed from: c */
    public final long f32326c;

    /* renamed from: d */
    public final long f32327d;

    /* renamed from: e */
    public final long f32328e;

    /* renamed from: f */
    public final long f32329f;

    /* renamed from: g */
    public final long f32330g;

    /* renamed from: h */
    public final long f32331h;

    /* renamed from: i */
    public final long f32332i;

    /* renamed from: j */
    public final long f32333j;

    /* renamed from: k */
    public final int f32334k;

    /* renamed from: l */
    public final int f32335l;

    /* renamed from: m */
    public final int f32336m;

    /* renamed from: n */
    public final long f32337n;

    public o96(int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, long j9) {
        this.f32324a = i;
        this.f32325b = i2;
        this.f32326c = j;
        this.f32327d = j2;
        this.f32328e = j3;
        this.f32329f = j4;
        this.f32330g = j5;
        this.f32331h = j6;
        this.f32332i = j7;
        this.f32333j = j8;
        this.f32334k = i3;
        this.f32335l = i4;
        this.f32336m = i5;
        this.f32337n = j9;
    }

    /* renamed from: a */
    public void mo46362a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f32324a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f32325b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((double) ((((float) this.f32325b) / ((float) this.f32324a)) * 100.0f)));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f32326c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f32327d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f32334k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f32328e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f32331h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f32335l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f32329f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f32336m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f32330g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f32332i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f32333j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f32324a + ", size=" + this.f32325b + ", cacheHits=" + this.f32326c + ", cacheMisses=" + this.f32327d + ", downloadCount=" + this.f32334k + ", totalDownloadSize=" + this.f32328e + ", averageDownloadSize=" + this.f32331h + ", totalOriginalBitmapSize=" + this.f32329f + ", totalTransformedBitmapSize=" + this.f32330g + ", averageOriginalBitmapSize=" + this.f32332i + ", averageTransformedBitmapSize=" + this.f32333j + ", originalBitmapCount=" + this.f32335l + ", transformedBitmapCount=" + this.f32336m + ", timeStamp=" + this.f32337n + '}';
    }
}
