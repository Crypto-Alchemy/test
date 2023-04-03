package p000;

import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: oe3 */
/* compiled from: LayoutIncludeDetector */
public class oe3 {

    /* renamed from: a */
    public final Deque<WeakReference<XmlPullParser>> f15846a = new ArrayDeque();

    /* renamed from: b */
    public static boolean m23752b(XmlPullParser xmlPullParser) {
        if (xmlPullParser == null) {
            return true;
        }
        try {
            if (xmlPullParser.getEventType() == 3 || xmlPullParser.getEventType() == 1) {
                return true;
            }
            return false;
        } catch (XmlPullParserException unused) {
            return true;
        }
    }

    /* renamed from: c */
    public static XmlPullParser m23753c(Deque<WeakReference<XmlPullParser>> deque) {
        while (!deque.isEmpty()) {
            XmlPullParser xmlPullParser = (XmlPullParser) deque.peek().get();
            if (!m23752b(xmlPullParser)) {
                return xmlPullParser;
            }
            deque.pop();
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m23754d(XmlPullParser xmlPullParser, XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 == null || xmlPullParser == xmlPullParser2) {
            return false;
        }
        try {
            if (xmlPullParser2.getEventType() == 2) {
                return "include".equals(xmlPullParser2.getName());
            }
            return false;
        } catch (XmlPullParserException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo23919a(AttributeSet attributeSet) {
        if (!(attributeSet instanceof XmlPullParser)) {
            return false;
        }
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        if (xmlPullParser.getDepth() != 1) {
            return false;
        }
        XmlPullParser c = m23753c(this.f15846a);
        this.f15846a.push(new WeakReference(xmlPullParser));
        if (m23754d(xmlPullParser, c)) {
            return true;
        }
        return false;
    }
}
