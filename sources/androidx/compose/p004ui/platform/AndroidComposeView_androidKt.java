package androidx.compose.p004ui.platform;

import android.content.res.Configuration;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a!\u0010\u0007\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\"4\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u001f\u001a\u00020\u0002*\u00020\u001c8@X\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, mo44877d2 = {"", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "f", "Lfp3;", "other", "Lr37;", "g", "([F[F)V", "m1", "row", "m2", "column", "", "c", "([FI[FI)F", "Lkotlin/Function1;", "Lrp4;", "Lun6;", "a", "Lrc2;", "e", "()Lrc2;", "setTextInputServiceFactory", "(Lrc2;)V", "getTextInputServiceFactory$annotations", "()V", "textInputServiceFactory", "Landroid/content/res/Configuration;", "d", "(Landroid/content/res/Configuration;)Landroidx/compose/ui/unit/LayoutDirection;", "localeLayoutDirection", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.AndroidComposeView_androidKt */
/* compiled from: AndroidComposeView.android.kt */
public final class AndroidComposeView_androidKt {

    /* renamed from: a */
    public static rc2<? super rp4, ? extends un6> f1981a = AndroidComposeView_androidKt$textInputServiceFactory$1.INSTANCE;

    /* renamed from: c */
    public static final float m3037c(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 0] * fArr2[0 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 3] * fArr2[12 + i2]);
    }

    /* renamed from: d */
    public static final LayoutDirection m3038d(Configuration configuration) {
        vx2.m53591g(configuration, "<this>");
        return m3040f(configuration.getLayoutDirection());
    }

    /* renamed from: e */
    public static final rc2<rp4, un6> m3039e() {
        return f1981a;
    }

    /* renamed from: f */
    public static final LayoutDirection m3040f(int i) {
        if (i == 0) {
            return LayoutDirection.Ltr;
        }
        if (i != 1) {
            return LayoutDirection.Ltr;
        }
        return LayoutDirection.Rtl;
    }

    /* renamed from: g */
    public static final void m3041g(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float c = m3037c(fArr4, 0, fArr3, 0);
        float c2 = m3037c(fArr4, 0, fArr3, 1);
        float c3 = m3037c(fArr4, 0, fArr3, 2);
        float c4 = m3037c(fArr4, 0, fArr3, 3);
        float c5 = m3037c(fArr4, 1, fArr3, 0);
        float c6 = m3037c(fArr4, 1, fArr3, 1);
        float c7 = m3037c(fArr4, 1, fArr3, 2);
        float c8 = m3037c(fArr4, 1, fArr3, 3);
        float c9 = m3037c(fArr4, 2, fArr3, 0);
        float c10 = m3037c(fArr4, 2, fArr3, 1);
        float c11 = m3037c(fArr4, 2, fArr3, 2);
        float c12 = m3037c(fArr4, 2, fArr3, 3);
        float c13 = m3037c(fArr4, 3, fArr3, 0);
        float c14 = m3037c(fArr4, 3, fArr3, 1);
        float c15 = m3037c(fArr4, 3, fArr3, 2);
        float c16 = m3037c(fArr4, 3, fArr3, 3);
        fArr3[0] = c;
        fArr3[1] = c2;
        fArr3[2] = c3;
        fArr3[3] = c4;
        fArr3[4] = c5;
        fArr3[5] = c6;
        fArr3[6] = c7;
        fArr3[7] = c8;
        fArr3[8] = c9;
        fArr3[9] = c10;
        fArr3[10] = c11;
        fArr3[11] = c12;
        fArr3[12] = c13;
        fArr3[13] = c14;
        fArr3[14] = c15;
        fArr3[15] = c16;
    }
}
