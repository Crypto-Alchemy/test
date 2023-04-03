package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: uz5 */
/* compiled from: ShapePath */
public class uz5 {
    @Deprecated

    /* renamed from: a */
    public float f34762a;
    @Deprecated

    /* renamed from: b */
    public float f34763b;
    @Deprecated

    /* renamed from: c */
    public float f34764c;
    @Deprecated

    /* renamed from: d */
    public float f34765d;
    @Deprecated

    /* renamed from: e */
    public float f34766e;
    @Deprecated

    /* renamed from: f */
    public float f34767f;

    /* renamed from: g */
    public final List<C6594f> f34768g = new ArrayList();

    /* renamed from: h */
    public final List<C6595g> f34769h = new ArrayList();

    /* renamed from: i */
    public boolean f34770i;

    /* renamed from: uz5$a */
    /* compiled from: ShapePath */
    public class C6589a extends C6595g {

        /* renamed from: b */
        public final /* synthetic */ List f34771b;

        /* renamed from: c */
        public final /* synthetic */ Matrix f34772c;

        public C6589a(List list, Matrix matrix) {
            this.f34771b = list;
            this.f34772c = matrix;
        }

        /* renamed from: b */
        public void mo48574b(Matrix matrix, oz5 oz5, int i, Canvas canvas) {
            for (C6595g b : this.f34771b) {
                b.mo48574b(this.f34772c, oz5, i, canvas);
            }
        }
    }

    /* renamed from: uz5$b */
    /* compiled from: ShapePath */
    public static class C6590b extends C6595g {

        /* renamed from: b */
        public final C6592d f34774b;

        public C6590b(C6592d dVar) {
            this.f34774b = dVar;
        }

        /* renamed from: b */
        public void mo48574b(Matrix matrix, oz5 oz5, int i, Canvas canvas) {
            float h = this.f34774b.mo48580m();
            float i2 = this.f34774b.mo48581n();
            oz5.mo46578a(canvas, matrix, new RectF(this.f34774b.mo48578k(), this.f34774b.mo48582o(), this.f34774b.mo48579l(), this.f34774b.mo48577j()), i, h, i2);
        }
    }

    /* renamed from: uz5$c */
    /* compiled from: ShapePath */
    public static class C6591c extends C6595g {

        /* renamed from: b */
        public final C6593e f34775b;

        /* renamed from: c */
        public final float f34776c;

        /* renamed from: d */
        public final float f34777d;

        public C6591c(C6593e eVar, float f, float f2) {
            this.f34775b = eVar;
            this.f34776c = f;
            this.f34777d = f2;
        }

