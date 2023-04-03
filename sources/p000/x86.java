package p000;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p000.jj1;

@SuppressLint({"RestrictedAPI"})
/* renamed from: x86 */
/* compiled from: StateListDrawable */
public class x86 extends jj1 {

    /* renamed from: H */
    public C3581a f19492H;

    /* renamed from: I */
    public boolean f19493I;

    /* renamed from: x86$a */
    /* compiled from: StateListDrawable */
    public static class C3581a extends jj1.C2607d {

        /* renamed from: J */
        public int[][] f19494J;

        public C3581a(C3581a aVar, x86 x86, Resources resources) {
            super(aVar, x86, resources);
            if (aVar != null) {
                this.f19494J = aVar.f19494J;
            } else {
                this.f19494J = new int[mo21915f()][];
            }
        }

        /* renamed from: A */
        public int mo27699A(int[] iArr) {
            int[][] iArr2 = this.f19494J;
            int h = mo21918h();
            for (int i = 0; i < h; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new x86(this, (Resources) null);
        }

        /* renamed from: o */
        public void mo21925o(int i, int i2) {
            super.mo21925o(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f19494J, 0, iArr, 0, i);
            this.f19494J = iArr;
        }

        /* renamed from: r */
        public void mo21928r() {
            int[] iArr;
            int[][] iArr2 = this.f19494J;
            int[][] iArr3 = new int[iArr2.length][];
            for (int length = iArr2.length - 1; length >= 0; length--) {
                int[] iArr4 = this.f19494J[length];
                if (iArr4 != null) {
                    iArr = (int[]) iArr4.clone();
                } else {
                    iArr = null;
                }
                iArr3[length] = iArr;
            }
            this.f19494J = iArr3;
        }

        /* renamed from: z */
        public int mo27700z(int[] iArr, Drawable drawable) {
            int a = mo21909a(drawable);
            this.f19494J[a] = iArr;
            return a;
        }

        public Drawable newDrawable(Resources resources) {
            return new x86(this, resources);
        }
    }

    public x86(C3581a aVar, Resources resources) {
        mo21881h(new C3581a(aVar, this, resources));
        onStateChange(getState());
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* renamed from: h */
    public void mo21881h(jj1.C2607d dVar) {
        super.mo21881h(dVar);
        if (dVar instanceof C3581a) {
            this.f19492H = (C3581a) dVar;
        }
    }

    public boolean isStateful() {
        return true;
    }

    /* renamed from: j */
    public C3581a mo21862b() {
        return new C3581a(this.f19492H, this, (Resources) null);
    }

    /* renamed from: k */
    public int[] mo27698k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    public Drawable mutate() {
        if (!this.f19493I && super.mutate() == this) {
            this.f19492H.mo21928r();
            this.f19493I = true;
        }
        return this;
    }

    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int A = this.f19492H.mo27699A(iArr);
        if (A < 0) {
            A = this.f19492H.mo27699A(StateSet.WILD_CARD);
        }
        if (mo21868g(A) || onStateChange) {
            return true;
        }
        return false;
    }

    public x86(C3581a aVar) {
        if (aVar != null) {
            mo21881h(aVar);
        }
    }
}
