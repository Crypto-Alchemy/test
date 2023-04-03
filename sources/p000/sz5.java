package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: sz5 */
/* compiled from: ShapeAppearancePathProvider */
public class sz5 {

    /* renamed from: a */
    public final uz5[] f34061a = new uz5[4];

    /* renamed from: b */
    public final Matrix[] f34062b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f34063c = new Matrix[4];

    /* renamed from: d */
    public final PointF f34064d = new PointF();

    /* renamed from: e */
    public final Path f34065e = new Path();

    /* renamed from: f */
    public final Path f34066f = new Path();

    /* renamed from: g */
    public final uz5 f34067g = new uz5();

    /* renamed from: h */
    public final float[] f34068h = new float[2];

    /* renamed from: i */
    public final float[] f34069i = new float[2];

    /* renamed from: j */
    public final Path f34070j = new Path();

    /* renamed from: k */
    public final Path f34071k = new Path();

    /* renamed from: l */
    public boolean f34072l = true;

    /* renamed from: sz5$a */
    /* compiled from: ShapeAppearancePathProvider */
    public static class C6508a {

        /* renamed from: a */
        public static final sz5 f34073a = new sz5();
    }

    /* renamed from: sz5$b */
    /* compiled from: ShapeAppearancePathProvider */
    public interface C6509b {
        /* renamed from: a */
        void mo47949a(uz5 uz5, Matrix matrix, int i);

        /* renamed from: b */
        void mo47950b(uz5 uz5, Matrix matrix, int i);
    }

    /* renamed from: sz5$c */
    /* compiled from: ShapeAppearancePathProvider */
    public static final class C6510c {

        /* renamed from: a */
        public final rz5 f34074a;

        /* renamed from: b */
        public final Path f34075b;

        /* renamed from: c */
        public final RectF f34076c;

        /* renamed from: d */
        public final C6509b f34077d;

        /* renamed from: e */
        public final float f34078e;

        public C6510c(rz5 rz5, float f, RectF rectF, C6509b bVar, Path path) {
            this.f34077d = bVar;
            this.f34074a = rz5;
            this.f34078e = f;
            this.f34076c = rectF;
            this.f34075b = path;
        }
    }

    public sz5() {
        for (int i = 0; i < 4; i++) {
            this.f34061a[i] = new uz5();
            this.f34062b[i] = new Matrix();
            this.f34063c[i] = new Matrix();
        }
    }

    /* renamed from: k */
    public static sz5 m52000k() {
        return C6508a.f34073a;
    }

    /* renamed from: a */
    public final float mo47936a(int i) {
        return (float) ((i + 1) * 90);
    }