        /* renamed from: b */
        public void mo48574b(Matrix matrix, oz5 oz5, int i, Canvas canvas) {
            RectF rectF = new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) Math.hypot((double) (this.f34775b.f34786c - this.f34777d), (double) (this.f34775b.f34785b - this.f34776c)), Utils.FLOAT_EPSILON);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f34776c, this.f34777d);
            matrix2.preRotate(mo48575c());
            oz5.mo46579b(canvas, matrix2, rectF, i);
        }

        /* renamed from: c */
        public float mo48575c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f34775b.f34786c - this.f34777d) / (this.f34775b.f34785b - this.f34776c))));
        }
    }

    /* renamed from: uz5$d */
    /* compiled from: ShapePath */
    public static class C6592d extends C6594f {

        /* renamed from: h */
        public static final RectF f34778h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f34779b;
        @Deprecated

        /* renamed from: c */
        public float f34780c;
        @Deprecated

        /* renamed from: d */
        public float f34781d;
        @Deprecated

        /* renamed from: e */
        public float f34782e;
        @Deprecated

        /* renamed from: f */
        public float f34783f;
        @Deprecated

        /* renamed from: g */
        public float f34784g;

        public C6592d(float f, float f2, float f3, float f4) {
            mo48584q(f);
            mo48588u(f2);
            mo48585r(f3);
            mo48583p(f4);
        }

        /* renamed from: a */
        public void mo48576a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f34787a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f34778h;
            rectF.set(mo48578k(), mo48582o(), mo48579l(), mo48577j());
            path.arcTo(rectF, mo48580m(), mo48581n(), false);
            path.transform(matrix);
        }

        /* renamed from: j */
        public final float mo48577j() {
            return this.f34782e;
        }

        /* renamed from: k */
        public final float mo48578k() {
            return this.f34779b;
        }

        /* renamed from: l */
        public final float mo48579l() {
            return this.f34781d;
        }

        /* renamed from: m */
        public final float mo48580m() {
            return this.f34783f;
        }

        /* renamed from: n */
        public final float mo48581n() {
            return this.f34784g;
        }

        /* renamed from: o */
        public final float mo48582o() {
            return this.f34780c;
        }

        /* renamed from: p */
        public final void mo48583p(float f) {
            this.f34782e = f;
        }

        /* renamed from: q */
        public final void mo48584q(float f) {
            this.f34779b = f;
        }

        /* renamed from: r */
        public final void mo48585r(float f) {
            this.f34781d = f;
        }

        /* renamed from: s */
        public final void mo48586s(float f) {
            this.f34783f = f;
        }

        /* renamed from: t */
        public final void mo48587t(float f) {
            this.f34784g = f;
        }

        /* renamed from: u */
        public final void mo48588u(float f) {
            this.f34780c = f;
        }
    }

    /* renamed from: uz5$e */
    /* compiled from: ShapePath */
    public static class C6593e extends C6594f {

        /* renamed from: b */
        public float f34785b;

        /* renamed from: c */
        public float f34786c;

        /* renamed from: a */
        public void mo48576a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f34787a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f34785b, this.f34786c);
            path.transform(matrix);
        }
    }

    /* renamed from: uz5$f */
    /* compiled from: ShapePath */
    public static abstract class C6594f {

        /* renamed from: a */
        public final Matrix f34787a = new Matrix();

        /* renamed from: a */
        public abstract void mo48576a(Matrix matrix, Path path);
    }

    /* renamed from: uz5$g */
    /* compiled from: ShapePath */
    public static abstract class C6595g {

        /* renamed from: a */
        public static final Matrix f34788a = new Matrix();

        /* renamed from: a */
        public final void mo48589a(oz5 oz5, int i, Canvas canvas) {
            mo48574b(f34788a, oz5, i, canvas);
        }

        /* renamed from: b */
        public abstract void mo48574b(Matrix matrix, oz5 oz5, int i, Canvas canvas);
    }

    public uz5() {
        mo48566n(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
    }

    /* renamed from: a */
    public void mo48553a(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        float f7;
        C6592d dVar = new C6592d(f, f2, f3, f4);
        dVar.mo48586s(f5);
        dVar.mo48587t(f6);
        this.f34768g.add(dVar);
        C6590b bVar = new C6590b(dVar);
        float f8 = f5 + f6;
        if (f6 < Utils.FLOAT_EPSILON) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        if (z) {
            f7 = (180.0f + f8) % 360.0f;
        } else {
            f7 = f8;
        }
        mo48555c(bVar, f5, f7);
        double d = (double) f8;
        mo48570r(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        mo48571s(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    /* renamed from: b */
    public final void mo48554b(float f) {
        if (mo48559g() != f) {
            float g = ((f - mo48559g()) + 360.0f) % 360.0f;
            if (g <= 180.0f) {
                C6592d dVar = new C6592d(mo48561i(), mo48562j(), mo48561i(), mo48562j());
                dVar.mo48586s(mo48559g());
                dVar.mo48587t(g);
                this.f34769h.add(new C6590b(dVar));
                mo48568p(f);
            }
        }
    }

    /* renamed from: c */
    public final void mo48555c(C6595g gVar, float f, float f2) {
        mo48554b(f);
        this.f34769h.add(gVar);
        mo48568p(f2);
    }

    /* renamed from: d */
    public void mo48556d(Matrix matrix, Path path) {
        int size = this.f34768g.size();
        for (int i = 0; i < size; i++) {
            this.f34768g.get(i).mo48576a(matrix, path);
        }
    }

    /* renamed from: e */
    public boolean mo48557e() {
        return this.f34770i;
    }

    /* renamed from: f */
    public C6595g mo48558f(Matrix matrix) {
        mo48554b(mo48560h());
        return new C6589a(new ArrayList(this.f34769h), new Matrix(matrix));
    }

    /* renamed from: g */
    public final float mo48559g() {
        return this.f34766e;
    }

    /* renamed from: h */
    public final float mo48560h() {
        return this.f34767f;
    }

    /* renamed from: i */
    public float mo48561i() {
        return this.f34764c;
    }

    /* renamed from: j */
    public float mo48562j() {
        return this.f34765d;
    }

    /* renamed from: k */
    public float mo48563k() {
        return this.f34762a;
    }

    /* renamed from: l */
    public float mo48564l() {
        return this.f34763b;
    }

    /* renamed from: m */
    public void mo48565m(float f, float f2) {
        C6593e eVar = new C6593e();
        float unused = eVar.f34785b = f;
        float unused2 = eVar.f34786c = f2;
        this.f34768g.add(eVar);
        C6591c cVar = new C6591c(eVar, mo48561i(), mo48562j());
        mo48555c(cVar, cVar.mo48575c() + 270.0f, cVar.mo48575c() + 270.0f);
        mo48570r(f);
        mo48571s(f2);
    }

    /* renamed from: n */
    public void mo48566n(float f, float f2) {
        mo48567o(f, f2, 270.0f, Utils.FLOAT_EPSILON);
    }

    /* renamed from: o */
    public void mo48567o(float f, float f2, float f3, float f4) {
        mo48572t(f);
        mo48573u(f2);
        mo48570r(f);
        mo48571s(f2);
        mo48568p(f3);
        mo48569q((f3 + f4) % 360.0f);
        this.f34768g.clear();
        this.f34769h.clear();
        this.f34770i = false;
    }

    /* renamed from: p */
    public final void mo48568p(float f) {
        this.f34766e = f;
    }

    /* renamed from: q */
    public final void mo48569q(float f) {
        this.f34767f = f;
    }

    /* renamed from: r */
    public final void mo48570r(float f) {
        this.f34764c = f;
    }

    /* renamed from: s */
    public final void mo48571s(float f) {
        this.f34765d = f;
    }

    /* renamed from: t */
    public final void mo48572t(float f) {
        this.f34762a = f;
    }

    /* renamed from: u */
    public final void mo48573u(float f) {
        this.f34763b = f;
    }
}
