package p000;

import androidx.constraintlayout.core.widgets.C0486d;
import androidx.constraintlayout.core.widgets.analyzer.C0479b;
import androidx.constraintlayout.core.widgets.analyzer.C0480c;
import androidx.constraintlayout.core.widgets.analyzer.C0482d;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;

/* renamed from: ki5 */
/* compiled from: RunGroup */
public class ki5 {

    /* renamed from: h */
    public static int f14095h;

    /* renamed from: a */
    public int f14096a = 0;

    /* renamed from: b */
    public boolean f14097b = false;

    /* renamed from: c */
    public WidgetRun f14098c = null;

    /* renamed from: d */
    public WidgetRun f14099d = null;

    /* renamed from: e */
    public ArrayList<WidgetRun> f14100e = new ArrayList<>();

    /* renamed from: f */
    public int f14101f;

    /* renamed from: g */
    public int f14102g;

    public ki5(WidgetRun widgetRun, int i) {
        int i2 = f14095h;
        this.f14101f = i2;
        f14095h = i2 + 1;
        this.f14098c = widgetRun;
        this.f14099d = widgetRun;
        this.f14102g = i;
    }

    /* renamed from: a */
    public void mo22319a(WidgetRun widgetRun) {
        this.f14100e.add(widgetRun);
        this.f14099d = widgetRun;
    }

    /* renamed from: b */
    public long mo22320b(C0486d dVar, int i) {
        WidgetRun widgetRun;
        WidgetRun widgetRun2;
        int i2;
        long j;
        WidgetRun widgetRun3 = this.f14098c;
        long j2 = 0;
        if (widgetRun3 instanceof ad0) {
            if (((ad0) widgetRun3).f2484f != i) {
                return 0;
            }
        } else if (i == 0) {
            if (!(widgetRun3 instanceof C0480c)) {
                return 0;
            }
        } else if (!(widgetRun3 instanceof C0482d)) {
            return 0;
        }
        if (i == 0) {
            widgetRun = dVar.f2415e;
        } else {
            widgetRun = dVar.f2417f;
        }
        DependencyNode dependencyNode = widgetRun.f2486h;
        if (i == 0) {
            widgetRun2 = dVar.f2415e;
        } else {
            widgetRun2 = dVar.f2417f;
        }
        DependencyNode dependencyNode2 = widgetRun2.f2487i;
        boolean contains = widgetRun3.f2486h.f2477l.contains(dependencyNode);
        boolean contains2 = this.f14098c.f2487i.f2477l.contains(dependencyNode2);
        long j3 = this.f14098c.mo145j();
        if (contains && contains2) {
            long d = mo22322d(this.f14098c.f2486h, 0);
            long c = mo22321c(this.f14098c.f2487i, 0);
            long j4 = d - j3;
            WidgetRun widgetRun4 = this.f14098c;
            int i3 = widgetRun4.f2487i.f2471f;
            if (j4 >= ((long) (-i3))) {
                j4 += (long) i3;
            }
            int i4 = widgetRun4.f2486h.f2471f;
            long j5 = ((-c) - j3) - ((long) i4);
            if (j5 >= ((long) i4)) {
                j5 -= (long) i4;
            }
            float s = widgetRun4.f2480b.mo4426s(i);
            if (s > Utils.FLOAT_EPSILON) {
                j2 = (long) ((((float) j5) / s) + (((float) j4) / (1.0f - s)));
            }
            float f = (float) j2;
            long j6 = ((long) ((f * s) + 0.5f)) + j3 + ((long) ((f * (1.0f - s)) + 0.5f));
            WidgetRun widgetRun5 = this.f14098c;
            j = ((long) widgetRun5.f2486h.f2471f) + j6;
            i2 = widgetRun5.f2487i.f2471f;
        } else if (contains) {
            DependencyNode dependencyNode3 = this.f14098c.f2486h;
            return Math.max(mo22322d(dependencyNode3, (long) dependencyNode3.f2471f), ((long) this.f14098c.f2486h.f2471f) + j3);
        } else if (contains2) {
            DependencyNode dependencyNode4 = this.f14098c.f2487i;
            return Math.max(-mo22321c(dependencyNode4, (long) dependencyNode4.f2471f), ((long) (-this.f14098c.f2487i.f2471f)) + j3);
        } else {
            WidgetRun widgetRun6 = this.f14098c;
            j = ((long) widgetRun6.f2486h.f2471f) + widgetRun6.mo145j();
            i2 = this.f14098c.f2487i.f2471f;
        }
        return j - ((long) i2);
    }

    /* renamed from: c */
    public final long mo22321c(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.f2469d;
        if (widgetRun instanceof C0479b) {
            return j;
        }
        int size = dependencyNode.f2476k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            jc1 jc1 = dependencyNode.f2476k.get(i);
            if (jc1 instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) jc1;
                if (dependencyNode2.f2469d != widgetRun) {
                    j2 = Math.min(j2, mo22321c(dependencyNode2, ((long) dependencyNode2.f2471f) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.f2487i) {
            return j2;
        }
        long j3 = j - widgetRun.mo145j();
        return Math.min(Math.min(j2, mo22321c(widgetRun.f2486h, j3)), j3 - ((long) widgetRun.f2486h.f2471f));
    }

    /* renamed from: d */
    public final long mo22322d(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.f2469d;
        if (widgetRun instanceof C0479b) {
            return j;
        }
        int size = dependencyNode.f2476k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            jc1 jc1 = dependencyNode.f2476k.get(i);
            if (jc1 instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) jc1;
                if (dependencyNode2.f2469d != widgetRun) {
                    j2 = Math.max(j2, mo22322d(dependencyNode2, ((long) dependencyNode2.f2471f) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.f2486h) {
            return j2;
        }
        long j3 = j + widgetRun.mo145j();
        return Math.max(Math.max(j2, mo22322d(widgetRun.f2487i, j3)), j3 - ((long) widgetRun.f2487i.f2471f));
    }
}
