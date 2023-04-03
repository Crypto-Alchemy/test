package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u00132\u00020\u0001:\u0001\u0005B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, mo44877d2 = {"Lug2;", "Lcq2;", "Landroid/graphics/Canvas;", "canvas", "Lr37;", "a", "Landroid/graphics/Paint;", "i", "Landroid/graphics/Paint;", "fgPaint", "", "f", "()I", "color", "width", "height", "hash", "<init>", "(III)V", "j", "library-identicon_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ug2 */
/* compiled from: GithubIdenticonDrawable.kt */
public final class ug2 extends cq2 {

    /* renamed from: j */
    public static final C6570a f34595j = new C6570a((DefaultConstructorMarker) null);

    /* renamed from: k */
    public static int[] f34596k = new int[60];

    /* renamed from: i */
    public final Paint f34597i;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lug2$a;", "", "<init>", "()V", "library-identicon_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ug2$a */
    /* compiled from: GithubIdenticonDrawable.kt */
    public static final class C6570a {
        public C6570a() {
        }

        public /* synthetic */ C6570a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            for (int i3 = 0; i3 < 4; i3++) {
                for (int i4 = 0; i4 < 4; i4++) {
                    if (i2 != i3 || i3 != i4) {
                        f34596k[i] = ((((i2 * 25) + 150) * 65536) - 16777216) + (((i3 * 25) + 150) * 256) + 150 + (i4 * 25);
                        i++;
                    }
                }
            }
        }
    }

    public ug2(int i, int i2, int i3) {
        super(i, i2, i3, 5);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f34597i = paint;
        mo41608c();
    }

    /* renamed from: a */
    public void mo41606a(Canvas canvas) {
        boolean z;
        int i;
        Canvas canvas2 = canvas;
        vx2.m53591g(canvas2, "canvas");
        this.f34597i.setColor(mo48397f());
        int width = (int) (((float) canvas.getWidth()) / 5.0f);
        int height = (int) (((float) canvas.getHeight()) / 5.0f);
        canvas2.drawColor(-1);
        int i2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = i3 * width;
            int i5 = i4 + width;
            int i6 = (4 - i3) * width;
            int i7 = i6 + width;
            int i8 = 0;
            while (i8 < 5) {
                int i9 = i2 + 1;
                if ((mo41607b() >> i2) % 2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    float f = (float) (i8 * height);
                    float f2 = f + ((float) height);
                    Canvas canvas3 = canvas;
                    float f3 = (float) i5;
                    float f4 = f;
                    i = i8;
                    canvas3.drawRect((float) i4, f, f3, f2, this.f34597i);
                    if (i3 != 2) {
                        canvas.drawRect((float) i6, f4, (float) i7, f2, this.f34597i);
                    }
                } else {
                    i = i8;
                }
                i8 = i + 1;
                i2 = i9;
            }
        }
    }

    /* renamed from: f */
    public final int mo48397f() {
        return f34596k[Math.abs((mo41607b() >> 15) % f34596k.length)];
    }
}
