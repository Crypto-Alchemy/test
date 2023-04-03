package zendesk.messaging;

import android.os.Handler;
import java.util.concurrent.TimeUnit;

public class TypingEventDispatcher {
    public static final long TYPING_WINDOW = TimeUnit.SECONDS.toMillis(3);
    private final EventFactory eventFactory;
    private final EventListener eventListener;
    private final Handler handler;
    public boolean isTyping = false;
    public final Runnable typingStopRunnable;

    public TypingEventDispatcher(final EventListener eventListener2, Handler handler2, final EventFactory eventFactory2) {
        this.eventListener = eventListener2;
        this.handler = handler2;
        this.eventFactory = eventFactory2;
        this.typingStopRunnable = new Runnable() {
            public void run() {
                eventListener2.onEvent(eventFactory2.typingStop());
                TypingEventDispatcher.this.isTyping = false;
            }
        };
    }

    public void onTyping() {
        if (this.isTyping) {
            this.handler.removeCallbacks(this.typingStopRunnable);
            this.handler.postDelayed(this.typingStopRunnable, TYPING_WINDOW);
            return;
        }
        this.isTyping = true;
        this.eventListener.onEvent(this.eventFactory.typingStart());
        this.handler.postDelayed(this.typingStopRunnable, TYPING_WINDOW);
    }
}
