package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

public interface DateSelector<S> extends Parcelable {
    /* renamed from: A0 */
    String mo32512A0(Context context);

    /* renamed from: B0 */
    Collection<jl4<Long, Long>> mo32513B0();

    /* renamed from: J */
    View mo32514J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, sh4<S> sh4);

    /* renamed from: W0 */
    boolean mo32515W0();

    /* renamed from: c1 */
    Collection<Long> mo32516c1();

    /* renamed from: f1 */
    S mo32517f1();

    /* renamed from: i0 */
    int mo32518i0(Context context);

    /* renamed from: l1 */
    void mo32519l1(long j);
}
