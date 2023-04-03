package p000;

import android.content.res.AssetManager;
import java.io.File;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: mr7 */
public final class mr7 {

    /* renamed from: a */
    public final gq7 f31763a;

    /* renamed from: b */
    public XmlPullParser f31764b;

    public mr7(gq7 gq7) {
        this.f31763a = gq7;
    }

    /* renamed from: a */
    public final void mo45859a(AssetManager assetManager, File file) throws IOException {
        this.f31764b = assetManager.openXmlResourceParser(gq7.m44835b(assetManager, file), "AndroidManifest.xml");
    }

    /* renamed from: b */
    public final long mo45860b() throws IOException, XmlPullParserException {
        if (this.f31764b != null) {
            while (true) {
                int next = this.f31764b.next();
                if (next != 2) {
                    if (next == 1) {
                        break;
                    }
                } else if (this.f31764b.getName().equals("manifest")) {
                    String attributeValue = this.f31764b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
                    String attributeValue2 = this.f31764b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
                    if (attributeValue != null) {
                        try {
                            int parseInt = Integer.parseInt(attributeValue);
                            if (attributeValue2 == null) {
                                return (long) parseInt;
                            }
                            try {
                                return (((long) Integer.parseInt(attributeValue2)) << 32) | (((long) parseInt) & 4294967295L);
                            } catch (NumberFormatException e) {
                                throw new XmlPullParserException(String.format("Couldn't parse versionCodeMajor to int: %s", new Object[]{e.getMessage()}));
                            }
                        } catch (NumberFormatException e2) {
                            throw new XmlPullParserException(String.format("Couldn't parse versionCode to int: %s", new Object[]{e2.getMessage()}));
                        }
                    } else {
                        throw new XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
                    }
                }
            }
            throw new XmlPullParserException("Couldn't find manifest entry at top-level.");
        }
        throw new XmlPullParserException("Manifest file needs to be loaded before parsing.");
    }
}
