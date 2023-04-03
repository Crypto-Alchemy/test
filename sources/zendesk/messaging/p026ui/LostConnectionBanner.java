package zendesk.messaging.p026ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.C1459b;
import androidx.transition.C1460c;
import androidx.transition.Slide;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import java.util.concurrent.atomic.AtomicReference;
import zendesk.messaging.ConnectionState;
import zendesk.messaging.R$id;
import zendesk.messaging.R$string;

/* renamed from: zendesk.messaging.ui.LostConnectionBanner */
class LostConnectionBanner {
    private final AtomicReference<ConnectionState> currentConnectionState;
    private final AnimatorSet hideAnimation;
    private final View lostConnectionBanner;
    private final Button lostConnectionButton;
    private final TextView lostConnectionTextView;
    /* access modifiers changed from: private */
    public View.OnClickListener onRetryConnectionClickListener;
    private final ViewGroup rootView;
    /* access modifiers changed from: private */
    public final TransitionSet showAnimation;
    /* access modifiers changed from: private */
    public State state = State.EXITED;

    /* renamed from: zendesk.messaging.ui.LostConnectionBanner$5 */
    public static /* synthetic */ class C99205 {
        public static final /* synthetic */ int[] $SwitchMap$zendesk$messaging$ConnectionState;
        public static final /* synthetic */ int[] $SwitchMap$zendesk$messaging$ui$LostConnectionBanner$State;

        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|(3:27|28|30)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        static {
            /*
                zendesk.messaging.ui.LostConnectionBanner$State[] r0 = zendesk.messaging.p026ui.LostConnectionBanner.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$zendesk$messaging$ui$LostConnectionBanner$State = r0
                r1 = 1
                zendesk.messaging.ui.LostConnectionBanner$State r2 = zendesk.messaging.p026ui.LostConnectionBanner.State.ENTERING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$zendesk$messaging$ui$LostConnectionBanner$State     // Catch:{ NoSuchFieldError -> 0x001d }
                zendesk.messaging.ui.LostConnectionBanner$State r3 = zendesk.messaging.p026ui.LostConnectionBanner.State.ENTERED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$zendesk$messaging$ui$LostConnectionBanner$State     // Catch:{ NoSuchFieldError -> 0x0028 }
                zendesk.messaging.ui.LostConnectionBanner$State r4 = zendesk.messaging.p026ui.LostConnectionBanner.State.EXITED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$zendesk$messaging$ui$LostConnectionBanner$State     // Catch:{ NoSuchFieldError -> 0x0033 }
                zendesk.messaging.ui.LostConnectionBanner$State r5 = zendesk.messaging.p026ui.LostConnectionBanner.State.EXITING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                zendesk.messaging.ConnectionState[] r4 = zendesk.messaging.ConnectionState.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                $SwitchMap$zendesk$messaging$ConnectionState = r4
                zendesk.messaging.ConnectionState r5 = zendesk.messaging.ConnectionState.RECONNECTING     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = $SwitchMap$zendesk$messaging$ConnectionState     // Catch:{ NoSuchFieldError -> 0x004e }
                zendesk.messaging.ConnectionState r4 = zendesk.messaging.ConnectionState.UNREACHABLE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = $SwitchMap$zendesk$messaging$ConnectionState     // Catch:{ NoSuchFieldError -> 0x0058 }
                zendesk.messaging.ConnectionState r1 = zendesk.messaging.ConnectionState.FAILED     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = $SwitchMap$zendesk$messaging$ConnectionState     // Catch:{ NoSuchFieldError -> 0x0062 }
                zendesk.messaging.ConnectionState r1 = zendesk.messaging.ConnectionState.CONNECTING     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = $SwitchMap$zendesk$messaging$ConnectionState     // Catch:{ NoSuchFieldError -> 0x006d }
                zendesk.messaging.ConnectionState r1 = zendesk.messaging.ConnectionState.CONNECTED     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = $SwitchMap$zendesk$messaging$ConnectionState     // Catch:{ NoSuchFieldError -> 0x0078 }
                zendesk.messaging.ConnectionState r1 = zendesk.messaging.ConnectionState.DISCONNECTED     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.p026ui.LostConnectionBanner.C99205.<clinit>():void");
        }
    }

    /* renamed from: zendesk.messaging.ui.LostConnectionBanner$State */
    public enum State {
        ENTERING,
        ENTERED,
        EXITING,
        EXITED
    }

    private LostConnectionBanner(ViewGroup viewGroup, RecyclerView recyclerView, InputBox inputBox, View view) {
        this.rootView = viewGroup;
        this.lostConnectionBanner = view;
        this.currentConnectionState = new AtomicReference<>(ConnectionState.DISCONNECTED);
        this.lostConnectionTextView = (TextView) view.findViewById(R$id.zui_lost_connection_label);
        int i = R$id.zui_lost_connection_button;
        this.lostConnectionButton = (Button) view.findViewById(i);
        view.findViewById(i).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (LostConnectionBanner.this.onRetryConnectionClickListener != null) {
                    LostConnectionBanner.this.onRetryConnectionClickListener.onClick(view);
                }
            }
        });
        TransitionSet G0 = new TransitionSet().mo10556H0(0).mo10562w0(new Slide(48)).mo10528m0(new DecelerateInterpolator());
        long j = MessagingView.DEFAULT_ANIMATION_DURATION;
        this.showAnimation = G0.mo10525k0(j).mo10510a(new C1459b(recyclerView, view, inputBox) {
            public final int originalPaddingTop;
            public final /* synthetic */ InputBox val$inputBox;
            public final /* synthetic */ View val$lostConnectionBanner;
            public final /* synthetic */ RecyclerView val$recyclerView;

            {
                this.val$recyclerView = r2;
                this.val$lostConnectionBanner = r3;
                this.val$inputBox = r4;
                this.originalPaddingTop = r2.getPaddingTop();
            }

            public void onTransitionEnd(Transition transition) {
                RecyclerView recyclerView = this.val$recyclerView;
                recyclerView.setPadding(recyclerView.getPaddingLeft(), this.val$recyclerView.getPaddingTop() + this.val$lostConnectionBanner.getHeight(), this.val$recyclerView.getPaddingRight(), Math.max(this.val$inputBox.getHeight(), (this.val$recyclerView.getHeight() - this.val$recyclerView.computeVerticalScrollRange()) - this.originalPaddingTop));
                State unused = LostConnectionBanner.this.state = State.ENTERED;
            }

            public void onTransitionStart(Transition transition) {
                State unused = LostConnectionBanner.this.state = State.ENTERING;
            }
        });
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        AnimatorSet animatorSet = new AnimatorSet();
        this.hideAnimation = animatorSet;
        int i2 = marginLayoutParams.topMargin;
        animatorSet.playTogether(new Animator[]{ValueAnimators.topPaddingAnimator(recyclerView, recyclerView.getPaddingTop(), recyclerView.getPaddingTop() - view.getHeight(), j), ValueAnimators.topMarginAnimator(view, i2, i2 - view.getHeight(), j)});
        animatorSet.setInterpolator(new AccelerateInterpolator());
        animatorSet.addListener(new AnimatorListenerAdapter(marginLayoutParams, recyclerView, view, inputBox) {
            private final int originalMargin;
            private final int originalPaddingBottom;
            public final /* synthetic */ InputBox val$inputBox;
            public final /* synthetic */ View val$lostConnectionBanner;
            public final /* synthetic */ ViewGroup.MarginLayoutParams val$params;
            public final /* synthetic */ RecyclerView val$recyclerView;

            {
                this.val$params = r2;
                this.val$recyclerView = r3;
                this.val$lostConnectionBanner = r4;
                this.val$inputBox = r5;
                this.originalMargin = r2.topMargin;
                this.originalPaddingBottom = r3.getPaddingBottom();
            }

            public void onAnimationEnd(Animator animator) {
                ViewGroup.MarginLayoutParams marginLayoutParams = this.val$params;
                marginLayoutParams.topMargin = this.originalMargin;
                this.val$lostConnectionBanner.setLayoutParams(marginLayoutParams);
                this.val$lostConnectionBanner.setVisibility(8);
                RecyclerView recyclerView = this.val$recyclerView;
                recyclerView.setPadding(recyclerView.getPaddingLeft(), this.val$recyclerView.getPaddingTop(), this.val$recyclerView.getPaddingRight(), this.originalPaddingBottom + this.val$inputBox.getHeight());
                State unused = LostConnectionBanner.this.state = State.EXITED;
            }

            public void onAnimationStart(Animator animator) {
                State unused = LostConnectionBanner.this.state = State.EXITING;
            }
        });
    }

    public static LostConnectionBanner create(ViewGroup viewGroup, RecyclerView recyclerView, InputBox inputBox) {
        return new LostConnectionBanner(viewGroup, recyclerView, inputBox, viewGroup.findViewById(R$id.zui_lost_connection_view));
    }

    public void hide() {
        int i = C99205.$SwitchMap$zendesk$messaging$ui$LostConnectionBanner$State[this.state.ordinal()];
        if (i == 1) {
            this.showAnimation.mo10510a(new C1459b() {
                public void onTransitionEnd(Transition transition) {
                    LostConnectionBanner.this.hide();
                    LostConnectionBanner.this.showAnimation.mo10517e0(this);
                }
            });
        } else if (i != 3 && i != 4) {
            this.hideAnimation.start();
        }
    }

    public void setOnRetryConnectionClickListener(View.OnClickListener onClickListener) {
        this.onRetryConnectionClickListener = onClickListener;
    }

    public void show() {
        int i = C99205.$SwitchMap$zendesk$messaging$ui$LostConnectionBanner$State[this.state.ordinal()];
        if (i != 1 && i != 2) {
            C1460c.m10211a(this.rootView, this.showAnimation);
            this.lostConnectionBanner.setVisibility(0);
        }
    }

    public void update(ConnectionState connectionState) {
        if (this.currentConnectionState.getAndSet(connectionState) != connectionState) {
            switch (C99205.$SwitchMap$zendesk$messaging$ConnectionState[connectionState.ordinal()]) {
                case 1:
                    this.lostConnectionTextView.setText(R$string.zui_label_reconnecting);
                    this.lostConnectionButton.setVisibility(8);
                    show();
                    return;
                case 2:
                    this.lostConnectionTextView.setText(R$string.zui_label_reconnecting_failed);
                    this.lostConnectionButton.setVisibility(8);
                    show();
                    return;
                case 3:
                    this.lostConnectionTextView.setText(R$string.zui_label_reconnecting_failed);
                    this.lostConnectionButton.setVisibility(0);
                    show();
                    return;
                case 4:
                case 5:
                case 6:
                    hide();
                    return;
                default:
                    return;
            }
        }
    }
}
