package com.kmk.dependency.command;

import java.util.Set;

import com.kmk.dependency.model.Program;
import com.kmk.dependency.service.ServiceException;

public class ListCommand extends AbstractCommand {
    @Override
    public String executeInternal(String[] args) throws CommandException, ServiceException {
        verifyHasExactNumberOfArguments(args, 1);

        Set<Program> installed = dependencyManager.list();

        StringBuffer response = new StringBuffer();
        for (Program program : installed) {
            response.append("\t").append(program.getName()).append("\n");
        }

        return response.toString();
    }
}
