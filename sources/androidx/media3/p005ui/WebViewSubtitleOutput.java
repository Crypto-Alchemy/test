package androidx.media3.p005ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.media3.p005ui.SubtitleView;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media3.ui.WebViewSubtitleOutput */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.C1091a {

    /* renamed from: a */
    public final CanvasSubtitleOutput f5940a;

    /* renamed from: d */
    public final WebView f5941d;

    /* renamed from: e */
    public List<dx0> f5942e;

    /* renamed from: g */
    public ib0 f5943g;

    /* renamed from: k */
    public float f5944k;

    /* renamed from: r */
    public int f5945r;

    /* renamed from: s */
    public float f5946s;

    /* renamed from: androidx.media3.ui.WebViewSubtitleOutput$a */
    public class C1096a extends WebView {
        public C1096a(WebViewSubtitleOutput webViewSubtitleOutput, Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    /* renamed from: androidx.media3.ui.WebViewSubtitleOutput$b */
    public static /* synthetic */ class C1097b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5947a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                android.text.Layout$Alignment[] r0 = android.text.Layout.Alignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5947a = r0
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5947a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5947a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.p005ui.WebViewSubtitleOutput.C1097b.<clinit>():void");
        }
    }

    public WebViewSubtitleOutput(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    public static int m8092b(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    /* renamed from: c */
    public static String m8093c(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i = C1097b.f5947a[alignment.ordinal()];
        if (i == 1) {
            return "start";
        }
        if (i != 2) {
            return "center";
        }
        return "end";
    }

    /* renamed from: d */
    public static String m8094d(ib0 ib0) {
        int i = ib0.f13239d;
        if (i == 1) {
            return w67.m29294A("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", an2.m409b(ib0.f13240e));
        } else if (i == 2) {
            return w67.m29294A("0.1em 0.12em 0.15em %s", an2.m409b(ib0.f13240e));
        } else if (i == 3) {
            return w67.m29294A("0.06em 0.08em 0.15em %s", an2.m409b(ib0.f13240e));
        } else if (i != 4) {
            return "unset";
        } else {
            return w67.m29294A("-0.05em -0.05em 0.15em %s", an2.m409b(ib0.f13240e));
        }
    }

    /* renamed from: f */
    public static String m8095f(int i) {
        return i != 1 ? i != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    /* renamed from: h */
    public static String m8096h(dx0 dx0) {
        String str;
        float f = dx0.f10942P;
        if (f == Utils.FLOAT_EPSILON) {
            return "";
        }
        int i = dx0.f10941M;
        if (i == 2 || i == 1) {
            str = "skewY";
        } else {
            str = "skewX";
        }
        return w67.m29294A("%s(%.2fdeg)", str, Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo8100a(List<dx0> list, ib0 ib0, float f, int i, float f2) {
        this.f5943g = ib0;
        this.f5944k = f;
        this.f5945r = i;
        this.f5946s = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            dx0 dx0 = list.get(i2);
            if (dx0.f10946g != null) {
                arrayList.add(dx0);
            } else {
                arrayList2.add(dx0);
            }
        }
        if (!this.f5942e.isEmpty() || !arrayList2.isEmpty()) {
            this.f5942e = arrayList2;
            mo8388i();
        }
        this.f5940a.mo8100a(arrayList, ib0, f, i, f2);
        invalidate();
    }

    /* renamed from: e */
    public final String mo8386e(int i, float f) {
        float h = gd6.m18018h(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (h == -3.4028235E38f) {
            return "unset";
        }
        return w67.m29294A("%.2fpx", Float.valueOf(h / getContext().getResources().getDisplayMetrics().density));
    }

    /* renamed from: g */
    public void mo8387g() {
        this.f5941d.destroy();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0144, code lost:
        if (r13 != 0) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0147, code lost:
        if (r13 != 0) goto L_0x0149;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x023b  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8388i() {
        /*
            r26 = this;
            r0 = r26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 4
            java.lang.Object[] r3 = new java.lang.Object[r2]
            ib0 r4 = r0.f5943g
            int r4 = r4.f13236a
            java.lang.String r4 = p000.an2.m409b(r4)
            r5 = 0
            r3[r5] = r4
            int r4 = r0.f5945r
            float r6 = r0.f5944k
            java.lang.String r4 = r0.mo8386e(r4, r6)
            r6 = 1
            r3[r6] = r4
            r4 = 1067030938(0x3f99999a, float:1.2)
            java.lang.Float r7 = java.lang.Float.valueOf(r4)
            r8 = 2
            r3[r8] = r7
            ib0 r7 = r0.f5943g
            java.lang.String r7 = m8094d(r7)
            r9 = 3
            r3[r9] = r7
            java.lang.String r7 = "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>"
            java.lang.String r3 = p000.w67.m29294A(r7, r3)
            r1.append(r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r7 = "default_bg"
            java.lang.String r10 = p000.an2.m408a(r7)
            java.lang.Object[] r11 = new java.lang.Object[r6]
            ib0 r12 = r0.f5943g
            int r12 = r12.f13237b
            java.lang.String r12 = p000.an2.m409b(r12)
            r11[r5] = r12
            java.lang.String r12 = "background-color:%s;"
            java.lang.String r11 = p000.w67.m29294A(r12, r11)
            r3.put(r10, r11)
            r10 = r5
        L_0x005d:
            java.util.List<dx0> r11 = r0.f5942e
            int r11 = r11.size()
            if (r10 >= r11) goto L_0x0259
            java.util.List<dx0> r11 = r0.f5942e
            java.lang.Object r11 = r11.get(r10)
            dx0 r11 = (p000.dx0) r11
            float r12 = r11.f10950x
            r13 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r14 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            r15 = 1120403456(0x42c80000, float:100.0)
            if (r14 == 0) goto L_0x007a
            float r12 = r12 * r15
            goto L_0x007c
        L_0x007a:
            r12 = 1112014848(0x42480000, float:50.0)
        L_0x007c:
            int r14 = r11.f10951y
            int r14 = m8092b(r14)
            float r2 = r11.f10947k
            int r17 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            r18 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r9 = "%.2f%%"
            if (r17 == 0) goto L_0x00da
            int r8 = r11.f10948r
            if (r8 == r6) goto L_0x00b0
            java.lang.Object[] r8 = new java.lang.Object[r6]
            float r2 = r2 * r15
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r8[r5] = r2
            java.lang.String r2 = p000.w67.m29294A(r9, r8)
            int r8 = r11.f10941M
            if (r8 != r6) goto L_0x00a9
            int r8 = r11.f10949s
            int r8 = m8092b(r8)
            int r8 = -r8
            goto L_0x00ee
        L_0x00a9:
            int r8 = r11.f10949s
            int r8 = m8092b(r8)
            goto L_0x00ee
        L_0x00b0:
            r8 = 0
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            java.lang.String r13 = "%.2fem"
            if (r8 < 0) goto L_0x00c7
            java.lang.Object[] r8 = new java.lang.Object[r6]
            float r2 = r2 * r4
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r8[r5] = r2
            java.lang.String r2 = p000.w67.m29294A(r13, r8)
            r8 = r5
            r13 = r8
            goto L_0x00ef
        L_0x00c7:
            java.lang.Object[] r8 = new java.lang.Object[r6]
            float r2 = -r2
            float r2 = r2 - r18
            float r2 = r2 * r4
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r8[r5] = r2
            java.lang.String r2 = p000.w67.m29294A(r13, r8)
            r8 = r5
            r13 = r6
            goto L_0x00ef
        L_0x00da:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            float r8 = r0.f5946s
            float r18 = r18 - r8
            float r18 = r18 * r15
            java.lang.Float r8 = java.lang.Float.valueOf(r18)
            r2[r5] = r8
            java.lang.String r2 = p000.w67.m29294A(r9, r2)
            r8 = -100
        L_0x00ee:
            r13 = r5
        L_0x00ef:
            float r4 = r11.f10935A
            r19 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r19 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r19 == 0) goto L_0x0107
            java.lang.Object[] r5 = new java.lang.Object[r6]
            float r4 = r4 * r15
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r15 = 0
            r5[r15] = r4
            java.lang.String r4 = p000.w67.m29294A(r9, r5)
            goto L_0x0109
        L_0x0107:
            java.lang.String r4 = "fit-content"
        L_0x0109:
            android.text.Layout$Alignment r5 = r11.f10944d
            java.lang.String r5 = m8093c(r5)
            int r9 = r11.f10941M
            java.lang.String r9 = m8095f(r9)
            int r15 = r11.f10939I
            float r6 = r11.f10940L
            java.lang.String r6 = r0.mo8386e(r15, r6)
            boolean r15 = r11.f10937C
            if (r15 == 0) goto L_0x0124
            int r15 = r11.f10938H
            goto L_0x0128
        L_0x0124:
            ib0 r15 = r0.f5943g
            int r15 = r15.f13238c
        L_0x0128:
            java.lang.String r15 = p000.an2.m409b(r15)
            r20 = r8
            int r8 = r11.f10941M
            java.lang.String r21 = "right"
            java.lang.String r22 = "left"
            java.lang.String r23 = "top"
            r24 = r14
            r14 = 1
            if (r8 == r14) goto L_0x0147
            r14 = 2
            if (r8 == r14) goto L_0x0144
            if (r13 == 0) goto L_0x0142
            java.lang.String r23 = "bottom"
        L_0x0142:
            r13 = 2
            goto L_0x0150
        L_0x0144:
            if (r13 == 0) goto L_0x0149
            goto L_0x014b
        L_0x0147:
            if (r13 == 0) goto L_0x014b
        L_0x0149:
            r21 = r22
        L_0x014b:
            r22 = r23
            r13 = 2
            r23 = r21
        L_0x0150:
            if (r8 == r13) goto L_0x015b
            r13 = 1
            if (r8 != r13) goto L_0x0156
            goto L_0x015b
        L_0x0156:
            java.lang.String r8 = "width"
            r14 = r24
            goto L_0x0161
        L_0x015b:
            java.lang.String r8 = "height"
            r14 = r20
            r20 = r24
        L_0x0161:
            java.lang.CharSequence r13 = r11.f10943a
            android.content.Context r21 = r26.getContext()
            android.content.res.Resources r21 = r21.getResources()
            android.util.DisplayMetrics r0 = r21.getDisplayMetrics()
            float r0 = r0.density
            androidx.media3.ui.a$b r0 = androidx.media3.p005ui.C1098a.m8101a(r13, r0)
            java.util.Set r13 = r3.keySet()
            java.util.Iterator r13 = r13.iterator()
        L_0x017d:
            boolean r21 = r13.hasNext()
            if (r21 == 0) goto L_0x01b5
            java.lang.Object r21 = r13.next()
            r24 = r13
            r13 = r21
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r21 = r3.get(r13)
            r25 = r0
            r0 = r21
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r3.put(r13, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x01ac
            java.lang.Object r13 = r3.get(r13)
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x01aa
            goto L_0x01ac
        L_0x01aa:
            r0 = 0
            goto L_0x01ad
        L_0x01ac:
            r0 = 1
        L_0x01ad:
            p000.C2725kr.m20987g(r0)
            r13 = r24
            r0 = r25
            goto L_0x017d
        L_0x01b5:
            r25 = r0
            r0 = 14
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            r19 = 0
            r0[r19] = r13
            r13 = 1
            r0[r13] = r22
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r13 = 2
            r0[r13] = r12
            r12 = 3
            r0[r12] = r23
            r16 = 4
            r0[r16] = r2
            r2 = 5
            r0[r2] = r8
            r2 = 6
            r0[r2] = r4
            r2 = 7
            r0[r2] = r5
            r2 = 8
            r0[r2] = r9
            r2 = 9
            r0[r2] = r6
            r2 = 10
            r0[r2] = r15
            r2 = 11
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r0[r2] = r4
            r2 = 12
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
            r0[r2] = r4
            r2 = 13
            java.lang.String r4 = m8096h(r11)
            r0[r2] = r4
            java.lang.String r2 = "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>"
            java.lang.String r0 = p000.w67.m29294A(r2, r0)
            r1.append(r0)
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r4 = 0
            r2[r4] = r7
            java.lang.String r5 = "<span class='%s'>"
            java.lang.String r2 = p000.w67.m29294A(r5, r2)
            r1.append(r2)
            android.text.Layout$Alignment r2 = r11.f10945e
            java.lang.String r5 = "</span>"
            if (r2 == 0) goto L_0x023b
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r0 = m8093c(r2)
            r6[r4] = r0
            java.lang.String r0 = "<span style='display:inline-block; text-align:%s;'>"
            java.lang.String r0 = p000.w67.m29294A(r0, r6)
            r1.append(r0)
            r0 = r25
            java.lang.String r0 = r0.f5949a
            r1.append(r0)
            r1.append(r5)
            goto L_0x0242
        L_0x023b:
            r0 = r25
            java.lang.String r0 = r0.f5949a
            r1.append(r0)
        L_0x0242:
            r1.append(r5)
            java.lang.String r0 = "</div>"
            r1.append(r0)
            int r10 = r10 + 1
            r4 = 1067030938(0x3f99999a, float:1.2)
            r5 = 0
            r0 = r26
            r9 = r12
            r8 = r13
            r2 = r16
            r6 = 1
            goto L_0x005d
        L_0x0259:
            java.lang.String r0 = "</div></body></html>"
            r1.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "<html><head><style>"
            r0.append(r2)
            java.util.Set r2 = r3.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0270:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0293
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.String r5 = "{"
            r0.append(r5)
            java.lang.Object r4 = r3.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.String r4 = "}"
            r0.append(r4)
            goto L_0x0270
        L_0x0293:
            java.lang.String r2 = "</style></head>"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = 0
            r1.insert(r2, r0)
            r0 = r26
            android.webkit.WebView r2 = r0.f5941d
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r3 = p000.be0.f21263c
            byte[] r1 = r1.getBytes(r3)
            r3 = 1
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r3)
            java.lang.String r3 = "text/html"
            java.lang.String r4 = "base64"
            r2.loadData(r1, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.p005ui.WebViewSubtitleOutput.mo8388i():void");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && !this.f5942e.isEmpty()) {
            mo8388i();
        }
    }

    public WebViewSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5942e = Collections.emptyList();
        this.f5943g = ib0.f13235g;
        this.f5944k = 0.0533f;
        this.f5945r = 0;
        this.f5946s = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.f5940a = canvasSubtitleOutput;
        C1096a aVar = new C1096a(this, context, attributeSet);
        this.f5941d = aVar;
        aVar.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(aVar);
    }
}
