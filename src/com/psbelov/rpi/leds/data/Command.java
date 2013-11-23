package com.psbelov.rpi.leds.data;

import java.io.Serializable;

public class Command implements Serializable {
    private CommandsEnum command;
    private Object data;
    
    public Command(CommandsEnum command,Object data) {
        this.command=command;
        this.data=data;
    }
    
    public CommandsEnum getCommand() {
        return command;
    }
    
    public Object getData() {
        return data;
    }

    public Integer getIntData() {
        Integer data = null;

        if (this.data == null) {
            return null;
        }

        try {
            data = Integer.parseInt(this.data.toString());
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();

        }

        return data;
    }

    public String getStringData() {
        return data.toString();
    }
}
