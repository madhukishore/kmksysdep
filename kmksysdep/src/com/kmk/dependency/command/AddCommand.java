package com.kmk.dependency.command;

import java.util.Set;

import com.kmk.dependency.model.Program;
import com.kmk.dependency.service.ServiceException;

public class AddCommand extends AbstractCommand {
    @Override
    public String executeInternal(String[] args) throws CommandException, ServiceException {
        verifyHasExactNumberOfArguments(args, 2);

        Set<Program> installed = dependencyManager.add(new Program(args[1]));

        StringBuffer response = new StringBuffer();
        for (Program program : installed) {
            response.append("\tInstalling ").append(program.getName()).append("\n");
        }

        return response.toString();
    }
}
