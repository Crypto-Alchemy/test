package net.safemoon.androidwallet.fragments;

import android.widget.TextView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.fragments.ReflectionsAdvanceFragment;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsToken;
import net.safemoon.androidwallet.views.TouchControlLineChart;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.fragments.ReflectionsAdvanceFragment$bindChart$1", mo48632f = "ReflectionsAdvanceFragment.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: ReflectionsAdvanceFragment.kt */
public final class ReflectionsAdvanceFragment$bindChart$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ List<RoomReflectionsDataAndToken> $list;
    public int label;
    public final /* synthetic */ ReflectionsAdvanceFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionsAdvanceFragment$bindChart$1(ReflectionsAdvanceFragment reflectionsAdvanceFragment, List<RoomReflectionsDataAndToken> list, ns0<? super ReflectionsAdvanceFragment$bindChart$1> ns0) {
        super(2, ns0);
        this.this$0 = reflectionsAdvanceFragment;
        this.$list = list;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new ReflectionsAdvanceFragment$bindChart$1(this.this$0, this.$list, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((ReflectionsAdvanceFragment$bindChart$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        TouchControlLineChart touchControlLineChart;
        Double d;
        Float f;
        Float f2;
        pm2 pm2;
        RoomReflectionsDataAndToken roomReflectionsDataAndToken;
        double d2;
        Double d3;
        Double d4;
        Float diffBalance;
        RoomReflectionsToken token;
        Double priceUsd;
        float f3;
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            ka2 A = this.this$0.mo57580M();
            if (!(A == null || (pm2 = A.f30772o) == null)) {
                List<RoomReflectionsDataAndToken> list = this.$list;
                pm2.f32735b.setText(R.string.mr_seg_time_total);
                pm2.f32738e.setVisibility(4);
                if (!list.isEmpty()) {
                    roomReflectionsDataAndToken = new RoomReflectionsDataAndToken(((RoomReflectionsDataAndToken) CollectionsKt___CollectionsKt.m47329Z(list)).getData(), ((RoomReflectionsDataAndToken) CollectionsKt___CollectionsKt.m47329Z(list)).getToken());
                    float f4 = 0.0f;
                    for (RoomReflectionsDataAndToken diffBalance2 : list) {
                        Float diffBalance3 = diffBalance2.getDiffBalance();
                        if (diffBalance3 != null) {
                            f3 = diffBalance3.floatValue();
                        } else {
                            f3 = 0.0f;
                        }
                        f4 += f3;
                    }
                    roomReflectionsDataAndToken.setDiffBalance(a40.m31672c(f4));
                } else {
                    roomReflectionsDataAndToken = null;
                }
                if (roomReflectionsDataAndToken == null || (token = roomReflectionsDataAndToken.getToken()) == null || (priceUsd = token.getPriceUsd()) == null) {
                    d2 = 0.0d;
                } else {
                    d2 = priceUsd.doubleValue();
                }
                if (roomReflectionsDataAndToken == null || (diffBalance = roomReflectionsDataAndToken.getDiffBalance()) == null) {
                    d3 = null;
                } else {
                    d3 = a40.m31671b((double) diffBalance.floatValue());
                }
                if (d3 != null) {
                    d4 = a40.m31671b(d3.doubleValue() * d2);
                } else {
                    d4 = null;
                }
                if (d3 != null) {
                    TextView textView = pm2.f32737d;
                    vx2.m53590f(textView, "tvTokenNativeBalance");
                    ol0.m70337Q(textView, d3.doubleValue());
                }
                if (d2 <= Utils.DOUBLE_EPSILON || d4 == null) {
                    pm2.f32736c.setText("");
                } else {
                    TextView textView2 = pm2.f32736c;
                    vx2.m53590f(textView2, "tvTokenBalance");
                    ol0.m70333M(textView2, d4.doubleValue(), true);
                }
            }
            ArrayList arrayList = new ArrayList();
            int size = this.$list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    try {
                        RoomReflectionsDataAndToken roomReflectionsDataAndToken2 = this.$list.get(size);
                        Double priceUsd2 = roomReflectionsDataAndToken2.getToken().getPriceUsd();
                        if (priceUsd2 != null) {
                            priceUsd2.doubleValue();
                        }
                        Float diffBalance4 = roomReflectionsDataAndToken2.getDiffBalance();
                        if (diffBalance4 != null) {
                            d = a40.m31671b((double) diffBalance4.floatValue());
                        } else {
                            d = null;
                        }
                        if (this.$list.size() == 1) {
                            arrayList.add(new Entry((float) roomReflectionsDataAndToken2.getData().getStartTime(), Utils.FLOAT_EPSILON));
                            float timeStamp = (float) roomReflectionsDataAndToken2.getData().getTimeStamp();
                            if (d != null) {
                                f2 = a40.m31672c((float) d.doubleValue());
                            } else {
                                f2 = null;
                            }
                            vx2.m53588d(f2);
                            arrayList.add(new Entry(timeStamp, f2.floatValue()));
                        } else {
                            float timeStamp2 = (float) roomReflectionsDataAndToken2.getData().getTimeStamp();
                            if (d != null) {
                                f = a40.m31672c((float) d.doubleValue());
                            } else {
                                f = null;
                            }
                            vx2.m53588d(f);
                            arrayList.add(new Entry(timeStamp2, f.floatValue()));
                        }
                    } catch (Exception unused) {
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
            LineDataSet lineDataSet = new LineDataSet(arrayList, this.this$0.f42029r);
            ReflectionsAdvanceFragment reflectionsAdvanceFragment = this.this$0;
            lineDataSet.setLineWidth(reflectionsAdvanceFragment.f42028k);
            lineDataSet.setColor(zr0.m31440c(reflectionsAdvanceFragment.requireContext(), R.color.white));
            lineDataSet.setHighLightColor(zr0.m31440c(reflectionsAdvanceFragment.requireContext(), R.color.white));
            LineData lineData = new LineData(lineDataSet);
            lineData.setValueTextColor(zr0.m31440c(this.this$0.requireContext(), R.color.white));
            lineData.setDrawValues(false);
            lineData.setHighlightEnabled(true);
            ka2 A2 = this.this$0.mo57580M();
            if (!(A2 == null || (touchControlLineChart = A2.f30763f) == null)) {
                ReflectionsAdvanceFragment reflectionsAdvanceFragment2 = this.this$0;
                touchControlLineChart.clear();
                touchControlLineChart.setClipValuesToContent(true);
                touchControlLineChart.setData(lineData);
                touchControlLineChart.getDescription().setEnabled(false);
                touchControlLineChart.getXAxis().setEnabled(true);
                touchControlLineChart.getXAxis().setValueFormatter(new ReflectionsAdvanceFragment.C8414a(reflectionsAdvanceFragment2, reflectionsAdvanceFragment2.mo57582O().mo61343o()));
                touchControlLineChart.getXAxis().setAxisLineColor(zr0.m31440c(reflectionsAdvanceFragment2.requireContext(), R.color.white));
                touchControlLineChart.getXAxis().setTextColor(zr0.m31440c(reflectionsAdvanceFragment2.requireContext(), R.color.white));
                touchControlLineChart.getAxisLeft().setEnabled(false);
                touchControlLineChart.getAxisLeft().setDrawLabels(false);
                touchControlLineChart.getAxisRight().setDrawLabels(false);
                touchControlLineChart.getAxisRight().setEnabled(false);
                touchControlLineChart.notifyDataSetChanged();
            }
            return r37.f33317a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
