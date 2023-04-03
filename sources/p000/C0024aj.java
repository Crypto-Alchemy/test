package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.wm4;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u001a\u0010$\u001a\u00020\u000e8VX\u0004¢\u0006\f\u0012\u0004\b\"\u0010#\u001a\u0004\b\u0013\u0010!R\u0014\u0010%\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010!\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, mo44877d2 = {"Laj;", "Ltm4;", "La95;", "rect", "Lr37;", "c", "Lyh5;", "roundRect", "b", "reset", "path1", "path2", "Lwm4;", "operation", "", "d", "(Ltm4;Ltm4;I)Z", "e", "Landroid/graphics/Path;", "a", "Landroid/graphics/Path;", "f", "()Landroid/graphics/Path;", "internalPath", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "rectF", "", "[F", "radii", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "mMatrix", "()Z", "isConvex$annotations", "()V", "isConvex", "isEmpty", "<init>", "(Landroid/graphics/Path;)V", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: aj */
/* compiled from: AndroidPath.android.kt */
public final class C0024aj implements tm4 {

    /* renamed from: a */
    public final Path f144a;

    /* renamed from: b */
    public final RectF f145b;

    /* renamed from: c */
    public final float[] f146c;

    /* renamed from: d */
    public final Matrix f147d;

    public C0024aj() {
        this((Path) null, 1, (DefaultConstructorMarker) null);
    }

    public C0024aj(Path path) {
        vx2.m53591g(path, "internalPath");
        this.f144a = path;
        this.f145b = new RectF();
        this.f146c = new float[8];
        this.f147d = new Matrix();
    }

    /* renamed from: a */
    public boolean mo312a() {
        return this.f144a.isConvex();
    }

    /* renamed from: b */
    public void mo313b(yh5 yh5) {
        vx2.m53591g(yh5, "roundRect");
        this.f145b.set(yh5.mo28069e(), yh5.mo28072g(), yh5.mo28071f(), yh5.mo28065a());
        this.f146c[0] = bu0.m11576d(yh5.mo28073h());
        this.f146c[1] = bu0.m11577e(yh5.mo28073h());
        this.f146c[2] = bu0.m11576d(yh5.mo28075i());
        this.f146c[3] = bu0.m11577e(yh5.mo28075i());
        this.f146c[4] = bu0.m11576d(yh5.mo28067c());
        this.f146c[5] = bu0.m11577e(yh5.mo28067c());
        this.f146c[6] = bu0.m11576d(yh5.mo28066b());
        this.f146c[7] = bu0.m11577e(yh5.mo28066b());
        this.f144a.addRoundRect(this.f145b, this.f146c, Path.Direction.CCW);
    }

    /* renamed from: c */
    public void mo314c(a95 a95) {
        vx2.m53591g(a95, "rect");
        if (mo316e(a95)) {
            this.f145b.set(c95.m11757b(a95));
            this.f144a.addRect(this.f145b, Path.Direction.CCW);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: d */
    public boolean mo315d(tm4 tm4, tm4 tm42, int i) {
        Path.Op op;
        vx2.m53591g(tm4, "path1");
        vx2.m53591g(tm42, "path2");
        wm4.C3557a aVar = wm4.f19177a;
        if (wm4.m29633f(i, aVar.mo27556a())) {
            op = Path.Op.DIFFERENCE;
        } else if (wm4.m29633f(i, aVar.mo27557b())) {
            op = Path.Op.INTERSECT;
        } else if (wm4.m29633f(i, aVar.mo27558c())) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else if (wm4.m29633f(i, aVar.mo27559d())) {
            op = Path.Op.UNION;
        } else {
            op = Path.Op.XOR;
        }
        Path path = this.f144a;
        if (tm4 instanceof C0024aj) {
            Path f = ((C0024aj) tm4).mo317f();
            if (tm42 instanceof C0024aj) {
                return path.op(f, ((C0024aj) tm42).mo317f(), op);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: e */
    public final boolean mo316e(a95 a95) {
        if (!(!Float.isNaN(a95.mo118f()))) {
            throw new IllegalStateException("Rect.left is NaN".toString());
        } else if (!(!Float.isNaN(a95.mo122i()))) {
            throw new IllegalStateException("Rect.top is NaN".toString());
        } else if (!(!Float.isNaN(a95.mo119g()))) {
            throw new IllegalStateException("Rect.right is NaN".toString());
        } else if (!Float.isNaN(a95.mo114c())) {
            return true;
        } else {
            throw new IllegalStateException("Rect.bottom is NaN".toString());
        }
    }

    /* renamed from: f */
    public final Path mo317f() {
        return this.f144a;
    }

    public boolean isEmpty() {
        return this.f144a.isEmpty();
    }

    public void reset() {
        this.f144a.reset();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0024aj(Path path, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Path() : path);
    }
}