    /* renamed from: b */
    public final void mo47937b(C6510c cVar, int i) {
        this.f34068h[0] = this.f34061a[i].mo48563k();
        this.f34068h[1] = this.f34061a[i].mo48564l();
        this.f34062b[i].mapPoints(this.f34068h);
        if (i == 0) {
            Path path = cVar.f34075b;
            float[] fArr = this.f34068h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f34075b;
            float[] fArr2 = this.f34068h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f34061a[i].mo48556d(this.f34062b[i], cVar.f34075b);
        C6509b bVar = cVar.f34077d;
        if (bVar != null) {
            bVar.mo47949a(this.f34061a[i], this.f34062b[i], i);
        }
    }

    /* renamed from: c */
    public final void mo47938c(C6510c cVar, int i) {
        int i2 = (i + 1) % 4;
        this.f34068h[0] = this.f34061a[i].mo48561i();
        this.f34068h[1] = this.f34061a[i].mo48562j();
        this.f34062b[i].mapPoints(this.f34068h);
        this.f34069i[0] = this.f34061a[i2].mo48563k();
        this.f34069i[1] = this.f34061a[i2].mo48564l();
        this.f34062b[i2].mapPoints(this.f34069i);
        float[] fArr = this.f34068h;
        float f = fArr[0];
        float[] fArr2 = this.f34069i;
        float max = Math.max(((float) Math.hypot((double) (f - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, Utils.FLOAT_EPSILON);
        float i3 = mo47944i(cVar.f34076c, i);
        this.f34067g.mo48566n(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
        mn1 j = mo47945j(i, cVar.f34074a);
        j.mo42935b(max, i3, cVar.f34078e, this.f34067g);
        this.f34070j.reset();
        this.f34067g.mo48556d(this.f34063c[i], this.f34070j);
        if (!this.f34072l || (!j.mo42934a() && !mo47946l(this.f34070j, i) && !mo47946l(this.f34070j, i2))) {
            this.f34067g.mo48556d(this.f34063c[i], cVar.f34075b);
        } else {
            Path path = this.f34070j;
            path.op(path, this.f34066f, Path.Op.DIFFERENCE);
            this.f34068h[0] = this.f34067g.mo48563k();
            this.f34068h[1] = this.f34067g.mo48564l();
            this.f34063c[i].mapPoints(this.f34068h);
            Path path2 = this.f34065e;
            float[] fArr3 = this.f34068h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f34067g.mo48556d(this.f34063c[i], this.f34065e);
        }
        C6509b bVar = cVar.f34077d;
        if (bVar != null) {
            bVar.mo47950b(this.f34067g, this.f34063c[i], i);
        }
    }

    /* renamed from: d */
    public void mo47939d(rz5 rz5, float f, RectF rectF, C6509b bVar, Path path) {
        path.rewind();
        this.f34065e.rewind();
        this.f34066f.rewind();
        this.f34066f.addRect(rectF, Path.Direction.CW);
        C6510c cVar = new C6510c(rz5, f, rectF, bVar, path);
        for (int i = 0; i < 4; i++) {
            mo47947m(cVar, i);
            mo47948n(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            mo47937b(cVar, i2);
            mo47938c(cVar, i2);
        }
        path.close();
        this.f34065e.close();
        if (!this.f34065e.isEmpty()) {
            path.op(this.f34065e, Path.Op.UNION);
        }
    }

    /* renamed from: e */
    public void mo47940e(rz5 rz5, float f, RectF rectF, Path path) {
        mo47939d(rz5, f, rectF, (C6509b) null, path);
    }

    /* renamed from: f */
    public final void mo47941f(int i, RectF rectF, PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    /* renamed from: g */
    public final du0 mo47942g(int i, rz5 rz5) {
        if (i == 1) {
            return rz5.mo47576l();
        }
        if (i == 2) {
            return rz5.mo47574j();
        }
        if (i != 3) {
            return rz5.mo47583t();
        }
        return rz5.mo47581r();
    }

    /* renamed from: h */
    public final eu0 mo47943h(int i, rz5 rz5) {
        if (i == 1) {
            return rz5.mo47575k();
        }
        if (i == 2) {
            return rz5.mo47573i();
        }
        if (i != 3) {
            return rz5.mo47582s();
        }
        return rz5.mo47580q();
    }

    /* renamed from: i */
    public final float mo47944i(RectF rectF, int i) {
        float[] fArr = this.f34068h;
        uz5 uz5 = this.f34061a[i];
        fArr[0] = uz5.f34764c;
        fArr[1] = uz5.f34765d;
        this.f34062b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            return Math.abs(rectF.centerX() - this.f34068h[0]);
        }
        return Math.abs(rectF.centerY() - this.f34068h[1]);
    }

    /* renamed from: j */
    public final mn1 mo47945j(int i, rz5 rz5) {
        if (i == 1) {
            return rz5.mo47572h();
        }
        if (i == 2) {
            return rz5.mo47577n();
        }
        if (i != 3) {
            return rz5.mo47578o();
        }
        return rz5.mo47579p();
    }

    /* renamed from: l */
    public final boolean mo47946l(Path path, int i) {
        this.f34071k.reset();
        this.f34061a[i].mo48556d(this.f34062b[i], this.f34071k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f34071k.computeBounds(rectF, true);
        path.op(this.f34071k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final void mo47947m(C6510c cVar, int i) {
        mo47943h(i, cVar.f34074a).mo42423b(this.f34061a[i], 90.0f, cVar.f34078e, cVar.f34076c, mo47942g(i, cVar.f34074a));
        float a = mo47936a(i);
        this.f34062b[i].reset();
        mo47941f(i, cVar.f34076c, this.f34064d);
        Matrix matrix = this.f34062b[i];
        PointF pointF = this.f34064d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f34062b[i].preRotate(a);
    }

    /* renamed from: n */
    public final void mo47948n(int i) {
        this.f34068h[0] = this.f34061a[i].mo48561i();
        this.f34068h[1] = this.f34061a[i].mo48562j();
        this.f34062b[i].mapPoints(this.f34068h);
        float a = mo47936a(i);
        this.f34063c[i].reset();
        Matrix matrix = this.f34063c[i];
        float[] fArr = this.f34068h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f34063c[i].preRotate(a);
    }
}
