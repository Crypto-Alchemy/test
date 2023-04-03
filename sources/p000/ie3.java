package p000;

import android.graphics.Matrix;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010\u0004\u001a\u00020\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\bR&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR!\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R!\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, mo44877d2 = {"Lie3;", "T", "", "Lr37;", "c", "target", "Lfp3;", "b", "(Ljava/lang/Object;)[F", "a", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "Lfd2;", "getMatrix", "Landroid/graphics/Matrix;", "androidMatrixCache", "previousAndroidMatrix", "d", "[F", "matrixCache", "e", "inverseMatrixCache", "", "f", "Z", "isDirty", "g", "isInverseDirty", "h", "isInverseValid", "<init>", "(Lfd2;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ie3 */
/* compiled from: LayerMatrixCache.android.kt */
public final class ie3<T> {

    /* renamed from: a */
    public final fd2<T, Matrix, r37> f13252a;

    /* renamed from: b */
    public Matrix f13253b;

    /* renamed from: c */
    public Matrix f13254c;

    /* renamed from: d */
    public float[] f13255d;

    /* renamed from: e */
    public float[] f13256e;

    /* renamed from: f */
    public boolean f13257f = true;

    /* renamed from: g */
    public boolean f13258g = true;

    /* renamed from: h */
    public boolean f13259h = true;

    public ie3(fd2<? super T, ? super Matrix, r37> fd2) {
        vx2.m53591g(fd2, "getMatrix");
        this.f13252a = fd2;
    }

    /* renamed from: a */
    public final float[] mo21516a(T t) {
        float[] fArr = this.f13256e;
        if (fArr == null) {
            fArr = fp3.m17170b((float[]) null, 1, (DefaultConstructorMarker) null);
            this.f13256e = fArr;
        }
        if (this.f13258g) {
            this.f13259h = hy2.m19301a(mo21517b(t), fArr);
            this.f13258g = false;
        }
        if (this.f13259h) {
            return fArr;
        }
        return null;
    }

    /* renamed from: b */
    public final float[] mo21517b(T t) {
        float[] fArr = this.f13255d;
        if (fArr == null) {
            fArr = fp3.m17170b((float[]) null, 1, (DefaultConstructorMarker) null);
            this.f13255d = fArr;
        }
        if (!this.f13257f) {
            return fArr;
        }
        Matrix matrix = this.f13253b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f13253b = matrix;
        }
        this.f13252a.invoke(t, matrix);
        Matrix matrix2 = this.f13254c;
        if (matrix2 == null || !vx2.m53586b(matrix, matrix2)) {
            C3601xi.m30111b(fArr, matrix);
            this.f13253b = matrix2;
            this.f13254c = matrix;
        }
        this.f13257f = false;
        return fArr;
    }

    /* renamed from: c */
    public final void mo21518c() {
        this.f13257f = true;
        this.f13258g = true;
    }
}
