package com.kmk.dependency;

import com.kmk.dependency.command.CommandException;

public class InputParser {

    public String[] parse(String commandString) throws CommandException {
        return commandString.split("\\s+");
    }

}
