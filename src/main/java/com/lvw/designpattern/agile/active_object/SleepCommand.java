package com.lvw.designpattern.agile.active_object;

/**
 * @author lvwei@tsintergy.com
 * @since 2023/3/9
 */
public class SleepCommand implements Command {

    Command nextCommand;
    long sleepTimeMillionSeconds;
    ActiveObjectEngine engine;
    long startTime;

    public SleepCommand(long sleepTimeMillionSeconds, ActiveObjectEngine engine, Command nextCommand) {
        this.nextCommand = nextCommand;
        this.sleepTimeMillionSeconds = sleepTimeMillionSeconds;
        this.engine = engine;
    }

    @Override public void execute() {
        long currentTime = System.currentTimeMillis();

        if (!started()) {
            startTime = currentTime;
        }

        if (startTime + sleepTimeMillionSeconds <= currentTime) {
            engine.addCommand(nextCommand);
        } else {
            engine.addCommand(this);
        }
    }

    private boolean started() {
        return startTime != 0;
    }
}
