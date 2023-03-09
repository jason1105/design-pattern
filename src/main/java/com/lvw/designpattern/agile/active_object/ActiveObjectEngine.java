package com.lvw.designpattern.agile.active_object;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author lvwei@tsintergy.com
 * @since 2023/3/9
 */
public class ActiveObjectEngine {

    private final BlockingQueue<Command> commands = new LinkedBlockingQueue<>();
    private boolean stopped = false;

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void run() throws InterruptedException {
        while (true) {
            commands.take().execute();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        while(true) {
            Thread.sleep(1);
        }
    }

    public void stop() {
        stopped = true;
    }

    public boolean stopped() {
        return stopped;
    }
}
