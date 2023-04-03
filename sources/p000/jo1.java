package p000;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.C0593c;

/* renamed from: jo1 */
/* compiled from: EmojiTextViewHelper */
public final class jo1 {

    /* renamed from: a */
    public final C2625b f13762a;

    /* renamed from: jo1$a */
    /* compiled from: EmojiTextViewHelper */
    public static class C2624a extends C2625b {

        /* renamed from: a */
        public final TextView f13763a;

        /* renamed from: b */
        public final fo1 f13764b;

        /* renamed from: c */
        public boolean f13765c = true;

        public C2624a(TextView textView) {
            this.f13763a = textView;
            this.f13764b = new fo1(textView);
        }

        /* renamed from: a */
        public InputFilter[] mo22012a(InputFilter[] inputFilterArr) {
            if (!this.f13765c) {
                return mo22019h(inputFilterArr);
            }
            return mo22017f(inputFilterArr);
        }

        /* renamed from: b */
        public boolean mo22013b() {
            return this.f13765c;
        }

        /* renamed from: c */
        public void mo22014c(boolean z) {
            if (z) {
                mo22023l();
            }
        }

        /* renamed from: d */
        public void mo22015d(boolean z) {
            this.f13765c = z;
            mo22023l();
            mo22022k();
        }

        /* renamed from: e */
        public TransformationMethod mo22016e(TransformationMethod transformationMethod) {
            if (this.f13765c) {
                return mo22024m(transformationMethod);
            }
            return mo22021j(transformationMethod);
        }

        /* renamed from: f */
        public final InputFilter[] mo22017f(InputFilter[] inputFilterArr) {
            for (fo1 fo1 : inputFilterArr) {
                if (fo1 == this.f13764b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, r0);
            inputFilterArr2[r0] = this.f13764b;
            return inputFilterArr2;
        }

        /* renamed from: g */
        public final SparseArray<InputFilter> mo22018g(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof fo1) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        /* renamed from: h */
        public final InputFilter[] mo22019h(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> g = mo22018g(inputFilterArr);
            if (g.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - g.size())];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (g.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        /* renamed from: i */
        public void mo22020i(boolean z) {
            this.f13765c = z;
        }

        /* renamed from: j */
        public final TransformationMethod mo22021j(TransformationMethod transformationMethod) {
            if (transformationMethod instanceof lo1) {
                return ((lo1) transformationMethod).mo22889a();
            }
            return transformationMethod;
        }

        /* renamed from: k */
        public final void mo22022k() {
            this.f13763a.setFilters(mo22012a(this.f13763a.getFilters()));
        }

        /* renamed from: l */
        public void mo22023l() {
            this.f13763a.setTransformationMethod(mo22016e(this.f13763a.getTransformationMethod()));
        }

        /* renamed from: m */
        public final TransformationMethod mo22024m(TransformationMethod transformationMethod) {
            if (!(transformationMethod instanceof lo1) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                return new lo1(transformationMethod);
            }
            return transformationMethod;
        }
    }

    /* renamed from: jo1$b */
    /* compiled from: EmojiTextViewHelper */
    public static class C2625b {
        /* renamed from: a */
        public InputFilter[] mo22012a(InputFilter[] inputFilterArr) {
            throw null;
        }

        /* renamed from: b */
        public boolean mo22013b() {
            throw null;
        }

        /* renamed from: c */
        public void mo22014c(boolean z) {
            throw null;
        }

        /* renamed from: d */
        public void mo22015d(boolean z) {
            throw null;
        }

        /* renamed from: e */
        public TransformationMethod mo22016e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* renamed from: jo1$c */
    /* compiled from: EmojiTextViewHelper */
    public static class C2626c extends C2625b {

        /* renamed from: a */
        public final C2624a f13766a;

        public C2626c(TextView textView) {
            this.f13766a = new C2624a(textView);
        }

        /* renamed from: a */
        public InputFilter[] mo22012a(InputFilter[] inputFilterArr) {
            if (mo22025f()) {
                return inputFilterArr;
            }
            return this.f13766a.mo22012a(inputFilterArr);
        }

        /* renamed from: b */
        public boolean mo22013b() {
            return this.f13766a.mo22013b();
        }

        /* renamed from: c */
        public void mo22014c(boolean z) {
            if (!mo22025f()) {
                this.f13766a.mo22014c(z);
            }
        }

        /* renamed from: d */
        public void mo22015d(boolean z) {
            if (mo22025f()) {
                this.f13766a.mo22020i(z);
            } else {
                this.f13766a.mo22015d(z);
            }
        }

        /* renamed from: e */
        public TransformationMethod mo22016e(TransformationMethod transformationMethod) {
            if (mo22025f()) {
                return transformationMethod;
            }
            return this.f13766a.mo22016e(transformationMethod);
        }

        /* renamed from: f */
        public final boolean mo22025f() {
            return !C0593c.m4521h();
        }
    }

    public jo1(TextView textView, boolean z) {
        gu4.m18429g(textView, "textView cannot be null");
        if (!z) {
            this.f13762a = new C2626c(textView);
        } else {
            this.f13762a = new C2624a(textView);
        }
    }

    /* renamed from: a */
    public InputFilter[] mo22007a(InputFilter[] inputFilterArr) {
        return this.f13762a.mo22012a(inputFilterArr);
    }

    /* renamed from: b */
    public boolean mo22008b() {
        return this.f13762a.mo22013b();
    }

    /* renamed from: c */
    public void mo22009c(boolean z) {
        this.f13762a.mo22014c(z);
    }

    /* renamed from: d */
    public void mo22010d(boolean z) {
        this.f13762a.mo22015d(z);
    }

    /* renamed from: e */
    public TransformationMethod mo22011e(TransformationMethod transformationMethod) {
        return this.f13762a.mo22016e(transformationMethod);
    }
}
