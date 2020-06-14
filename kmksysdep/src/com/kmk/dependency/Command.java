package com.kmk.dependency;

import com.kmk.dependency.command.CommandException;

public interface Command {
     String execute(String[] args) throws CommandException;
}
