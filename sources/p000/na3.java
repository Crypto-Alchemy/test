package p000;

import android.content.Context;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: na3 */
/* compiled from: KeyFrames */
public class na3 {

    /* renamed from: b */
    public static HashMap<String, Constructor<? extends y93>> f15510b;

    /* renamed from: a */
    public HashMap<Integer, ArrayList<y93>> f15511a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends y93>> hashMap = new HashMap<>();
        f15510b = hashMap;
        try {
            hashMap.put("KeyAttribute", ca3.class.getConstructor(new Class[0]));
            f15510b.put("KeyPosition", xa3.class.getConstructor(new Class[0]));
            f15510b.put("KeyCycle", fa3.class.getConstructor(new Class[0]));
            f15510b.put("KeyTimeCycle", eb3.class.getConstructor(new Class[0]));
            f15510b.put("KeyTrigger", fb3.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException unused) {
        }
    }

    public na3() {
    }

    /* renamed from: a */
    public void mo23634a(jy3 jy3) {
        ArrayList arrayList = this.f15511a.get(-1);
        if (arrayList != null) {
            jy3.mo22113b(arrayList);
        }
    }

    /* renamed from: b */
    public void mo23635b(jy3 jy3) {
        ArrayList arrayList = this.f15511a.get(Integer.valueOf(jy3.f13915c));
        if (arrayList != null) {
            jy3.mo22113b(arrayList);
        }
        ArrayList arrayList2 = this.f15511a.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                y93 y93 = (y93) it.next();
                if (y93.mo28001f(((ConstraintLayout.LayoutParams) jy3.f13914b.getLayoutParams()).f3132b0)) {
                    jy3.mo22112a(y93);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo23636c(y93 y93) {
        if (!this.f15511a.containsKey(Integer.valueOf(y93.f20101b))) {
            this.f15511a.put(Integer.valueOf(y93.f20101b), new ArrayList());
        }
        ArrayList arrayList = this.f15511a.get(Integer.valueOf(y93.f20101b));
        if (arrayList != null) {
            arrayList.add(y93);
        }
    }

    /* renamed from: d */
    public ArrayList<y93> mo23637d(int i) {
        return this.f15511a.get(Integer.valueOf(i));
    }

    public na3(Context context, XmlPullParser xmlPullParser) {
        HashMap<String, ConstraintAttribute> hashMap;
        HashMap<String, ConstraintAttribute> hashMap2;
        y93 y93 = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (f15510b.containsKey(name)) {
                        try {
                            Constructor constructor = f15510b.get(name);
                            if (constructor != null) {
                                y93 y932 = (y93) constructor.newInstance(new Object[0]);
                                try {
                                    y932.mo12033e(context, Xml.asAttributeSet(xmlPullParser));
                                    mo23636c(y932);
                                } catch (Exception unused) {
                                }
                                y93 = y932;
                            } else {
                                throw new NullPointerException("Keymaker for " + name + " not found");
                            }
                        } catch (Exception unused2) {
                            continue;
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (!(y93 == null || (hashMap2 = y93.f20104e) == null)) {
                            ConstraintAttribute.m4120i(context, xmlPullParser, hashMap2);
                        }
                    } else if (!(!name.equalsIgnoreCase("CustomMethod") || y93 == null || (hashMap = y93.f20104e) == null)) {
                        ConstraintAttribute.m4120i(context, xmlPullParser, hashMap);
                    }
                } else if (eventType == 3) {
                    if ("KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
