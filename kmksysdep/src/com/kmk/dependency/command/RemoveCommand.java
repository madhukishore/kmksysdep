package com.kmk.dependency.command;

import java.util.Set;

import com.kmk.dependency.model.Program;
import com.kmk.dependency.service.ServiceException;

public class RemoveCommand extends AbstractCommand {
    @Override
    public String executeInternal(String[] args) throws CommandException, ServiceException {
        verifyHasExactNumberOfArguments(args, 2);

        Set<Program> installed = dependencyManager.remove(new Program(args[1]));

        StringBuffer response = new StringBuffer();
        for (Program program : installed) {
            response.append("\tRemoving ").append(program.getName()).append("\n");
        }

        return response.toString();
    }
}
