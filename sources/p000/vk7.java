package p000;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* renamed from: vk7 */
/* compiled from: WidgetContainer */
public class vk7 extends ConstraintWidget {

    /* renamed from: U0 */
    public ArrayList<ConstraintWidget> f18830U0 = new ArrayList<>();

    /* renamed from: a */
    public void mo27205a(ConstraintWidget constraintWidget) {
        this.f18830U0.add(constraintWidget);
        if (constraintWidget.mo4351M() != null) {
            ((vk7) constraintWidget.mo4351M()).mo27207q1(constraintWidget);
        }
        constraintWidget.mo4378Z0(this);
    }

    /* renamed from: o1 */
    public ArrayList<ConstraintWidget> mo27206o1() {
        return this.f18830U0;
    }

    /* renamed from: p1 */
    public void mo4497p1() {
        ArrayList<ConstraintWidget> arrayList = this.f18830U0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = this.f18830U0.get(i);
                if (constraintWidget instanceof vk7) {
                    ((vk7) constraintWidget).mo4497p1();
                }
            }
        }
    }

    /* renamed from: q1 */
    public void mo27207q1(ConstraintWidget constraintWidget) {
        this.f18830U0.remove(constraintWidget);
        constraintWidget.mo4427s0();
    }

    /* renamed from: r1 */
    public void mo27208r1() {
        this.f18830U0.clear();
    }

    /* renamed from: s0 */
    public void mo4427s0() {
        this.f18830U0.clear();
        super.mo4427s0();
    }

    /* renamed from: w0 */
    public void mo4436w0(d80 d80) {
        super.mo4436w0(d80);
        int size = this.f18830U0.size();
        for (int i = 0; i < size; i++) {
            this.f18830U0.get(i).mo4436w0(d80);
        }
    }
}
