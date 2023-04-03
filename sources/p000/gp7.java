package p000;

import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p000.uy3;

/* renamed from: gp7 */
/* compiled from: XmpMotionPhotoDescriptionParser */
public final class gp7 {

    /* renamed from: a */
    public static final String[] f12540a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    public static final String[] f12541b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    public static final String[] f12542c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: a */
    public static uy3 m18319a(String str) throws IOException {
        try {
            return m18320b(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            gk3.m18132i("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* renamed from: b */
    public static uy3 m18320b(String str) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (fp7.m17186f(newPullParser, "x:xmpmeta")) {
            long j = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
            ImmutableList<uy3.C3448a> of = ImmutableList.m36627of();
            do {
                newPullParser.next();
                if (fp7.m17186f(newPullParser, "rdf:Description")) {
                    if (!m18322d(newPullParser)) {
                        return null;
                    }
                    j = m18323e(newPullParser);
                    of = m18321c(newPullParser);
                } else if (fp7.m17186f(newPullParser, "Container:Directory")) {
                    of = m18324f(newPullParser, "Container", "Item");
                } else if (fp7.m17186f(newPullParser, "GContainer:Directory")) {
                    of = m18324f(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!fp7.m17184d(newPullParser, "x:xmpmeta"));
            if (of.isEmpty()) {
                return null;
            }
            return new uy3(j, of);
        }
        throw ParserException.createForMalformedContainer("Couldn't find xmp metadata", (Throwable) null);
    }

    /* renamed from: c */
    public static ImmutableList<uy3.C3448a> m18321c(XmlPullParser xmlPullParser) {
        for (String a : f12542c) {
            String a2 = fp7.m17181a(xmlPullParser, a);
            if (a2 != null) {
                return ImmutableList.m36629of(new uy3.C3448a("image/jpeg", "Primary", 0, 0), new uy3.C3448a("video/mp4", "MotionPhoto", Long.parseLong(a2), 0));
            }
        }
        return ImmutableList.m36627of();
    }

    /* renamed from: d */
    public static boolean m18322d(XmlPullParser xmlPullParser) {
        String[] strArr = f12540a;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String a = fp7.m17181a(xmlPullParser, strArr[i]);
            if (a == null) {
                i++;
            } else if (Integer.parseInt(a) == 1) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static long m18323e(XmlPullParser xmlPullParser) {
        for (String a : f12541b) {
            String a2 = fp7.m17181a(xmlPullParser, a);
            if (a2 != null) {
                long parseLong = Long.parseLong(a2);
                if (parseLong == -1) {
                    return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
                }
                return parseLong;
            }
        }
        return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* renamed from: f */
    public static ImmutableList<uy3.C3448a> m18324f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        long j;
        long j2;
        ImmutableList.C4534a builder = ImmutableList.builder();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (fp7.m17186f(xmlPullParser, str3)) {
                String a = fp7.m17181a(xmlPullParser, str2 + ":Mime");
                String a2 = fp7.m17181a(xmlPullParser, str2 + ":Semantic");
                String a3 = fp7.m17181a(xmlPullParser, str2 + ":Length");
                String a4 = fp7.m17181a(xmlPullParser, str2 + ":Padding");
                if (a == null || a2 == null) {
                    return ImmutableList.m36627of();
                }
                if (a3 != null) {
                    j = Long.parseLong(a3);
                } else {
                    j = 0;
                }
                if (a4 != null) {
                    j2 = Long.parseLong(a4);
                } else {
                    j2 = 0;
                }
                builder.mo34667a(new uy3.C3448a(a, a2, j, j2));
            }
        } while (!fp7.m17184d(xmlPullParser, str4));
        return builder.mo34692l();
    }
}
