package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.C0532a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

class TimePickerView extends ConstraintLayout {

    /* renamed from: o1 */
    public final Chip f24648o1;

    /* renamed from: p1 */
    public final Chip f24649p1;

    /* renamed from: q1 */
    public final ClockHandView f24650q1;

    /* renamed from: r1 */
    public final ClockFaceView f24651r1;

    /* renamed from: s1 */
    public final MaterialButtonToggleGroup f24652s1;

    /* renamed from: t1 */
    public final View.OnClickListener f24653t1;

    /* renamed from: u1 */
    public C4457f f24654u1;

    /* renamed from: v1 */
    public C4458g f24655v1;

    /* renamed from: w1 */
    public C4456e f24656w1;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$a */
    public class C4452a implements View.OnClickListener {
        public C4452a() {
        }

        public void onClick(View view) {
            if (TimePickerView.this.f24655v1 != null) {
                TimePickerView.this.f24655v1.mo34096a(((Integer) view.getTag(g35.selection_type)).intValue());
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$b */
    public class C4453b implements MaterialButtonToggleGroup.C4231e {
        public C4453b() {
        }

        /* renamed from: a */
        public void mo32031a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
            int i2;
            if (i == g35.material_clock_period_pm_button) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (TimePickerView.this.f24654u1 != null && z) {
                TimePickerView.this.f24654u1.mo34095a(i2);
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$c */
    public class C4454c extends GestureDetector.SimpleOnGestureListener {
        public C4454c() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            if (TimePickerView.this.f24656w1 != null) {
                TimePickerView.this.f24656w1.mo34094a();
            }
            return onDoubleTap;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$d */
    public class C4455d implements View.OnTouchListener {

        /* renamed from: a */
        public final /* synthetic */ GestureDetector f24660a;

        public C4455d(GestureDetector gestureDetector) {
            this.f24660a = gestureDetector;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f24660a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$e */
    public interface C4456e {
        /* renamed from: a */
        void mo34094a();
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$f */
    public interface C4457f {
        /* renamed from: a */
        void mo34095a(int i);
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$g */
    public interface C4458g {
        /* renamed from: a */
        void mo34096a(int i);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo34090z();
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            mo34090z();
        }
    }

    /* renamed from: x */
    public final void mo34088x() {
        Chip chip = this.f24648o1;
        int i = g35.selection_type;
        chip.setTag(i, 12);
        this.f24649p1.setTag(i, 10);
        this.f24648o1.setOnClickListener(this.f24653t1);
        this.f24649p1.setOnClickListener(this.f24653t1);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: y */
    public final void mo34089y() {
        C4455d dVar = new C4455d(new GestureDetector(getContext(), new C4454c()));
        this.f24648o1.setOnTouchListener(dVar);
        this.f24649p1.setOnTouchListener(dVar);
    }

    /* renamed from: z */
    public final void mo34090z() {
        boolean z;
        if (this.f24652s1.getVisibility() == 0) {
            C0532a aVar = new C0532a();
            aVar.mo5161p(this);
            int i = 1;
            if (ga7.m17715B(this) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 2;
            }
            aVar.mo5159n(g35.material_clock_display, i);
            aVar.mo5155i(this);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24653t1 = new C4452a();
        LayoutInflater.from(context).inflate(c45.material_timepicker, this);
        this.f24651r1 = (ClockFaceView) findViewById(g35.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(g35.material_clock_period_toggle);
        this.f24652s1 = materialButtonToggleGroup;
        materialButtonToggleGroup.mo32002g(new C4453b());
        this.f24648o1 = (Chip) findViewById(g35.material_minute_tv);
        this.f24649p1 = (Chip) findViewById(g35.material_hour_tv);
        this.f24650q1 = (ClockHandView) findViewById(g35.material_clock_hand);
        mo34089y();
        mo34088x();
    }
}
