package com.lvw.designpattern.agile.active_object;

/**
 * @author lvwei@tsintergy.com
 * @since 2023/3/9
 */
public class ClientProgram {
    public static void main(String[] args) throws InterruptedException {
        ActiveObjectEngine engine = new ActiveObjectEngine();
        new Thread(() -> {
            try {
                engine.run();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        engine.addCommand(new SleepCommand(20000, engine, new Command(){
            @Override public void execute() {
                engine.stop();
            }
        }));

        // 下面的 10 个 command 看起来好像是同时执行的
        engine.addCommand(new DelayedTyper(100, '1', engine));
        engine.addCommand(new DelayedTyper(300, '3', engine));
        engine.addCommand(new DelayedTyper(500, '5', engine));
        engine.addCommand(new DelayedTyper(700, '7', engine));
    }
}
