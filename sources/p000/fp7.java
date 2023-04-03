package p000;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: fp7 */
/* compiled from: XmlPullParserUtil */
public final class fp7 {
    /* renamed from: a */
    public static String m17181a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m17182b(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (m17188h(xmlPullParser.getAttributeName(i)).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m17183c(XmlPullParser xmlPullParser) throws XmlPullParserException {
        if (xmlPullParser.getEventType() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m17184d(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        if (!m17183c(xmlPullParser) || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m17185e(XmlPullParser xmlPullParser) throws XmlPullParserException {
        if (xmlPullParser.getEventType() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m17186f(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        if (!m17185e(xmlPullParser) || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m17187g(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        if (!m17185e(xmlPullParser) || !m17188h(xmlPullParser.getName()).equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static String m17188h(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            return str;
        }
        return str.substring(indexOf + 1);
    }
}
