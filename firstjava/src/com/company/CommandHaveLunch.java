package com.company;

/**
 * Created by taozhiheng on 14-11-4.
 */
public class CommandHaveLunch implements MyCommand{
    private MyReceiver receiver;
    public CommandHaveLunch(MyReceiver receiver)
    {
        this.receiver=receiver;
    }
    public void change()
    {
        receiver.toHaveLunch();
    }
}
