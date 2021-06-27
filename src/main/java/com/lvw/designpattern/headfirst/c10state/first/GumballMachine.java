package com.lvw.designpattern.headfirst.c10state.first;

public class GumballMachine {

    private STATE state;
    private int count;

    public GumballMachine(int count) {
        this.count = count;
        if (this.count > 0) {
            state = STATE.NO_QUARTER;
        }
    }

    String getState() {
        return state.toString();
    }

    void insertQuarter() {

        switch (state) {

            case SOLD_OUT: {
                System.out.println("啊哈, 已经售罄了..., 钱退给你.");
                break;
            }
            case NO_QUARTER:{
                System.out.println("你投了25分钱.");
                state = STATE.HAS_QUARTER;
                break;
            }

            case HAS_QUARTER:{
                System.out.println("已经投过钱了, 来挑一个.");
                break;
            }
            case SOLD:{
                System.out.println("稍等, 正在输出.");
                break;
            }
            default:

        }
    }

    void ejectQuarter() {
        switch (state) {

            case SOLD_OUT: {
                System.out.println("你还没有投钱.");
                break;
            }
            case NO_QUARTER:{
                System.out.println("你还没有投钱.");
                break;
            }

            case HAS_QUARTER:{
                System.out.println("退还25分钱.");
                state =STATE.NO_QUARTER;
                break;
            }
            case SOLD:{
                System.out.println("这个时候了退钱? 有一颗糖果等着你呢, 快拿.");
                break;
            }
            default:

        }

    }

    void turnCrank() {
        switch (state) {

            case SOLD_OUT: {
                System.out.println("售罄啦, 转也没有用.");
                break;
            }
            case NO_QUARTER:{
                System.out.println("你还没投钱呢, 投25分钱就可以.");
                break;
            }

            case HAS_QUARTER:{
                System.out.println("哗啦啦, 转了一大波糖果.");
                state = STATE.SOLD;
                break;
            }
            case SOLD:{
                System.out.println("请稍等, 正在输出, 拿走这个再继续呗.");
                break;
            }
            default:

        }

    }

    void dispense() {
        switch (state) {

            case SOLD_OUT: {
                System.out.println("没有糖果了, 你是不是作弊了?");
                break;
            }
            case NO_QUARTER:{
                System.out.println("没有投钱还想吃糖? 你是不是作弊了?");
                break;
            }

            case HAS_QUARTER:{
                System.out.println("先摇一摇呗, 不一样口味, 祝你好运!");
                break;
            }
            case SOLD:{
                System.out.println("给你一颗糖果.");

                count--;
                if (count == 0) {
                    state = STATE.SOLD_OUT;
                } else {
                    state = STATE.NO_QUARTER;
                }

                break;
            }
            default:

        }

    }
}
