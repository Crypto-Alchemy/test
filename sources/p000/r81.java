package p000;

/* renamed from: r81 */
/* compiled from: DefaultImageFormats */
public final class r81 {

    /* renamed from: a */
    public static final rq2 f17197a = new rq2("JPEG", "jpeg");

    /* renamed from: b */
    public static final rq2 f17198b = new rq2("PNG", "png");

    /* renamed from: c */
    public static final rq2 f17199c = new rq2("GIF", "gif");

    /* renamed from: d */
    public static final rq2 f17200d = new rq2("BMP", "bmp");

    /* renamed from: e */
    public static final rq2 f17201e = new rq2("ICO", "ico");

    /* renamed from: f */
    public static final rq2 f17202f = new rq2("WEBP_SIMPLE", "webp");

    /* renamed from: g */
    public static final rq2 f17203g = new rq2("WEBP_LOSSLESS", "webp");

    /* renamed from: h */
    public static final rq2 f17204h = new rq2("WEBP_EXTENDED", "webp");

    /* renamed from: i */
    public static final rq2 f17205i = new rq2("WEBP_EXTENDED_WITH_ALPHA", "webp");

    /* renamed from: j */
    public static final rq2 f17206j = new rq2("WEBP_ANIMATED", "webp");

    /* renamed from: k */
    public static final rq2 f17207k = new rq2("HEIF", "heif");

    /* renamed from: l */
    public static final rq2 f17208l = new rq2("DNG", "dng");

    /* renamed from: a */
    public static boolean m26115a(rq2 rq2) {
        if (rq2 == f17202f || rq2 == f17203g || rq2 == f17204h || rq2 == f17205i) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m26116b(rq2 rq2) {
        if (m26115a(rq2) || rq2 == f17206j) {
            return true;
        }
        return false;
    }
}
