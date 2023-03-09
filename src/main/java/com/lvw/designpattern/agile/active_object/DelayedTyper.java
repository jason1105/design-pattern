package com.lvw.designpattern.agile.active_object;

/**
 * @author lvwei@tsintergy.com
 * @since 2023/3/9
 */
public class DelayedTyper implements Command {
    private final long delay;
    private final char charToPrint;
    private ActiveObjectEngine engine;

    public DelayedTyper(long delay, char charToPrint, ActiveObjectEngine engine) {
        this.delay = delay;
        this.charToPrint = charToPrint;
        this.engine = engine;
    }

    public DelayedTyper(long delay, char charToPrint) {
        this.delay = delay;
        this.charToPrint = charToPrint;
    }

    @Override public void execute() {

        if (notStop()) {
            System.out.print(charToPrint);
            engine.addCommand(new SleepCommand(delay, engine, this));
        }
    }

    private boolean notStop() {
        return !engine.stopped();
    }
}
