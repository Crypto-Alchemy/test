package p000;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* renamed from: kn */
/* compiled from: AppCompatTextClassifierHelper */
public final class C2715kn {

    /* renamed from: a */
    public TextView f14214a;

    /* renamed from: b */
    public TextClassifier f14215b;

    /* renamed from: kn$a */
    /* compiled from: AppCompatTextClassifierHelper */
    public static final class C2716a {
        /* renamed from: a */
        public static TextClassifier m20914a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }

    public C2715kn(TextView textView) {
        this.f14214a = (TextView) gu4.m18428f(textView);
    }

    /* renamed from: a */
    public TextClassifier mo22411a() {
        TextClassifier textClassifier = this.f14215b;
        if (textClassifier == null) {
            return C2716a.m20914a(this.f14214a);
        }
        return textClassifier;
    }

    /* renamed from: b */
    public void mo22412b(TextClassifier textClassifier) {
        this.f14215b = textClassifier;
    }
}
